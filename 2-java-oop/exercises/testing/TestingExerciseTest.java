package testing;

import org.junit.Assert;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static testing.TestingExercise.sleepIn;

public class TestingExerciseTest {
    public static boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation;

        @Nested
        class SleepInTest {

            public void main(String[] args) {
                testSleepIn1();
                testSleepIn2();
                testSleepIn3();
                testSleepIn4();
            }

            @Test
            public void testSleepIn1() {

                boolean weekday = false;
                boolean vacation = false;
                boolean expected = true;

                boolean actual = sleepIn(weekday, vacation);

                System.out.println(actual == expected ? "Test 1 PASSED" : "Test 1 FAILED");


            }

            @Test
            public void testSleepIn2() {

                boolean weekday = true;
                boolean vacation = false;
                boolean expected = false;

                boolean actual = sleepIn(weekday, vacation);

                System.out.println(actual == expected ? "Test 2 PASSED" : "Test 2 FAILED");

            }

            @Test
            public void testSleepIn3() {

                boolean weekday = false;
                boolean vacation = true;
                boolean expected = true;

                boolean actual = sleepIn(weekday, vacation);
            }

            @Test
            public void testSleepIn4() {

                boolean weekday = true;
                boolean vacation = true;
                boolean expected = true;

                boolean actual = sleepIn(weekday, vacation);

                System.out.println(actual == expected ? "Test 4 PASSED" : "Test 4 FAILED");
            }

            @Nested
            class CountEvensTest {

                public void main(String[] args) {
                    testCountEvens1();
                    testCountEvens2();
                    testCountEvens3();
                    testCountEvens4();
                    testCountEvens5();
                    testCountEvens6();
                    testCountEvens7();
                    testCountEvens8();
                }

                public static int countEvens(int[] nums) {
                    int count = 0;

                    for (int num : nums) {
                        if (num % 2 == 0)
                            count++;
                    }
                    return count;
                }

                @Test
                public void testCountEvens1() {

                    int[] nums = {2, 1, 2, 3, 4};
                    int expected = 3;

                    int actual = countEvens(nums);

                    System.out.println(actual == expected ? "Test 1 PASSED" : "Test 1 FAILED");
                }

                @Test
                public void testCountEvens2() {

                    int[] nums = {2, 2, 0};
                    int expected = 3;

                    int actual = countEvens(nums);

                    System.out.println(actual == expected ? "Test 2 PASSED" : "Test 2 FAILED");
                }

                public void testCountEvens3() {

                    int[] nums = {1, 3, 5};
                    int expected = 0;

                    int actual = countEvens(nums);

                    System.out.println(actual == expected ? "Test 3 PASSED" : "Test 3 FAILED");
                }

                public static void testCountEvens4() {

                    int[] nums = {};
                    int expected = 0;

                    int actual = countEvens(nums);

                    System.out.println(actual == expected ? "Test 4 PASSED" : "Test 4 FAILED");
                }

                @Test
                public void testCountEvens5() {

                    int[] nums = {11, 9, 0, 1};
                    int expected = 1;

                    int actual = countEvens(nums);

                    System.out.println(actual == expected ? "Test 5 PASSED" : "Test 5 FAILED");
                }

                @Test
                public void testCountEvens6() {

                    int[] nums = {2, 11, 9, 0};
                    int expected = 2;

                    int actual = countEvens(nums);

                    System.out.println(actual == expected ? "Test 6 PASSED" : "Test 6 FAILED");
                }

                @Test
                public void testCountEvens7() {

                    int[] nums = {2};
                    int expected = 1;

                    int actual = countEvens(nums);

                    System.out.println(actual == expected ? "Test 7 PASSED" : "Test 7 FAILED");
                }

                @Test
                public void testCountEvens8() {

                    int[] nums = {2, 5, 12};
                    int expected = 2;

                    int actual = countEvens(nums);

                    System.out.println(actual == expected ? "Test 8 PASSED" : "Test 8 FAILED");
                }

                @Nested
                class CigarPartyTest {

                    public void main(String[] args) {
                        testCigarParty1();
                        testCigarParty2();
                        testCigarParty3();
                        testCigarParty4();
                        testCigarParty5();
                    }

                    public boolean cigarParty(int cigars, boolean isWeekend) {
                    if(isWeekend)
                        return 40 <= cigars;

                    return 40 < cigars && cigars < 60;
                }

                @Test
                public void testCigarParty1() {

                    int cigars = 30;
                    boolean isWeekend = false;
                    boolean expected = false;

                    boolean actual = cigarParty(cigars, isWeekend);

                    System.out.println(actual == expected ? "Test 1 PASSED" : "Test 1 FAILED");
                }

                @Test
                public void testCigarParty2() {

                    int cigars = 50;
                    boolean isWeekend = false;
                    boolean expected = true;

                    boolean actual = cigarParty(cigars, isWeekend);

                    System.out.println(actual == expected ? "Test 2 PASSED" : "Test 2 FAILED");
                }

                @Test
                public void testCigarParty3() {

                    int cigars = 70;
                    boolean isWeekend = true;
                    boolean expected = true;

                    boolean actual = cigarParty(cigars, isWeekend);

                    System.out.println(actual == expected ? "Test 3 PASSED" : "Test 3 FAILED");
                }

                @Test
                public void testCigarParty4() {

                    int cigars = 30;
                    boolean isWeekend = true;
                    boolean expected = false;

                    boolean actual = cigarParty(cigars, isWeekend);

                    System.out.println(actual == expected ? "Test 4 PASSED" : "Test 4 FAILED");
                }

                @Test
                public void testCigarParty5() {

                    int cigars = 50;
                    boolean isWeekend = true;
                    boolean expected = true;

                    boolean actual = cigarParty(cigars, isWeekend);

                    System.out.println(actual == expected ? "Test 5 PASSED" : "Test 5 FAILED");
                }

                }
        }
    }
}
}