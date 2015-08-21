
package hello.mysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class MySQLdata {

	@Id
	@GeneratedValue
	protected Integer id;
	protected String name;
	protected String description;


	public MySQLdata() {
		super();
	}

	public MySQLdata(String name, String description) {

		super();
		this.name = name;
		this.description = description;
	}

	// for debug
	public String toString() {
		return "[name:" + name + ", description:" + description + "]";
	}

}
