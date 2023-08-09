package ua.com.goit.javacore.modulefour.task17;

public class ATM {
    public int countBanknotes(int sum){
        int[] banknotes = {500, 200, 50, 20, 10, 5, 2, 1};
        var notes = 0;
        var index = 0;
        while (index < banknotes.length){
            if(sum >= banknotes[index]){
                notes += sum / banknotes[index];
                sum = sum % banknotes[index];
            }
            index++;
        }
        return notes;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println("atm.countBanknotes(500) = " + atm.countBanknotes(500));
        System.out.println("atm.countBanknotes(578) = " + atm.countBanknotes(578));
    }
}
