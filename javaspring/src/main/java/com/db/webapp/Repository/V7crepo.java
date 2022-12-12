package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V7c;

import java.util.List;



@Repository
public interface V7crepo extends JpaRepository <V7c, String> {

    @Query(value ="SELECT * FROM v7c", nativeQuery= true)
    List<V7crepo> getv7c();


}