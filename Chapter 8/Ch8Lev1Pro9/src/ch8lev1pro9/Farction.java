/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8lev1pro9;

/**
 *
 * @author Farhad
 */


public class Farction {

    private int numerator;

    private int denominator;

    public Farction() {

        this(0, 1);

    }

    public Farction(int number) {

        this(number, 1);

    }

    /**
     * 
     * Creates a copy of frac
     * 
     * 
     * 
     * 
     * @param frac a copy of this parameter is created
     */
    public Farction(Farction frac) {

        this(frac.getNumerator(), frac.getDenominator());

    }

    public Farction(int num, int denom) {

        if (denom < 0) {

            num = -num;

            denom = -denom;

        }

        if (num == 0) {

            denom = 1;

        }

        setNumerator(num);

        setDenominator(denom);

    }

    public static int gcd(int m, int n) {

        int r = n % m;

        while (r != 0) {

            n = m;

            m = r;

            r = n % m;

        }

        return m;

    }

    public static Farction min(Farction f1, Farction f2) {

        // convert to decimals and then compare

        double f1_dec = f1.decimal();

        double f2_dec = f2.decimal();

        if (f1_dec <= f2_dec) {

            return f1;

        } else {
            return f2;

        }

    }

    public Farction add(Farction frac) {

        int a, b, c, d;

        Farction sum;

        a = this.getNumerator();

        b = this.getDenominator();

        c = frac.getNumerator();

        d = frac.getDenominator();

        sum = new Farction(a * d + b * c, b * d);

        return sum;

    }

    public Farction add(int number) {

        Farction frac = new Farction(number, 1);

        Farction sum = add(frac);

        return sum;

    }

    public Farction divide(Farction frac) {

        int a, b, c, d;

        Farction quotient;

        a = this.getNumerator();

        b = this.getDenominator();

        c = frac.getNumerator();

        d = frac.getDenominator();

        quotient = new Farction(a * d, b * c);

        return quotient;

    }

    public Farction divide(int number) {

        Farction frac = new Farction(number, 1);

        Farction quotient = divide(frac);

        return quotient;

    }

    public boolean equals(Farction frac) {

        Farction f1 = simplify(); // simplify itself

        Farction f2 = frac.simplify(); // simplify frac

        return (f1.getNumerator() == f2.getNumerator() &&

                f1.getDenominator() == f2.getDenominator());

    }

    /**
     * 
     * Returns the denominator of this fraction
     * 
     * 
     * 
     * 
     * @return the denominator of this fraction
     */
    public int getDenominator() {

        return denominator;

    }

    /**
     * 
     * Returns the numerator of this fraction
     * 
     * 
     * 
     * 
     * @return the numerator of this fraction
     */
    public int getNumerator() {
        return numerator;
    }

    public Farction multiply(Farction frac) {

        int a, b, c, d;

        Farction product;

        a = this.getNumerator();

        b = this.getDenominator();

        c = frac.getNumerator();

        d = frac.getDenominator();

        product = new Farction(a * c, b * d);

        return product;

    }

    public Farction multiply(int number) {

        Farction frac = new Farction(number, 1);

        Farction product = multiply(frac);

        return product;

    }

    /**
     * 
     * Sets the denominator of this fraction
     * 
     * 
     * 
     * 
     * @param denom the denominator of this fraction
     */
    public void setDenominator(int denom) {
        if (denom == 0) {
            // Fatal error

            System.out.println("Fatal Error");

            System.exit(1);

        }

        denominator = denom;

    }

    public void setNumerator(int num) {

        numerator = num;

    }

    public Farction simplify() {

        int num = getNumerator();

        int denom = getDenominator();

        int divisor = 1;

        if (num != 0) {

            divisor = gcd(Math.abs(num), denom);

        }

        return new Farction(num / divisor, denom / divisor);

    }

 

    public Farction subtract(Farction frac) {

        int a, b, c, d;

        Farction diff;

        a = this.getNumerator();

        b = this.getDenominator();

        c = frac.getNumerator();

        d = frac.getDenominator();

        diff = new Farction(a * d - b * c, b * d);

        return diff;

    }

    public Farction subtract(int number) {

        Farction frac = new Farction(number, 1);

        Farction difference = subtract(frac);

        return difference;

    }

    public String toString() {

        return getNumerator() + "/" + getDenominator();

    }

    private double decimal() {

        // returns the decimal equivalent

        return (double) getNumerator() / getDenominator();

    }

    public static void main(String[] args) {

        Farction fraction = new Farction();

        fraction.setDenominator(25);

        fraction.setNumerator(12);

        System.out.print(fraction.multiply(5));

    }

}
