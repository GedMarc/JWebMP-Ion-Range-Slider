import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.ionrangeslider.IonRangeSliderPageConfigurator;

module com.jwebmp.plugins.ionrangeslider {
	exports com.jwebmp.plugins.ionrangeslider;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with IonRangeSliderPageConfigurator;

	provides IGuiceScanJarExclusions with com.jwebmp.plugins.ionrangeslider.implementations.IonRangeSliderExclusionsModule;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.ionrangeslider.implementations.IonRangeSliderExclusionsModule;

	opens com.jwebmp.plugins.ionrangeslider to com.fasterxml.jackson.databind, com.jwebmp.core;
}