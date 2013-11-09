/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Map;

/**
 *
 * @author schereja
 */
public class TextReader {
    private FormatConverter converter;
    private String UNKNOWN_FORMAT = "This is an unknown converter.";
    public TextReader(FormatConverter converter){
        if(converter == null){
            throw new IllegalArgumentException(UNKNOWN_FORMAT);
        }
        this.converter = converter;
    }
    
    public Map readFile(String path){
        String fileString = "";
        //read file
        Map map = converter.convert(fileString);
        return map;
    }
}
