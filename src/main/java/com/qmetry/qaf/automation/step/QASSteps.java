package com.qmetry.qaf.automation.step;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import javax.mail.QuotaAwareStore;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.runtime.reflect.Factory;
import com.qmetry.qaf.automation.data.MetaData;
import com.qmetry.qaf.automation.ui.webdriver.ElementFactory;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import org.aspectj.runtime.internal.AroundClosure;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.lang.JoinPoint.StaticPart;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.JavaStepReporter;
import com.qmetry.qaf.automation.step.QAFTestStep;
public final class QASSteps {
	private static final JoinPoint.StaticPart ajc$tjp_3=null;
	
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
	
	@QAFTestStep(description = "i want to sendKeys {text} into {loc}")
	public static void wantsendKeys(String text, String loc) {
		System.out.println("sending text"+text+ "into locator"+ loc);
		sendKeys(text, loc);
	}
	
}
