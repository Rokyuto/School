package Worker;

public class HourlyWorker extends Worker{
    HourlyWorker(String name, int salary,String workType,int weekWorkHoursCount) {
        super(name, salary,workType,weekWorkHoursCount);
    }

    @Override
    double getWeeklySalary() {
        if (weekWorkHoursCount <= 40){
            return this.salary;
        }
        else{
            return this.salary + ((1.5 * this.salary) * (weekWorkHoursCount - 40));
        }
    }
}
