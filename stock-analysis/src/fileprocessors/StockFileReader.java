package fileprocessors;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileReader {
	
	String filePath = null;

	public StockFileReader(String filePath) {

		this.filePath = filePath;
	}
	
	public List<String> getHeaders() throws IOException{
        String line = readFirstLine(filePath);
        String [] headers = line.split(",");
        List<String> values = new ArrayList<String>();
        values = Arrays.asList(headers);
        return values;
		
	}
	
	public static String readFirstLine(String path) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(path));
		return br.readLine();
	}
	
	public List<String> readFileData() throws FileNotFoundException, IOException{
		List<String> lines = new ArrayList<String>();
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			// Skip first line
			// Skip next line
			br.readLine();
			String line = null;
			//Advance from the second line onwards
			while((line = br.readLine()) != null){
				lines.add(line);
			}
		}
		return lines;
		
	}

}
