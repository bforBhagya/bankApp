package com.bforbhagya.bforbhagyabank.controller;

import com.bforbhagya.bforbhagyabank.dto.*;
import com.bforbhagya.bforbhagyabank.serviceInterface.UserServiceInterface;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {
    @Autowired
    UserServiceInterface userServiceInterface;

    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"
    )
    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest) {

        return userServiceInterface.createAccount(userRequest);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Given an account number, Check how much the user has"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 200 SUCCESS"
    )
    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest enquiryRequest) {

        return userServiceInterface.balanceEnquiry(enquiryRequest);
    }

    @Operation(
            summary = "Name Enquiry",
            description = "Given an account number, Check the user's full name"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 200 SUCCESS"
    )
    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest enquiryRequest) {

        return userServiceInterface.nameEnquiry(enquiryRequest);
    }

    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest creditDebitRequest) {

        return userServiceInterface.creditAccount(creditDebitRequest);
    }

    @PostMapping("debit")
    public BankResponse debit(@RequestBody CreditDebitRequest creditDebitRequest) {

        return userServiceInterface.debitAccount(creditDebitRequest);
    }

    @PostMapping("transfer")
    public BankResponse transfer(@RequestBody TransferRequest transferRequest) {

        return userServiceInterface.transferAccount(transferRequest);
    }
}
