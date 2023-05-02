package Worker;

public class Test {
    static Worker[] workers = new Worker[3];
    public static void main(String[] args) {

        workers[0] = new HourlyWorker("Ivan",350,"Builder",35);
        workers[1] = new SalariedWorker("Pesho",250,"Farmer",40);
        workers[2] = new HourlyWorker("Georgi",400,"Scientist",45);

    }

    public double allHoursCount(){
        int sum = 0;
        for (Worker currentWorker : workers){
            sum += currentWorker.weekWorkHoursCount;
        }
        return sum;
    }

    public double averageHoursCount(){
        return allHoursCount() / workers.length;
    }

    public double allSalary(){
        int sum = 0;
        for (Worker currentWorker : workers){
            sum += currentWorker.salary;
        }
        return sum;
    }

    public double averageSalary(){
        return allHoursCount() / workers.length;
    }
}
