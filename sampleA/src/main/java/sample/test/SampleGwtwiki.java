package sample.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import info.bliki.wiki.model.WikiModel;

public class SampleGwtwiki {

	public static void main(String[] args) {

		System.out.println("Start ========================================");

		WikiModel model = new WikiModel("", "");
		StringBuilder wikiTextBuider = new StringBuilder();
		try{
			  File file = new File("sample_min.txt");
			  FileReader filereader = new FileReader(file);

			  int ch;
			  while((ch = filereader.read()) != -1){
				  wikiTextBuider.append((char)ch);
			  }

			  filereader.close();
		}catch(FileNotFoundException e){
		  System.out.println(e);
		}catch(IOException e){
		  System.out.println(e);
		}
		String wikiText = new String(wikiTextBuider);
		
		System.out.println("===");
		System.out.println("Before: " + wikiText);
		String html = WikiModel.toHtml(wikiText);
		System.out.println("After: " + html);

		System.out.println("End   ========================================");
	}

}
