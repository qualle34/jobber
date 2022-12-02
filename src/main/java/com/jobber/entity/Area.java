package com.jobber.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "area", fetch = FetchType.LAZY)
    private Set<Task> TaskSet;

    @ManyToMany(mappedBy = "areaSet", fetch = FetchType.LAZY)
    private Set<User> userSet;

    public Area(Long id) {
        this.id = id;
    }
}
