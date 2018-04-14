package com.jwebmp.plugins.ionrangeslider;

import com.jwebmp.BaseTestClass;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class IonRangeSliderFeatureTest
		extends BaseTestClass
{

	public IonRangeSliderFeatureTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		IonRangeSliderFeature bsf = new IonRangeSliderFeature(getInstance().getBody());
		bsf.getOptions()
		   .setDualKnobs(true);
		System.out.println(bsf.renderJavascript());
	}
}
