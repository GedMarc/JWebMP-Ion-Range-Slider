package com.jwebmp.plugins.ionrangeslider;

import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class IonRangeSliderOptionsTest
{

	public IonRangeSliderOptionsTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		IonRangeSliderOptions bso = new IonRangeSliderOptions();
		bso.setSnaps(true);
		bso.setFromMax(5.2);
		System.out.println(bso);
	}

}
