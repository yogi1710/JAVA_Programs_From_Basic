import java.util.Scanner;

class VolumeOfSemiSphere {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
        double r = sc.nextDouble();
        double volume = (2 * Math.PI * Math.pow(r, 3)) / 3;
        System.out.println("The volume of the semi-sphere is " + volume);
        sc.close();

    }
}