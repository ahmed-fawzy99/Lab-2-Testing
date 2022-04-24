import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class oddEvenTester{

    OddEvenChecker OddEvenTestObj;

    @BeforeEach
    public void init(){
        OddEvenTestObj = new OddEvenChecker();
    }

    @Nested
    class oddClass{

        @Test
        @DisplayName("Test 3 is odd")
        public void oddTest1() {
            assertEquals("ODD", OddEvenTestObj.OddEvenCheck(3));
        }
        @Test
        @DisplayName("Test -1 is odd")
        public void oddTest2() {
            assertEquals("ODD", OddEvenTestObj.OddEvenCheck(-1));
        }
        @Test
        @DisplayName("Test 99 is odd")
        public void oddTest3() {
            assertEquals("ODD", OddEvenTestObj.OddEvenCheck(99));
        }
        @Test
        @DisplayName("Test 412687421 is odd")
        public void oddTest4() {
            assertEquals("ODD", OddEvenTestObj.OddEvenCheck(412687421));
        }

    }

    @Nested
    class evenClass{

        @Test
        @DisplayName("Test 2 is even")
        public void evenTest1() {
            assertEquals("EVEN", OddEvenTestObj.OddEvenCheck(2));
        }
        @Test
        @DisplayName("Test -114 is even")
        public void evenTest2() {
            assertEquals("EVEN", OddEvenTestObj.OddEvenCheck(-114));
        }
        @Test
        @DisplayName("Test 0 is even")
        public void evenTest3() {
            assertEquals("EVEN", OddEvenTestObj.OddEvenCheck(0));
        }
        @Test
        @DisplayName("Test 1244478 is even")
        public void evenTest4() {
            assertEquals("EVEN", OddEvenTestObj.OddEvenCheck(1244478));
        }

    }

    @AfterEach
    public void garbageCollect(){
        OddEvenTestObj = null;
    }

}
