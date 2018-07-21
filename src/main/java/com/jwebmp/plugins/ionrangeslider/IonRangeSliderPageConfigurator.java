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

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Ion Range Slider",
		pluginDescription = "Ion.RangeSlider. Is an easy, flexible and responsive range slider with tons of options.",
		pluginUniqueName = "jwebswing-ion-range-slider",
		pluginVersion = "2.1.7",
		pluginCategories = "selector,numbers,range,sliders, ui,web ui, framework",
		pluginSubtitle = "Ion.RangeSlider. Is an easy, flexible and responsive range slider with tons of options.",
		pluginSourceUrl = "https://github.com/IonDen/ion.rangeSlider",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Ion-Range-Slider/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Ion-Range-Slider",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://ionden.com/a/plugins/ion.rangeSlider/en.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/IonRangeSlider.jar/download") class IonRangeSliderPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new IonRangeSliderPageConfigurator
	 */
	public IonRangeSliderPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(IonRangeSliderReferencePool.IonRangeSlider.getJavaScriptReference());
			page.getBody()
			    .addCssReference(IonRangeSliderReferencePool.IonRangeSlider.getCssReference());
		}
		return page;
	}
}
