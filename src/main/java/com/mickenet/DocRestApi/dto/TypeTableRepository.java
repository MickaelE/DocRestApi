package com.mickenet.DocRestApi.dto;

import com.mickenet.DocRestApi.entity.TypeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeTableRepository  extends JpaRepository<TypeTable,Long> {
}
