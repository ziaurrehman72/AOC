import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {
    Day1 day1 = new Day1();
    String[] inputs;


    @org.junit.jupiter.api.BeforeEach
    void setUp() throws IOException {
        String readContent = IOUtils.toString(
                this.getClass().getResourceAsStream("inputs.txt"),
                "UTF-8"
        );
        this.inputs = readContent.split("\n");
    }

    @Test
    void checkReturnCount() {
//        assertEquals(0,0);
        System.out.println(inputs.length);
        System.out.println(day1.returnIncreasedCount(inputs));
    }
}