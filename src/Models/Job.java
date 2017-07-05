package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Burak Köken on 5.7.2017.
 */
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "jobList")
    private Collection<Employee> employeeList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Collection<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
