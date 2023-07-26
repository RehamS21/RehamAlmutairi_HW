import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Question 1: ");
        for (int i = 1; i <= 100; i++) {

            if( i%3 ==0 && i%5 ==0 ){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            } else System.out.println(i);

        }

        System.out.println("_____________________________________");
        System.out.println("Question 2: ");
        System.out.println("Reverse the text");
        String str = "The quick brown fox";
        System.out.println("Before reverse : ");
        System.out.println(str);
        System.out.println("After reverse : ");
        for (int i = str.length() -1 ; i >= 0 ; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

        System.out.println("_____________________________________");
        System.out.println("Question 3: ");
        System.out.println("Please Enter a positive integer or 0 to quit ");
        int input_user = input.nextInt();

        do{
            if(input_user == 0)
                break;
        // to check the positive numbers
        if(input_user > 0) {
            System.out.println("The multiplication of "+ input_user +" =");
            for (int i = 1; i <= 10; i++) {
                System.out.println(input_user+" * "+ i +" = "+ input_user * i);
            }
        }else{
            System.out.println("The number is a negative, try again ");
        }

            System.out.println("Please Enter a Positive integer or 0 to quit ");
             input_user = input.nextInt();

        }while (true);

        System.out.println("_____________________________________");
        System.out.println("Question 4: ");

        System.out.println("This part for a factorial value");
        System.out.println("Please enter factorial number, or 0 to quit");
        int factorial = input.nextInt();
        do{
            if (factorial == 0) break;

            int result_factorial = 1;
            for (int i =factorial ; i > 0 ; i--){
                result_factorial *= i;
            }
            System.out.println("The result of factorial = "+ result_factorial);
            System.out.println("Please enter factorial number, or 0 to quit");
             factorial = input.nextInt();
        }while (true);



        System.out.println("_____________________________________");
        System.out.println("Question 5: ");
        System.out.println("Please enter two number for power");
        System.out.println("Enter first number : ");
        int first_num = input.nextInt();
        System.out.println("Enter second number that will be a power : ");
        int second_num = input.nextInt();
        int power = 1;

        for (int i = 1; i <= second_num; i++) {
            power *= first_num;
        }
        System.out.println("The result of power  = "+ power);
        System.out.println("_____________________________________");
        System.out.println("Question 6: ");
        System.out.println("Please enter the numbers to sum the even and odd integers, or 0 to quit");
        int num_user = input.nextInt();
        int even = 0;
        int odd  = 0;
        do{
            if(num_user == 0) break;
            if(num_user%2 == 0){
                even += num_user;
            }else{
                odd += num_user;
            }
            System.out.println("Please enter the numbers to sum the even and odd integers, or 0 to quit");
             num_user = input.nextInt();
        }while (true);

        System.out.println("The sum of even number = "+ even+"\n" +
                "The sum of odd number = "+odd);
        System.out.println("_____________________________________");
        System.out.println("Question 7: ");
        System.out.println("We check the number is prime or not");
        System.out.println("Please enter positive integer to check the prime number or 0 to quit");
        int test_prim = input.nextInt();
        boolean find_prim = false;
        do{
            if (test_prim == 0) break;
            if(test_prim > 0) {

                if(test_prim == 1) {
                    find_prim = true;
                } else {
                    for (int i = 2; i < test_prim; i++)
                    {
                        // to check the integers that is not prime
                        if(test_prim % i == 0){
                            find_prim = true;
                        }
                    }
                }
                if(find_prim){
                    System.out.println(test_prim+ " is a not prime number");
                }else{
                    System.out.println(test_prim + " is prime number");
                }

            }else {
                System.out.println("incorrect number, try again");
            }
            System.out.println("Please enter positive integer to check the prime number or 0 to quit");
             test_prim = input.nextInt();
             find_prim = false;
        }while (true);
        System.out.println("_____________________________________");
        System.out.println("Question 8: ");
        System.out.println("In this part, we will count the number of zeros, positive, and negative number");
        String str_new = input.nextLine();

        System.out.println("Enter the numbers, or A to exit ");
        String test_num = input.nextLine();

        int count_positive = 0;
        int count_negative = 0;
        int count_zeros = 0;

        do{
            if(test_num.equalsIgnoreCase("A")){
                break;
            } else {
                int convert_to_int = 0;
                try {
                    convert_to_int = Integer.parseInt(test_num);
                }
                catch (Exception e){
                    System.out.println("This is not number : " +e.getMessage());
                    break;
                }
                if(convert_to_int > 0){
                    count_positive++;
                } else if (convert_to_int < 0) {
                    count_negative ++;
                }else if (convert_to_int == 0){
                    count_zeros++;
                }else{
                    System.out.println("Incorrect input");
                }
            }
            System.out.println("Enter the numbers, or A to exit ");
             test_num = input.nextLine();

        }while (true);

        System.out.println("Count of positive numbers = "+ count_positive+"\n" +
                "Count of negative numbers ="+ count_negative+"\n" +
                "Count of zeros = "+count_zeros);

        System.out.println("_____________________________________");
        System.out.println("Question 9: ");

        for (int i = 1 ; i <= 4 ; i++){
            System.out.println("Week "+ i);
            for (int j = 1 ; j <= 7 ; j++){
                System.out.println("Day "+ j);
            }
        }
        System.out.println("_____________________________________");
        System.out.println("Question 10: ");
        System.out.println("Enter the word to check if palindrome or not");
        String word = input.nextLine();
        String test_word ="";

        for(int i = word.length() -1; i >= 0 ; i--){
            test_word += word.charAt(i);
        }
        if (word.equalsIgnoreCase(test_word))
        {
            System.out.println(word +" is palindrome");
        }else {
            System.out.println(word +" is not palindrome");
        }
    }
}

