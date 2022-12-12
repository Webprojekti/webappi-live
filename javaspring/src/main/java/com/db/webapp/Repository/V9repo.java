package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V9;

import java.util.List;



@Repository
public interface V9repo extends JpaRepository <V9, String> {

    @Query(value ="SELECT * FROM v9", nativeQuery= true)
    List<V9repo> getv9();


}