public class TemperatureConverter {
    public static void main(String args[]) {
        // implecit type casting mean lower to higher data type
        int celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}