package com.jobber.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employer")
public class Employer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "employer_id")
    private int id;

    private String title;
    private String phone;
    private String description;
    private String location;
    private String password;
    private String email;

    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Task> taskSet;

    public Employer() {
    }

    public Employer(String title) {
        this.title = title;
    }

    public Employer(String title, String phone, String description, String location, String password, String email) {
        this.title = title;
        this.phone = phone;
        this.description = description;
        this.location = location;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Task> getTaskSet() {
        return taskSet;
    }

    public void setTaskSet(Set<Task> taskSet) {
        this.taskSet = taskSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return id == employer.id &&
                Objects.equals(title, employer.title) &&
                Objects.equals(phone, employer.phone) &&
                Objects.equals(description, employer.description) &&
                Objects.equals(location, employer.location) &&
                Objects.equals(password, employer.password) &&
                Objects.equals(email, employer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, phone, description, location, password, email);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", taskSet=" + taskSet +
                '}';
    }
}
