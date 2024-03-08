package org.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.Currency;
import org.example.model.PositionType;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "java_trading_db", name = "position_tb")
public class PositionEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -1465730249394703102L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "category_type")
    private PositionType positionType;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency")
    private Currency currency;

    @Column(name = "entry_date")
    private LocalDateTime entryDate;

    @Column(name = "entry_price")
    private Long EntryPrice;

    @Column(name = "exit_date")
    private LocalDateTime exitDate;

    @Column(name = "exit_price")
    private Long ExitPrice;

    @Column(name = "is_open")
    private Boolean isOpen;

    @Column(name = "profit")
    private Long profit;

}