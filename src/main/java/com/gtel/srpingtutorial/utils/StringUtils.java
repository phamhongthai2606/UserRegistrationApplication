package com.gtel.srpingtutorial.utils;

import com.gtel.srpingtutorial.exception.ApplicationException;

public class StringUtils {

    public static void validatePassword(String password) throws ApplicationException {

        if (org.apache.commons.lang3.StringUtils.isEmpty(password)) {
            throw new ApplicationException(ERROR_CODE.INVALID_PARAMETER , "password is invalid");
        }

        if ( password.length() < 8) {
            throw new ApplicationException(ERROR_CODE.INVALID_PARAMETER , "Password must be at least 8 characters");
        }

        if (!password.matches(".*[a-zA-Z].*")) {
            throw new ApplicationException(ERROR_CODE.INVALID_PARAMETER , "password must contain at least one letter");
        }

        if (!password.matches(".*[0-9].*")) {
            throw new ApplicationException(ERROR_CODE.INVALID_PARAMETER, "password must contain at least one number");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new ApplicationException(ERROR_CODE.INVALID_PARAMETER , "password must contain at least one uppercase letter");
        }
        
        if (!password.matches(".*[!@#$%^&*()_+=\\-\\[\\]{};':\"\\\\|,.<>/?].*")) {
            throw new ApplicationException(ERROR_CODE.INVALID_PARAMETER , "password must contain at least one special character");
        }
    }
}
