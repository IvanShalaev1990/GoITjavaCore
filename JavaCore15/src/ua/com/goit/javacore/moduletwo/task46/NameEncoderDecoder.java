package ua.com.goit.javacore.moduletwo.task46;

public class NameEncoderDecoder {
    public String encode(String name) {
        if (name.contains("0") ||
                name.contains("1") ||
                name.contains("2") ||
                name.contains("3") ||
                name.contains("4") ||
                name.contains("5") ||
                name.contains("6") ||
                name.contains("7") ||
                name.contains("8") ||
                name.contains("9")) {
            return name;
        }return "NOTFORYOU" + name.
                replace("e", "1").
                replace("u", "2").
                replace("i", "3").
                replace("o", "4").
                replace("a", "5") + "YESNOTFORYOU";

    }
        public String decode(String name) {
            name = name.substring(9,name.length()-12);
            return name.
                    replace("1", "e").
                    replace("2", "u").
                    replace("3", "i").
                    replace("4", "o").
                    replace("5", "a");
        }
}
