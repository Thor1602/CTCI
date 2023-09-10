public class Chapter5 {
    /**
     * @param args
     * NOT (~)
     * OR operator (|)
     * AND (&)
     * XOR operation (^)
     * Left shift: <<
     * Arithmetic/signed right shift: >>
     * Logical/unsigned right shift: >>>
     */
    public static void main(String[] args) {
//      book example
        bitOperations bo = new bitOperations(5,0);
        bo.getBit();
        bo = new bitOperations(16,0);
        System.out.println(bo.cleanBit());
        bo = new bitOperations(16,2);
        System.out.println(bo.cleanBit());
        bo = new bitOperations(16,3);
        System.out.println(bo.cleanBit());

//        5.1 (STUDY MORE)
        Insertion inse = new Insertion();
        System.out.println(inse.insertMIntoN(1000000000, 10011, 2, 6));

//        5.2 (STUDY MORE)
        BinaryToString ins = new BinaryToString(20);
        System.out.println(ins.change());
//        5.5
        Debugger deb = new Debugger();
        deb.play(10);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");


    }
}
/**
 * Insertion: You are given two 32-bit numbers, Nand M, and two bit positions, i and
 * j. Write a method to insert Minto N such that M starts at bit j and ends at bit i. You
 * can assume that the bits j through i have enough space to fit all of M. That is, if
 * M = 10011, you can assume that there are at least 5 bits between j and i. You would not, for
 * example, have j = 3 and i = 2, because M could not fully fit between bit 3 and bit 2.
 * EXAMPLE
 * Input: N 10011, i 2, j 6
 * Output: N 10001001100
 * Hints: # 137, #169, #215
 */

class BitTricks{

    /**
     * ^ = XOR >> 1110 + 0100 = 1010 (expl: 1/1 and 0/0 = 0 |||| 0/1 and 1/0 = 1)
     * & = AND >> 1110 + 0100 = 0100 (expl: 1/1 = 1 |||| 0/0 and 0/1 and 1/0 = 0)
     * | = OR >> 1010 + 0100 = 1110 (expl: 0/0 = 0 |||| 1/1 and 0/1 and 1/0 = 1)
     * @param x
     * These bit manipulation equations involve bitwise operations on a variable x with some specific bit masks. Let's break down what each equation means:
     * x^0s = x  >>
     * This equation performs a bitwise XOR (^) operation between x and a bit mask consisting of all zeros (0s).
     * The result is x itself because XORing any value with 0 doesn't change the value.
     * x&0s = 0
     * This equation performs a bitwise AND (&) operation between x and a bit mask consisting of all zeros (0s).
     * The result is always 0 because ANDing any value with 0 results in 0.
     * x|0s = x
     * This equation performs a bitwise OR (|) operation between x and a bit mask consisting of all zeros (0s).
     * The result is x itself because ORing any value with 0 doesn't change the value.
     * x^1s = ~x
     * This equation performs a bitwise XOR (^) operation between x and a bit mask consisting of all ones (1s).
     * The result is the bitwise complement of x (~x), which means all the 1s become 0s, and all the 0s become 1s.
     * x&1s = x
     * This equation performs a bitwise AND (&) operation between x and a bit mask consisting of all ones (1s).
     * The result is x itself because ANDing any value with 1 doesn't change the value.
     * x|1s = 1s
     * This equation performs a bitwise OR (|) operation between x and a bit mask consisting of all ones (1s).
     * The result is a bit mask consisting of all ones (1s) because ORing any value with 1 sets all the bits to 1.
     * x^x = 0
     * This equation performs a bitwise XOR (^) operation between x and itself.
     * The result is all zeros (0) because XORing a value with itself results in all bits being turned off (set to 0).
     * x&x = x
     * This equation performs a bitwise AND (&) operation between x and itself.
     * The result is x itself because ANDing a value with itself preserves the original value.
     * x|x = x
     * This equation performs a bitwise OR (|) operation between x and itself.
     * The result is x itself because ORing a value with itself preserves the original value.
     */

}

class bitOperations{
    int num;
    int i;

    bitOperations(int num, int i){
        this.num=num;
        this.i=i;
    }
    boolean getBit(){
        int r = 1 << i;
        r = num & r;
        return r != 0;
    }
    int setBit(){
        int r = 1 << i;
        System.out.println("num: " + Integer.toBinaryString(num) + ". r: " + Integer.toBinaryString(r) + ". Result: " + Integer.toBinaryString(num | r));
        return num | r;
    }
    int updateBit(int value){
        int mask = ~(1<<i); // if i = 0, then 1. Reversed = ~11111110
        int right = value << i;  // if i = 0 and value = 1 then ~00000001
        int left = num & mask; // if num = 6 ~00000110 & ~11111110 = ~00000110
        return left | right; // ~00000110 (6) | ~00000001 (1) = ~00000111 (7)
    }
    int cleanBit(){
        System.out.println(-1<<i);
        int mask = ~(1<<i); // if i = 2, then 100. Reversed = 1111111111111011
        return num & mask;
    }
}
class Insertion{
    String insertMIntoN(Integer N,Integer M, Integer i, Integer j){
        // Create a mask to clear the bits from i to j in N
        int allOneMask = ~0;
        String test=Integer.toBinaryString(allOneMask);
        int left = allOneMask << (j + 1);
        test=Integer.toBinaryString(left);
        int right = (1 << i) - 1;
        test=Integer.toBinaryString(right);
        int mask = left | right;
        test=Integer.toBinaryString(mask);
        // Clear bits from i to j in N
        N &= mask;
        test=Integer.toBinaryString(N);
        // Shift M to align with bits i to j in N
        M <<= i;
        System.out.println(Integer.toBinaryString(M));
        // Merge M and N
        return Integer.toBinaryString(N | M);
    }
}
/**
 * Binary to String: Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double, print
 * the binary representation. If the number cannot be represented accurately in binary with at most 32
 * characters, print "ERROR:'
 * Hints: #143, #167, #173, #269, #297
 */
class BinaryToString {
    double n;
    BinaryToString(double number){
        n=number;
    }
    String change() {
        long bits = Double.doubleToRawLongBits(n);
        StringBuilder binary = new StringBuilder();
        for (int i = 63; i >= 0; i--) {
            long mask = 1L << i;
//          The L suffix indicates that it's a long integer literal.
            long bit = (bits & mask) == 0 ? 0 : 1;
//          conditionResult ? iftrue : iffalse;
            binary.append(bit);
        }
        return binary.toString();
    }
}
/**
 * Debugger: Explain what the following code does: ( (n & (n - 1) ) ==0).
 * ANSWER the code uses the bitwise AND operator which will simulate an AND gate between the number n and n-1
 * It will always return false unless n is 2^x which can be 1,2,4,8,16,32,64,128,etc...
 * That is because the previous number of 2^x in bits is always the opposite (32=10000 and 31=01111, 4=100 and 3=011)
 * EXAMPLE 1 1000 (8) & 0111 (7) equals zero (=0000) because both need to be 1.
 * EXAMPLE 2 111 (7) &  110(6) equals not zero (=110 or 6) because the first and second bit are both 1
 * Hints: #151, #202, #261, #302, #346, #372, #383, #398
 */
class Debugger{

    void play(int number){
        for(int n = number; n>0;n--){
            System.out.println((n & (n - 1)) == 0);
        }
    }
}
