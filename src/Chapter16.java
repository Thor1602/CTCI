import java.util.*;

//import java.util.Arrays;
//
///**
// * 16.1 Number Swapper: Write a function to swap a number in place (that is, without temporary variables).
// */
//class numberSwapper {
//    static int[] swap(int x, int y){
//        x = x^y;
//        y = x^y;
//        x = x^y;
//        return new int[]{x,y};
//    }
//}
//
class chapter16 {
    public static void main(String[] args) {
        System.out.println("16.1");
        NumberSwapper swap = new NumberSwapper(5, 7);
        swap.swap();
        System.out.println("X = " + swap.x);
        System.out.println("Y = " + swap.y);
        System.out.println("16.2");
        WordFrequencies book = new WordFrequencies("He is John Wick Wick wick Wick is");
        System.out.println(book.count());
        System.out.println("16.3");
        Intersection intersection = new Intersection(5, 3, 6, 4, 8, 9, 20, 9);
        intersection.calculate();
        System.out.println("(x,y) = (" + intersection.x + ", " + intersection.y + ")");
        System.out.println("Line 1: " + intersection.m1 + "x + " + intersection.b1);
        System.out.println("Line 2: " + intersection.m2 + "x + " + intersection.b2);
        System.out.println("16.4");
        char[][][] unit_testing = {{{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'X', 'O'}}, {{'O', 'X', 'X'}, {'O', 'O', 'X'}, {'X', 'X', 'O'}}, {{'X', 'O', 'O'}, {'O', 'X', 'X'}, {'X', 'O', 'X'}}, {{'0', 'X', 'O'}, {'X', 'X', 'O'}, {'O', 'O', 'X'}}};
        for (char[][] test : unit_testing) {
            TicTacToe tictactoe = new TicTacToe(test);
            if (tictactoe.hasWon()) {
                System.out.println("Game " + Arrays.deepToString(test) + " is won.");
            } else {
                System.out.println("Game " + Arrays.deepToString(test) + " is lost.");
            }
        }
        System.out.println("16.5");
        int n = 10;
        FactorialZeros trailingZeros = new FactorialZeros(n);
        int result = trailingZeros.countTrailingZeros();
        System.out.println("Number of trailing zeros in " + n + "! = " + result);
        System.out.println("16.6");
        SmallestDifference smallestDifference = new SmallestDifference(new int[]{1, 3, 15, 11, 2}, new int[]{23, 127, 235, 4, 18});

        System.out.println(smallestDifference.calculate());
        System.out.println("16.7");
        System.out.println("Max numbers: ");
        NumberMax numberMax = new NumberMax(15, 5);
        System.out.println(numberMax.findMax());
        NumberMax numberMax2 = new NumberMax(8, 30);
        System.out.println(numberMax2.findMax());
        NumberMax numberMax3 = new NumberMax(0, 4);
        System.out.println(numberMax3.findMax());

        System.out.println("16.8");
//        EnglishInt englishInt = new EnglishInt(100000);
//        englishInt.describe();
        System.out.println("16.9");
        HashMap<String, List<Integer>> people = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            String[] names = {"Alice", "Bob", "Charlie", "David", "Emma", "Fiona", "George", "Hannah", "Isaac", "Julia"};
            String name = names[random.nextInt(names.length)];
            int birthYear = random.nextInt(100) + 1920; // Random birth year between 1920 and 2019
            int deathYear = birthYear + random.nextInt(80); // Random death year up to 80 years after birth
            List<Integer> values = new ArrayList<>();
            values.add(0, birthYear);
            values.add(1, deathYear);
            people.put(name, values);
        }
        LivingPeople livingPeople = new LivingPeople(people);
        System.out.println(livingPeople.YearMostPeopleAlive());
        System.out.println("16.10");
        System.out.println("16.11");
//        System.out.println("16.12");
//        System.out.println("16.13");
        System.out.println("16.14");
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int x = random.nextInt(20);
            int y = random.nextInt(20);
            points.add(new Point(x, y));
        }
        BestLine bestLine = new BestLine(points);
        ;
        System.out.println(bestLine.calculate());
//        System.out.println("16.15");
//        System.out.println("16.16");
//        System.out.println("16.17");
//        System.out.println("16.18");
//        System.out.println("16.19");
//        System.out.println("16.20");
//        System.out.println("16.21");
//        System.out.println("16.22");
//        System.out.println("16.23");
//        System.out.println("16.24");
//        System.out.println("16.25");
//        System.out.println("16.26");
//        System.out.println("16.27");
        System.out.println("16.28");
        LRUCache lruCache = new LRUCache(5);
        String[] animals = {
                "Lion", "Elephant", "Giraffe", "Tiger", "Kangaroo", "Zebra", "Monkey"
        };
        String[] birthYears = {
                "2015", "2000", "1998", "2012", "2018", "2005", "2010"
        };
        for (int i = 0; i < animals.length-2; i++) {
            lruCache.add(new CacheMap(animals[i], birthYears[i]));
        }
        System.out.println(lruCache.findValue("Elephant")); // 2000
        for (int i = 5; i < animals.length; i++) {
            lruCache.add(new CacheMap(animals[i], birthYears[i]));
        }
        System.out.println(lruCache.findValue("Elephant")); // null
        lruCache.print();
//        lion and elephant with values 2015 and 2000 are lru so will be removed.
//        System.out.println("16.29");
    }
}

/**
 * Write a function to swap a number in place (that is, without temporary variables).
 * Hints: #492, #716, #737
 */
class NumberSwapper {
    int x;
    int y;

    NumberSwapper(int xx, int yy) {
        x = xx;
        y = yy;
    }

    void swap() {
        x = x | y; // ==x^y
        y = x | y; // ==x^y
        x = x | y; // ==x^y
    }
}

/**
 * Design a method to find the frequency of occurrences of any given word in a book. What if we were running this algorithm multiple times?
 * Hints: #489, #536
 */
class WordFrequencies {
    String text;

    WordFrequencies(String booktext) {
        text = booktext;
    }

    LinkedHashMap<String, Integer> count() {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (lhm.containsKey(word)) {
                Integer value = lhm.get(word) + 1;
                lhm.put(word, value);
            } else {
                lhm.put(word, 1);
            }
        }
        return lhm;
    }
}

/**
 * DONE
 * Given two straight line segments (represented as a start point and an end point), compute the point of intersection, if any.
 * calculate m = (y2-y1)/(x2-x1), b = y-m+x, intersection: int_x = ((b2-b1)/(m1-m2)), y_int = m(x_int) + b
 * Hints: #465, #472, #497, #517, #527
 */
class Intersection {
    private final int osx1;
    private final int osy1;
    private final int oex1;
    private final int oey1;
    private final int osx2;
    private final int osy2;
    private final int oex2;
    private final int oey2;
    float x;
    float y;
    float m1;
    float m2;
    float b1;
    float b2;

    Intersection(int sx1, int sy1, int ex1, int ey1, int sx2, int sy2, int ex2, int ey2) {
        osx1 = sx1;
        osy1 = sy1;
        oex1 = ex1;
        oey1 = ey1;
        osx2 = sx2;
        osy2 = sy2;
        oex2 = ex2;
        oey2 = ey2;
    }

    void calculate() {
        m1 = (float) (oey1 - osy1) / (oex1 - osx1);
        m2 = (float) (oey2 - osy2) / (oex2 - osx2);

        b1 = oey1 - m1 * oex1;
        b2 = oey2 - m2 * oex2;
        x = ((b2 - b1) / (m1 - m2));
        y = (m1 * x + b1);
    }
}

/**
 * DONE
 * Design an algorithm to figure out if someone has won a game of tic-tac-toe.
 * Hints: #710, #732
 * Setup: Draw a 3x3 grid on a piece of paper or use a Tic-Tac-Toe board if available. Decide which player will be "X" and which will be "O."
 * Gameplay:
 * Players take turns placing their symbol ("X" or "O") in an empty cell of the grid.
 * The first player starts by placing their symbol in any empty cell.
 * Players alternate turns, placing their symbols one at a time.
 * Winning:
 * The game is won by getting three of your symbols in a row, either horizontally, vertically, or diagonally.
 * The winning player should announce their victory by pointing out the winning line.
 * Draw:
 * If all cells are filled and no player has three symbols in a row, the game is a draw (also known as a tie or stalemate).
 */
class TicTacToe {
    private final char[][] objOutcomes;

    TicTacToe(char[][] outcomes) {
        objOutcomes = outcomes;
    }

    boolean hasWon() {
//        [[0,0,0],[0,0,0],[0,0,0]]
        if (objOutcomes[0][0] == objOutcomes[0][1] && objOutcomes[0][0] == objOutcomes[0][2]) {
            return true;
        } else if (objOutcomes[1][0] == objOutcomes[1][1] && objOutcomes[1][0] == objOutcomes[1][2]) {
            return true;
        } else if (objOutcomes[2][0] == objOutcomes[2][1] && objOutcomes[2][0] == objOutcomes[2][2]) {
            return true;
        } else if (objOutcomes[0][1] == objOutcomes[1][1] && objOutcomes[0][1] == objOutcomes[2][1]) {
            return true;
        } else if (objOutcomes[0][2] == objOutcomes[1][2] && objOutcomes[0][2] == objOutcomes[2][2]) {
            return true;
        } else if (objOutcomes[0][0] == objOutcomes[1][1] && objOutcomes[0][0] == objOutcomes[2][2]) {
            return true;
        } else if (objOutcomes[0][2] == objOutcomes[1][1] && objOutcomes[0][2] == objOutcomes[2][0]) {
            return true;
        } else {
            return false;
        }

    }
}

/**
 * Write an algorithm which computes the number of trailing zeros in n factorial.
 * Hints: #585, #711, #729, #733, #745
 */
class FactorialZeros {
    private int n;

    FactorialZeros(int num) {
        n = num;
    }

    int countTrailingZeros() {
        int count = 0;

        // Divide n by powers of 5 and accumulate the results
        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }
}

/**
 * Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.
 * EXAMPLE
 * Input: {1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
 * Output: 3. That is, the pair (11 , 8).
 * Hints: #632, #670, #679
 */
class SmallestDifference {
    private final int[] objArr1;
    private final int[] objArr2;

    SmallestDifference(int[] arr1, int[] arr2) {
        objArr1 = arr1;
        objArr2 = arr2;
    }

    Integer calculate() {
        Integer smallest_diff = null;
        for (int x : objArr1) {
            for (int y : objArr2) {
                int diff = x - y;
                if (diff >= 0) {
                    if (smallest_diff == null) {
                        smallest_diff = diff;
                    } else if (diff < smallest_diff) {
                        smallest_diff = diff;
                    }
                }

            }
        }

        return smallest_diff;
    }
}

/**
 * Write a method that finds the maximum of two numbers. You should not use if-else or any other comparison operator.
 * Hints: #473, #513, #707, #728
 */
class NumberMax {
    int objA;
    int objB;

    NumberMax(int a, int b) {
        objA = a;
        objB = b;
    }

    int findMax() {
//        calculate difference
        int diff = objA - objB;
//        calculate signbit
//        shift 1 bit from 32 with the right shift operator >> from 32 to 31 to calculate sign difference to isolate the signbit
//        The bitwise AND operation (&) with 0x1 (which is 00000001 in binary) extracts the least significant bit, which represents the sign.
        int sighbit = (diff >> 31) & 0x1;
//        calculate max using XOR
        return objA - diff * sighbit;
    }
}

/**
 * Given any integer, print an English phrase that describes the integer (e.g., "One Thousand, Two Hundred Thirty Four").
 * Hints: #502, #588, #688
 */
class EnglishInt {
    long n;

    EnglishInt(long number) {
        n = number;

    }

    public String describe() {
        String[] singlets = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tenFold = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundred"};
        String[] thousandFold = {"Thousand", "Million", "Billion", "Trillion", "Quadrillion", "Quintillion"};
        Map<String, Integer> singletsMap = new LinkedHashMap<>();
        Map<String, Integer> tenFoldMap = new LinkedHashMap<>();
        Map<String, Long> thousandFoldMap = new LinkedHashMap<>();
        for (int i = 0; i < singlets.length; i++) {
            singletsMap.put(singlets[i], i);
        }
        for (int i = 1; i <= tenFold.length; i++) {
            tenFoldMap.put(tenFold[i - 1], i * 10);
        }
        long previous = 1;
        // I used long because Trillion didnt work with integer
        for (String s : thousandFold) {
            previous *= 1000;
            thousandFoldMap.put(s, previous);
        }
        ArrayList<String> numberParts = new ArrayList<>();
        String number = Long.toString(n);
        for (int i = 0; number.length() > i; i += 3) {
            try {
                numberParts.add(number.substring(i, i + 4));
            } catch (StringIndexOutOfBoundsException e) {
                numberParts.add(number.substring(i, -1));
            }
        }
        System.out.println(numberParts);
        return "";
    }
}

/**
 * Write methods to implement the multiply, subtract, and divide operations for integers. The results of all of these are integers. Use only the add operator.
 * Hints: #572, #600, #613, #648
 */
class Operations {
    static int Operationsmethod() {
        return 0;
    }
}

/**
 * Given a list of people with their birth and death years, implement a method to compute the year with the most number of people alive. You may assume that all people were born between 1900 and 2000 (inclusive). If a person was alive during any portion of that year, they should be included in that year's count. For example, Person (birth = 1908, death = 1909) is included in the counts for both 1908 and 1909.
 * Hints: #476, #490, #507, #514, #523, #532, #541, #549, #576
 */
class LivingPeople {
    HashMap<String, List<Integer>> people;

    LivingPeople(HashMap<String, List<Integer>> p) {
        people = p;
    }

    String YearMostPeopleAlive() {
        HashMap<Integer, Integer> count = new HashMap<>();
        int smallestYear = 2300;
        int biggestYear = 0;
        for (Map.Entry<String, List<Integer>> entry : people.entrySet()) {
            List<Integer> value = entry.getValue();
            if (value.get(0) < smallestYear) {
                smallestYear = value.get(0);
            }
            if (value.get(1) > biggestYear) {
                biggestYear = value.get(1);
            }


        }
        for (int i = smallestYear; i <= biggestYear; i++) {
            count.put(i, 0);

        }
        for (Map.Entry<String, List<Integer>> entry : people.entrySet()) {
            List<Integer> value = entry.getValue();
            int min = value.get(0);
            int max = value.get(1);
            for (Map.Entry<Integer, Integer> year : count.entrySet()) {
                Integer key = year.getKey();
                Integer val = year.getValue();
                if (key >= min && key <= max) {
                    val += 1;
                    count.put(key, val);
                }
            }
        }
        Integer highestNumber = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            Integer value = entry.getValue();
            if (value > highestNumber) {
                highestNumber = value;
            }
        }
        List<Integer> mostPeopleAlive = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value.equals(highestNumber)) {
                mostPeopleAlive.add(key);
            }

        }
        return mostPeopleAlive.toString();
    }
}

/**
 * You are building a diving board by placing a bunch of planks of wood end-to-end. There are two types of planks, one of length shorter and one of length longer. You must use exactly K planks of wood. Write a method to generate all possible lengths for the diving board.
 * Hints: #690, #700, #715, #722, #740, #747
 */
class DivingBoard {
    static int DivingBoardmethod() {
        return 0;
    }
}

/**
 * Since XML is very verbose, you are given a way of encoding it where each tag gets mapped to a pre-defined integer value. The language/grammar is as follows:
 * Element --> Tag Attributes END Children END
 * Attribute --> Tag Value
 * END --> e
 * Tag --> some predefined mapping to int
 * Value --> string value
 * For example, the following XML might be converted into the compressed string below (assuming a mapping of family - > 1, person - >2, firstName - > 3, lastName - > 4, state - > 5).
 * <family lastName="McDowell" state="CA">
 * <person firstName="Gayle">Some Message</person>
 * </family>
 * Becomes:
 * 1 4 McDowell 5 CA e 2 3 Gayle e Some Message e e
 * Write code to print the encoded version of an XML element (passed in Element and Attribute objects).
 * Hints: #466
 */
class XMLEncoding {
    static int XMLEncodingmethod() {
        return 0;
    }
}

/**
 * Given two squares on a two-dimensional plane, find a line that would cut these two squares in half. Assume that the top and the bottom sides of the square run parallel to the x-axis.
 * Hints: #468, #479, #528, #560
 */
class BisectSquares {
    BisectSquares() {

    }

    int BisectSquaresmethod() {
        return 0;
    }
}

/**
 * Given a two-dimensional graph with points on it, find a line which passes the most number of points.
 * Hints: #491, #520, #529, #563
 */
class BestLine {
    ArrayList<Point> points;

    BestLine(ArrayList<Point> p) {
        points = p;
    }

    String calculate() {
        HashSet<Point[]> permutations = new HashSet<>();
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Point[] point_set = {points.get(i), points.get(i + 1)};
                permutations.add(point_set);
            }
        }
        Map<String, Integer> formulas = new HashMap<>();


        for (Point[] p : permutations) {
            try {
                int m = (p[1].y - p[0].y) / (p[1].x - p[0].x);
                int b = p[1].y - (m * p[1].x);
                String formula = m + "x+" + b;
                if (formulas.containsKey(formula)) {
                    int value = formulas.get(formula) + 1;
                    formulas.put(formula, value);
                } else {
                    formulas.put(formula, 1);
                }
            } catch (ArithmeticException ignored) {
            }

        }
        String mostCommon = "";
        int highest = 0;
        for (Map.Entry<String, Integer> entry : formulas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > highest) {
                highest = value;
                mostCommon = key;
            }
        }
        return mostCommon;
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/**
 * The Game of Master Mind is played as follows: The computer has four slots, and each slot will contain a ball that is red (R), yellow (V), green (G) or blue (B). For example, the computer might have RGGB (Slot #1 is red, Slots #2 and #3 are green, Slot #4 is blue). You, the user, are trying to guess the solution. You might, for example, guess YRGB. When you guess the correct color for the correct slot, you get a "hit:" If you guess a color that exists but is in the wrong slot, you get a "pseudo-hit:" Note that a slot that is a hit can never count as a pseudo-hit. Write a method that, given a guess and a solution, returns the number of hits and pseudo-hits.
 * Hints: #639, #730
 */
class MasterMind {
    static int MasterMindmethod() {
        return 0;
    }
}

/**
 * Given an array of integers, write a method to find indices m and n such that if you sorted elements m through n, the entire array would be sorted. Minimize n - m (that is, find the smallest such sequence).
 * EXAMPLE
 * Input: 1, 2, 4, 7, 11, 7, 12, 6, 7, 16, 18, 19
 * Output: (3, 9)
 * Hints: #482, #553, #667, #708, #735, #746
 */
class SubSort {
    static int SubSortmethod() {
        return 0;
    }
}

/**
 * You are given an array of integers (both positive and negative). Find the contiguous sequence with the largest sum. Return the sum.
 * EXAMPLE
 * Input: 2, -8, 3, -2, 4, -10
 * Output: 5 (i.e., {3, -2, 4})
 * Hints: #531, #551, #567, #594, #614
 */
class ContiguousSequence {
    static int ContiguousSequencemethod() {
        return 0;
    }
}

/**
 * You are given two strings, pattern and value. The pattern string consists of just the letters a and b, describing a pattern within a string. For example, the string catcatgocatgo matches the pattern aabab (where cat is a and go is b). It also matches patterns like a, ab, and b. Write a method to determine if value matches pattern.
 * Hints: #631, #643, #653, #663, #685, #718, #727
 */
class PatternMatching {
    static int PatternMatchingmethod() {
        return 0;
    }
}

/**
 * You have an integer matrix representing a plot of land, where the value at that location represents the height above sea level. A value of zero indicates water. A pond is a region of water connected vertically, horizontally, or diagonally. The size of the pond is the total number of connected water cells. Write a method to compute the sizes of all ponds in the matrix.
 * EXAMPLE
 * Input:
 * 1 2 1 0
 * 0 1 0 1
 * 1 1 0 1
 * 0 1 0 1
 * Output: 2, 4, 1 (in any order)
 * Hints: #674, #687, #706, #723
 */
class PondSizes {
    static int PondSizesmethod() {
        return 0;
    }
}

/**
 * On old cell phones, users typed on a numeric keypad and the phone would provide a list of words that matched these numbers. Each digit mapped to a set of 0 - 4 letters. Implement an algorithm to return a list of matching words, given a sequence of digits. You are provided a list of valid words (provided in whatever data structure you'd like).
 * The mapping is shown in the diagram below:
 * 1 2 3
 * abc def
 * 4 5 6
 * ghi jkl mno
 * 7 8 9
 * pqrs tuv wxyz
 * 0
 * EXAMPLE
 * Input: 8733
 * Output: tree, used
 * Hints: #471, #487, #654, #703, #726, #744
 */
class T9 {
    static int T9method() {
        return 0;
    }
}

/**
 * Given two arrays of integers, find a pair of values (one value from each array) that you can swap to give the two arrays the same sum.
 * EXAMPLE
 * Input: (4, 1, 2, 1, 1, 2) and (3, 6, 3, 3)
 * Output: (1, 3)
 * Hints: #545, #557, #564, #571, #583, #592, #602, #606, #635
 */
class SumSwap {
    static int SumSwapmethod() {
        return 0;
    }
}

/**
 * Langton's Ant: An ant is sitting on an infinite grid of white and black squares. It initially faces right. At each step, it does the following:
 * (1) At a white square, flip the color of the square, turn 90 degrees right (clockwise), and move forward one unit.
 * (2) At a black square, flip the color of the square, turn 90 degrees left (counter-clockwise), and move forward one unit.
 * Write a program to simulate the first K moves that the ant makes and print the final board as a grid.
 * Hints: #474, #487, #533, #540, #559, #570, #599, #676, #627
 */
class LangtonsAnt {
    static int LangtonsAntmethod() {
        return 0;
    }
}

/**
 * Rand7 from Rand5: Implement a method rand7() given rand5(). That is, given a method that generates a random number between 0 and 4 (inclusive), write a method that generates a random number between 0 and 6 (inclusive).
 * Hints: #505, #574, #637, #668, #697, #720
 */
class Rand7fromRand5 {
    static int Rand7fromRand5method() {
        return 0;
    }
}

/**
 * Pairs with Sum: Design an algorithm to find all pairs of integers within an array which sum to a specified value.
 * Hints: #548, #597, #644, #673
 */
class PairswithSum {
    static int PairswithSummethod() {
        return 0;
    }
}

/**
 * LRU Cache: Design and build a "least recently used" cache,
 * which evicts the least recently used item. The cache should
 * map from keys to values (allowing you to insert and retrieve
 * a value associated with a particular key) and be initialized
 * with a max size. When it is full, it should evict the
 * least recently used item.
 * Hints: #524, #630, #694
 */
class CacheMap {
    private final String k;
    private String v;

    CacheMap(String key, String value) {
        k = key;
        v = value;
    }
    public String getK() {
        return k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}

class LRUCache {

    Queue<CacheMap> lru = new LinkedList<>();

    int length;

    LRUCache(int size) {
        length = size;
    }

    void add(CacheMap data) {
        if (lru.size() < length) {
            lru.add(data);
        } else if (lru.size() == length) {
            lru.remove();
            lru.add(data);
        } else {
            lru.remove();
        }
    }

    String findValue(String key){
        for (CacheMap d : lru) {
            if (Objects.equals(d.getK(), key)){
                return d.getV();
            }
        }
        return null;
    }

    void print() {
        for (CacheMap d : lru
        ) {
            System.out.println(d.getK() + ": " + d.getV());
        }
    }
}

/**
 * Calculator: Given an arithmetic equation consisting of positive integers, +, -, * and / (no parentheses), compute the result.
 * EXAMPLE
 * Input: 2*3+5/6*3+15
 * Output: 23.5
 * Hints: #527, #624, #665, #698
 */
class Calculator {
    String eq;
    Calculator(String equation){
        eq=equation;
    }
    int analyze() {
        if (eq.contains("=") && eq.contains("+") || eq.contains("-") || eq.contains("*") || eq.contains("/")){
            if (!eq.contains("(") && !eq.contains(")")){
                String[] parts = eq.split("\\d+");
                if (Objects.equals(parts[0], "=")){

                }
                else {

                }

            }
            else {
                throw new ArithmeticException("equation contains improper characters: ( and )");
            }
        }
        else {
            throw new ArithmeticException("equation contains insufficient symbols to be an equation");
        }
        return 0;
    }
}