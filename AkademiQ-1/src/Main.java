import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        atmSimulationDemo();
        shoppingDemo();
        trafficTickedCalculation();
        gradeManagement();

    }
    public static void atmSimulationDemo(){

        Scanner scanner = new Scanner(System.in);

        int correctPın = 1234;
        int choice = 0;
        int balance = 1000;
        int amount ;
        int userPın ;
        System.out.println("Enter your password: ");
        userPın = scanner.nextInt();
        if (correctPın == userPın){
            System.out.println("Authentication Successful");
            for (; choice != 4;){
                System.out.println("Press 1 for Balance Check ");
                System.out.println("Press 2 for Deposit ");
                System.out.println("Press 3 for Withdraw ");
                System.out.println("Press 4 for Exit");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("You have " + balance + " money ");
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to deposit 💵");
                        amount = scanner.nextInt();
                        balance = balance + amount;
                        System.out.println(" Now you have " + balance + " money ");
                        break;
                    case 3:

                        System.out.println("Enter the amount you want to withdraw ");
                        amount = scanner.nextInt();
                        if(amount < balance ) {
                            balance = balance - amount;
                            System.out.println(" Now you have " + balance + " money 💵 ");
                        }else{
                            System.out.println("Sorry😒 You do not have enough money ");
                        }
                        break;
                    case 4:
                        System.out.println("Have a nice day 🙌");

                        break;
                    default:
                        System.out.println("Enter a valid choice ");

                }

            }

        }else {
            System.out.println("Password is not correct.Try again later");
            return;
        }
    }
    public static void shoppingDemo(){
        Scanner scanner = new Scanner(System.in);
        double amount =0;
        int choice;
        while (true){
            System.out.println("Welcome to Supermarket\n" +
                    "Enter 1 to buy banana\n" +
                    "Enter 2 to buy apple\n" +
                    "Enter 3 to buy water\n" +
                    "Enter 4 to discount\n"+
                    "Enter 5 to see the bill");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    amount += 10;
                    break;
                case 2:
                    amount += 7;
                    break;
                case 3:
                    amount+=5;
                    break;
                case 4:
                    System.out.println("Discount code applied");
                    amount = amount-amount/10;
                    break;
                case 5:
                    System.out.println("The amount: "+amount);
                    return;
            }
        }

    }

    public static void trafficTickedCalculation(){
        Scanner scanner = new Scanner(System.in);
        int speed;
        System.out.println("Enter the speed: ");
        speed = scanner.nextInt();
        int speedLimit = 90;
        if (speed > speedLimit){
            if (speed<110){
                System.out.println("Ticked: 1000 Tl ");
            } else if (speed > 110 && speed<130) {
                System.out.println("Ticked: 2000 Tl ");
            } else if (speed > 130){
                System.out.println("Your driver's licence has been confiscated");
            }
        }else{
            System.out.println("You are under the speed limit");
        }
    }

    public static void gradeManagement() {
        Scanner scanner = new Scanner(System.in);
        int length = 5;
        int totalGrade = 0;
        int lowGradeCount = 0;
        double averageGrade;
        int maxGrade = 0;
        int minGrade = 100;
        int grade;

        int[] gradeList = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter grade: ");
            grade = scanner.nextInt();
            gradeList[i] = grade;
        }

        for (int i = 0; i < length; i++) {
            totalGrade += gradeList[i];
        }

        for (int i = 0; i < length; i++) {
            if (gradeList[i] > maxGrade) {
                maxGrade = gradeList[i];
            }
        }

        for (int i = 0; i < length; i++) {
            if (gradeList[i] < minGrade) {
                minGrade = gradeList[i];
            }
        }

        averageGrade = totalGrade / (double) length;

        if (averageGrade > 50) {
            System.out.println("Your average grade: " + averageGrade + "  Passed");
        } else {
            System.out.println("Your average grade: " + averageGrade + "  Failed");
        }

        for (int i = 0; i < length; i++) {
            if (gradeList[i] < 30) {
                lowGradeCount++;
            }
        }

        if (lowGradeCount != 0) {
            System.out.println("Warning! You have " + lowGradeCount + " low grades");
        }
        System.out.println("Your maximum grade is " + maxGrade);
        System.out.println("Your minimum grade is " + minGrade);
    }

}