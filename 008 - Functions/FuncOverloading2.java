public class FuncOverloading2 {
    public static int prod(int a, int b){
        return a*b;
    }
    public static float prod(float a, float b){
        return a*b;
    }
    public static void main(String[] args){
        System.out.println("The product of 2 and 3 is: " + prod(2,3));
        System.out.println("The product of 2.5 and 3.5 is: " + prod(2.5f,3.5f));
    }
}
