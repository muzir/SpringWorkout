package com.springWorkout.service.impl;

import java.security.SecureRandom;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWorkout.dao.ApiLogDao;
import com.springWorkout.domain.ApiLog;
import com.springWorkout.service.ApiLogService;

/**
 * @author erhun.baycelik
 *
 */
@Service
public class ApiLogServiceImpl implements ApiLogService {
	@Autowired
	private ApiLogDao apiLogDao;

	public ApiLog saveApiRequest(String request) {
		if(request.contains("erhun")){
			throw new IllegalArgumentException();
		}
		SecureRandom r = new SecureRandom();
		String apiLogId = String.valueOf(r.nextInt());
		ApiLog apiLog = new ApiLog.Builder().id(apiLogId).request(request).requestDate(new Date()).build();
		apiLogDao.save(apiLog);
		return apiLog;
	}

	public void saveApiResponse(ApiLog apiLog, String response) {
		apiLog.setResponse(response);
		apiLog.setResponseDate(new Date());
		apiLogDao.saveOrUpdate(apiLog);
	}

}
