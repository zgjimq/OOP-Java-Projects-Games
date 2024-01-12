package java5.DAY1;
import java.util.ArrayList;
import java4.sup.BookException;
public class Main {
    private ArrayList<Book>list;
    static BookStore bs=new BookStore();
    public Main(){
        list=new ArrayList<>();
    }
    public void addIntoBookStore()throws BookException{
        for(int i=0;i<list.size();i++)
            bs.addBooks(list.get(i));
    }
    public void add(Book b)throws BookException{
        if(b==null)
            throw new BookException("Libri nuk duhet te jete null");
        
        if(list.contains(b)){
           throw new BookException("Dy libra nuk indektik nuk mund te jete!");
        }
        list.add(b);
    }
    public void printStoreBooks()throws BookException{
        //Book r=bs.getBook(0);
        for(int i=0;i<bs.list2.size();i++){
            Book book=bs.getBook(i);
            if(bs.getBook(i)==null)
                throw new BookException("Null Book");
            
            System.out.println(book+"\n\n");
        }
    }
    public void print(){
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i)+"\n\n");
    }
    
    public static void main(String[] args) {
        try{
            Main mainn= new Main();
          Book book1= new Book("Libri 1", "Titulli1",5.0);
            Book book2= new Book("Libri 2", "Titulli2",6.9);
            Book book3= new Book("Libri 3", "Titulli3",6.9);
            Book book4= new Book("Libri 4", "Titulli4",6.9);
            mainn.add(book1);
            mainn.add(book2);
            mainn.add(book3);
            mainn.add(book4);
            mainn.addIntoBookStore();
            System.out.println("==============Before sell book===============");
            mainn.printStoreBooks();
            bs.setBook(0, new Book(book4)); 
            bs.sellBookByTitle("Titulli4");//2 books will be removed 
            System.out.println("==============After sell book and update===========");
            mainn.printStoreBooks();
        }catch(BookException e){
            System.out.println(e.getMessage());
        }
        
    }
}
