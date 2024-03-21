package builder;

import org.example.builder.Book;
import org.example.builder.BookBuilder;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class BookBuilderTest {

    @Test
    void throwExceptionBookWithoutTitle(){
        try {
            BookBuilder bookBuilder = new BookBuilder();
            Book book = bookBuilder
                    .setAuthor("Author")
                    .setDescription("Description")
                    .setISBN("9301294")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Invalid Title!", e.getMessage());
        }
    }

    @Test
    void throwExceptionBookWithoutAuthor(){
        try {
            BookBuilder bookBuilder = new BookBuilder();
            Book book = bookBuilder
                    .setTitle("Title 01")
                    .setDescription("Description")
                    .setISBN("9301294")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Invalid Author!", e.getMessage());
        }
    }

    @Test
    void throwExceptionBookWithoutISBN(){
        try {
            BookBuilder bookBuilder = new BookBuilder();
            Book book = bookBuilder
                    .setTitle("Title 01")
                    .setAuthor("Author 01")
                    .setDescription("Description")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Invalid ISBN!", e.getMessage());
        }
    }

    @Test
    void throwExceptionBookWithoutPublicationDate(){
        try {
            BookBuilder bookBuilder = new BookBuilder();
            Book book = bookBuilder
                    .setTitle("Title 01")
                    .setAuthor("Author 01")
                    .setDescription("Description")
                    .setISBN("9301294")
                    .build();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Invalid Publication Date!", e.getMessage());
        }
    }

    @Test
    void validBookCreation(){
        BookBuilder bookBuilder = new BookBuilder();
        Date date = new Date();
        Book book = bookBuilder
                .setTitle("Title 01")
                .setAuthor("Author 01")
                .setDescription("Description")
                .setISBN("9301294")
                .setPublicationDate(date)
                .build();
        assertNotNull(book);
    }
}
