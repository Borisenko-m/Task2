package com.company;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m._main(args);
    }
    
    void _main(String[] args)
    {
        println(
            "1)  repeat: "              + repeat("mice", 5) + '\n' +
            "2)  differenceMaxMin: "    + differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}) + '\n' +
            "3)  isAvgWhole: "          + isAvgWhole(new int[] {1, 2, 3, 4}) + '\n' +
            "4)  cumulativeSum: "       + arrayToString(cumulativeSum(new int[] {3, 3, -2, 408, 3, 3})) + '\n' +
            "5)  getDecimalPlaces: "    + getDecimalPlaces("20.00") + '\n' +
            "6)  Fibonacci: "           + Fibonacci(5) + '\n' +
            "7)  isValid: "             + isValid("") + '\n' +
            "8)  isStrangePair: "       + isStrangePair("", "") + '\n' +
            "9)  repeat: "              + isSuffix("prefixsuffixpre", "-pre") + '\n' +
            "9)  repeat: "              + isPrefix("prefixsuffixpre", "pre-") + '\n' +
            "10) boxSeq: "              + boxSeq( 9)+ '\n'
        );
    }
    String arrayToString(int[] array)
    {
        String a = "";
        for (int b : array) a += b + " ";
        return a;
    }
    void println(Object o) { System.out.println(o); }
    String repeat(String a, int b)
    {
        String res = "";
        int count = b;
        for (char c : a.toCharArray())
        {
            count = b;
            while (count-- > 0) res += c;
        }
        return res;
    }
    int differenceMaxMin(int[] array)
    {
        int min = 0, max = 0;
        for (int a : array) { min = Math.min(min, a); max = Math.max(max, a); }
        return Math.abs(min) + max;
    }
    boolean isAvgWhole(int[] array)
    {
        int x = 0;
        for (int a : array) x += a;
        return x % array.length == 0;
    }
    int[] cumulativeSum(int[] array)
    {
        int x = 0;
        for (int i = 0; i < array.length; i++)
        {
            x += array[i];
            array[i] = x;
        }
        return array;
    }
    int getDecimalPlaces(String n)
    {
        var a = n.indexOf('.');
        return a == -1? 0 : n.length() - a - 1;
    }
    int Fibonacci(int n)
    {
        int prev = 0, cur = 1, next = 0;
        while (n-- > 0)
        {
            next = prev + cur;
            prev = cur;
            cur = next;
        }
        return cur;
    }
    boolean isValid(String s)
    {
        if(s.length() < 6)
                try { Integer.parseInt(s); return true; }
                catch (NumberFormatException e){ return false; }
        return false;
    }
    boolean isStrangePair(String a, String b)
    {
        return
        a.equals("") & b.equals("") ||
        !a.equals("") && !b.equals("") &&
        a.charAt(a.length() - 1) == b.charAt(0) &&
        b.charAt(b.length() - 1) == a.charAt(0);
    }
    boolean isPrefix(String a, String b)
    {
        return
        b.contains("-") &&
        a.substring(0, b.length() - 1)
         .equals(
        b.substring(0, b.length() - 1));
    }
    boolean isSuffix(String a, String b)
    {
        return
        b.contains("-") &&
        a.substring(a.length() - (b.length() - 1))
         .equals(
        b.substring(1));
        
    }
    int boxSeq(int i) { return i % 2 == 0? i : i + 2; }
}
