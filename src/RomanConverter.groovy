/**
 * User: kon
 * Date: 6/03/13
 * Time: 7:12 PM
 */
public class RomanConverter {

    private final static IllegalArgumentException romanExc = new IllegalArgumentException("Romans only go forward");

//    Map<Integer, String> driver = new HashMap<>()
//
//    public RomanConverter() {
//           driver.put(0, "I")
//       driver.put(4, "V")
//    }

    List conversion = ['IV', 'XL', 'CD', 'M']

    public String integerToRoman(int i) {
        if (i <= 0) {
            throw romanExc;
        }

        String intAsString = i.toString();
        String stringer = ""

        intAsString.eachWithIndex { String entry, int index ->
            int column = intAsString.length() - index - 1
            int numeral = Integer.valueOf(entry)

            if (numeral == 9) {
                stringer += "${conversion[column][0]}${conversion[column + 1][0]}"
            } else if (numeral == 4) {
                stringer += "${conversion[column][0]}${conversion[column][1]}"
            } else {
                if (numeral >= 5) {
                    stringer += "${conversion[column][1]}"
                    numeral -= 5
                }

                stringer += conversion[column][0] * numeral
            }
        }

        return stringer

//        boolean prefix = false
//        driver.reverseEach { key, value ->
//
//            if (prefix) {
//                stringer = value+key;
//                prefix=false
//            }
//
//            if (i == key || i-1 == key)
//                stringer = value
//
//            if (i == key)
//                prefix = true
//
//            if (i > key) {
//                stringer += value
//                i -= key
//            }
//        }
//
//        return stringer + "I"*i
    }
}
