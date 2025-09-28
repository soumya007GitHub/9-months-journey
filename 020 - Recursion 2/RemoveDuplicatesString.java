public class RemoveDuplicatesString{

    public static String remove(String name, int index, StringBuilder newstr, boolean array[]){

        if(index == name.length()){
            return newstr.toString();
        }

        char ch = name.charAt(index);
        if(array[ch-'a']){
            return remove(name, index+1, newstr, array);
        }else{
            array[ch - 'a'] = true;
            return remove(name, index+1, newstr.append(ch), array);
        }
    }
    public static void main(String args[]){
        String name = "hellotralalerotralala";
        System.out.println(remove(name, 0, new StringBuilder(""), new boolean[26]));
    }
}