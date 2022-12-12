package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V7;

import java.util.List;



@Repository
public interface V7repo extends JpaRepository <V7, String> {

    @Query(value ="SELECT * FROM v7", nativeQuery= true)
    List<V7repo> getv7();


}