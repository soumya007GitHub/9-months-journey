public class Pattern4{
    public static void main(String[] args){
        char initial = 'A';
        for(int i = 1; i<5; ++i){
            for(int j = 1; j<=i; ++j){
                System.out.print(initial+" ");
                initial += 1;
            }
            System.out.println();
        }
    }
}