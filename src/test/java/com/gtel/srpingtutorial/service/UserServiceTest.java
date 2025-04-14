package com.gtel.srpingtutorial.service;

import com.gtel.srpingtutorial.model.request.ConfirmOtpRegisterRequest;
import com.gtel.srpingtutorial.model.request.RegisterRequest;
import com.gtel.srpingtutorial.redis.repository.OtpLimitRedisRepository;
import com.gtel.srpingtutorial.redis.repository.RegisterUserRedisRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private OtpLimitRedisRepository otpLimitRedisRepository;

    @Mock
    private RegisterUserRedisRepository registerUserRedisRepository;

    // 1. Boundary Value Analysis
}
