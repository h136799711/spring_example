package com.hebidu.example.test1;

import com.hebidu.example.test1.entity.BsBookCategoryEntity;
import com.hebidu.example.test1.repo.BsBookCategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/test_db")
public class TestFromDb {

    private final static Logger logger = LoggerFactory.getLogger(TestFromDb.class);

    @Autowired
    BsBookCategoryRepository bookCategoryRepository;

    @RequestMapping("/")
    String index() {
        System.out.println(logger.getClass().toString());
        logger.info(logger.getClass().toString());
        Optional<BsBookCategoryEntity> bc = bookCategoryRepository.findById(1L);
        return bc.orElse(new BsBookCategoryEntity("not find")).getCateName();
    }

    @RequestMapping("/find/{id}")
    String find(@PathVariable(value = "id", required = true) Long id) {
        Optional<BsBookCategoryEntity> bc = bookCategoryRepository.findById(id);
        return bc.orElse(new BsBookCategoryEntity("not find")).getCateName();
    }

    @RequestMapping("/findOne/{id}")
    BsBookCategoryEntity findOne(@PathVariable(value = "id", required = true) Long id) {
        Optional<BsBookCategoryEntity> bc = bookCategoryRepository.findById(id);
        return bc.orElse(new BsBookCategoryEntity("not find"));
    }
}

