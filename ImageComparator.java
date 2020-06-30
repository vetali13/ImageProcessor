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
		
		int m;
		int count = 0;
		int sbrLength = 0;
		int mbrLength = 0;
		
		while((m = mbr.read())!=-1) {
			if( m != sbr.read() ) {
				count++;
			}
			mbrLength++;
			sbrLength++;
		}
		if ( (mbr.read() == -1) && ( sbr.read() == -1 ) ) {
			sbr.close();
			mbr.close();
			return count;
		}
		else {
			while (sbr.read() != -1) {
				sbrLength++;
			}
			sbr.close();
			mbr.close();
			return sbrLength - mbrLength;
		}
	}
}