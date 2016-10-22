/**
 * Created by fasttrackit on 10/22/2016.
 */
public class Princi {
    public static void main(String[] args) {

        //int nnumere = SkeletonJava.readIntGUI("Pentru cate nr sa facem media?");
        int nnumere = 0;

        while( (nnumere = SkeletonJava.readIntGUI("Pentru cate nr sa facem media?")) <= 0 )
        {
            SkeletonJava.printGUI("Pentru medie avem nevoie de cel putin 1 numar");
        }

        int a = 0;
        double avg = 0;



        for (int i = 1; i <= nnumere ; i++){

            a += SkeletonJava.readIntGUI("Introdu numarul" + i);
        }




        avg = (double)a/nnumere;

        SkeletonJava.printGUI("Media este "+avg);
    }
}
