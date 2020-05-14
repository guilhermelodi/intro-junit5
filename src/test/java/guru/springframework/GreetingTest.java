package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each...");

        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After all class");
    }

    @Test
    void helloWorldTest() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorldWithParamTest() {
        System.out.println(greeting.helloWorld("Lodi"));
    }
}