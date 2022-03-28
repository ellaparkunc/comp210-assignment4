package a4;

public class MinHeap implements Heap {
  
  private int size = 0; // number of elements currently in the heap
  private int[] elts;   // heap array
  private int max;      // array declared size
  
  // ================================================
  // constructors
  // ================================================
  
  public MinHeap(int umax) { // user defined heap size
    this.max = umax;
    this.elts = new int[umax];
  }
  public MinHeap( ) { // default heap size is 100
    this.max = 100;
    this.elts = new int[100];
  }

  //==================================================
  // methods we need to grade
  //==================================================
  
  public int[] getArray() { // do not change this method
    return this.elts;
  }
  
  //=========================================================
  // public methods -- Implement these for the assignment.
  // Note that we want a Min Heap... so the operations
  // getFront and delFront and insert have to compare 
  // for min being at the root  
  //========================================================= 


  public void insert(int p){
    //Hint: remember to update size.  Also, remember that we skip index 0 in the array.
    /*Your code here */
  }
  
  public void delFront(){
    /*Your code here */
  }
  
  public int getFront() throws IllegalStateException {
    //Return the element at the front (i.e., the smallest) element in the min-heap.
    //If the min-heap has no elements, throw an IllegalStateException.
    /*Your code here */
    throw new IllegalStateException(); //Dummy return statement.  Remove (or move elsewhere) when you implement!
  }
  
  public boolean empty( ) {
    /*Your code here */
    return true; //Dummy return statement.  Remove (or move elsewhere) when you implement!
  }

  public int size() {
    /*Your code here */
    return -1; //Dummy return statement.  Remove (or move elsewhere) when you implement!
  }
  
  public void clear() { 
    /*Your code here */

  }
  
  public void build (int[] e, int ne) {
    //Hint: remember to skip slot 0 in the heap array.
    /* Your code here */

  }  
  
  public int[] sort() {
    // Hint: the smallest element will go in slot 0
    /*Your code here */
    return null;// Dummy return statement.  Remove (or move elsewhere) when you implement!
  }

}
