package mvc;
/* Robert Palagano
 * 1/15/13
 * 
 * This program helps Tim, the time-travelling salesman
 * convert denominations and find the best price in future currencies.
 * It is formatted in the MVC design pattern.
 * 
 * Start of program
 * creates instances of model, view and controller
 * Sends arguments of model and view to controller constructor
 * 
 * The first line is the number K of input data sets, followed by the K data sets,
 * each of the following form:
 * The first line of each data set contains the number 2 <= D <= 7 of denominations,
 * and the number 2 <= N <= 10 of the item’s different prices.
 * On the next line are D −1 positive integers,
 * where the ith integer specifies the number of notes of denomination i + 1
 * that are equivalent to 1 note of denomination i.
 * This is followed by N lines,
 * each one specifying a price in terms of the quantity of notes of each denomination.
 * Each line contains D non-negative integers,
 * where the ith integer specifies the number of notes of denomination i.
 * It is guaranteed that each of the N prices,
 * in terms of the smallest denomination, will fit in a 32-bit integer. 
 * 
 * Unit test:
 * 2
 * 2 2
 * 2
 * 2 0
 * 0 5
 * 3 3
 * 3 5
 * 1 1 1
 * 3 0 0
 * 1 10 0
 * 
 * results should be: 1 and 44
 */
public class MVC {

    public static void main(String[] args) {
        
        Model mymodel = new Model();                                //create new model
        View myview = new View();                                   //create new view
        Controller mycontroller = new Controller(mymodel, myview);  //create new controller
    }
}
