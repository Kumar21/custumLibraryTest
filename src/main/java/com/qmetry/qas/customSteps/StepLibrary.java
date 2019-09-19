package com.qmetry.qas.customSteps;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import com.qmetry.qaf.automation.step.QAFTestStep;
public class StepLibrary {
	
	@QAFTestStep(description = "i want to switch platform to {0}")
	public static void iwattoswitch(String data) {

		System.out.println("my changed platform is "+data);
	}

}
