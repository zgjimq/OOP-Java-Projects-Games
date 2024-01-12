package java5.Aas;

public class Manga extends Book implements interF{
    public boolean popular(){
        return true;
    }
    private int chapters;
    public Manga(String author,String title,double rating,int chapters)throws BookException{
        super(author,title,rating);
        if(chapters<0 || chapters>5000){
            throw new BookException("Chapter are wrong");
        }
        this.chapters=chapters;
    }
    public Manga(String author,String title,double rating,Manga source)throws BookException{
        super(author,title,rating);
        if(chapters<0 || chapters>5000){
            throw new BookException("Chapter are wrong");
        }
        this.chapters=source.chapters;
    }
    public int getChapters(){
        return chapters;
    }
    public void setChapters(int chapters)throws BookException{
        if(chapters<0 || chapters>5000){
            throw new BookException("Updated chapters are wrong");
        }
        this.chapters=chapters;
    }
    public String toString(){
        return super.toString()+"\nWith "+this.chapters+" chapters"+"\nPolular? :"+(popular()? "Eshte i popular" : "Nuk eshte popular");
    }
}
