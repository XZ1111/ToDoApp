package com.luckydraw.todoapp.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "text")
    @NotNull
    private String text;

    @Column(name = "date")
    @NotNull
    private Date date;

    @Column(name = "completed")
    @NotNull
    private Boolean completed;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Group group;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(id, note.id) && Objects.equals(name, note.name) && Objects.equals(text, note.text) && Objects.equals(date, note.date) && Objects.equals(completed, note.completed) && Objects.equals(group, note.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, text, date, completed, group);
    }
}
