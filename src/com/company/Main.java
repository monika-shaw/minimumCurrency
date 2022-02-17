package com.company;


 public class Main {
     static int  total_balance=5000;
     public static void main(String[] args) {



                 int[] counts=getCurrency(2800);
                 if(counts[0]>total_balance)
                 {
                     System.out.println("Insufficient Balance=" + counts[0]);
                 }
                 else if(counts[1]<100)
                    {
                     System.out.println("Please enter a valid amount." );
                     }

                 else {

                     System.out.println("2000 notes=" + counts[2]);
                     System.out.println("500 notes=" + counts[3]);
                     System.out.println("200 notes=" + counts[4]);
                     System.out.println("100 notes=" + counts[5]);
                 }

             }

             public static int[] getCurrency(int amount)
             {
                 int[] count = new int[6];
                 count[0]=amount;
                 count[1]=amount;
                 if(count[0]>total_balance)
                 {
                     return count;
                 }
                 else if(count[1]<100)
                 {
                     return count;
                 }
                 else {


                     count[2] = amount / 2000;
                     amount = amount % 2000;

                     count[3] = amount / 500;
                     amount = amount % 500;

                     count[4] = amount / 200;
                     amount = amount % 200;

                     count[5] = amount / 100;
                     amount = amount % 100;

                 }
                 return count;
             }

         }











