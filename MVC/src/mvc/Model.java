package mvc;
/* Robert Palagano
 * 1/15/13
 * 
 * The model takes data from the controller and calculates the answer
 */
import java.util.Arrays;                    //import array utility for sort

public class Model {
    public int calculate(int d, int n, int[] c, int[][] a){
        int[] r = new int[n];               //lists simplified prices
        int[] t = new int[d];               //lists worth of denomination in lowest denomination form
        
        for(int i=0; i<n; i++){             //each pass calculates one row
            int x = 0;                      //term counter
            for(int j=d-1; j>=0; j--){      //each pass calculates one term
                t[x] = a[i][j];             //takes first term in matrix and puts in array

                for(int k=j; k<d-1; k++){   //loop to convert term to lowest denomination
                    t[x] = t[x] * c[k];     //multiplies term by conversion number

                }//end k
                r[i] = r[i] + t[x];         //add to find total price
                x++;                        //increment term counter
            }//end j
        }//end i
        Arrays.sort(r);                     //sort results array
        int result = r[n-1] - r[0];         //subtract highest term by lowest term
        
        return result;
    }
}
