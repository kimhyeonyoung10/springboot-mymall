package com.megait.mymall.repository;

import com.megait.mymall.domain.Category;
import com.megait.mymall.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
