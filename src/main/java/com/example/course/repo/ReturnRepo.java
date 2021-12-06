package com.example.course.repo;

import com.example.course.entity.Return;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnRepo extends JpaRepository<Return, Long> {
}
