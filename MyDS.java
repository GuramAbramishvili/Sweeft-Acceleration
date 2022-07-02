import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MyDS {

    ArrayList<Integer> arr;
    HashMap<Integer, Integer> hash;
    public MyDS(){
        arr = new ArrayList<Integer>();
        hash = new HashMap<Integer, Integer>();
    }

    void add(int x){
        if (hash.get(x) != null)
            return;
        int s = arr.size();
        arr.add(x);
        hash.put(x, s);
    }

    void remove(int x){
        Integer index = hash.get(x);
        if (index == null)
            return;
        hash.remove(x);
        int size = arr.size();
        Integer last = arr.get(size-1);
        Collections.swap(arr, index,  size-1);
        arr.remove(size-1);
        hash.put(last, index);
    }
}
class Main
{
    public static void main (String[] args) {
        MyDS ds = new MyDS();
        ds.add(1);
        ds.add(2);
        ds.add(3);
        ds.add(7);
        ds.remove(1);
    }
}