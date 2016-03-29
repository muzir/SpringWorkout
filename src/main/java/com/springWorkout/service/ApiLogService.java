package com.springWorkout.service;

import com.springWorkout.domain.ApiLog;
import com.springWorkout.exceptions.InvalidApiResponseException;

/**
 * @author erhun.baycelik
 *
 */
public interface ApiLogService {

	ApiLog saveApiRequest(String request);

	void saveApiResponse(ApiLog apiLog, String response) throws InvalidApiResponseException;

	void logResponse(ApiLog apiLog, String response) throws InvalidApiResponseException;

	void mandatoryResponse() throws InvalidApiResponseException;

	void neverResponse() throws InvalidApiResponseException;
}
