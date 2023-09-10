import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Specify the path of the text file you want to read
        String filePath = "C:\\Users\\thorb\\OneDrive - University of the People\\IntelIJProjects\\test\\test.txt";
        String filePath2 = "C:\\Users\\thorb\\OneDrive - University of the People\\IntelIJProjects\\test\\test2.txt";

        // Create a File object
        File file = new File(filePath);
        File file2 = new File(filePath2);
        LinkedHashMap<String, String> topicDescriptions = new LinkedHashMap<>();

        topicDescriptions.put("16.1", "Write a function to swap a number in place (that is, without temporary variables).\nHints: #492, #716, #737");
        topicDescriptions.put("16.2", "Design a method to find the frequency of occurrences of any given word in a book. What if we were running this algorithm multiple times?\nHints: #489, #536");
        topicDescriptions.put("16.3", "Given two straight line segments (represented as a start point and an end point), compute the point of intersection, if any.\nHints: #465, #472, #497, #517, #527");
        topicDescriptions.put("16.4", "Design an algorithm to figure out if someone has won a game of tic-tac-toe.\nHints: #710, #732");
        topicDescriptions.put("16.5", "Write an algorithm which computes the number of trailing zeros in n factorial.\nHints: #585, #711, #729, #733, #745");
        topicDescriptions.put("16.6", "Given two arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference. Return the difference.\nEXAMPLE\nInput: {1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}\nOutput: 3. That is, the pair (11 , 8).\nHints: #632, #670, #679");
        topicDescriptions.put("16.7", "Write a method that finds the maximum of two numbers. You should not use if-else or any other comparison operator.\nHints: #473, #513, #707, #728");
        topicDescriptions.put("16.8", "Given any integer, print an English phrase that describes the integer (e.g., \"One Thousand, Two Hundred Thirty Four\").\nHints: #502, #588, #688");
        topicDescriptions.put("16.9", "Write methods to implement the multiply, subtract, and divide operations for integers. The results of all of these are integers. Use only the add operator.\nHints: #572, #600, #613, #648");
        topicDescriptions.put("16.10", "Given a list of people with their birth and death years, implement a method to compute the year with the most number of people alive. You may assume that all people were born between 1900 and 2000 (inclusive). If a person was alive during any portion of that year, they should be included in that year's count. For example, Person (birth = 1908, death = 1909) is included in the counts for both 1908 and 1909.\nHints: #476, #490, #507, #514, #523, #532, #541, #549, #576");
        topicDescriptions.put("16.11", "You are building a diving board by placing a bunch of planks of wood end-to-end. There are two types of planks, one of length shorter and one of length longer. You must use exactly K planks of wood. Write a method to generate all possible lengths for the diving board.\nHints: #690, #700, #715, #722, #740, #747");
        topicDescriptions.put("16.12", "Since XML is very verbose, you are given a way of encoding it where each tag gets mapped to a pre-defined integer value. The language/grammar is as follows:\nElement --> Tag Attributes END Children END\nAttribute --> Tag Value\nEND --> e\nTag --> some predefined mapping to int\nValue --> string value\nFor example, the following XML might be converted into the compressed string below (assuming a mapping of family - > 1, person - >2, firstName - > 3, lastName - > 4, state - > 5).\n<family lastName=\"McDowell\" state=\"CA\">\n<person firstName=\"Gayle\">Some Message</person>\n</family>\nBecomes:\n1 4 McDowell 5 CA e 2 3 Gayle e Some Message e e\nWrite code to print the encoded version of an XML element (passed in Element and Attribute objects).\nHints: #466");
        topicDescriptions.put("16.13", "Given two squares on a two-dimensional plane, find a line that would cut these two squares in half. Assume that the top and the bottom sides of the square run parallel to the x-axis.\nHints: #468, #479, #528, #560");
        topicDescriptions.put("16.14", "Given a two-dimensional graph with points on it, find a line which passes the most number of points.\nHints: #491, #520, #529, #563");
        topicDescriptions.put("16.15", "The Game of Master Mind is played as follows: The computer has four slots, and each slot will contain a ball that is red (R), yellow (V), green (G) or blue (B). For example, the computer might have RGGB (Slot #1 is red, Slots #2 and #3 are green, Slot #4 is blue). You, the user, are trying to guess the solution. You might, for example, guess YRGB. When you guess the correct color for the correct slot, you get a \"hit:\" If you guess a color that exists but is in the wrong slot, you get a \"pseudo-hit:\" Note that a slot that is a hit can never count as a pseudo-hit. Write a method that, given a guess and a solution, returns the number of hits and pseudo-hits.\nHints: #639, #730");
        topicDescriptions.put("16.16", "Given an array of integers, write a method to find indices m and n such that if you sorted elements m through n, the entire array would be sorted. Minimize n - m (that is, find the smallest such sequence).\nEXAMPLE\nInput: 1, 2, 4, 7, 11, 7, 12, 6, 7, 16, 18, 19\nOutput: (3, 9)\nHints: #482, #553, #667, #708, #735, #746");
        topicDescriptions.put("16.17", "You are given an array of integers (both positive and negative). Find the contiguous sequence with the largest sum. Return the sum.\nEXAMPLE\nInput: 2, -8, 3, -2, 4, -10\nOutput: 5 (i.e., {3, -2, 4})\nHints: #531, #551, #567, #594, #614");
        topicDescriptions.put("16.18", "You are given two strings, pattern and value. The pattern string consists of just the letters a and b, describing a pattern within a string. For example, the string catcatgocatgo matches the pattern aabab (where cat is a and go is b). It also matches patterns like a, ab, and b. Write a method to determine if value matches pattern.\nHints: #631, #643, #653, #663, #685, #718, #727");
        topicDescriptions.put("16.19", "You have an integer matrix representing a plot of land, where the value at that location represents the height above sea level. A value of zero indicates water. A pond is a region of water connected vertically, horizontally, or diagonally. The size of the pond is the total number of connected water cells. Write a method to compute the sizes of all ponds in the matrix.\nEXAMPLE\nInput: \n1 2 1 0\n0 1 0 1\n1 1 0 1\n0 1 0 1\nOutput: 2, 4, 1 (in any order)\nHints: #674, #687, #706, #723");
        topicDescriptions.put("16.20", "On old cell phones, users typed on a numeric keypad and the phone would provide a list of words that matched these numbers. Each digit mapped to a set of 0 - 4 letters. Implement an algorithm to return a list of matching words, given a sequence of digits. You are provided a list of valid words (provided in whatever data structure you'd like).\nThe mapping is shown in the diagram below:\n1 2 3\nabc def\n4 5 6\nghi jkl mno\n7 8 9\npqrs tuv wxyz\n0\nEXAMPLE\nInput: 8733\nOutput: tree, used\nHints: #471, #487, #654, #703, #726, #744");
        topicDescriptions.put("16.21", "Given two arrays of integers, find a pair of values (one value from each array) that you can swap to give the two arrays the same sum.\nEXAMPLE\nInput: (4, 1, 2, 1, 1, 2) and (3, 6, 3, 3)\nOutput: (1, 3)\nHints: #545, #557, #564, #571, #583, #592, #602, #606, #635");
        topicDescriptions.put("16.22", "Langton's Ant: An ant is sitting on an infinite grid of white and black squares. It initially faces right. At each step, it does the following:\n(1) At a white square, flip the color of the square, turn 90 degrees right (clockwise), and move forward one unit.\n(2) At a black square, flip the color of the square, turn 90 degrees left (counter-clockwise), and move forward one unit.\nWrite a program to simulate the first K moves that the ant makes and print the final board as a grid.\nHints: #474, #487, #533, #540, #559, #570, #599, #676, #627");
        topicDescriptions.put("16.23", "Rand7 from Rand5: Implement a method rand7() given rand5(). That is, given a method that generates a random number between 0 and 4 (inclusive), write a method that generates a random number between 0 and 6 (inclusive).\nHints: #505, #574, #637, #668, #697, #720");
        topicDescriptions.put("16.24", "Pairs with Sum: Design an algorithm to find all pairs of integers within an array which sum to a specified value.\nHints: #548, #597, #644, #673");
        topicDescriptions.put("16.25", "LRU Cache: Design and build a \"least recently used\" cache, which evicts the least recently used item. The cache should map from keys to values (allowing you to insert and retrieve a value associated with a particular key) and be initialized with a max size. When it is full, it should evict the least recently used item.\nHints: #524, #630, #694");
        topicDescriptions.put("16.26", "Calculator: Given an arithmetic equation consisting of positive integers, +, -, * and / (no parentheses), compute the result.\nEXAMPLE\nInput: 2*3+5/6*3+15\nOutput: 23.5\nHints: #527, #624, #665, #698");

        // Print the descriptions
        for (String topic : topicDescriptions.keySet()) {
            System.out.println("Topic " + topic + ": " + topicDescriptions.get(topic));
        }
        try {
            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(file);
            Scanner scanner2 = new Scanner(file2);
            Iterator<Map.Entry<String, String>> iterator = topicDescriptions.entrySet().iterator();

            // Read and print each line of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String classTitle = line.replace(" ", "").replace("'", "");
                Map.Entry<String, String> entry = iterator.next();
                String description = entry.getValue();
                System.out.printf("""
                        /**
                         * %s
                         */
                        class %s {
                            static int %s(){
                                                
                            }
                        }%n""", description, classTitle,classTitle);

            }

            // Close the scanner
            scanner.close();
            scanner2.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
}