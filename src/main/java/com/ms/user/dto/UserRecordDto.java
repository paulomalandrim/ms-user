package com.ms.user.dto;

import com.ms.user.model.UserModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDto(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email
) {

}
