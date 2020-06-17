package OOP.abstractClasses;

import java.nio.file.Path;

public class UppercaseFileReader extends BaseFileReader{
    protected UppercaseFileReader(Path filePath) {
        super(filePath);
    }

    @Override
    protected String mapFileLine(String line) {
        return line.toUpperCase();
    }
}
