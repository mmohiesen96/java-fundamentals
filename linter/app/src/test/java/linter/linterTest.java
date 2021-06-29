package linter;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class linterTest {

    private App app;

    @BeforeEach
    public void setUp() throws Exception {
        app = new App();
    }

    @Test
    @DisplayName("Empty")
    public void testEmptyFile() throws IOException {
        Path path = Paths.get("C:\\Users\\mmohi\\java-fundamentals\\linter\\app\\src\\test\\resources\\empty.js");
        assertEquals(0, app.linter(path.toString()),
                "should return zero for empty file");
    }


    @Test
    @DisplayName("One Error")
    public void testOneError() throws IOException {
        assertEquals(1, app.linter("C:\\Users\\mmohi\\java-fundamentals\\linter\\app\\src\\test\\resources\\oneError.js"),
                "should return one error if found");
    }

    @Test
    @DisplayName("Few Errors")
    public void testFewErrors() throws IOException {
        assertEquals(4, app.linter("C:\\Users\\mmohi\\java-fundamentals\\linter\\app\\src\\test\\resources\\fewErrors.js"),
                "should return several errors");
    }


    @Test
    @DisplayName("Many Errors")
    public void testManyErrors() throws IOException {
        assertEquals(5, app.linter("C:\\Users\\mmohi\\java-fundamentals\\linter\\app\\src\\test\\resources\\manyErrors.js"),
                "should return many errors");
    }
    @Test
    @DisplayName("No Error")
    public void testNoError() throws IOException {
        assertEquals(0, app.linter("C:\\Users\\mmohi\\java-fundamentals\\linter\\app\\src\\test\\resources\\empty.js"),
                "should return zero for no errors");
    }
}
