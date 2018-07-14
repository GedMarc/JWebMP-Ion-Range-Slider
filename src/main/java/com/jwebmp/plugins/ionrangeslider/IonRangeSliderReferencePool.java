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

import com.jwebmp.base.references.CSSReference;
import com.jwebmp.base.references.JavascriptReference;
import com.jwebmp.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum IonRangeSliderReferencePool
		implements ReferencePool
{
	IonRangeSlider(new JavascriptReference("IonRangeSlider", 2.1, "bower_components/ionrangeslider/js/ion.rangeSlider.js"),
	               new CSSReference("IonRangeSlider", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.css")),
	IonRangeSliderFlatSkin(null, new CSSReference("IonRangeSliderFlatSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinFlat.css")),
	IonRangeSliderHtml5Skin(null, new CSSReference("IonRangeSliderHtml5Skin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinHTML5.css")),
	IonRangeSliderModernSkin(null, new CSSReference("IonRangeSliderModernSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinModern.css")),
	IonRangeSliderNiceSkin(null, new CSSReference("IonRangeSliderNiceSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinNice.css")),
	IonRangeSliderSimpleSkin(null, new CSSReference("IonRangeSliderSimpleSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinSimple.css")),
	IonRangeSliderSimpleDarkSkin(null, new CSSReference("IonRangeSliderSimpleDarkSkin", 2.1, "bower_components/ionrangeslider/css/ion.rangeSlider.skinDarkSimple.css")),
	;
	/**
	 * Any sub data
	 */
	private String data;
	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	/**
	 * A new AngularSlimScrollReferencePool
	 */
	IonRangeSliderReferencePool()
	{

	}

	IonRangeSliderReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
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
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
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
