package com.example.trading.utils;

import java.util.Random;

public class OtpUtils {

    public static String generateOtp() {

        int otpLength = 6;
        Random random = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < otpLength; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
