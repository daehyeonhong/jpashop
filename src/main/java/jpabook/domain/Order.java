package jpabook.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import static javax.persistence.EnumType.STRING;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@Table(name = "ORDERS")
@FieldDefaults(level = PRIVATE)
public class Order {
    @Id
    @Column(name = "ORDER_ID")
    Long id;
    @Column(name = "MEMBER_ID")
    Long memberId;
    Member member;
    LocalDateTime orderDate;
    @Enumerated(value = STRING)
    OrderStatus status;
}
