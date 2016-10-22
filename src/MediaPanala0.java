/**
 * Created by fasttrackit on 10/22/2016.
 */
public class MediaPanala0 {

    public static void main(String[] args) {

        //int nnumere = SkeletonJava.readIntGUI("Pentru cate nr sa facem media?");
        //int nnumere = 0;

        /*while( (nnumere = SkeletonJava.readIntGUI("Pentru cate nr sa facem media?")) <= 0 )
        {
            SkeletonJava.printGUI("Pentru medie avem nevoie de cel putin 1 numar");
        }*/

        int a = 0;
        int sum = 0;
        double avg = 0;
        int i = 0;




        while( (a = SkeletonJava.readIntGUI("Introdu numarul " + (i+1) ) ) <= 0 ){
            sum += a;
            i++;
        }


        avg = (double)sum/i;

        SkeletonJava.printGUI("Media este "+avg);
    }
}
