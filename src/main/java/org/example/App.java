package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        int principle;
        double rate;
        int years;
        double investment_amount;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the principal: ");
        principle=input.nextInt();

        System.out.print("Enter the rate of interest: ");
        rate=input.nextDouble();

        System.out.print("Enter the number of years: ");
        years=input.nextInt();

        investment_amount=principle*(1+(rate/100)*(years));

        BigDecimal cent_rounding = new BigDecimal(investment_amount).setScale(2, RoundingMode.HALF_UP);
        double investment_rounded = cent_rounding.doubleValue();

        int castInt=(int)investment_rounded;

        System.out.print("After " +(years)+ " years at "+ (rate)+"%, the investment will be worth $"+(castInt)+".");


    }
}

