package br.com.erudio.Converter;

public class Converter {

    public static Double convertToDouble(String strNumber) throws Exception {
        if (strNumber == null) {
            throw new NullPointerException();
        }
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number))
            return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String strNumber) throws Exception {
        if (strNumber == null) {
            throw new Exception();
        }
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
    
}
