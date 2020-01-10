package com.mickenet.DocRestApi.dto;

import com.mickenet.DocRestApi.entity.DocumentTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocumentTableRepository extends JpaRepository<DocumentTable, Long> {
    Optional<DocumentTable> findById(Long _id);

}
