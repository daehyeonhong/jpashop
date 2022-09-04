package jpabook.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@FieldDefaults(level = PRIVATE)
public class Item {
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    Long id;
    String name;
    int price;
    int stockOfQuantity;
}
