package a4;
//dheyam@unc.edu
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
    if (size == max) {
      return;
    }
    elts[size + 1] = p;
    int child = size + 1;
    //while parent (of last element) is greater than last element
    //elts[child/2] > p
    System.out.println("inserted elt into array");
    while (child/2 >= 1){
      System.out.println(elts[child/2]);
      if (elts[child/2] <= elts[child]) {
        size++;
        return;
      }
      //save parent's element
      int parent = elts[child/2];
      //assign to parent's spot the child
      elts[child/2] = elts[child];
      elts[child] = parent;
      child = child/2;
    }
    size ++;
    return;
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
    while ((location *2) < size) {
      //while parent is greater than one child
      int smaller = -1;
      //if there is no right child (but there is a left child!)
      if ((location *2)+1 > size) {
        //compare to see if parent is greater than left child (end of array)
        if (elts[location] > elts[location *2]) {
          //save smaller element
          int p = elts[location *2];
          //to child, assign parent
          elts[location *2] = elts[location];
          //to parent, assign child
          elts[location] = p;
        }
        break;
      }
      //if there is both a left and right child & one of them is smaller than parent
      if (elts[location] > elts[(location *2)+1] || elts[location] > elts[(location *2)])  {
        //swap with smaller child
        if (elts[(location *2)+1] < elts[(location *2)]) {
          smaller = (location *2)+1;
        }
        if (elts[(location *2)+1] >= elts[(location *2)]) {
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
      else {
        break;
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
    size--;
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
    return size;
  }
  
  public void clear() { 
    /*Your code here */
    this.elts = new int[this.max];
    this.size = 0;
  }
  
  public void build (int[] e, int ne) {
    //Hint: remember to skip slot 0 in the heap array.
    /* Your code here */
    //1. clear
    clear();
    //2. load the elements in parameter "elts" into the heap
    //         array directly ( a O(N) copying action )

    for(int i=0; i<ne; i++) {
      //take my 'this' element at i+1 and assign the first e element to it.
      elts[i+1] = e[i];
      size++;
    }
    //start at parent of last index and work to root
    for(int i=size/2; i>0; i--) {
      helperbubble(i);
    }
    //helper method (from delFront) takes in location


    //third:  perform the "bubble down" operations that a build
    //         requires on the heap array
    // start w parent of last node, bubble down
  }  

  public void helperbubble(int location) {
    while ((location *2) <= size) {
      //while parent is greater than one child
      int smaller = -1;
      //if there is no right child (but there is a left child!)
      if ((location *2)+1 > size) {
        //compare to see if parent is greater than left child (end of array)
        if (elts[location] > elts[location *2]) {
          //save smaller element
          int p = elts[location *2];
          //to child, assign parent
          elts[location *2] = elts[location];
          //to parent, assign child
          elts[location] = p;
        }
        break;
      }
      //if there is both a left and right child & one of them is smaller than parent
      if (elts[location] > elts[(location *2)+1] || elts[location] > elts[(location *2)])  {
        //swap with smaller child
        if (elts[(location *2)+1] < elts[(location *2)]) {
          smaller = (location *2)+1;
        }
        if (elts[(location *2)+1] >= elts[(location *2)]) {
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
      else {
        break;
      }
    }
  }
  public int[] sort() {
    // Hint: the smallest element will go in slot 0
    /*Your code here */
    return null;// Dummy return statement.  Remove (or move elsewhere) when you implement!
  }

}
