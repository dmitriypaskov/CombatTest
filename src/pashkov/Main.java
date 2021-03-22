package pashkov;

public class Main {

    private static final double SALARY_FOR_ALL = 100000;
    private static double bossSalary;
    private static double ivanSalary;
    private static double alexSalary;
    private static double sergeySalary;

    public static void main(String[] args) {
        TimeSpan timeSpan1 = new TimeSpan(15, 50);
        TimeSpan timeSpan2 = new TimeSpan(1, 20);
        timeSpan1.add(timeSpan2);
        System.out.println(timeSpan1);
        timeSpan1.sub(timeSpan2);
        System.out.println(timeSpan1);
        timeSpan1.mult(3);
        System.out.println(timeSpan1);

        BankAccount boss = new BankAccount("Oleg", 0);
        BankAccount ivan = new BankAccount("Ivan", 0);
        BankAccount alex = new BankAccount("Alex", 0);
        BankAccount sergey = new BankAccount("Sergey", 0);
        boss.add(SALARY_FOR_ALL);
        boss.transfer(ivan, 10000);
        boss.transfer(alex, 15000);
        boss.transfer(sergey, 20000);
        bossSalary = boss.getCount();
        ivanSalary = ivan.getCount();
        alexSalary = alex.getCount();
        sergeySalary = sergey.getCount();
        System.out.println("Salary for boss " + boss.getCount());
        System.out.println("Salary for ivan " + ivan.getCount());
        System.out.println("Salary for alex " + alex.getCount());
        System.out.println("Salary for sergey " + sergey.getCount());
        System.out.println("Commission for bank " + calculateCommission());
    }

    private static double calculateCommission() {
        return SALARY_FOR_ALL - (bossSalary + ivanSalary + alexSalary + sergeySalary);
    }


}
