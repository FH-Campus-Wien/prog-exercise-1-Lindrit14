
package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){


        double myChar = 'Z';
        int charIntoInt = (int) myChar;

        int hexIntoInt = 0xface;

        int octIntoInt = 012;


        long myLong = 80L;
        int longIntoInt = (int) myLong;


        float myFloat1 = 44e-1f;
        int floatIntoInt1 = (int) myFloat1;


        float myFloat2 = 5.5f;
        int floatIntoInt2 = (int) myFloat2;



        double myDouble1 = 8.88e1;
        int doubleIntoInt = (int) myDouble1;


        double myDouble2 = 99.9;
        int doubleIntoInt2 = (int) myDouble2;




        int sum = charIntoInt + hexIntoInt + octIntoInt + longIntoInt + floatIntoInt1 + floatIntoInt2 + doubleIntoInt +doubleIntoInt2;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner sc=new Scanner(System.in);

        int firstNum = sc.nextInt();

        int secondNum = sc.nextInt();


        System.out.println(firstNum + secondNum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner sc=new Scanner(System.in);


        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        System.out.println("After Swap:");
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;

        System.out.println("x: " + firstNum);
        System.out.println("y: " + secondNum);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        System.out.print("n1: ");
        System.out.print("n2: ");
        if (firstNum > secondNum){
            System.out.println("n1 > n2");
        } else if (firstNum < secondNum) {
            System.out.println("n2 > n1");
        }else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){



        Scanner sc = new Scanner (System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = sc.nextInt();

        if (revenue >= 0 && revenue <20000){
            System.out.println("Poor Sales Revenue");
        } else if (revenue>= 20000 && revenue<50000) {
            System.out.println("Average Sales Revenue");
        }else if (revenue>= 50000 && revenue < 80000){
            System.out.println("Good Sales Revenue");
        } else if (revenue >= 80000 && revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }else {
            System.out.println("Invalid Revenue");
        }


    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int commissionClass = sc.nextInt();

        switch(commissionClass) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
            System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }

    }

    //todo Task 9
    public void leapyear(){

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 4 == 0 && year % 400 == 0){
            System.out.println("Year: Leapyear");
        } else if (year % 100 == 0) {
            System.out.println("Year: Not a Leapyear");
        }else {
            System.out.println("Year: Not a Leapyear");
        }


    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner sc= new Scanner(System.in);
        int numToTranspond = sc.nextInt();
        //123
        int ziffer1 = numToTranspond % 10; // 3
        int temp = numToTranspond/10; // 12
        int ziffer2 = temp % 10; // 2
        temp = temp/10; //1

        System.out.println("Number: " + (ziffer1*100 + ziffer2 *10 + temp *1) );
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}