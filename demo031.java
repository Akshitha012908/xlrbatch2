import java.util.HashSet;

class HashSetdemo1 {
    void HSetMethod() {
        // We can add any type of element here...
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(100); 
        hashSet.add("CHASHMITHA REDDY");
        hashSet.add(9999.99);
        System.out.println(hashSet);
        
        // We can use the Object class to read any type of elements
        for (Object x : hashSet) {
            System.out.println(x);
        }
    }
}

public class demo031 {
    public static void main(String[] args) {
        HashSetdemo1 obj = new HashSetdemo1();
        obj.HSetMethod();
    }
}