package Anonymous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * ["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
 * [[],[0],[1],[0],[2],[1],[]]
 *
 * Input
 * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
 * [[], [1], [2], [2], [], [1], [2], []]
 * Output
 * [null, true, false, true, 2, true, false, 2]
 *
 *
 * RandomizedSet() Initializes the RandomizedSet object.
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
 */
public class Randomized {
    ArrayList<Integer> list;
    //store the val and index
    HashMap<Integer, Integer> lookup;


    public static void main(String[] args) {

    }

    public Randomized() {
            list = new ArrayList<>();
            lookup = new HashMap<>();
    }

    public boolean insert(int val) {
        if(lookup.containsKey(val)){
            return false;
        }
        lookup.put(val, list.size());
        list.add(val);
        return true;

    }

    public boolean remove(int val) {
        if(!lookup.containsKey(val)){
            return false;
        }
        int index = lookup.get(val);
        //remove from the map
        lookup.remove(val);
        list.remove(index);
        return true;

    }

    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}
