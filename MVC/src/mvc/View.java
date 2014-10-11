package mvc;
/* Robert Palagano
 * 1/15/13
 * 
 * The view receives and displays data to the user
 * It does not do anything with the data except send it to the controller
 */
import java.util.Scanner;                       //import scanner utility

public class View {
    private int k;                              //number of data sets
    private int d;                              //number of denominations
    private int n;                              //number of different prices
    Scanner input = new Scanner(System.in);     //create scanner
    
    public int getK(){
        k = input.nextInt();                                //scan input
        return k;
    }
    
    public int getD(){
        d = input.nextInt();                                //scan input
        if(d < 2 || d > 7){
            d = input.nextInt();
        }
        return d;
    }
    
    public int getN(){
        n = input.nextInt();                                //scan input
        if(n < 2 || n > 10){
            n = input.nextInt();
        }
        return n;
    }
    
    public int[] getConvert(){                              //array converts denominations
        int[] convert = new int[d-1];                       //create int array
        for(int i=0; i<d-1; i++){
            convert[i] = input.nextInt();                   //scan input
        }
        return convert;
    }
    
    public int[] getDarray(){                               //array of prices in different denominations
        int[] darray = new int[d];                          //create int array
        for(int i=0; i<d; i++){
            darray[i] = input.nextInt();                    //scan input
        }
        return darray;
    }
    
    public void display(int i, int result){                 //displays output
        System.out.println("Data Set " + (i+1) + ":");
        System.out.println(result + "\n");
    }
}
