package Seminat4.HomeWork4;

public class Worker {
    private String name;
    private Integer tabel;
    private String phone;
    private int experience;

    public Worker(String name, Integer tabel, String phone, int experience) {
        this.name = name;
        this.tabel = tabel;
        this.phone = phone;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", tabel=" + tabel +
                ", phone='" + phone + '\'' +
                ", experience=" + experience +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTabel() {
        return tabel;
    }

    public void setTabel(Integer tabel) {
        this.tabel = tabel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
