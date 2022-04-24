/*

import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class oddEvenTester {

    MinMaxChecker MinMaxTestObj;

    @BeforeEach
    public void init() {
        MinMaxTestObj = new MinMaxChecker();
    }

    @Nested
    class minClass{

        @Test
        @DisplayName("Testing min of [1, 300, -2, 0, 23], expecting -2")
        public void minTest1() {
            MinMaxTestObj.setArrToCheck(new int[]{1, 300, -2, 0, 23});
            assertEquals(-2, MinMaxTestObj.MinCheck());
        }

        @Test
        @DisplayName("Testing min of [0, -5, 78, -426, 1988], expecting -426")
        public void minTest2() {
            MinMaxTestObj.setArrToCheck(new int[]{0, -5, 78, -426, 1988});
            assertEquals(-426, MinMaxTestObj.MinCheck());
        }

        @Test
        @DisplayName("Testing min of [-241455, -4879, -54841, 0 ,31145], expecting -241455")
        public void minTest3() {
            MinMaxTestObj.setArrToCheck(new int[]{-241455, -4879, -54841, 0, 31145});
            assertEquals(-241455, MinMaxTestObj.MinCheck());
        }
    }

    @Nested
    class maxClass{

        @Test
        @DisplayName("Testing max of [1, 300, -2, 0, 23], expecting 300")
        public void maxTest1() {
            MinMaxTestObj.setArrToCheck(new int[]{1, 300, -2, 0, 23});
            assertEquals(300, MinMaxTestObj.MaxCheck());
        }

        @Test
        @DisplayName("Testing max of [0, -5, 78, -426, 1988], expecting 1988")
        public void maxTest2() {
            MinMaxTestObj.setArrToCheck(new int[]{0, -5, 78, -426, 1988});
            assertEquals(1988, MinMaxTestObj.MaxCheck());
        }

        @Test
        @DisplayName("Testing max of [-241455, 2441, -54841, 0 ,31145], expecting 31145")
        public void maxTest3() {
            MinMaxTestObj.setArrToCheck(new int[]{-241455, 2441, -54841, 0, 31145});
            assertEquals(31145, MinMaxTestObj.MaxCheck());
        }

        @AfterEach
        public void clearArr() {
            MinMaxTestObj.clearArr();
        }

    }

    @AfterEach
    public void garbageCollect() {
        MinMaxTestObj = null;
    }

}

*/