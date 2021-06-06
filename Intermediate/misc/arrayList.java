import java.util.ArrayList;

class arrayListTest {

    public String name;

    arrayListTest (String name) {
        this.name = name;
    }

    // Overidding default implementation of the equals.
    @Override 
    public boolean equals(Object o) {
        arrayListTest l = (arrayListTest) o;
        if (this.name == l.name) {
            System.out.println("equal");
            return true;
        }
        return false;
    } 

    @Override
    public String toString() {
        return "Array has " + this.name ;
    }
     
    public static void main(String[] args) {
        ArrayList<arrayListTest> arl = new ArrayList<>();
        ArrayList<arrayListTest> brl = new ArrayList<>();
        
        arrayListTest a1 = new arrayListTest("ab");
        arrayListTest b1 = new arrayListTest("ab");

        arl.add(a1);
        brl.add(b1);

        System.out.println(arl.equals(brl));
        System.out.println(arl);
    }
}