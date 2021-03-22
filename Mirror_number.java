public class Mirror_number {
    static int number = 123456;

    public static String Mirror_numb (int number){
        String mirror_number = Integer.toString(number);
        return new StringBuilder(mirror_number).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Mirror_numb(number));
    }
}
