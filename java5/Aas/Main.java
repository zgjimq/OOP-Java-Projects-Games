package java5.Aas;

import java.util.ArrayList;

public class Main {
    ArrayList<Book>list;
    
    public Main(){
        list=new ArrayList<>();
    }
    public void addBooks(Book book)throws BookException{
        if(book==null){
            throw new BookException("Nuk mund te jete null");
        }
        if(list.contains(book)){
            throw new BookException("This book is their");
        }
        list.add(book);
    }
    public void print(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"\n\n");
        }
    }
    public void MangaTitles(){
        for(int i=0;i<list.size();i++){
            if(list.get(i) instanceof Manga m){
                System.out.println(m.getAuthor()); 
            }
        }
    }
    public void bestRating(){
        double rating=0.0;
        Book b=null;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getRating()>rating){
                rating=list.get(i).getRating();
                b=list.get(i);
            } 
        }
        System.out.println("Ky eshte librin me i vleresuar "+b.getTitle());
       
    }
    public static void main(String[] args) {
        try {
            Main m=new Main();
            Book r1 = new Romance("RAuthor 1", "RTitulli1", 5.0, 200);
            Book r2 = new Romance("RAuthor 2", "RTitulli2", 5.0, 210);
            Book r3 = new Romance("RAuthor 3", "RTitulli3", 5.0, 250);
            Book m1 = new Manga("Akira", "One Piece", 10.0, 1050);
            Book m2 = new Manga("MAuthor1", "MTitulli1", 5.0, 20);

            m.addBooks(r1);
            m.addBooks(r2);
            m.addBooks(r3);
            m.addBooks(m1);
            m.addBooks(m2);
            m.print();
            System.out.println("===============BestRating===========");
            m.bestRating();
            System.out.println("===============Authors of Manga===========");
            m.MangaTitles();
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
    }
}
