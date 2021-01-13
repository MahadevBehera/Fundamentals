import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadAndReplaceFileData {

	public static void main(String[] args) {
		Map<String, String> dataSet = getMapOfValuesFromFile(
				"C:\\Users\\mahadev.behera\\Desktop\\Patients-List-Improvment\\old&newMasterListMapping.txt");
		System.out.println(
				"********************************************************************************************");
		System.out.println(dataSet);
		System.out.println(
				"********************************************************************************************");
		readFileAndReplaceContent(dataSet, "C:\\Users\\mahadev.behera\\Desktop\\Patients-List-Improvment\\demo.sql");
	}

	public static Map<String, String> getMapOfValuesFromFile(String path) {
		System.out.println("Starting Map Preparation ... ");
		Map<String, String> resultMap = new LinkedHashMap<>();
		File wordSetForReplace = new File(path);
		BufferedReader reader = null;
		int count = 0;
		try {
			reader = new BufferedReader(new FileReader(wordSetForReplace));
			String line = reader.readLine();
			while (line != null) {
				count++;
				String array[] = line.trim().split(" ----> ");
				resultMap.put(array[0].trim(), array[1].trim());
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Count ::  " + count);
		System.out.println("resultMap Size  ::  " + resultMap.size());
		System.out.println("Finished Map Preparation ... ");
		return resultMap;
	}

	public static void readFileAndReplaceContent(Map<String, String> dataSet, String pathString) {
		System.out.println("Replacing Content inside File ... ");
		Path path = Paths.get(pathString);
		Charset charset = StandardCharsets.UTF_8;
		String[] content = new String[1];
		try {
			content[0] = new String(Files.readAllBytes(path), charset);
			dataSet.forEach((oldId, newId) -> {
				content[0] = content[0].replaceAll(oldId, newId);
			});
			Files.write(path, content[0].getBytes(charset));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File is ready with new Data Set ... ");
	}

}
