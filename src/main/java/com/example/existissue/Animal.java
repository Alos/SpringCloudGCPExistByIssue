package com.example.existissue;


import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@Entity
@Data
@Accessors(chain = true)
public class Animal {
  @Id private Long id;
  private String name;
}
