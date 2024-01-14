public class MyBigDecimal {

    private double number;
    private MyBigInteger myBigInteger;

    public MyBigDecimal() {
    }

    public MyBigDecimal(double number) {
        this.number = number;
    }

    public MyBigDecimal(MyBigInteger myBigInteger) {
        this.myBigInteger = myBigInteger;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public MyBigInteger getMyBigInteger() {
        return myBigInteger;
    }

    public void setMyBigInteger(MyBigInteger myBigInteger) {
        this.myBigInteger = myBigInteger;
    }

    @Override
    public String toString() {
        return number + "";
    }

    /**
     * @return value of number
     */
    public double valueOf(){
        return number;
    }

    /**
     * retype double to MyBigDecimal
     * @param number - value of double
     * @return MyBigDecimal with value of number
     */
    public MyBigDecimal valueOfNumber(double number){
        return new MyBigDecimal(number);
    }

    /**
     * Adds two numbers
     * @param myBigDecimal - added number
     * @return sum of two numbers in MyBigDecimal
     */
    public MyBigDecimal add(MyBigDecimal myBigDecimal){
        MyBigDecimal help = new MyBigDecimal(myBigDecimal.valueOf() + number);
        return help;
    }

    /**
     * Divides two numbers
     * @param myBigDecimal - denominator
     * @return quotient of two numbers
     */
    public MyBigDecimal devide(MyBigDecimal myBigDecimal){
        MyBigDecimal help = new MyBigDecimal(number/myBigDecimal.valueOf());
        return help;
    }
}
