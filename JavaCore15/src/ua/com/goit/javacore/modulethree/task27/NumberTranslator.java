package ua.com.goit.javacore.modulethree.task27;

public class NumberTranslator {
    public int translate(String romanNumber){
        switch (romanNumber.toUpperCase().strip()){
            case "I" :
                return 1;
            case "II" :
                return 2;
            case "III" :
                return 3;
            case "IV" :
                return 4;
            case "V" :
                return 5;
            case "VI" :
                return 6;
            case "VII" :
                return 7;
            case "VIII" :
                return 8;
            case "IX" :
                return 9;
            case "X" :
                return 10;
            case "XI" :
                return 11;
            case "XII" :
                return 12;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        NumberTranslator ntl = new NumberTranslator();
        System.out.println("ntl.translate(\"iv\") = " + ntl.translate("iv"));
        System.out.println("ntl.translate(\" xi \") = " + ntl.translate(" xi "));
        System.out.println("ntl.translate(\"iii \") = " + ntl.translate("iii "));
    }
}
