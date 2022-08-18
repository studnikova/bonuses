public class Main {

    public static void main(String[] args) {
        int initialBalance = 95;
        int depositAmount = 1050;
        int bonus = depositAmount / 100 * 1;

        if (depositAmount >= 1_000) {
            bonus = depositAmount / 100 * 1;
            System.out.println ("Итоговый бонус: " + bonus);
        }

        if (depositAmount < 1_000) {
            System.out.println ("Бонус не начислен");
        }

        int finalScore = initialBalance + depositAmount + bonus;
        System.out.println ("Итоговый баланс: " + finalScore);
    }
}
