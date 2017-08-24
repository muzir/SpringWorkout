package com.springWorkout.service.impl;

import com.springWorkout.service.ApiUtilService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author erhun.baycelik
 *
 */
@Service
public class ApiUtilServiceImpl implements ApiUtilService {
	@Override
	public String getRequestString(HttpServletRequest request) {
		StringBuilder result = new StringBuilder();
		Map<String, String[]> parameterMap = request.getParameterMap();
		for (String paramaterName : parameterMap.keySet()) {
			String[] value = parameterMap.get(paramaterName);
			result.append(paramaterName).append("=").append(value[0]).append(" ");
		}
		return result.toString();
	}
}
