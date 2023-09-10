public class Test {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitmask = 1<<pos;
        int result = bitmask & n;

        if (result==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("One");
        }
    }
}
