package com.peterson.realrankapi.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum MediaType {
    MOVIE(1),
    SERIES(2),
    ANIME(3);

    private final int code;

    MediaType(int code) {
        this.code = code;
    }

    @JsonCreator
    public static MediaType fromCode(int code) {
        for (MediaType value : MediaType.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid MediaType code: " + code);
    }

    @JsonValue
    public int getCode() {
        return code;
    }

}
