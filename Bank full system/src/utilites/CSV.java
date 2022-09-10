package utilites;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	// will read datas and return list
	public static List<String[]> read(String file) {		
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try {
			try (BufferedReader buffer = new BufferedReader(new FileReader(file))) {
				while ((dataRow = buffer.readLine()) != null) {
				String[] dataRecords = dataRow.split(" , ");
				data.add(dataRecords);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("COULD NOR READ FILE");
			e.printStackTrace();
		}
		return data;
	}
}
