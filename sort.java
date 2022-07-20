import java.util.*;

public class sort{

    public static void main(String args[]){

        Random rand = new Random();
        int[] array = new int[20];
        array = fill_array(array, rand);
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        int[] a = sorted(array);
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.print("\n");

    }

    public static int[] fill_array(int[] array, Random rand){

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++){

            result[i] = rand.nextInt(100);

        }
        return result;

    }

    static public int[] sorted(int[] array){

        int buff;
        int[] result = new int[array.length];
        result = array;
        for (int i = 0; i < result.length; ++i){
            try{

                if (result[i] > result[i + 1]){

                    //System.out.printf("%d > %d\n", result[i], result[i + 1]);
                    buff = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = buff;
                    i = -1;

                }

                else{

                    continue;

                }

            }

            catch(IndexOutOfBoundsException ex){

                return result;

            }

        }
        
        return result;

    }

}