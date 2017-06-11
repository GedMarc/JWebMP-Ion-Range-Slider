package za.co.mmagon.jwebswing.plugins.ionrangeslider;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

/**
 *
 * @author Marc Magon
 */
public class IonRangeSliderTest extends BaseTestClass
{

    public IonRangeSliderTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        IonRangeSlider irs = new IonRangeSlider();
        irs.setSkin(IonRangeSliderTheme.Flat);
        irs.getOptions().setDualKnobs(true);
        System.out.println(irs.toString(true));
    }

    @Test
    public void testSomeMethod2()
    {
        IonRangeSlider irs = new IonRangeSlider();

        irs.getOptions().setDualKnobs(true);
        System.out.println(irs.toString(true));
    }

    @Test
    public void testJavaScript()
    {
        IonRangeSlider irs = new IonRangeSlider();
        irs.getOptions().setDualKnobs(true);
        System.out.println(irs.renderJavascript());
    }

    @Test
    public void testHtml()
    {
        Page p = getInstance();
        IonRangeSlider irs = new IonRangeSlider();
        p.getOptions().setDynamicRender(false);
        p.getBody().add(irs);
        System.out.println(p.toString(true));
    }
}
