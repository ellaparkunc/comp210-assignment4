package a4;

public class MinHeap implements Heap {
  
  private int size = 0; // number of elements currently in the heap
  private int[] elts;   // heap array - the elements in the heap
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

  //for heap sort, there are 2 ways to do it: magic build and regular

  public void insert(int p){
    //Hint: remember to update size.  Also, remember that we skip index 0 in the array.
    /*Your code here */
    if (size == max) {
      return;
    }
    elts[size + 1] = p;
    int child = size + 1;
    //while parent (of last element) is greater than last element
    while (elts[child/2] > p && child != 1){
      //save parent's element
      int parent = elts[child/2];
      //assign to parent's spot the child
      elts[child/2] = elts[child];
      elts[child] = parent;
      child = child/2;
    }
    size ++;
    //1. put p @ next empty slot in array, at size +1
    //location of p = variable that changes over time
    //while loop: while p is less than parent:
    //check if item @ index/2 < p
    //if yes, assign old elt to new location
      //assign new elt to old location
    //update location of p
  }
  
  public void delFront(){
    /*Your code here */
    int location = size;
    elts[1] = elts[location];
    location = 1;
    //compare to size. there will never be a skip in the array, so we only need compare the right child
    //if there is both a left and right child
    if (elts[(location *2)+1] <= size) {
      //while parent is greater than one child
      int smaller = -1;
      while (elts[location] > elts[(location *2)+1] || elts[location] > elts[(location *2)])  {
        //swap with smaller child
        if (elts[(location *2)+1] > elts[(location *2)]) {
          smaller = (location *2)+1;
        }
        if (elts[(location *2)+1] <= elts[(location *2)]) {
          smaller = (location *2);
        }
        //save smaller element
        int p = elts[smaller];
        //@ smaller location, assign parent
        elts[smaller] = elts[location];
        elts[location] = p;
        //bubble down to where you just switched
        location = smaller;
      }
    }
    //if there is only a left child
    if (elts[(location *2)+1] <= size) {
      //compare to see if parent is greater than left child
      while (elts[location] > elts[location *2]) {
        //save smaller element
        int p = elts[location *2];
        //to child, assign parent
        elts[location *2] = elts[location];
        //to parent, assign child
        elts[location] = p;
      }
    }
    //if there are no children, do nothing

    //1. start with last node and move to i=1
    //2. compare new 'first' with lower child??????
      //bc we want to go from low to high-
      //bc we want the lower one to move upwards and be above the greater child
    //3. helper method = bubble down (would be nice) continue until both children are greater OR until there's one child
    //4. if there's only one child, compare to that one.


    // start w parent of last node & bubble down?? ==build
    //2. but which one would i start with, the most left version?
    //3. most left=

  }
  
  public int getFront() throws IllegalStateException {
    //Return the element at the front (i.e., the smallest) element in the min-heap.
    //If the min-heap has no elements, throw an IllegalStateException.
    /*Your code here */
    if (size == 0) {
      throw new IllegalStateException();
    }
    else {
      return elts[1];
    }
  }
  
  public boolean empty( ) {
    //doesn't empty it, tells you if its already empty.
    /*Your code here */
    if (this.size == 0) {
      return true;
    }
    else {
      return false;
    }
  }

  public int size() {
    /*Your code here */
    return -1; //Dummy return statement.  Remove (or move elsewhere) when you implement!
  }
  
  public void clear() { 
    /*Your code here */
      //this.MinHeap = new MinHeap(this.max);
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
