import java.lang.Math;
public class PowerUptoN {

    public static double powerUptoN(int base, int power){
        if(power == 0){
            return 1;
        }
        if(power == 1){
            return base;
        }
        return base * Math.pow(base, power-1);
    }
    public static void main(String args[]){
        int base = 2;
        int power = 10;
        System.out.println(powerUptoN(base, power));
    }
}
