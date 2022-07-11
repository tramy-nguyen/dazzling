package webtech.com.dazzling.api;

public class Person {


    private long id;
    private String firstname;
    private String lastname;
    private boolean vaccinated;
    private int age;

    public Person (long id, String firstname, String lastname, int age, Boolean vaccinated) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.vaccinated = vaccinated;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
