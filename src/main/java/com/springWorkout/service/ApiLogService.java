package com.springWorkout.service;

import com.springWorkout.domain.ApiLog;
import com.springWorkout.exceptions.ChechedException;


public interface ApiLogService {

    ApiLog saveApiRequest(String request) throws ChechedException;

    void saveResponseRequiresNew(ApiLog apiLog, String response);

    void saveResponseRequired(ApiLog apiLog, String response);

    void saveResponseMandatory(ApiLog apiLog, String response);

    void saveResponseNever(ApiLog apiLog, String response);

}
