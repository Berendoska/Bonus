public class Main {
    public static void main(String[] args) {

        int bill = 200;
        int plus = 1000;

        if (bill + plus > 1000) {
            System.out.println("Сумма бонусов: " + (bill + plus) / 100);
            System.out.println("Итоговый счет: " + (bill + plus));
        }
    }
}

