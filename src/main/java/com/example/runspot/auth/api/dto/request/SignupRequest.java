package com.example.runspot.auth.api.dto.request;

import com.example.runspot.user.domain.AgeGroup;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class SignupRequest {
    @NotBlank
    private String loginId;

    @NotBlank
    private String password;

    @NotBlank
    private String name;

    @NotNull
    private AgeGroup ageGroup;

    @NotNull
    private int weeklyRunningCount;

    @NotNull
    private int averagePace;
}
