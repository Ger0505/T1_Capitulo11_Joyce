/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_;

/**
 *
 * @author Gerardo A A
 */
public abstract class Story {
    protected String title;
    protected String author;
    protected Integer pages;
    protected String message="Limite de paginas no cumplido";

    public Story(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public abstract void setPages(Integer pages);

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Story{" + "title=" + title + ", author=" + author + ", pages=" + pages+'}';
    }
    
    
    
}
