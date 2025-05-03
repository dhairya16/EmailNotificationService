package com.dcode.ws.emailnotification.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "processed-events")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProcessedEventEntity implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String messageId;

    @Column(nullable = false)
    private String productId;
}
