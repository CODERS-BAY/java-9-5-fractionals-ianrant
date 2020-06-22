package at.codersbay.datastructures;


/**
 * A Fractional is a class that consists of a numerator and a denominator
 * e.g.: 1/2, 1/3, 24/37, ..
 */
public class Fractional {

    private Integer numerator;
    private Integer denominator;

    public Fractional(Integer numerator, Integer denominator) {
        if (numerator == null || denominator == null || denominator == 0) {
            throw new IllegalArgumentException("The values for length cannot be NULL, ZERO or NEGATIVE");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        // TODO implement to fix tests in FractionalTest1
    }

    public Integer getNumerator() {
        return numerator;
        // TODO implement to fix tests in FractionalTest1
    }

    public Integer getDenominator() {
        return denominator;
        // TODO implement to fix tests in FractionalTest1
    }

    public Float asFloat() {
        Float result = 0f;
        result = numerator.floatValue() / denominator.floatValue();
        // TODO implement to fix tests in FractionalTest2
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO implement to fix tests in FractionalTest3
        Fractional other = (Fractional) obj;
        boolean testsEqual = (other.denominator.equals(this.denominator) && other.numerator.equals(this.numerator)) ||
                (other.numerator == 0 && this.numerator == 0) ||
                Math.abs(other.asFloat() - this.asFloat()) <= 0.000000000000000001;
        return testsEqual;
    }

    public Fractional multiply(Fractional other) {
        // TODO implement to fix tests in FractionalTest4
        //int resultNumerator = this.numerator * other.numerator;
        //int resultDenominator = this.denominator * other.denominator;
        //Fractional fractional = new Fractional(resultNumerator, resultDenominator);

        return new Fractional(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fractional multiply(Integer other) {
        // TODO implement to fix tests in FractionalTest4
        Fractional fractional = new Fractional(this.numerator * other, this.denominator);

        return fractional;
    }

    public Fractional divide(Fractional other) {
        // TODO implement to fix tests in FractionalTest5

        return new Fractional(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public Fractional divide(Integer other) {
        // TODO implement to fix tests in FractionalTest5
        if (denominator <= 0) {
            throw new IllegalArgumentException("You cannot divide through zero!");
        } else {
            return new Fractional(this.numerator, this.denominator * other);
        }
    }

    public Fractional add(Fractional other) {
        // TODO implement to fix tests in FractionalTest6
        return new Fractional(this.numerator * other.denominator + other.numerator * this.denominator, this.denominator * other.denominator);
    }

    public Fractional add(Integer other) {
        // TODO implement to fix tests in FractionalTest6
        return new Fractional(this.numerator + (other * this.denominator), this.denominator);
    }

    public Fractional subtract(Fractional other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional(this.numerator * other.denominator - other.numerator * this.denominator, this.denominator * other.denominator);
    }

    public Fractional subtract(Integer other) {
        // TODO implement to fix tests in FractionalTest7
        return new Fractional(this.numerator - (other * this.denominator), this.denominator);
    }

}