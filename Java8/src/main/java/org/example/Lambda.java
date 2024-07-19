package org.example;

interface AwesomeComparator {
    public boolean compare(int i, int j);
}

public class Lambda {
    public static void main(String[] args) {
        AwesomeComparator awComparator = ((i, j) -> i > j);
        boolean res = awComparator.compare(2,3);
        System.out.println("Result = " + res);
    }
}
