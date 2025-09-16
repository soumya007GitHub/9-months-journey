public class StringsEquality {
    public static void main(String args[]){
        String name1 = "Tony";
        String name2 = "Tony";
        String name3 = new String("Tony");

        if(name1 == name2){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }

        if(name1 == name3){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }

        if(name1.equals(name3)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
}
}
