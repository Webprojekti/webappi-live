package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V1m;

import java.util.List;



@Repository
public interface V1mrepo extends JpaRepository <V1m, String> {

    @Query(value ="SELECT * FROM v1m", nativeQuery= true)
    List<V1mrepo> getv1m();


}