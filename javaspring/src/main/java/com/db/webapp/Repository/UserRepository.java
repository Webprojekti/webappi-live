package com.db.webapp.Repository;
 import java.util.List;
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.webapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value ="SELECT * FROM v1gm", nativeQuery= true)
    List<String> getdata();


/*      @Query("select u from User u where u.name=?1")
    List<User> findByName(String name);




    @Query(value="select name from user", nativeQuery = true)
    List<String> getName();
 */





 
    //@Modifying//jos del tai update
    //@Query(value="insert")
}
