package com.food.ordering.system.order.service.dataaccess.customer.entity;

import com.food.ordering.system.order.service.dataaccess.order.entity.OrderItemEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(OrderItemEntity.class)
@Entity
@Table(name = "order_customer_m_view", schema = "customer")
public class CustomerEntity {

    @Id
    private UUID id;
}
