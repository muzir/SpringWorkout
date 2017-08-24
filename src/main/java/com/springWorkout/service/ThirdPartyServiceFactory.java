package com.springWorkout.service;

import com.springWorkout.domain.Person;
import com.springWorkout.responseObject.ConcurrencyResponseObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author erhun.baycelik
 *
 */
@Component
public class ThirdPartyServiceFactory {
	@Autowired
	private ThirdPartyService thirdPartyService;

	public ThirdPartyService getThirdPartyService(String isThirdPartyApiCall) {
		if (StringUtils.isNotBlank(isThirdPartyApiCall)) {
			return thirdPartyService;
		}
		return NO_OPERATION_INSTANCE;
	}

	private ThirdPartyService NO_OPERATION_INSTANCE = new ThirdPartyService() {

		@Override
		public void injectPersonDataToResponse(ConcurrencyResponseObject concurrencyResponseObject, Person person,
				String requestId) {
			System.out.println("requestId:" + requestId);
		}

	};
}
