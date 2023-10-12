package Worker;

public class SalariedWorker extends Worker{

    SalariedWorker(String name, int salary,String workType,int weekWorkHoursCount) {
        super(name, salary,workType,weekWorkHoursCount);
    }

    @Override
    double getWeeklySalary() {
        return this.salary;
    }
}
