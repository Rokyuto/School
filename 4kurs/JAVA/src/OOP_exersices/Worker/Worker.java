package Worker;

public abstract class Worker {
    protected String name;
    protected int salary;
    protected String workType;
    protected int weekWorkHoursCount;

    Worker(String name,int salary,String workType,int weekWorkHoursCount){
        this.name = name;
        this.salary = salary;
        this.workType = workType;
        this.weekWorkHoursCount = weekWorkHoursCount;
    }

    abstract double getWeeklySalary();
}
