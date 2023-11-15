package ru.job4j.articles.model;

import java.util.Objects;

public class Word {

    private int id;

    private String value;

    public Word(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Word word = (Word) o;
        return id == word.id && Objects.equals(value, word.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
