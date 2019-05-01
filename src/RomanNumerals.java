import java.util.ArrayList;

public class RomanNumerals {

    public class RomanInfo {
        public int value;
        public String Numerals;

        public RomanInfo(int inputValue, String inputNums) {
            value = inputValue;
            Numerals = inputNums;
        }
    }

    private static ArrayList<RomanInfo> RomNums;

    public RomanNumerals() {
        RomNums = new ArrayList<RomanInfo>();
        RomNums.add(new RomanInfo(900, "CM"));
        RomNums.add(new RomanInfo(1000, "M"));
        RomNums.add(new RomanInfo(400, "CD"));
        RomNums.add(new RomanInfo(500, "D"));
        RomNums.add(new RomanInfo(90, "XC"));
        RomNums.add(new RomanInfo(100, "C"));
        RomNums.add(new RomanInfo(40, "XL"));
        RomNums.add(new RomanInfo(50, "L"));
        RomNums.add(new RomanInfo(9, "IX"));
        RomNums.add(new RomanInfo(10, "X"));
        RomNums.add(new RomanInfo(4, "IV"));
        RomNums.add(new RomanInfo(5, "V"));
        RomNums.add(new RomanInfo(1, "I"));
    }

    public int getIntValueFromRomanNumeralString(String inputString) {

        inputString = inputString.toUpperCase();

        int outputValue = 0;
        int lastIndex;
        String findStr;

        for(int n = 0; n < RomNums.size(); n++) {
            RomanInfo currentNumeral = RomNums.get(n);

            findStr = currentNumeral.Numerals;
            lastIndex = 0;

            while(lastIndex != -1){

                lastIndex = inputString.indexOf(findStr, lastIndex);

                if(lastIndex != -1){

                    System.out.printf("Found: %s (%d)%n", findStr, currentNumeral.value);
                    outputValue += currentNumeral.value;

                    inputString = inputString.replaceFirst(findStr,"-");

                    lastIndex += findStr.length();
                }
            }
        }

        return outputValue;
    }

    public static void main(String[] args) {

        String inputString = "MCDXLVI"; //1446

        RomanNumerals rn = new RomanNumerals();

        int romanNumInt = rn.getIntValueFromRomanNumeralString(inputString);

        System.out.printf("Roman Numeral Value: %d", romanNumInt);
    }

}
