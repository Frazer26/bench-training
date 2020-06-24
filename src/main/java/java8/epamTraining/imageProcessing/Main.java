package java8.epamTraining.imageProcessing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URI imageURI = Objects.requireNonNull(Main.class.getClassLoader().getResource("image.png")).toURI();
        BufferedImage image = ImageIO.read(new File(imageURI));

        PixelStore pixels = readImage(image);

        long start = System.currentTimeMillis();
        int[] rgbArray = process(pixels);
        long end = System.currentTimeMillis();
        System.out.println("It took: " + (end-start) + " ms");

        writeResult(image, rgbArray);
    }

    private static void writeResult(BufferedImage image, int[] rgbArray) throws IOException {
        BufferedImage result = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        result.setRGB(0, 0, image.getWidth(), image.getHeight(), rgbArray, 0, image.getWidth());
        ImageIO.write(result, "jpg", new File("result.jpg"));
    }

    private static int[] process(PixelStore pixels) {
        return pixels.parallelStream()
                .map(p -> pixels.getAreaColor(p))
                .peek(p -> p.applySepia())
                .mapToInt(p -> p.toInt())
                .toArray();
    }

    private static PixelStore readImage(BufferedImage image) {
        PixelStore pixels = new PixelStore(image.getWidth(), image.getHeight());
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int rgb = image.getRGB(x, y);
                pixels.add(rgb);
            }
        }
        return pixels;
    }
}
