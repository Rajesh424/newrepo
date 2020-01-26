import java.io.*;
class First{
	public static void main(String[] args)throws IOException {
		FileWriter fw=new FileWriter("D:/java/out.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.write(100);
		pw.print("hellow");
		pw.flush();
	}}
