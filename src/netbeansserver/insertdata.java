package netbeansserver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class insertdata {
    
    
    public static void escreverTexto(String CArquivo, String textEscrever){
        try(
                FileWriter criadorArquivos = new FileWriter(CArquivo, true);
                BufferedWriter buffer = new BufferedWriter(criadorArquivos);
                PrintWriter escritorArquivos = new PrintWriter(buffer);                        
                        
                ){
            escritorArquivos.append(textEscrever);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}