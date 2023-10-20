package com.bforbhagya.bforbhagyabank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountInfo {
    @Schema(
            name = "User account name"
    )
    private String accountName;
    @Schema(
            name = "User account balance"
    )
    private BigDecimal accountBalance;
    @Schema(
            name = "User account number"
    )
    private String accountNumber;
}
