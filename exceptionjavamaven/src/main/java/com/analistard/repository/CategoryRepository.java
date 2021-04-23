package com.analistard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analistard.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
