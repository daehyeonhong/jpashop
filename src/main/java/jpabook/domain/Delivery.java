package jpabook.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@FieldDefaults(level = PRIVATE)
public class Delivery {
    @Id
    @GeneratedValue
    Long id;
    String city;
    String street;
    String zipcode;
    DeliveryStatus status;
    @OneToOne(mappedBy = "delivery")
    Order order;
}
