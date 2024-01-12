package java5.DAY1;
import java4.sup.BookException;
public class Book{
    private String author;
    private String title;
    private double rating;

    public Book(String author,String title,double rating)throws BookException{
        if(author==null || author.trim().isEmpty()){
            throw new BookException("Emri i autorit nuk eshte ne rregull");
        }
        if(title==null || title.trim().isEmpty()){
            throw new BookException("Emri i titullit nuk eshte ne rregull");
        }
        if(rating<0.0 || rating>10.00){
            throw new BookException("Vleresimi i librit nuk eshte ne rregull");
        }
        this.author=author;
        this.rating=rating;
        this.title=title;
    }

    public Book(Book source)throws BookException{
         if(source.author==null || source.author.trim().isEmpty()){
            throw new BookException("Emri i autorit nuk eshte ne rregull");
        }
        if(source.title==null || source.title.trim().isEmpty()){
            throw new BookException("Emri i titullit nuk eshte ne rregull");
        }
        if(source.rating<0.0 || source.rating>10.00){
            throw new BookException("Vleresimi i librit nuk eshte ne rregull");
        }
        this.author=source.author;
        this.rating=source.rating;
        this.title=source.title;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public double getRating(){
        return rating;
    }
    public void setAuthor(String author)throws BookException{
        if(author==null || author.trim().isEmpty()){
            throw new BookException("Autori qe deshironi te beni update nuk eshte ne rregull");
        }
        this.author=author;
    }
    public void setTitle(String title)throws BookException{
        if(title==null || title.trim().isEmpty()){
            throw new BookException("Titulli qe deshironi te beni update nuk eshte ne rregull");
        }
        this.title=title;
    }
    public void setRating(double rating)throws BookException{
        if(rating<0.0 || rating>10.00){
            throw new BookException("Rating qe deshironi te beni update nuk eshte ne rregull");
        }   
        this.rating=rating;
    }
    public String toString(){
        return "Emri i autorit eshte :"+this.author+"\nEmri i librit eshte :"+this.title+"\nMe vleresimin :"+this.rating;
    }
    public boolean equals(Object o){
        if(o instanceof Book b){
            return author.equals(b.getAuthor()) && title.equals(b.getTitle());
        }
        return false;
    }
}