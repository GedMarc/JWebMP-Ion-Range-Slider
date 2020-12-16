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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.DivSimple;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class IonRangeSliderTest

{

	public IonRangeSliderTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		IonRangeSlider irs = new IonRangeSlider();
		irs.setSkin(IonRangeSliderTheme.Flat);
		irs.getOptions()
		   .setDualKnobs(true);
		System.out.println(irs.toString(true));
	}

	@Test
	public void testSomeMethod2()
	{
		IonRangeSlider irs = new IonRangeSlider();

		irs.getOptions()
		   .setDualKnobs(true);
		System.out.println(irs.toString(true));
	}

	@Test
	public void testJavaScript()
	{
		IonRangeSlider irs = new IonRangeSlider();
		irs.getOptions()
		   .setDualKnobs(true);
		System.out.println(irs.renderJavascript());
	}

	@Test
	public void testHtml()
	{
		Page<?> p = new Page();
		IonRangeSlider irs = new IonRangeSlider();
		irs.setSkin(IonRangeSliderTheme.Flat);
		p.getOptions()
		 .setDynamicRender(false);
		p.getBody()
		 .add(new DivSimple<>().add(irs));
		System.out.println(p.toString(true));
	}
}
