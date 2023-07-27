import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Question 1 : ");
        System.out.println("This part compare first element with last in array");
        System.out.println("Enter the numbers or -1 to quit");
        int user_arrays = input.nextInt();
        ArrayList<Integer> compare_arr = new ArrayList<>();
        do{
            if(user_arrays == -1 && compare_arr.size() >= 2) break;
            if(user_arrays ==-1 && compare_arr.size() < 2){
                System.out.println("Your array must greater than or equal to 2");
            }

            if (user_arrays != -1)
                compare_arr.add(user_arrays);
            System.out.println("Enter the numbers or -1 to quit");
            user_arrays = input.nextInt();
        }while(true);
        //int [] compare = {10, -20, 0, 30, 40, 60, 10};
        System.out.println("Your Array : "+ compare_arr);
        System.out.println("The first number equal the last number?");
        if(compare_arr.get(0) == compare_arr.get(compare_arr.size()-1)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println("__________________________________________");
        System.out.println("Question 2: ");
        System.out.println("In this part enter k and array of numbers");

        System.out.println("Enter how many greatest numbers you want to find ?");
        int k = input.nextInt();

        System.out.println("Enter the array or -1 to quit: ");
        int user_array = input.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        do{
            if (user_array == -1) break;
            numbers.add(user_array);
            System.out.println("Enter the array or -1 to quit: ");
             user_array = input.nextInt();
        } while(true);

        System.out.println("Your Array :" +numbers);
        int temp = 0;
        int max = 0;

        // first we need to arrange the array from largest to lowest
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {
                if(numbers.get(j) > numbers.get(i))
                {
                    max = numbers.get(j);
                    temp = numbers.get(i);
                    numbers.set(i,max);
                    numbers.set(j,temp);
                }
            }
        }

        int greatest_num [] = new int[k];
        for (int i = 0; i < greatest_num.length; i++) {
            try {
                greatest_num[i] = numbers.get(i);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(k+ " largest elements of the said array are: "+ Arrays.toString(greatest_num));

        System.out.println("__________________________________________");
        System.out.println("Question 3: ");

        System.out.println("In this part we calculate the average of array and find the number greater than average");
        System.out.println("Enter numbers or -1 to quit");
        int average_num = input.nextInt();
        ArrayList<Integer> average_list = new ArrayList<>();
        double sum = 0.0;

        do {
            if(average_num == -1) break;
            average_list.add(average_num);
            sum += average_num;

            System.out.println("Enter numbers or -1 to quit");
            average_num = input.nextInt();
        }while(true);

        System.out.println("Your Array : ");
        System.out.println(average_list);

        double result = sum / average_list.size();

        ArrayList<Integer> greater = new ArrayList<>();
        for (int i = 0; i < average_list.size(); i++) {
            if (average_list.get(i) >= result){
                greater.add(average_list.get(i));
            }
        }

        System.out.println("The average of the list = "+result+" and the greater number = "+ greater);

        System.out.println("__________________________________________");
        System.out.println("Question 4: ");
        System.out.println("We will find the larger value between first and last elements that you entered");

        System.out.println("Enter numbers or -1 to quit");
        int array_user = input.nextInt();
        ArrayList<Integer> larger_array = new ArrayList<>();

        do{
            if(array_user == -1) break;
            larger_array.add(array_user);

            System.out.println("Enter numbers or -1 to quit");
            array_user = input.nextInt();
        }while(true);
        System.out.println("Your Array : ");
        System.out.println(larger_array);
        if(larger_array.get(0) == larger_array.get(larger_array.size()-1)){
            System.out.println(larger_array.get(0)+" first element equal to last element");

        }else if(larger_array.get(0) >= larger_array.get(larger_array.size()-1)){
            System.out.println(larger_array.get(0)+" first element greater than last element");
        }else{
            System.out.println(larger_array.get(larger_array.size()-1)+" last element greater than first element");

        }
        System.out.println("__________________________________________");
        System.out.println("Question 5: ");
        System.out.println("In this part we will swap between the first and last elements of array");

        System.out.println("Enter the numbers or -1 to quit");
        int swap_num = input.nextInt();
        ArrayList<Integer> array_version1 = new ArrayList<>();
        ArrayList<Integer> array_version2 = new ArrayList<>();

        do{
            if(swap_num == -1) break;

            array_version1.add(swap_num);
            System.out.println("Enter the numbers or -1 to quit");
            swap_num = input.nextInt();
        }while (true);

        System.out.println("Your Array : ");
        System.out.println(array_version1);

        int temp_version1 = 0;
        temp_version1 = array_version1.get(0); //12
        array_version1.set(0,array_version1.get(array_version1.size()-1));
        array_version1.set(array_version1.size()-1 , temp_version1);

        for (int index: array_version1) {
            array_version2.add(index);
        }
        System.out.println("Your Array after swap");
        System.out.println(array_version2);

        System.out.println("__________________________________________");
        System.out.println("Question 6: ");
        System.out.println("In this part we will find the longest words");
        String skip_word = input.nextLine();
        System.out.println("Please enter the word or -1 to quit");
        String long_word = input.nextLine();
        ArrayList <String> Array_longWord1 = new ArrayList<>();

        while(true){
            if(long_word.equals("-1")) break;
            Array_longWord1.add(long_word);

            System.out.println("Please enter the word or -1 to quit");
            long_word = input.nextLine();
        }
        System.out.println("Your Array : ");
        System.out.println(Array_longWord1);

        int temp_word = Array_longWord1.get(0).length(); // initialize the word
        for (int i = 0; i < Array_longWord1.size(); i++) {
            if(Array_longWord1.get(i).length() >= temp_word)
            {
                temp_word = Array_longWord1.get(i).length();
            }
        }

        System.out.println("The longest words are: ");
        for (int i = 0; i < Array_longWord1.size() ; i++) {
            if(temp_word == Array_longWord1.get(i).length()){
                System.out.print(Array_longWord1.get(i) +" ");
            }
        }
        System.out.println();

        System.out.println("__________________________________________");
        System.out.println("Question 7: ");
        System.out.println("Hello to the Inventory System");
        System.out.println("Please choose one of these options \n" +
                "1. Accept new products \n" +
                "2. Display Products \n" +
                "3. Search about the available products \n" +
                "4. Sort products \n" +
                "5. Exit");
        int user_choose = input.nextInt();
        ArrayList <String> products = new ArrayList<>();
        do{
            if (user_choose == 5) break;
            switch (user_choose){
                case 1:
                    System.out.println("Enter the product name or -1 to quit : ");
                    String skip_compiler1 = input.nextLine();
                    String product  = input.nextLine();
                    do{
                        if(product.equals("-1")) break;

                        products.add(product);
                        System.out.println("Enter the product name or -1 to quit : ");
                        product  = input.nextLine();
                    }while(true);
                    break;
                case 2:
                    System.out.println("The available products : ");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println(i+1 +". "+products.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Enter product name to search about it: ");
                    String skip_compiler2 = input.nextLine();
                    String p = input.nextLine();
                    boolean not_found = false;
                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).equalsIgnoreCase(p)){
                            System.out.println("The "+ p +" available");
                            not_found  = true;
                            break;
                        }
                    }
                    if(! not_found ){
                        System.out.println("Sorry, the "+p+ " not found");
                    }
                    break;
                case 4:
                    System.out.println("Sort alphabetical order products");
                    Collections.sort(products); // built-in java methods for Arraylist
                    System.out.println(products);
                    break;
            }
            System.out.println("Please choose one of these options \n" +
                    "1. Accept new products \n" +
                    "2. Display Products \n" +
                    "3. Search about the available products \n" +
                    "4. Sort products \n" +
                    "5. Exit");
            user_choose = input.nextInt();
        }while(true);
        System.out.println("__________________________________________");
        System.out.println("Question 8: ");
        System.out.println("The occurrences numbers");

        System.out.println("The Array ");
        int [] num_occur = {1,1,1,3,3,5,50,1,20,21,50,70};
        System.out.println(Arrays.toString(num_occur));

        System.out.println("Enter number that do you want to find how many occurrences or -1 to quit");
        int occur = input.nextInt();
        int count = 0;

        do{
            if(occur == -1) break;
            for (int i = 0; i < num_occur.length; i++) {
                if(num_occur[i] == occur)
                    count++;
            }
            System.out.println(occur + " occurs "+ count+ " times");

            System.out.println("The Array ");
            System.out.println(Arrays.toString(num_occur));

            System.out.println("Enter number that do you want to find how many occurrences or -1 to quit");
            occur = input.nextInt();
            count = 0;
        }while(true);

        System.out.println("__________________________________________");
        System.out.println("Question 9: ");
        System.out.println("Put the odd numbers before even numbers in array");
        int [] all_numbers = {2,3,2,40,1,5,9,4,10,7};
        System.out.println("Before arrange: ");
        System.out.println(Arrays.toString(all_numbers));
        ArrayList<Integer> odd_num = new ArrayList<>();
        ArrayList<Integer> even_num = new ArrayList<>();

        for (int i = 0; i < all_numbers.length; i++) {

            if(all_numbers[i]%2 == 1)
            {
                odd_num.add(all_numbers[i]);
            }else {
               even_num.add(all_numbers[i]);
            }
        }

        System.out.println("Array after rearrange the odd before even numbers : ");
        for (int i = 0; i < odd_num.size(); i++) {
            all_numbers[i] = odd_num.get(i);
        }
        int count_even = all_numbers.length;
        for (int i = 0; i < even_num.size(); i++) {
            all_numbers[--count_even] = even_num.get(i);
        }
        System.out.println(Arrays.toString(all_numbers));

        System.out.println("__________________________________________");
        System.out.println("Question 10: ");
        System.out.println("In this part, we display two arrays to check if equals values or not");

        int [] array_1 = {2,3,6,6,4};
        int [] array_2 = {2,3,6,6,4};
        boolean flag = false;

        System.out.println("First Array : "+ Arrays.toString(array_1));
        System.out.println("Second Array : "+ Arrays.toString(array_2));

        for (int i = 0 ; i < 5 ; i++){
            if(array_1[i] != array_2[i])
            {
                flag = true;
                break;
            }
        }
        System.out.println("The result: ");
        if(!flag) System.out.println("The two arrays are the same with values : "+Arrays.toString(array_1));

        else System.out.println("The two arrays are Not the same,"+" First Array : "+ Arrays.toString(array_1)+" Second array : "+
                Arrays.toString(array_2));

    }
}