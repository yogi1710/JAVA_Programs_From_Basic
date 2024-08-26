import java.util.Scanner;

class WeatherProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        if (celsius >= 40) {
            System.out.println("It's too hot, I am a cotton cloth.");
        } else if (celsius > 20) {
            System.out.println("I am a cotton cloth, but I am not too hot.");
        } else if (celsius > 10 && celsius <= 20) {
            System.out.println("I am a bit cold.");
        } else if (celsius <= 10) {
            System.out.println("I am too cold, I am a woolen cloth.");
        }
        sc.close();
    }
}