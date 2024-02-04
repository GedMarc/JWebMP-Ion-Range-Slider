import com.jwebmp.plugins.ionrangeslider.implementations.IonRangeSliderInclusionModule;

module com.jwebmp.plugins.ionrangeslider {
	exports com.jwebmp.plugins.ionrangeslider;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.ionrangeslider.IonRangeSliderPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.ionrangeslider.implementations.IonRangeSliderExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with IonRangeSliderInclusionModule;

	opens com.jwebmp.plugins.ionrangeslider to com.fasterxml.jackson.databind, com.jwebmp.core;
}
