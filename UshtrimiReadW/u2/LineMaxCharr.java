import java.io.*;
public class LineMaxCharr{
	private String filePath;
	private FileReader fr;
	private BufferedReader br;
	
	public LineMaxCharr(String filePath)throws IOException{
		this.filePath=filePath;
		fr = new FileReader(filePath);
		br= new BufferedReader(fr);
		
	}
	public String findMaxChar()throws IOException{
		String line = "";
		String longestLine=null;
		while((line=br.readLine())!-null){
			if(longestLine == null || line.length() > longestLine.length()){
				longestLine=line;
			} 
		}
		FileWriter fw = new FileWriter("ubt2.out");
		fw.write("diqka shenon ketu");
		
		fw.close();
		return longestLine;
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
		LineMaxChar l = null;
		try{
			l=new LineMaxCharr("ubt.txt");
			String line = l.findMaxChar();
			System.out.println("fjala me e gjate eshte :"+line);
			
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}finally{
			l.closeAll();
		}
		
	}
	
}