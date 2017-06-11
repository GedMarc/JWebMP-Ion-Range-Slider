package za.co.mmagon.jwebswing.plugins.ionrangeslider;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.attributes.InputAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Turn checkboxes and radio buttons into toggle switches. Created by Mattia Larentis, maintained by Emanuele Marchi and Peter Stein with the help of the community.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Ion Range Slider", description = "Ion.RangeSlider. Is an easy, flexible and responsive range slider with tons of options.",
        url = "https://github.com/GedMarc/JWebSwing-Ion-Range-Slider")
public class IonRangeSlider extends Input<InputAttributes, IonRangeSlider>
{

    private static final long serialVersionUID = 1L;
    /**
     * The feature for this select
     */
    private IonRangeSliderFeature feature;
    /**
     * Apply a skin
     */
    private IonRangeSliderTheme skin;

    /*
     * Constructs a new IonRangeSlider
     */
    public IonRangeSlider()
    {
        addFeature(getFeature());
        addClass("irs-hidden-input");
        addAttribute("readonly", "");
    }

    /**
     * Returns the feature for this component
     *
     * @return
     */
    public IonRangeSliderFeature getFeature()
    {
        if (feature == null)
        {
            feature = new IonRangeSliderFeature(this);
        }
        return feature;
    }

    /**
     * Sets the feature for this bootstrap drop down
     *
     * @param feature
     *
     * @return
     */
    public IonRangeSlider setFeature(IonRangeSliderFeature feature)
    {
        this.feature = feature;
        return this;
    }

    @Override
    public IonRangeSliderOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * Gets a skin
     *
     * @return
     */
    public IonRangeSliderTheme getSkin()
    {
        return skin;
    }

    /**
     * Sets a skin
     *
     * @param skin
     *
     * @return
     */
    public IonRangeSlider setSkin(IonRangeSliderTheme skin)
    {
        if (this.skin != null)
        {
            getCssReferences().remove(this.skin.getData());
        }
        this.skin = skin;
        getCssReferences().add(skin.getData());
        return this;
    }

}
