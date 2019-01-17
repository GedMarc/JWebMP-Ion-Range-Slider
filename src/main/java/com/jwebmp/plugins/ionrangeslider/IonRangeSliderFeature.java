/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Creates toast messages
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
public class IonRangeSliderFeature
		extends Feature<IonRangeSliderFeature, IonRangeSliderOptions, IonRangeSliderFeature>
{


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
