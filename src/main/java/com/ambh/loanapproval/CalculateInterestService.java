package com.ambh.loanapproval;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalculateInterestService implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS-SPRING");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Executing activity '" + execution.getCurrentActivityName() + "'");
	}

}
