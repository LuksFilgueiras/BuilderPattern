package org.example.builder;

import java.util.Date;

public class BookBuilder {
    private Book book;

    public BookBuilder(){
        this.book = new Book();
    }

    public Book build(){
        if(book.getTitle().isEmpty()){
            throw new IllegalArgumentException("Invalid Title!");
        }
        if(book.getAuthor().isEmpty()){
            throw new IllegalArgumentException("Invalid Author!");
        }
        if(book.getISBN().isEmpty()){
            throw new IllegalArgumentException("Invalid ISBN!");
        }
        if(book.getPublicationDate() == null){
            throw new IllegalArgumentException("Invalid Publication Date!");
        }

        return book;
    }

    public BookBuilder setTitle(String title){
        book.setTitle(title);
        return this;
    }

    public BookBuilder setAuthor(String author){
        book.setAuthor(author);
        return this;
    }

    public BookBuilder setDescription(String description){
        book.setDescription(description);
        return this;
    }

    public BookBuilder setPublicationDate(Date publicationDate){
        book.setPublicationDate(publicationDate);
        return this;
    }

    public BookBuilder setISBN(String ISBN){
        book.setISBN(ISBN);
        return this;
    }

    public BookBuilder setCopiesAvailable(int copiesAvailable){
        book.setCopiesAvailable(copiesAvailable);
        return this;
    }

    public BookBuilder setPrice(double price){
        book.setPrice(price);
        return this;
    }
}
