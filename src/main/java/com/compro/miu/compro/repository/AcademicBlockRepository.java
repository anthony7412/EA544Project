package com.compro.miu.compro.repository;

import com.compro.miu.compro.domain.AcademicBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicBlockRepository extends JpaRepository<AcademicBlock,Long> {
}
