package com.jwebmp.plugins.ionrangeslider;

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class IonRangeSliderFeatureTest

{

	public IonRangeSliderFeatureTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		IonRangeSliderFeature bsf = new IonRangeSliderFeature(new Page().getBody());
		bsf.getOptions()
		   .setDualKnobs(true);
		System.out.println(bsf.renderJavascript());
	}
}
