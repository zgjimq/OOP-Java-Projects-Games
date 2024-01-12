package java5.Aas;

public class Romance extends Book implements interF{
    private int pages;
    public boolean popular(){
        return true;
    }
    public Romance(String author,String title,double rating,int pages)throws BookException{
        super(author,title,rating);
        if(pages<0 || pages>500){
            throw new BookException("Pages are not good");
        }
        this.pages=pages;
    }
    
    public int getPages(){
        return pages;
    }
    public void setPages(int pages)throws BookException{
        if(pages<0||pages>500){
            throw new BookException("Updated page its incorrect");
        }
        this.pages=pages;
    }
    public String toString(){
        return super.toString()+"\nWith "+pages+" pages"+"\nPopular? :"+(popular()? "Eshte i popular" : "Nuk eshte popular");
    }
}
