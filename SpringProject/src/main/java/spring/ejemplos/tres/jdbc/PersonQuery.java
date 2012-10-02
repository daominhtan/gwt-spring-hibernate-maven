package spring.ejemplos.tres.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

/**
 * MappingSqlQuery
 * Heredando de esta clase se puede definir de forma sencilla como se debe mapear cada columna de un 
 * registro en su correspondiente propiedad dentro de un objeto. 
 * Las clases que hereden de MappingSqlQuery deben definir en su constructor la sentencia SQL 
 * de la que se obtendr�n los registros, as� como el n�mero y tipos de par�metros que necesitan, 
 * y adem�s, deben de implementar el m�todo mapRow que convierta los registros en objetos:
 * 
 * @author Damian Ciocca
 */
public class PersonQuery extends MappingSqlQuery<Person>{

	public PersonQuery(DataSource ds) {
		
		super(ds, "SELECT first_name FROM customer WHERE first_name = :name");
		super.declareParameter( new SqlParameter("first_name", Types.VARCHAR) );
		compile();
	}

	@Override
	protected Person mapRow(ResultSet rs, int rowNumber) throws SQLException {
		
		Person p = new Person();
		p.setName(rs.getString(1));
        return p;
	}

}
