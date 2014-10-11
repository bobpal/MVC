package mvc;
/* Robert Palagano
 * 1/15/13
 * 
 * The controller is the liaison between the model and the view
 * It takes data from the view, sends it to the model for calculation
 * then sends it back to the view
 */
public class Controller {
    Model model;
    View view;
    
    public Controller(Model mymodel, View myview){              //constructor
        model = mymodel;
        view = myview;
        
        int k = view.getK();                                    //get K from view
        for(int i=0; i<k; i++){                                 //do for however many sets there are
            int d = view.getD();                                //get D from view
            int n = view.getN();                                //get N from view
            
            int[] convert = view.getConvert();                  //get conversion array from view
            
            int[][] darray = new int[n][d];                     //create array of int arrays
            for(int j=0; j<n; j++){                             //do N times
                darray[j] = view.getDarray();                   //get denomination array from view, put in new row of array
            }
            
            int result = model.calculate(d, n, convert, darray);//send all data to model, put result in variable
            view.display(i, result);                            //send result to view
            
        }//end k loop
    }//end constructor
}
