/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.ionrangeslider;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.attributes.InputAttributes;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Turn checkboxes and radio buttons into toggle switches. Created by Mattia Larentis, maintained by Emanuele Marchi and Peter Stein with the help of the community.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Ion Range Slider",
		description = "Ion.RangeSlider. Is an easy, flexible and responsive range slider with tons of options.",
		url = "https://github.com/GedMarc/JWebSwing-Ion-Range-Slider")
public class IonRangeSlider
		extends Input<InputAttributes, IonRangeSlider>
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

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		IonRangeSlider that = (IonRangeSlider) o;

		if (!getFeature().equals(that.getFeature()))
		{
			return false;
		}
		return getSkin() == that.getSkin();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
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
