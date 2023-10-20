package com.bforbhagya.bforbhagyabank.serviceInterface;

import com.bforbhagya.bforbhagyabank.dto.*;

public interface UserServiceInterface {
    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);

    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse creditAccount(CreditDebitRequest creditDebitRequest);

    BankResponse debitAccount(CreditDebitRequest creditDebitRequest);

    BankResponse transferAccount(TransferRequest transferRequest);
}
