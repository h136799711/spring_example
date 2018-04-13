package com.hebidu.example.test1.repo;

import com.hebidu.example.test1.entity.BsBookCategoryEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BsBookCategoryRepository extends CrudRepository<BsBookCategoryEntity, Long> {

    BsBookCategoryEntity findByCateName(String cateName);

    @Query(value = "select id,cateName from BsBookCategoryEntity bc where bc.cateName=:cateName")
    BsBookCategoryEntity show(@Param("cateName") String name);
}
