public class FunctionCallByValue {
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap : "+a+" "+b);
    }
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("Before Swap : "+a+" "+b);
    }
}

// Here we have passed values of a, b(copies) not actual variables
//  So the original values will remain same as they are