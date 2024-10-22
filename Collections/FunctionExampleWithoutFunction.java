class FunctionExampleWithoutFunction {
    public static void main(String args[]){
        System.out.println("The square of 4 is : "+squareIt(4));
        System.out.println("The square of 11 is : "+squareIt(11));
    }
    public static int squareIt(int n){
        return n * n;
    }
}