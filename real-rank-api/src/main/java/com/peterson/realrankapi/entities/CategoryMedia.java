package com.peterson.realrankapi.entities;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table( name = "tb_category_media",
        uniqueConstraints = @UniqueConstraint(columnNames = {"category_id", "media_id"})
)
@Getter
public class CategoryMedia implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String opinion;

    @Setter
    private Integer score;

    @Column(nullable = false)
    @Setter
    private Integer position;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "media_id", nullable = false)
    private Media media;

    public CategoryMedia() {}

    public CategoryMedia(Long id, String opinion, Integer score, Integer position, Category category, Media media) {
        this.id = id;
        this.opinion = opinion;
        this.score = score;
        this.position = position;
        this.category = category;
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoryMedia that)) return false;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
