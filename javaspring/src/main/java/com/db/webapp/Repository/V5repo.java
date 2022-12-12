package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V5;

import java.util.List;



@Repository
public interface V5repo extends JpaRepository <V5, String> {

    @Query(value ="SELECT * FROM v5", nativeQuery= true)
    List<V5repo> getv5();


}