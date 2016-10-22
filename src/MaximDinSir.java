/**
 * Created by fasttrackit on 10/22/2016.
 */
public class MaximDinSir {

    public static void main(String[] args) {

        //int nnumere = SkeletonJava.readIntGUI("Pentru cate nr sa facem media?");
        //int nnumere = 0;

        /*while( (nnumere = SkeletonJava.readIntGUI("Pentru cate nr sa facem media?")) <= 0 )
        {
            SkeletonJava.printGUI("Pentru medie avem nevoie de cel putin 1 numar");
        }*/

        int a = 0;
        int max = 0;
        double avg = 0;
        int i = 0;

        do{
            a = SkeletonJava.readIntGUI("Introdu numarul " + (i+1) );
            if ( a>max ){
                max = a;
            }
            i++;
        }while(a>0);





        SkeletonJava.printGUI("Maximul este "+max);
    }
}
