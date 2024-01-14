public class Factorial {

    private MyBigInteger number;

    public Factorial() {
    }

    public Factorial(MyBigInteger number) {
        this.number = number;
    }

    public MyBigInteger getNumber() {
        return number;
    }

    public void setNumber(MyBigInteger number) {
        this.number = number;
    }

    /**
     * Calculates numbers over factorial
     * @param mbi - number
     * @return the calculated part of Euler's number
     */
    public MyBigInteger fac(MyBigInteger mbi){
        MyBigInteger myBigInteger = new MyBigInteger();
        if(mbi.valueOf() == 0){
            return myBigInteger.valueOfNumber(1);
        }else {
            return mbi.multiply(fac(mbi.add(myBigInteger.valueOfNumber(-1))));
        }
    }
}
