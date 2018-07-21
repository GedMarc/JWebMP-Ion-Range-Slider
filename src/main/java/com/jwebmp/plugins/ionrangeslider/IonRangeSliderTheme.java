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

import com.jwebmp.core.base.references.CSSReference;

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
	IonRangeSliderTheme()
	{

	}

	/**
	 * A new IonRangeSliderTheme with data
	 */
	IonRangeSliderTheme(CSSReference data)
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
