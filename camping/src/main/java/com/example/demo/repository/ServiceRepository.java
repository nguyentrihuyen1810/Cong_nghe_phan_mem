package com.example.demo.repository;

import com.example.demo.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
    @Query(value="select * from service where service_name like :serviceNameSearch and attach_service_id like :attachServiceIdSearch",
            countQuery ="select * from service where service_name like :serviceNameSearch and attach_service_id like :attachServiceIdSearch",nativeQuery =true)
    Page<Service> search(@Param("serviceNameSearch")String serviceNameSearch, @Param("attachServiceIdSearch")String attachServiceIdSearch, Pageable pageable);
}
