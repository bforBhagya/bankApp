package com.bforbhagya.bforbhagyabank.serviceInterface;

import com.bforbhagya.bforbhagyabank.dto.EmailDetails;

public interface EmailServiceInterface {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
