package com.peterson.realrankapi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_category")
@Getter
public class Category implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    @Setter
    private String name;
    @Setter
    private String imageURL;

    @Column(unique = true, nullable = false, updatable = false)
    private String shareSlug;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User owner;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("position ASC")
    private final List<CategoryMedia> categoryMediaList = new ArrayList<>();


    public Category() {}

    public Category(Long id, String name, String imageURL, String shareSlug, User owner) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        this.shareSlug = shareSlug;
        this.owner = owner;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category)) return false;
        return id != null && Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
