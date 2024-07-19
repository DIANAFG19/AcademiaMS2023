package org.example;

interface ICalculator
{
    default int addNumbers(int i, int j)
    {
        return i + j;
    }

    default int multiplyNumbers(int i, int j)
    {
        return i * j;
    }
}

class Calculator implements ICalculator{}

public class MetodosPredeterminados {
    public static void main(String[] args){
        ICalculator calc = new Calculator();
        System.out.println("add 2 and 3 = " + calc.addNumbers(2, 3));
        System.out.println("mul 2 and 3 = " + calc.multiplyNumbers(2, 3));
    }
}

