package com.peterson.realrankapi.entities;

import com.peterson.realrankapi.entities.enums.MediaType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_media")
@Getter
public class Media implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private String posterUrl;
    @NotBlank
    private String author;
    @NotNull
    private LocalDate releaseDate;

    @Enumerated(EnumType.STRING)
    @NotNull
    private MediaType mediaType;

    @Setter
    private Integer durationMinutes;  // Movies
    @Setter
    private Integer episodeCount; // Series | anime

    public Media(){}
    public Media(UUID id, String title, String description, String posterUrl, String author, LocalDate releaseDate, MediaType mediaType) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.posterUrl = posterUrl;
        this.author = author;
        this.releaseDate = releaseDate;
        this.mediaType = mediaType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Media media)) return false;
        return id != null && Objects.equals(id, media.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
