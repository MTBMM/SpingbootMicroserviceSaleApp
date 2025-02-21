package com.tth.commonlibrary.dto.request.rating;

import com.tth.commonlibrary.enums.CriteriaType;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RatingRequestCreate {

    @NotNull(message = "{rating.supplier.notNull}")
    private String supplierId;

    @Builder.Default
    @NotNull(message = "{rating.notNull}")
    @DecimalMin(value = "1.00", message = "{rating.min}")
    @DecimalMax(value = "5.00", message = "{rating.max}")
    private BigDecimal rating = BigDecimal.valueOf(5);

    private String content;

    @NotNull(message = "{rating.criteria.notNull}")
    private CriteriaType criteria;

}
