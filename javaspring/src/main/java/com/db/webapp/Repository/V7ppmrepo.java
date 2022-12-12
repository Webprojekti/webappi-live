package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.db.webapp.model.V7ppm;

import java.util.List;



@Repository
public interface V7ppmrepo extends JpaRepository <V7ppm, String> {

    @Query(value ="SELECT * FROM v7ppm", nativeQuery= true)
    List<V7ppmrepo> getv7ppm();


}