/**
 * 
 */
package es.cifpcm.mislibrosgonzalezveronica.data;

import java.io.FileOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import es.cifpcm.mislibrosgonzalezveronica.model.Libro;

/**
 * @author Veronica_Gonzalez
 *
 */
public class ImpPerGonzalezV implements Persistance {
	public static List<Libro> memStore=new ArrayList<Libro>();
	private final String file= "\\GonzalezVeronica_libros.txt";
	File archivo = new File(file);
	int c;
	@Override
	public void open() throws Exception{
		// TODO Auto-generated method stub
		try {
            FileInputStream in = new FileInputStream(file);
            //FileOutputStream out = new FileOutputStream(file);
            while((c=in.read()) !=-1)
            	{
            		in.read();
                }
            in.close();
            in.close();
          } catch (IOException ioe){
            ioe.printStackTrace();
          }
	}

	@Override
	public void close() throws Exception{
		// TODO Auto-generated method stub
		try  {
            FileInputStream in = new FileInputStream(file);
            FileOutputStream out = new FileOutputStream(file);
            while((c=in.read()) !=-1)
            	{
                	out.write(c);
                }
            out.close();
            out.close();
          } catch (IOException ioe){
            ioe.printStackTrace();
          }
	}

	@Override
	public void save(Libro libro) {
		// TODO Auto-generated method stub
		memStore.add(libro) ;
	}

	@Override
	public void delete(Libro libro) {
		// TODO Auto-generated method stub
		memStore.remove(libro);
	}

	@Override
	public List<Libro> list() {
		// TODO Auto-generated method stub
		return memStore;
	}

}
