
package com.audit.auditchecklistservice.exceptions;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.audit.auditchecklistservice.exception.FeignProxyException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class FeignProxyExceptionTest {

	@Mock
	FeignProxyException feignProxyException;

	@Test
	public void contextLoads() {
		assertNotNull(feignProxyException);
	}

	@Test
	public void testConstructor() {

		assertNotNull(new FeignProxyException());
	}

}
