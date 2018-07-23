package com.springWorkout.service.impl;

import com.springWorkout.dao.ApiLogDao;
import com.springWorkout.domain.ApiLog;
import com.springWorkout.service.ApiLogService;
import java.security.SecureRandom;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ApiLogServiceImpl implements ApiLogService {

    private ApiLogDao apiLogDao;

    @Autowired
    public ApiLogServiceImpl(ApiLogDao _apiLogDao) {
        apiLogDao = _apiLogDao;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public ApiLog saveApiRequest(String request) {
        SecureRandom r = new SecureRandom();
        String apiLogId = String.valueOf(r.nextInt());
        ApiLog apiLog = new ApiLog.Builder().id(apiLogId).request(request).requestDate(new Date()).build();
        apiLogDao.save(apiLog);
        return apiLog;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void saveResponseRequiresNew(ApiLog apiLog, String response) {
        saveResponse(apiLog, response);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveResponseRequired(ApiLog apiLog, String response) {
        saveResponse(apiLog, response);
    }

    @Transactional(readOnly = false, propagation = Propagation.MANDATORY)
    public void saveResponseMandatory(ApiLog apiLog, String response) {
        saveResponse(apiLog, response);
    }

    @Transactional(readOnly = false, propagation = Propagation.NEVER)
    public void saveResponseNever(ApiLog apiLog, String response) {
        saveResponse(apiLog, response);
    }

    private void saveResponse(ApiLog apiLog, String response) {
        apiLog.setResponse(response);
        apiLog.setResponseDate(new Date());
        apiLogDao.save(apiLog);
    }
}
