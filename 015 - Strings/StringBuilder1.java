import java.lang.StringBuilder;

public class StringBuilder1{
    public static void main(String args[]){
        // StringBuilder name = new StringBuilder("Soumya");
        StringBuilder obj = new StringBuilder("");
        String name = "Soumya";
        for(int i = 0; i<name.length(); ++i){
            obj.append(name.charAt(i));
        }
    for(int i = 0; i<obj.length(); ++i){
        System.out.println(obj.charAt(i));
    }
    }
}