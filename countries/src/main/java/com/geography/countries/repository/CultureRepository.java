package com.geography.countries.repository;

import com.geography.countries.Culture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CultureRepository  extends JpaRepository<Culture,String> {

    Culture getCultureByOrigin(String name);
}
