import java.util.Scanner;

public class BMICalculator {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        
        //weight
        System.out.println("Enter the weight in kilogram:");
        double weight= scanner.nextDouble();
        
        //height
        System.out.println("Enter the height in meter:");
        double height = scanner.nextDouble();
        //add height and weight in bmi
        double bmi=calculateBMI(weight,height);
        System.out.println("your bmi is :"+bmi);
        scanner.close();
         
    }
    public static double calculateBMI(double weight,double height){
        return weight/(height*height);
    }
    
}