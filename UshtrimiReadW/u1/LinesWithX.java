import java.io.*;
public class LinesWithX {
    private String filePath;
    private FileReader fr;
    private BufferedReader br;
    public LinesWithX(String filePath)throws IOException{
        this.filePath=filePath;
        fr = new FileReader(filePath);
        br= new BufferedReader(fr);
    }
    public int countLines()throws IOException{
    String line = "";
    int count =0;
    while((line = br.readLine())!=-1){
		if(line.contains("X")){
			count++;
		}
		
	}
	FileWriter fw = new FileWriter(){
		fw.write("Numri i rreshtave ne file-in <emri_i_file-it> që e permbajnë shkronjën X eshte: <nr_rreshtave>");
		fw.close();
		return count;
	}
	public void closeAll()throws IOException{
		try{
			fr.close();
		br.close();
		}catch(IOException ioe){
		System.out.println(ioe.getMessage());
		}
		
	}
	public static void main (String []args){
		try{
			LinesWithX l = new LinesWithX();
			int numriRreshtav = l.countLines();
			
			System.out.println(numriRreshtav);
			
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	}
	
    }
}