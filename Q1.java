/*
1.	Taking the following EDIFACT message text, write some code to parse out the all the LOC segments and 
populate an array with the 2nd and 3rd element of each segment.  

Note:  the ‘+’ is an element delimiter

UNA:+.? '
UNB+UNOC:3+2021000969+4441963198+180525:1225+3VAL2MJV6EH9IX+KMSV7HMD+CUSDECU-IE++1++1'
UNH+EDIFACT+CUSDEC:D:96B:UN:145050'
BGM+ZEM:::EX+09SEE7JPUV5HC06IC6+Z'
LOC+17+IT044100'
LOC+18+SOL'
LOC+35+SE'
LOC+36+TZ'
LOC+116+SE003033'
DTM+9:20090527:102'
DTM+268:20090626:102'
DTM+182:20090527:102'
*/
public class Q1 {

	public static void main(String[] args) {
		String s1 = "UNA:+.? '"
				+ "UNB+UNOC:3+2021000969+4441963198+180525:1225+3VAL2MJV6EH9IX+KMSV7HMD+CUSDECU-IE++1++1'"
				+ "UNH+EDIFACT+CUSDEC:D:96B:UN:145050'"
				+ "BGM+ZEM:::EX+09SEE7JPUV5HC06IC6+Z'"
				+ "LOC+17+IT044100'"
				+ "LOC+18+SOL'"
				+ "LOC+35+SE'"
				+ "LOC+36+TZ'"
				+ "LOC+116+SE003033'"
				+ "DTM+9:20090527:102'"
				+ "DTM+268:20090626:102'"
				+ "DTM+182:20090527:102'";
		
		String[] x = new String[10]; //create array to store results
		String[] sAr = s1.split("\'");// split original string (edifact message) on last char on each line
		for(int i = 0, j = 0; i < sAr.length; i++){ //loop through all lines
			if(sAr[i].contains("LOC")){ // search for lines containing "LOC" 
				String[] LOC = sAr[i].split("\\+"); // split LOC on "+"
				x[j] = LOC[1];
				x[j+1] = LOC[2];
				j+=2;
			}	
		}
		//Print out final array containing 2nd and 3rd elements
		for(int z = 0; z < x.length; z++){
			System.out.print(x[z] + " ");
		}	
	}
}
