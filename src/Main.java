public class Main {

    public static void main(String[] args) {

        int initionalBalance = 100;
        int addend = 1100;
        int bonus = 0;

        if ( addend > 1000 ) {
        bonus = addend / 100;
    }

       // int bonus = addend > 1000 ? addend / 100 : 0;


    int finalBalance = initionalBalance + addend + bonus;

        System.out.println("Ваш итоговый баланс: " + finalBalance);
        System.out.println("Ваши бонусы: " + bonus);
    }
}
