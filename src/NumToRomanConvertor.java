
import java.util.TreeMap;

//Using the template provided by the application.
//No changes in method names and class names assuming it is expected to fit in the given solution model.
//The javadoc and comments are not written with the right format as the shortcuts used in standard IDE are not available and had to be done manually. 
public class NumToRomanConvertor {
    //This map will hold the numbers and their roman counterparts.

    private final static TreeMap<Integer, String> map = new TreeMap<>();

    //Inserting the values
    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    /**
     * this is a recursive method to find the number in roman alphabet.
     * @param n
     * @return
     */
    public String run(int n) {
        if (n < 1 || n > 10000) {
            return "Invalid input";
        }
        String n_in_roman_alphabet = "";
        int l = map.floorKey(n);
        if (n == l) {
            n_in_roman_alphabet = map.get(n);
            return n_in_roman_alphabet;
        }
        n_in_roman_alphabet = map.get(l) + run(n - l);
        return n_in_roman_alphabet;
    }
    /**
     * This is a getter for map. This is being used only in test cases.
     * @return TreeMap
     */
    public TreeMap<Integer, String> getMap() {
        return map;
    }
}
