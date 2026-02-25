package com.santos.employer.repositories;

import com.santos.employer.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <AlunoModel,Long> {
}
