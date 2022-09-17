package org.chester_sd.day11;

public class Picker implements Worker{
    private int salary;

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);

    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() > 1500){
            salary *= 3;
        }

    }
}
