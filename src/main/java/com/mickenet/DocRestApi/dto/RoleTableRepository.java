package com.mickenet.DocRestApi.dto;

import com.mickenet.DocRestApi.entity.RoleTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleTableRepository extends JpaRepository<RoleTable,Long> {

}
