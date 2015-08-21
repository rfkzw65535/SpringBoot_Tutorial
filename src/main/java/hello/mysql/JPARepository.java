
package hello.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface JPARepository extends JpaRepository<MySQLdata, Integer> {
	
}



/*
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;


public interface JPARepository extends Repository<MySQLController, String> {

	Page<MySQLController> findAll(Pageable pageable);

}
*/

