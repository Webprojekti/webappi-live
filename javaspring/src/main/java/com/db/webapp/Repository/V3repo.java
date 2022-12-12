package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V3;

import java.util.List;



@Repository
public interface V3repo extends JpaRepository <V3, String> {

    @Query(value ="SELECT * FROM v3", nativeQuery= true)
    List<V2repo> getmaunaloaco2();
}