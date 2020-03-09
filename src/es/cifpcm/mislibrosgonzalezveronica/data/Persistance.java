/**
 * 
 */
package es.cifpcm.mislibrosgonzalezveronica.data;

import java.util.ArrayList;
import java.util.List;

import es.cifpcm.mislibrosgonzalezveronica.model.Libro;

/**
 * @author Veronica_Gonzalez
 *
 */
public interface Persistance {
	void open() throws Exception;
	void close() throws Exception;
	void save(Libro libro);
	void delete(Libro libro);
	List<Libro>list();
}
