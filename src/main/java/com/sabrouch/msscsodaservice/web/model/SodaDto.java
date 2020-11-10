package com.sabrouch.msscsodaservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by sabrouch.
 * Date: 11/10/2020
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SodaDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String beerName;
    private SodaStyleEnum sodaStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
