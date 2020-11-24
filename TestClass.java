import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона в формате 88001234567 или +78001234567");
        Scanner scanner = new Scanner(System.in);
        String a;
        String check = "(?=.*[a-z])(?=.*[_])(?=.*[A-Z])(?=.*[!@#$%^&*()_№%:«»;><{}])}";
        a = scanner.nextLine();

        String code = null;
        int length = a.length();
        if (a.matches(check)) {
            throw new IllegalArgumentException("Введены недопустимые символы");
        }
            if (a.contains("+")) {
                code = a.substring(1, length-10);
                a = a.substring(length-11);

            }
            if (a.contains("8")) {
                a = a.substring(1);
                code = "7";
            }
            long l = Long.parseLong(a);
            System.out.println("+"+code+ String.valueOf(l).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
    }
}
