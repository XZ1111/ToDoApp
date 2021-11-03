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
@Table(name = "notes_group")
public class Group {

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
    @JoinColumn(name = "note_list_id")
    private NotesList notesList;

    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
    private Set<Note> notes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id) && Objects.equals(name, group.name) && Objects.equals(date, group.date) && Objects.equals(notesList, group.notesList) && Objects.equals(notes, group.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, notesList, notes);
    }
}
