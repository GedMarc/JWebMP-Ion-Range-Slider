module com.jwebmp.plugins.ionrangeslider {
	exports com.jwebmp.plugins.ionrangeslider;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.ionrangeslider.IonRangeSliderPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.ionrangeslider.implementations.IonRangeSliderExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.ionrangeslider.implementations.IonRangeSliderExclusionsModule;

	opens com.jwebmp.plugins.ionrangeslider to com.fasterxml.jackson.databind, com.jwebmp.core;
}
