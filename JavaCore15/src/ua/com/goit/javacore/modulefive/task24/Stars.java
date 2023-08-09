package ua.com.goit.javacore.modulefive.task24;

public class Stars {
    private int count;
    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }
    @Override
    public String toString(){
        int [] code = {1000, 100, 10 ,1};
        String[] deCoder = {"X", "Y", "Z", "*"};
        int count = this.getCount();
        int index = 0;
        String deCode = "";
        while (index < code.length){
            if (count >= code[index]){
                for (int i = 0; i < count / code[index]; i++) {
                    deCode += deCoder[index];
                }
                count = count % code[index];
                index++;
            }else index++;
        }
        return deCode;
    }
}
