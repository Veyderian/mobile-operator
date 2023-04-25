public class Main {
    public static void main(String[] args) {

        int account = 500; // начальный счёт
        int depositAmount = 1500; // сумма пополнения


        int bonus = depositAmount > 1000 ? depositAmount / 100 : 0;

        System.out.println(("бонусные рубли:") + bonus);
        System.out.println(("Итоговый счёт:") + (account + depositAmount + bonus) + ("рублей"));
    }
}