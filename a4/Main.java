package a4;

public class Main {

  public static void main(String[] args) {

    /*You are free to test your code however you wish.  Some code samples
    are commented below as an example.  These operations (e.g., insert, build)
    won't function correctly until you provide the implementation in MinHeap.java.
     */



    //int[] e = new int[] {  101, 37, 26, 19, 15, 12, 9, 2, 3, 5  };
    int[] e = new int[] {  6, 12, 9, 4, 5, 3  };
    MinHeap hp = new MinHeap(300);

    for (int i=0; i<e.length; i++) {
      hp.insert(e[i]);
      System.out.println(i);
    }

    hp.build(e,6);
    System.out.println("heap many inserts: ");
    Print.heap(hp);  // one form
    int[] x = hp.sort();
    int i = 0;
    while(i<6) {
      System.out.println(x[i]);
      i++;
    }
    //System.out.println(hp.size());
//    hp.build(e,6);
//    System.out.println("heap magic build: ");
//    Print.heap(hp);  // another form


  }
}

