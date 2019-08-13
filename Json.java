package ArqJson;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Json {
    
    public static void main(String[] args){
        
    	try {
        FileReader arq = new FileReader("arrayjson.json");
        BufferedReader lerarquivo = new BufferedReader(arq);

        String linha = lerarquivo.readLine();
        
        while(linha != null){
        	System.out.printf(linha);
        	linha = lerarquivo.readLine();
        }
           
        lerarquivo.close();
        arq.close();
    	} catch (IOException e) {
    		// log erro
    		
        }
    }
}
