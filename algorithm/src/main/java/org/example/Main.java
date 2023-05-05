package org.example;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Main {

    public static OptionalInt findIteminArray(int[] num, int item){
        return Arrays.stream(num).filter(x-> x==item).findFirst();
    }

    public static int binarySearch(int[] arr,int item){
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];

        while(min<=max) {
            int mid = (min + max) / 2;
            if (mid == item){
                item = mid;
            break;
        }
            else if(item < mid) {
                max = mid - 1;
            }
                else if(item > mid){
                 min = mid+1;
                             }


            }


        return item;

    }
    public static int[] arrayOfEvenNumbers(int[] arr1, int[] arr2){
        IntPredicate isEven= num -> num % 2 ==0;
       return Stream.of(arr1,arr2).flatMapToInt(Arrays::stream).filter(isEven).toArray();

    }
    public static void convertNumberToBinary(int n){
        int num=1;
        Queue<Integer> que = new LinkedList<>();
        que.add(num);
        for(int i=0; i<n; i++){
          num = que.remove();
            System.out.println( "Binary no i s: "+num);
          num= num * 10;
          que.add(num);
          num+=1;
          que.add(num);

        }
    }
    public static void printOuttheQueue(){
        Queue<String> stringQue= new LinkedList<>();
        stringQue.add("first no");
        stringQue.add("second no");
        stringQue.add("third no");
        System.out.println("Queue value is : " + stringQue);

    }

    public static void checkTheLargerNumber(int[] arr){

        Stack<Integer> st= new Stack<>();

        st.push(arr[0]);
        int num ;

        // checkTheLargerNumber(new int[]{3,5,16,78,4,2});
        for (int i = 1; i < arr.length; i++) {

            if (!st.isEmpty()) {
                num = st.pop();
                while (num < arr[i]) {
                    System.out.println(num + "-->" + arr[i]);
                    if (st.isEmpty()) {
                        break;
                    }
                    num = st.pop();
                }

                if (num > arr[i]) {
                    st.push(num);
                }
            }
            st.push(arr[i]);
        }
            while(!st.isEmpty()){
                int pop2= st.pop();
                System.out.println(pop2+" --> "+ "-1");
            }

    }
    public static void main(String[] args) {
        int [] nums= new int[]{1,7,3,4, 19,33,25};

        //call method to find item in array
        OptionalInt optionalInt = findIteminArray(nums, 7);
        //convert optionalInt to int
        int value = optionalInt.orElse(0); // returns 10
        System.out.println("value of item found in array is : "+ value);

//        System.out.println("item searched in the array is : "+ c);
  //call the method for binary search
        int item= binarySearch(nums,19);
        System.out.println("find the item through binary search : " + item);

        //find the even numbers in 2 arrays
   Arrays.stream(arrayOfEvenNumbers(new int[]{2,4,3,4,6,5,7},new int[]{8,7,5,4,3,1,2})).forEach(System.out::println);
//
        for(int x:nums) {
//            Arrays.asList(nums);
//            System.out.println(x);
        }
        // find the binary of a given number
        convertNumberToBinary(9);

        //print out the Queue
        printOuttheQueue();


        //find largernumber
        checkTheLargerNumber(new int[]{3,5,16,78,4,2});

        Arrays.sort(nums);
        System.out.println(",,."+Arrays.toString(nums));
       System.out.println(nums);
        System.out.println("Hello world!");
        String s="HELLO";
        String s2="hello";
        String s3="23576";
        List<String> s4 = Arrays.asList("hello","khjk","plpo");
        System.out.println("if string is uppercase : "+ s.chars().anyMatch(Character::isUpperCase));
        System.out.println("if string is lowercase : "+ s2.chars().anyMatch(Character::isLowerCase));
        System.out.println("if string has digit : "+ s3.chars().anyMatch(Character::isDigit));
        s4.stream().map(x->{
            System.out.println(x);
            return " +x" + x;

        });
    }
}