public class Tiles{

    public static int tiles(int length){
        if(length == 0 || length == 1){
            return 1;
        }

        int verticalArrangement = tiles(length - 1);
        int horizontalArrangement = tiles(length - 2);

        return verticalArrangement+horizontalArrangement;
    }
    public static void main(String args[]){
        int floorLength = 5;
        System.out.println(tiles(floorLength));
    }
}