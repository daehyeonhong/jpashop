package jpabook.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
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
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    Member member;
    @OneToMany(mappedBy = "order")
    List<OrderItem> orderItems = new ArrayList<>();
    LocalDateTime orderDate;
    @Enumerated(value = STRING)
    OrderStatus status;

    public void addOrderItem(final OrderItem orderItem) {
        this.orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}
