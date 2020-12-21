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
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Ion Range Slider",
		pluginDescription = "Ion.RangeSlider. Is an easy, flexible and responsive range slider with tons of options.",
		pluginUniqueName = "ion-range-slider",
		pluginVersion = "2.1.7",
		pluginCategories = "selector,numbers,range,sliders, ui,web ui, framework",
		pluginSubtitle = "Ion.RangeSlider. Is an easy, flexible and responsive range slider with tons of options.",
		pluginSourceUrl = "https://github.com/IonDen/ion.rangeSlider",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Ion-Range-Slider/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Ion-Range-Slider",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://ionden.com/a/plugins/ion.rangeSlider/en.html",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.ion/jwebmp-ion-range-slider",
		pluginGroupId = "com.jwebmp.plugins.ion",
		pluginArtifactId = "jwebmp-ion-range-slider",
		pluginModuleName = "com.jwebmp.plugins.ionrangeslider",
		pluginStatus = PluginStatus.Released,
		pluginLastUpdatedDate = "2020/12/15"
)
public class IonRangeSliderPageConfigurator
		implements IPageConfigurator<IonRangeSliderPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new IonRangeSliderPageConfigurator
	 */
	public IonRangeSliderPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return IonRangeSliderPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		IonRangeSliderPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(IonRangeSliderReferencePool.IonRangeSlider.getJavaScriptReference());
			page.getBody()
			    .addCssReference(IonRangeSliderReferencePool.IonRangeSlider.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return IonRangeSliderPageConfigurator.enabled;
	}
}
