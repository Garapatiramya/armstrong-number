/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author STUDENT
 */
public class armstrongnumber {
    public static void main(String args[])
    {
        int num=370,number,temp,total=0;
        number = num;
        while (number !=0)
        {
            temp =number %10;
            total =total+temp*temp*temp;
            number /=10;
        }
        if (total == num)
            System.out.println(num +"is an armstrong number");
        else
            System.out.println(num +"is not an armstrong number");
    }
        
    }
    

