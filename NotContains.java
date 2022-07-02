public class NotContains {

    public static void main(String[] args) {
        int[] array = {4, 3, -7, 3};
        System.out.println(notContains(array));
    }

    public static int notContains(int[] array) {
        int integer = 1;
        for (int element : array) {
            if (element == integer) {
                integer++;
            }
        }
        return integer;
    }
}
