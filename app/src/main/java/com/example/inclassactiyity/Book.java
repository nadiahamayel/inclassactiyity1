package com.example.inclassactiyity;

import android.widget.EditText;

public class Book {
    private  String title;
    private  String author;
    private  int page;

    public Book(EditText title, EditText name, EditText page) {
    }

    public Book(String title, String author,int page) {
        this.author = author;
        this.page = page;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
