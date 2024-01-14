public class MyBigInteger {

    private long number;

    public MyBigInteger() {
    }

    public MyBigInteger(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "";
    }

    /**
     * @return value of number
     */
    public long valueOf() {
        return number;
    }

    /**
     * retype long to MyBigInteger
     * @param number - value of long
     * @return MyBigInteger with value of number
     */
    public MyBigInteger valueOfNumber(long number){
        return new MyBigInteger(number);
    }

    /**
     * Adds two numbers
     * @param myBigInteger - added number
     * @return sum of two numbers in MyBigInteger
     */
    public MyBigInteger add(MyBigInteger myBigInteger){
        MyBigInteger help = new MyBigInteger(number + myBigInteger.valueOf());
        return help;
    }

    /**
     * Multiply two numbers
     * @param myBigInteger - a multiple of a number
     * @return product of two numbers in MyBigInteger
     */
    public MyBigInteger multiply(MyBigInteger myBigInteger){
        MyBigInteger help = new MyBigInteger(number*myBigInteger.valueOf());
        return help;
    }


}
