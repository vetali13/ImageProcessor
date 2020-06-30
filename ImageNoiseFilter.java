package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImageNoiseFilter {
	
	public ImageNoiseFilter removeNoiseFrom(String sourceFile) throws IOException {
		
		BufferedReader br = new BufferedReader( new FileReader(sourceFile) );
		BufferedWriter bw = new BufferedWriter( new FileWriter(sourceFile.replace(".txt", ".clean.txt")) );
		int c;
		while((c = br.read())!=-1) {
			if( c == 'x' ) {
				c = ' ';
			}
			bw.write(c);
		}
		bw.close();
		br.close();
		
		return this;
	}
}