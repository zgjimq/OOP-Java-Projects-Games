package java5.DAY1;

import java.util.ArrayList;

import java4.sup.BookException;

public class BookStore {
    ArrayList<Book>list2;
    
    public BookStore(){
        list2=new ArrayList<>();
    }
    
    public Book getBook(int index)throws BookException{
        if(index>list2.size())
            throw new BookException("Something wrong with the size");
        
        Book newBook=new Book(this.list2.get(index));
        return newBook;
    }
    
    public void setBook(int index,Book b)throws BookException{
        if(b ==null)
            throw new BookException("Something wrong with this!");
        
        if(index>list2.size())
            throw new BookException("Something wrong with the size of the index");
        
        this.list2.set(index, new Book(b));
    }
    public void addBooks(Book b)throws BookException{
        if(b==null)
            throw new BookException("The Book that u trying to add is null");
        
        if(list2.contains(b))
            throw new BookException("No duplicates");
        
        list2.add(new Book(b));
    }
   
    public void sellBookByTitle(String title){
        for(int i=0;i<list2.size();i++){
            if(list2.get(i).getTitle().equals(title)){
                list2.remove(i);
            }
        }
    }
}
