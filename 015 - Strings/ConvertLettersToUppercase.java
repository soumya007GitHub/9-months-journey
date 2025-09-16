import java.lang.StringBuilder;

public class ConvertLettersToUppercase {
    public static void main(String args[]){
        String msg = "hello i am Soumya tripathy";
        StringBuilder newMsg = new StringBuilder("");
        newMsg.append(Character.toUpperCase(msg.charAt(0)));

        for(int i = 1; i<msg.length(); ++i){
            if(msg.charAt(i) == ' '){
                newMsg.append(' ');
                ++i;
                newMsg.append(Character.toUpperCase(msg.charAt(i)));
            }
            else{
                newMsg.append(msg.charAt(i));
            }
        }
    System.out.println(newMsg);
    }
}
