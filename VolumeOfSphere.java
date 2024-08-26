import java.util.Scanner;

public class VolumeOfSphere {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
        double r = sc.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("The volume of the sphere is " + volume);
        sc.close();
    }
}