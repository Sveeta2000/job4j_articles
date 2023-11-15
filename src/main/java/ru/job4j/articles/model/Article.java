package ru.job4j.articles.model;

import java.util.Objects;

public class Article {

    private int id;

    private String text;

    public Article(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Article(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Article article = (Article) o;
        return id == article.id && Objects.equals(text, article.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text);
    }
}
