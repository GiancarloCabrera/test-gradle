package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "d18e510457c9fd628b65edfa22a2386e9d88ce4e2b3243440114267b8e185ef0";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionPutToken(String endPoint, String idUser, String name, String email){
        RestInteractions.executionPutToken(endPoint, idUser, TOKEN, name, email);
    }

    public static void validatePutResponse(Integer statusCode, String name, String email) {
        RestInteractions.validatecode(statusCode);
        String pathName = "name";
        String pathEmail = "email";
        RestInteractions.validateDataResponse(name, email, pathName, pathEmail);
    }
}
