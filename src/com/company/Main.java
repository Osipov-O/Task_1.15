package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {


    	BigInteger rez = BigInteger.ONE;

		for ( int i=1; i<=200; i++) {
			rez = rez.multiply(BigInteger.valueOf(i*i));
		}
		System.out.println(rez);

    }
}
