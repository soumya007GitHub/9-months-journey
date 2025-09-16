public class SubString {
    public static void main(String args[]){
        String name = "Soumya";
        for(int i = 0; i<4; ++i){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        String newName = name.substring(0, 4);
        System.out.println(newName);
    }
}
