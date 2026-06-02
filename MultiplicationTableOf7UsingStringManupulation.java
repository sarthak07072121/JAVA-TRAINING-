public class MultiplicationTableOf7UsingStringManupulation {
    public static void main(String[] args) {

        String table = "";

        for (int i = 1; i <= 10; i++) {
            table = table + "7 x " + i + " = " + (7 * i) + "\n";
        }

        System.out.println(table);
    }
}
