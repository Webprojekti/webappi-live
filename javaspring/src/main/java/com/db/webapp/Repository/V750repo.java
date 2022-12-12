package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V750;

import java.util.List;



@Repository
public interface V750repo extends JpaRepository <V750, String> {

    @Query(value ="SELECT * FROM v750", nativeQuery= true)
    List<V750repo> getv750();


}