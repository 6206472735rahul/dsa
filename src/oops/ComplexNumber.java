package oops;

import java.util.Scanner;

//A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
//Implement the Complex numbers class that contains following functions -
//1. constructor
//You need to create the appropriate constructor.
//2. plus -
//This function adds two given complex numbers and updates the first complex number.
//e.g.
//if C1 = 4 + i5 and C2 = 3 +i1
//C1.plus(C2) results in:
//C1 = 7 + i6 and C2 = 3 + i1
//3. multiply -
//This function multiplies two given complex numbers and updates the first complex number.
//e.g.
//if C1 = 4 + i5 and C2 = 1 + i2
//C1.multiply(C2) results in:
//C1 = -6 + i13 and C2 = 1 + i2
//4. print -
//This function prints the given complex number in the following format :
//a + ib
public class ComplexNumber {
int real;
int imaginary;

public ComplexNumber(int real,int imaginary){
    this.real=real;
    this.imaginary=imaginary;
}



}
