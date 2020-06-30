package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImageComparator {
	public int compareTwo(String sourceFile, String modifiedFile) throws IOException {
		BufferedReader sbr = new BufferedReader( new FileReader(sourceFile) );
		BufferedReader mbr = new BufferedReader( new FileReader(modifiedFile) );
		
		int s;
		int count = 0;
		while((s = sbr.read())!=-1) {
			if( s != mbr.read() ) {
				count++;
			}
			
		}
		sbr.close();
		mbr.close();
	
		return count;
	}
}