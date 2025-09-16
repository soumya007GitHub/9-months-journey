import java.lang.Math;
public class ShortestPath {
    public static void main(String args[]){
        int x= 0;
        int y = 0;
        String directions = "WNEENESENNN";
        for(int i =0; i<directions.length(); ++i){
            if(directions.charAt(i) == 'W'){
                --x;
            }
            else if(directions.charAt(i) == 'E'){
                ++x;
            }
            else if(directions.charAt(i) == 'N'){
                ++y;
            }
            else{
                --y;
            }
        }
    double shortestPath = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println(shortestPath);
    }
}
