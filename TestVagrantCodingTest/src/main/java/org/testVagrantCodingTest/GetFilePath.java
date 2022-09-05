package org.testVagrantCodingTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetFilePath {
    static Properties properties;
    public static String getFileLocation() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream("./src/main/resources/util.properties"));
        String path = properties.getProperty("path");
        return path;
    }
}
