package OOP.abstractClasses;

import java.nio.file.Path;

public class LowercaseFileReader extends BaseFileReader {

    protected LowercaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String line) {
        return line.toLowerCase();
    }
}
