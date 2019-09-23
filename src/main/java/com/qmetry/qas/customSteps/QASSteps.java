package com.qmetry.qas.customSteps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import com.qmetry.qaf.automation.step.QAFTestStep;
public class QASSteps {
	/**
	  * @param data
	  *                       : data which is being passed from bdd
	  */
	@QAFTestStep(description = "i want to switch platform to {0}")
	public static void iwattoswitch(String data) {

		System.out.println("my changed platform is "+data);
	}

	@QAFTestStep(description = "switch to platform {0}")
	public static void switchToplatform(String data) {

		String data1 = data;
		sendKeys(data1, data);
		System.out.println("my changed platform is "+data1);
	}
}
