package za.co.mmagon.jwebswing.plugins.ionrangeslider;

import za.co.mmagon.jwebswing.base.references.CSSReference;

/**
 * Applied themes for the slider
 *
 * @author Marc Magon
 * @since 11 Jun 2017
 */
public enum IonRangeSliderTheme
{
    Flat(IonRangeSliderReferencePool.IonRangeSliderFlatSkin.getCssReference()),
    Html5(IonRangeSliderReferencePool.IonRangeSliderHtml5Skin.getCssReference()),
    Modern(IonRangeSliderReferencePool.IonRangeSliderModernSkin.getCssReference()),
    Nice(IonRangeSliderReferencePool.IonRangeSliderNiceSkin.getCssReference()),
    Simple(IonRangeSliderReferencePool.IonRangeSliderSimpleSkin.getCssReference());
    /**
     * Any sub data
     */
    private CSSReference data;

    /**
     * A new IonRangeSliderTheme
     */
    private IonRangeSliderTheme()
    {

    }

    /**
     * A new IonRangeSliderTheme with data
     */
    private IonRangeSliderTheme(CSSReference data)
    {
        this.data = data;
    }

    /**
     * Returns the reference for the data
     *
     * @return
     */
    public CSSReference getData()
    {
        return data;
    }

    /**
     * Returns the name or the data contained within
     *
     * @return
     */
    @Override
    public String toString()
    {
        if (data != null)
        {
            return data.toString();
        }
        else
        {
            return name();
        }
    }
}
