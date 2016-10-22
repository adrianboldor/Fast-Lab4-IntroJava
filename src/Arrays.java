/**
 * Created by fasttrackit on 10/22/2016.
 */
public class Arrays {
    public static void main(String[] args) {
        int sir[] = {3,5,6,3,71};
        int sirDuplicat[] = new int[sir.length];
        int sirImpar[] = new int[sir.length];
        int suma = 0;
        int i=0;
        int max=sir[0];

        for (int j=0; i<sir.length ; i++){
            suma += sir[i];
            if (sir[i] > max){
                max = sir[i];
            }
            sirDuplicat[i] = sir[i]*2;

            System.out.print(sirDuplicat[i] + " ");

            if (sir[i]%2 !=0){
                sirImpar[j] = sir[i];
                j++;
            }
        }

        for (int k =0 ; k<sirImpar.length;k++){
            System.out.print(sirImpar[k] + " ");
        }

        double avg = (double)suma/i;
        SkeletonJava.printGUI("Media este " + avg + " si maxim este " + max);




    }
}
