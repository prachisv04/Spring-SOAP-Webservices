package com.geography.countries.repository;


import com.geography.countries.GK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@Repository
public interface GKRepository extends JpaRepository<GK,String> {
    GK getGKByName(String name);
}
