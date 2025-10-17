// Brute Force Approach
// Time Complexity - O(nlogn)

// public class BinaryNumbersPrint {
//     public static void print(int num){
//         for(int i = 1; i<=num; ++i){
//             System.out.print(binary(i)+" ");
//         }
//     }
//     public static int binary(int num){
//         int result = 0;
//         int digit = 1;
        
//         while(num != 0){
//             int temp = num%2;
//             result = digit * temp + result;
//             digit = digit * 10;
//             num = num/2;
//         }
        
//         return result;
//     }
//     public static void main(String args[]){
//         print(5);
//     }
// }


// Optimised Approach
// Time Complexity - O(n) 
import java.util.*;
public class BinaryNumbersPrint {

    public static void print(int num){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        int count = 1;

        while(count <= num){
            String current = q.remove();
            System.out.print(current+" ");
            q.add(current+"0");
            q.add(current+"1");
            ++count;
        }
    }
    public static void main(String args[]){
        print(5);
    }
}
