package za.co.mmagon.jwebswing.plugins.ionrangeslider;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum IonRangeSliderReferencePool implements ReferencePool
{
    IonRangeSlider(new JavascriptReference("IonRangeSlider", 2.1, "bower_components/ionrangeslider/js/ion.rangeSlider.js"),
            new CSSReference("IonRangeSlider", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.css")),
    IonRangeSliderFlatSkin(null, new CSSReference("IonRangeSliderFlatSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinFlat.css")),
    IonRangeSliderHtml5Skin(null, new CSSReference("IonRangeSliderFlatSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinHTML5.css")),
    IonRangeSliderModernSkin(null, new CSSReference("IonRangeSliderFlatSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinModern.css")),
    IonRangeSliderNiceSkin(null, new CSSReference("IonRangeSliderFlatSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinNice.css")),
    IonRangeSliderSimpleSkin(null, new CSSReference("IonRangeSliderFlatSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinSimple.css")),
    IonRangeSliderSimpleDarkSkin(null, new CSSReference("IonRangeSliderFlatSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinDarkSimple.css")),;
    /**
     * Any sub data
     */
    private String data;

    /**
     * A new AngularSlimScrollReferencePool
     */
    private IonRangeSliderReferencePool()
    {

    }

    /**
     * A new AngularSlimScrollReferencePool with data
     */
    private IonRangeSliderReferencePool(String data)
    {

    }

    private JavascriptReference javaScriptReference;
    private CSSReference cssReference;

    private IonRangeSliderReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
    {
        this.javaScriptReference = javaScriptReference;
        if (this.javaScriptReference != null)
        {
            this.javaScriptReference.setPriority(RequirementsPriority.DontCare);
        }
        this.cssReference = cssReference;
        if (this.cssReference != null)
        {
            this.cssReference.setPriority(RequirementsPriority.DontCare);
        }
    }

    @Override
    public JavascriptReference getJavaScriptReference()
    {
        return javaScriptReference;
    }

    @Override
    public void setJavaScriptReference(JavascriptReference javaScriptReference)
    {
        this.javaScriptReference = javaScriptReference;
    }

    @Override
    public CSSReference getCssReference()
    {
        return cssReference;
    }

    @Override
    public void setCssReference(CSSReference cssReference)
    {
        this.cssReference = cssReference;
    }

    /**
     * Returns the name or the data contained within
     *
     * @return
     */
    @Override
    public String toString()
    {
        if (data != null && !data.isEmpty())
        {
            return data;
        }
        else
        {
            return name();
        }
    }
}
