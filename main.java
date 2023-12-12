package ss4.QuadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri a");
        double a = scanner.nextDouble();
        System.out.println("nhap gia tri b");
        double b = scanner.nextDouble();
        System.out.println("nhap gia tri c");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a , b, c );
        double delta = equation.getDiscriminant();
        if (delta > 0 ){
            System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if ( delta == 0){
            System.out.println("The root is " + equation.getRoot2());
        } else {
            System.out.println("The equation has no roots");
        }




    }



}
