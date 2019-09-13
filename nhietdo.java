import java.util.Scanner;

public class nhietdo {
    public static double celsiustoFahrenheit( double celsius){
        double fahrenheit =9.0/5 * celsius+32;
        return  fahrenheit;
    }
    public  static  double fahrenheittocelsius( double farenheit){
        double celsius =5.0/9*(farenheit-32);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrehenit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choise : ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Celsius is =" + fahrenheittocelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println(" Fahrehenit is =" + celsiustoFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }
}