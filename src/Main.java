public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Yared", "10/11/2000","5/5/2025");
        System.out.println(employee1);
        System.out.println("Age = " + employee1.getAge());
        System.out.println("Pay = " + employee1.collectPay());

        SalariedEmployee Yared = new SalariedEmployee("Yared Leake", "11/19/2000", "5/6/2025", 125000);
        System.out.println(Yared);
        System.out.println("Yared's Paycheck = $" + Yared.collectPay() + " Bi-weekly");
    }
}
