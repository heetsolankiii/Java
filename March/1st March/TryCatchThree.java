public class TryCatchThree {
    public static void main(String[] args) {
        try {
            int dataOne = 50 / 0;
        }
        catch(Exception e) {
            int dataTwo = 50 / 0;
        }
        System.out.println("rest of the code...");
    }
}
