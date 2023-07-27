package ua.com.goit.javacore.modulethree.task26;

public class CaptainDisputeAgain {
    public int findMin(int[] triple){
        int holder;
       int i = triple[2] < triple[1] ? (holder = triple[2]) : (holder = triple[1]);
        int b = holder > triple[0] ? (holder = triple[0]) : (holder = holder);
        return holder;
    }

    public static void main(String[] args) {
        CaptainDisputeAgain cda = new CaptainDisputeAgain();
        int[] arr = {0, 1, 2};
        int[] arrOne = {1, 10, 3};
        int[] arrTwo = {50, 4, 100};
        System.out.println("cda.findMin(arr) = " + cda.findMin(arr));
        System.out.println("cda.findMin(arrOne) = " + cda.findMin(arrOne));
        System.out.println("cda.findMin(arrTwo) = " + cda.findMin(arrTwo));
    }
}
