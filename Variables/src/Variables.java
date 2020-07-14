public class Variables {

    private static int x = 3;
    private static int y = 7;

    private static int a = 12;
    private static int b = 6;

    public static void main(String[] args) {
        int z = x * y;
        int c = a + b;
        float answer = (float)c / z;

        System.out.println(answer);

    }
}
