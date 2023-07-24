import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Question 1: ");
        System.out.println("Please Enter First Number:");
        int num_1 = input.nextInt();
        System.out.println("Please Enter Second Number:");
        int num_2 = input.nextInt();

        System.out.println("The sum is : "+ (num_1 + num_2));
        System.out.println("The subtract : "+(num_1 - num_2));
        System.out.println("The multiply : "+ (num_1 * num_2));
        System.out.println("The divide is : "+ (num_1 / num_2));
        System.out.println("The remainder of two numbers : " + (num_1 % num_2));

        System.out.println("__________________________________________________");
        System.out.println("Question 2 :");
        System.out.println("Convert the String into lower case\n Please Enter the String");
        String input_string = input.nextLine();

        System.out.println("Before Convert : "+ input_string.toUpperCase());
        System.out.println("After Convert : "+ input_string.toLowerCase());

        System.out.println("__________________________________________________");
        System.out.println("Question 3: ");
        System.out.println("In this part, Enter any string and the index from that string");
        System.out.println("Please Enter the string");
        String str_user = input.nextLine();
        System.out.println("Please Enter the index to return the character from that string");
        int index_user = input.nextInt();

        /* to check the user not enter the index that invalid in index */
        if (str_user.length() > index_user)
            System.out.println("The character is : "+ str_user.charAt(index_user));
        else System.out.println("Invalid index");

        System.out.println("__________________________________________________");
        System.out.println("Question 4: ");
        System.out.println("Enter the number to check if even or odd numbers");
        int test_num = input.nextInt();
        int result = test_num % 2;
        if (result != 0){
            System.out.println("The number is odd with result : "+ result);
        }else System.out.println("The number is even with result : "+ result);

        System.out.println("__________________________________________________");
        System.out.println("Question 5: ");
        System.out.println("Enter Your Role to check from the system: ");
        String user_role = input.nextLine();
        if (user_role.equalsIgnoreCase("admin")){
            System.out.println("Welcome admin");
        } else if (user_role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome superuser");
        }else {
            System.out.println("Welcome user");
        }
        System.out.println("__________________________________________________");
        System.out.println("Question 6: ");
        System.out.println("Enter 3 numbers, two number for calculate and compare with the third");
        System.out.println("First number: ");
        int first_num = input.nextInt();
        System.out.println("Second number :");
        int second_num = input.nextInt();
        System.out.println("Third number to compare: ");
        int third_num = input.nextInt();

        boolean compare = (first_num + second_num) == third_num;
        if(compare){
            System.out.println("The result " + compare);
        }else {
            System.out.println("the result "+ compare);
        }
        System.out.println("__________________________________________________");
        System.out.println("Question 7: ");
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2st number: ");
        int num2 = input.nextInt();
        System.out.println("Enter 3st number: ");
        int num3 = input.nextInt();

        int num4 = Math.max(num1, num2);
        int max_num = Math.max(num3,num4);

        System.out.println("The greatest number is : "+ max_num);

        System.out.println("__________________________________________________");
        System.out.println("Question 8: ");
        System.out.println("Please enter the number between 1-7 to display the weekday: ");
        int weekday = input.nextInt();

        switch (weekday){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");
        }


    }
}