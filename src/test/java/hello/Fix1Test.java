package hello;

import static org.junit.jupiter.api.Assertions.*;

class Fix1Test {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void comeFix1() {
        assertEquals("come from fix1", Fix1.comeFix1());
    }
}