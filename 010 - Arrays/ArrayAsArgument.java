public class ArrayAsArgument {
    public static void updateMarks(int marks[]){
        for(int i = 0; i<marks.length; ++i){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[] = {10, 20, 30};
        updateMarks(marks);
        // arrays are always passed as reference to functions by-default
        for(int i = 0; i<marks.length; ++i){
            System.out.println(marks[i]);
        }
    }
}
