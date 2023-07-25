package ua.com.goit.javacore.modulethree.task14;

public class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet){
        return String.format("name - %s, age - %s, planet - %s", name, age, planet );
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
        String[] all = new String[names.length];
        for (int i = 0; i < all.length; i++) {
            all[i] = aggregateSingle(names[i],String.valueOf(ages[i]), planets[i]);
        }
        return all;
    }
}
