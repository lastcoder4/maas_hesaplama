public class Employee
{
    String name;
    double salary;
    int workHours;
    int hireYear;
public Employee(String name, double salary, int workHours,int hireYear)
{
    this.name = name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
}
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }
public double bonus()
{
    if(workHours > 40)
    {
        return (workHours- 40)*30;
    }
    else {
        return 0;
    }
}
    public double raiseSalary() {
        int currentYear = 2021;
        int workYears = currentYear - hireYear;
        if (workYears < 10) {
            return salary * 0.05;
        } else if (workYears >= 10 && workYears < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }
    public String toString() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double totalSalary = salary - taxAmount + bonusAmount + raiseAmount;

        return "Çalışanın Adı: " + name + "\n" +
                "Maaşı: " + salary + " TL\n" +
                "Haftalık Çalışma Saati: " + workHours + "\n" +
                "İşe Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + taxAmount + " TL\n" +
                "Bonus: " + bonusAmount + " TL\n" +
                "Maaş Artışı: " + raiseAmount + " TL\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + (salary - taxAmount + bonusAmount) + " TL\n" +
                "Toplam Maaş: " + totalSalary + " TL\n";
    }




    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali Veli", 2000, 45, 1985);
        System.out.println(emp1);
    }
}