package com.luckydraw.todoapp.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notes_list")
public class NotesList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "date")
    @NotNull
    private Date date;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "notesList", fetch = FetchType.EAGER)
    private Set<Group> groups;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotesList notesList = (NotesList) o;
        return Objects.equals(id, notesList.id) && Objects.equals(name, notesList.name) && Objects.equals(date, notesList.date) && Objects.equals(user, notesList.user) && Objects.equals(groups, notesList.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, user, groups);
    }
}
