package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V2;

import java.util.List;



@Repository
public interface V2repo extends JpaRepository <V2, String> {

    @Query(value ="SELECT * FROM v2", nativeQuery= true)
    List<V2repo> getv2();


}