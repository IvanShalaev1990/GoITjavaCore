package ua.com.goit.javacore.modulesix.task21;

public class LevelLoader {
    private static LevelLoader instance = new LevelLoader();
    private LevelLoader(){}

    public static LevelLoader getInstance(){
        return instance;
    }
    public String load(String levelName){
        return "Loading level " + levelName + " ...";
    }
}
