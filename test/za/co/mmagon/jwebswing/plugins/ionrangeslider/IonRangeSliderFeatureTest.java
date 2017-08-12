package za.co.mmagon.jwebswing.plugins.ionrangeslider;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;

/**
 * @author Marc Magon
 */
public class IonRangeSliderFeatureTest extends BaseTestClass
{

	public IonRangeSliderFeatureTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		IonRangeSliderFeature bsf = new IonRangeSliderFeature(getInstance().getBody());
		bsf.getOptions().setDualKnobs(true);
		System.out.println(bsf.renderJavascript());
	}
}
