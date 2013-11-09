
package lab4;

import java.util.Map;

/**
 *
 * @author schereja
 */
public class FileService {
    private FileReader reader;
    private FileWriter writer;
    
    public FileService(FileReader r, FileWriter w){
        reader = r;
        writer = w;
    }
    public Map readFile(String path){
       
        Map map = reader.readFile(path);
        return map;
    }
}
