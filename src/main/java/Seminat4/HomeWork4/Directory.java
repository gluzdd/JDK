package Seminat4.HomeWork4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
    private ArrayList<Worker> workers;
    public Directory() {
        this.workers = new ArrayList<>();
    }

    /**
     * Добавить метод добавление нового сотрудника в справочник сотрудников
     */
    public void add(Worker worker){
        boolean flag = false;
        for (Worker el : workers) {
            if (Objects.equals(el.getTabel(), worker.getTabel())){
                flag = true;
                break;
            }
        }
        if (!flag) {
            workers.add(worker);
        }
    }

    public ArrayList<Worker> SearchByExperience(int experience){
        ArrayList<Worker> works = new ArrayList<>();
        for (Worker employ : workers) {
            if (employ.getExperience() == experience){
                works.add(employ);
            }
        } return works;
    }
    /**
     Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
     */
    public void phoneWorker(String name) {
        List<Worker> workerArrayList = workers.stream().filter(e ->e.getName().equals(name)).toList();
        workerArrayList.forEach(e-> System.out.println(e.getPhone() + "->" + e.getName()));
    }

    /**
     * Добавить метод, который ищет сотрудника по табельному номеру
     */
    public void searchTabelNum(Integer tabelNum){
        workers.stream().filter(e->e.getTabel().equals(tabelNum)).findFirst().ifPresent(System.out::println);
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "workers=" + workers +
                '}';
    }
}
