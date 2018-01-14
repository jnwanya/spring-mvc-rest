package com.jnwanya.repositories;

import com.jnwanya.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jnwanya on
 * Sun, 14 Jan, 2018.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
