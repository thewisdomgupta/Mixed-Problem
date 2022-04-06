//Mohit has decided to distribute mangoes to needy people on the occasion of his birthday.
//        Mohit can buy mangoes by using either coupon or rupees. And donate mangoes to people. His every activity is considered as one transaction.
//
//        Example, if mohit have 4 mangoes and he bought 2 mangoes, this is one transaction and if mohit donates 3 mangoes, it will be another transaction. So, total number of transactions equals 2.
//
//        mohit have 10 rupees and 1 coupon.
//        For N number of mangoes to buy, mohit can use 1 coupon or N rupees.
//
//        Your job is to help mohit to do maximum transaction using optimum combination of coupon and rupees
//
//        Given a STRING of integers, where each integers denotes number of mangoes mohit have after each transaction.
//        First integer denotes initial number of mangoes mohit have.
//
//        Example:
//        Input: "4,2,9,6,18,13,19"
//        output: 5
//
//        Explanation:
//        Number of rupees = 10
//        Number of coupons = 1
//        Step 1: (4,2) = Initially he has 4 mangoes, number of mangoes decreased to 2 denotes he donated 2 mangoes. Hence, It is mohit's first transaction.
//
//        Step 2: (2,9) = Number of mangoes increased denotes mohit bought 7 mangoes. He can either use 1 coupon or 7 rupees. Remember you have only one coupon. So make sure to use it for transaction of buying maximum mangoes. So, for this step we'll use 7 rupees. This is transaction number 2.
//
//        Step 3: (9,6) = Like step one, it is donation of 3 mangoes, transaction 3rd.
//        Step 4: (6,18) = Now we have 3 rupees and 1 coupon, so we can use coupon for this transaction. This is transaction 4th. After this, we have 3 rupees only
//
//        Step 5: (18,13) = Like step 1 and 3, it is donation of 5 mangoes, transaction 5th.
//        Step 6: (13,19) = To buy 6 mangoes, we don't have enough money, so we can't proceed to this transaction.
//
//        Hence, Output is 5
import java.util.Arrays;
import java.util.Scanner;
public class Mangoes {
    public static void main(String [] args){
        System.out.println("Enter Mango Transactions:");
        Scanner vivek =new Scanner(System.in);
        int n=vivek.nextInt();
        System.out.println("Enter Mango Transactions Elements:");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=vivek.nextInt();
        }
        System.out.println("Your Entries");
        System.out.println(Arrays.toString(arr));
        int Coupon=1;
        int Rupees=10;
        int count=0;

        for(int i=0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    count=count+1;
                }
                else{
                    int difference=arr[i+1]-arr[i];
                    if(difference<Rupees){
                        Rupees=Rupees-difference;  //10-7=3
                        count=count+1;
                    }
                    else{
                        if(Coupon==0){
                            break;
                        }
                        Coupon=Coupon-1;
                        count=count+1;
                    }


                }
            }
        System.out.println("Total Transactions are");
        System.out.println(count);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
