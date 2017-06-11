package za.co.mmagon.jwebswing.plugins.ionrangeslider;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

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
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/IonRangeSlider.jar/download"
)
class IonRangeSliderPageConfigurator extends PageConfigurator
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
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            page.getBody().addJavaScriptReference(IonRangeSliderReferencePool.IonRangeSlider.getJavaScriptReference());
            page.getBody().addCssReference(IonRangeSliderReferencePool.IonRangeSlider.getCssReference());
        }
        return page;
    }
}
