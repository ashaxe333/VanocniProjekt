public class Calculation {
    private int precision;
    public Calculation(){
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        if(precision >= 1 && precision <= 16){
            this.precision = precision;
        }else {
            throw new IndexOutOfBoundsException("Numbers 1 - 16");
        }
    }

    /**
     * Calculates over factorial parts of Euler's number and adds them up
     * @return Euler's number
     */
    public String result(){
        Factorial factorial = new Factorial();
        MyBigDecimal result = new MyBigDecimal();
        for (int i = 0; i <= 20; i++){
            MyBigInteger forFactorial = new MyBigInteger(i);
            MyBigInteger n = factorial.fac(forFactorial);
            MyBigDecimal current = new MyBigDecimal(1).devide(new MyBigDecimal(n.valueOf()));
            result = result.add(current);
        }
        return result.toString().substring(0, precision+2);
    }
}
