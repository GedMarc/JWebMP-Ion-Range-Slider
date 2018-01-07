package za.co.mmagon.jwebswing.plugins.ionrangeslider;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Creates toast messages
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class IonRangeSliderFeature extends Feature<IonRangeSliderOptions, IonRangeSliderFeature>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new IonRangeSliderFeature
	 */
	public IonRangeSliderFeature(ComponentHierarchyBase component)
	{
		super("IonRangeSliderFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "ionRangeSlider(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	/**
	 * Returns the options
	 *
	 * @return
	 */
	@Override
	public IonRangeSliderOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new IonRangeSliderOptions());
		}
		return super.getOptions();
	}

}
