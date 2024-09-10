/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.integeroverflow;

/**
 *
 * @author CMcPhail2026
 */
public class IntegerOverflow {

    public static void main(String[] args) {
        //int declaration
        int a = 2000000000, b= 2000000000; 
      long sum = (long)a + (long)b; //casts into long 
      if (sum > 2147483647){
         System.out.println("Integer out of range!"); // Prints statement if greater than int limit
      } else{
        System.out.println("Sum: "+(int)sum); //Prints statement if below int limit
      }
    }
}
