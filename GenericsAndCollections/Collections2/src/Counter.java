import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Counter<E> {
    private HashMap<E, Integer>/* TODO
The HashMap should accomodate a generic class for the keys and Integer for the value*/ counts;

    public Counter(E[] things){
/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
        counts = new HashMap<>();
        for (E thing : things) {
            if (!(counts.containsKey(thing)))
                counts.put(thing, 1);
            else
                counts.put(thing, counts.get(thing) + 1);
        }
    }


    public Integer getCount(E element){
      /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */
        return counts.get(element);
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent(){/* TODO
Returns the most frequent key in the HashMap*/
        E element = null;
        int max = Collections.max(counts.values());
        for(Map.Entry<E, Integer> mapEntry: counts.entrySet()){
            if(max == mapEntry.getValue())
               element = mapEntry.getKey();
        }
        return element;
    }
}
