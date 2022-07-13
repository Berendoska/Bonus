public class Main {
    public static void main(String[] args) {

        int bill = 200;
        int plus = 5000;

        int bonus;
        if (plus > 1000) {
            bonus = (bill + plus) / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Сумма бонусов:" + (bonus));
        System.out.println("Итоговый счет: " + (bill + plus));
    }
}


