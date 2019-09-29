package com.jobber.entity;

import javax.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "job_area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "area_id")
    private int id;

    private String name;

    @OneToMany(mappedBy = "area", fetch = FetchType.LAZY)
    private Set<Task> TaskSet;

    @ManyToMany(mappedBy = "areaSet", fetch = FetchType.LAZY)
    private Set<User> userSet;

    public Area() {
    }

    public Area(String name) {
        this.name = name;
    }

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

    public Set<Task> getTaskSet() {
        return TaskSet;
    }

    public void setTaskSet(Set<Task> taskSet) {
        TaskSet = taskSet;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return id == area.id &&
                Objects.equals(name, area.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
