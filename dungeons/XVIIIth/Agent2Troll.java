package XVIIIth;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *  parse/filter-pattern for agent2.pl output files
 * 
 *  tab-delim-file => collection => filter with predicate
 *
 *
 */

public class Agent2Troll {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		final java.io.BufferedReader ds=
				new java.io.BufferedReader(new FileReader(new java.io.File("I:\\non\\bots\\testlab\\agent1\\20150130_1002_anunturi_f53cam.txt")));
		
		String l=null;
		
		while((l=ds.readLine())!=null){
			System.out.println(l);
		}
		
		
	}

}
