package com.jwebmp.plugins.ionrangeslider.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class IonRangeSliderExclusionsModule
		implements IGuiceScanModuleExclusions<IonRangeSliderExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.ionrangeslider");
		return strings;
	}
}
