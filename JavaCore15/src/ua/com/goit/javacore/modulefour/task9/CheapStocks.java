package ua.com.goit.javacore.modulefour.task9;

public class CheapStocks {
    public String getCheapStocks(String[] stocks){
        StringBuilder sb = new StringBuilder();
        for (String str: stocks) {
            String[] separated = str.split(" ");
            if (Integer.parseInt(separated[1]) < 200){
                sb.append(separated[0]).append(" ");
            }
        }

        return String.valueOf(sb).strip();
    }

    public static void main(String[] args) {
        CheapStocks cs = new CheapStocks();
        System.out.println(cs.getCheapStocks(new String[]{"gun 500", "firebow 70", "pixboom 200", "xi 118", "Ha 138"}));
    }
}
