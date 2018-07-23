import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.ionrangeslider.IonRangeSliderPageConfigurator;

module com.jwebmp.plugins.ionrangeslider {
	exports com.jwebmp.plugins.ionrangeslider;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with IonRangeSliderPageConfigurator;

}
