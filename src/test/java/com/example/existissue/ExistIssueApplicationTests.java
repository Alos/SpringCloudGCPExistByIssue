package com.example.existissue;



import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExistIssueApplicationTests {

  @Autowired AnimalRepository animalRepository;

  @Test
  public void existBy_test(){
    Cat cat = new Cat();
    cat.setAge(2).setName("bob");
    Cat savedCat = animalRepository.save(cat);
    System.out.println("Saved cat: " + savedCat.toString());
    assertNotNull(savedCat);
    boolean isCatThere = animalRepository.existsByName("bob");
    assertTrue( isCatThere);
  }

  @Test
  void contextLoads() {
  }

}
