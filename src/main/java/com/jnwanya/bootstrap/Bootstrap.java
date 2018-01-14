package com.jnwanya.bootstrap;

import com.jnwanya.domain.Category;
import com.jnwanya.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by Jnwanya on
 * Sun, 14 Jan, 2018.
 */
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;

    public Bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Category fruits = new Category();
        fruits.setName("Fruits");
        categoryRepository.save(fruits);

        Category dried = new Category();
        dried.setName("Dried");
        categoryRepository.save(dried);

        Category fresh = new Category();
        fresh.setName("Fresh");
        categoryRepository.save(fresh);

        Category nuts = new Category();
        nuts.setName("Nuts");
        categoryRepository.save(nuts);
    }
}
