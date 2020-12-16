package com.jwebmp.plugins.ionrangeslider.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class IonRangeSliderInclusionModule implements IGuiceScanModuleInclusions<IonRangeSliderInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.ionrangeslider");
		return set;
	}
}
