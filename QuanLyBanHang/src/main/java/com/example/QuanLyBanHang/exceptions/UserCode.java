package com.example.QuanLyBanHang.exceptions;

import org.springframework.http.HttpStatus;

public class UserCode {
    public static final ResponseStatus STAFF_SAVE_NULL =
            new ResponseStatus("STAFF_SAVE_NULL", "Object is null", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_USERNAME_BLANK =
            new ResponseStatus("STAFF_USERNAME_BLANK", "Username is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_PASSWORD_BLANK =
            new ResponseStatus("STAFF_PASSWORD_BLANK", "Password is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_EMAIL_BLANK =
            new ResponseStatus("STAFF_EMAIL_BLANK", "Email is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_ADDRESS_BLANK =
            new ResponseStatus("STAFF_ADDRESS_BLANK", "Address is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_PHONE_NUMBER_BLANK =
            new ResponseStatus("STAFF_PHONE_NUMBER_BLANK", "PHONE NUMBER is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_STATUS_BLANK =
            new ResponseStatus("STAFF_STATUS_BLANK", "Status is blank", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_USERNAME_MAX_LENGTH =
            new ResponseStatus("STAFF_USERNAME_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_PASSWORD_MAX_LENGTH =
            new ResponseStatus("STAFF_PASSWORD_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_EMAIL_MAX_LENGTH =
            new ResponseStatus("STAFF_EMAIL_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_ADDRESS_MAX_LENGTH =
            new ResponseStatus("STAFF_ADDRESS_MAX_LENGTH", "Max length is 255", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_PHONE_NUMBER_MAX_LENGTH =
            new ResponseStatus("STAFF_PHONE_NUMBER_MAX_LENGTH", "Max length is 10", HttpStatus.BAD_REQUEST);
    public static final ResponseStatus STAFF_STATUS_MAX_LENGTH =
            new ResponseStatus("STAFF_STATUS_MAX_LENGTH", "Max length is 1", HttpStatus.BAD_REQUEST);

    private UserCode() {

    }
}
