package com.jwebmp.plugins.ionrangeslider;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.htmlbuilder.javascript.JavascriptFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * All the options available for Bootstrap Switch
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class IonRangeSliderOptions
		extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;
	/**
	 * How long, in milliseconds, to wait to trigger the ionChange event after each change in the range value. Default 0.
	 */
	private Integer debounce;
	/**
	 * Show two knobs. Defaults to false.
	 */
	private Boolean dualKnobs;
	/**
	 * Maximum integer value of the range. Defaults to 100.
	 */
	private Number max;
	/**
	 * Minimum integer value of the range. Defaults to 0.
	 */
	private Number min;
	/**
	 * If true, a pin with integer value is shown when the knob is pressed. Defaults to false.
	 */
	private Boolean pin;
	/**
	 * If true, the knob snaps to tick marks evenly spaced based on the step property value. Defaults to false.
	 */
	private Boolean snaps;
	/**
	 * Specifies the value granularity. Defaults to 1.
	 */
	private Number step;
	/**
	 * The ion Range Slider Types
	 */
	private IonRangeSliderTypes type;
	/**
	 * The number on the slider to place the range first item
	 */
	private Number from;
	/**
	 * The number on the slider to place the second ranger slider
	 */
	private Number to;
	/**
	 * Whether or not to show a grid
	 */
	private Boolean grid;
	/**
	 * Any prefix for the number entered
	 */
	private Character prefix;
	/**
	 * Use a custom range of numbers for the slider
	 */
	private List<Number> values;
	/**
	 * Whether numbers should be beautified
	 */
	@JsonProperty("prettify_enabled")
	private Boolean prettifyEnabled;
	/**
	 * Sets a specific thousand separater
	 */
	@JsonProperty("prettify_separator")
	private Character prettifySeparater;
	/**
	 * A custom function used to prettify the numbers
	 */
	private JavascriptFunction prettify;
	/**
	 * A given postfix for a number
	 */
	private Character postfix;

	/**
	 * A given postfix for the displayed maximum number
	 */
	@JsonProperty("max_postfix")
	private Character maxPostfix;
	/**
	 * Show the decoration for both min and max in the value field
	 */
	@JsonProperty("decorate_both")
	private Boolean decorateBoth;
	/**
	 * Use your own separator symbol with values_separator option. Like →
	 */
	@JsonProperty("values_separator")
	/**
	 * Specifies any values separator as needed
	 */
	private String valueSeparator;
	@JsonProperty("hide_min_max")
	/**
	 * Hides the mix max field
	 */
	private Boolean hideMinMax;
	/**
	 * Hides the from and the to
	 */
	@JsonProperty("hide_from_to")
	private Boolean hideFromTo;
	/**
	 * slider labels are far away outside it's container by default, can fix it with ease if you wish, with force_edges attribute:
	 */
	@JsonProperty("force_edges")
	private Boolean forceEdges;
	/**
	 * Specify number of steps in grid number
	 */
	@JsonProperty("grid_num")
	private Number gridNumber;
	/**
	 * Have pre-defined step? You can snap grid to it:
	 */
	@JsonProperty("grid_snap")
	private Boolean gridSnap;
	/**
	 * Fixes the from handler
	 */
	@JsonProperty("from_fixed")
	private Boolean fromFixed;
	/**
	 * fixes the to handle
	 */
	@JsonProperty("to_fixed")
	private Boolean toFixed;
	/**
	 * sets the minimum from
	 */
	@JsonProperty("from_min")
	private Number fromMin;
	/**
	 * Sets the maximum from
	 */
	@JsonProperty("from_max")
	private Number fromMax;
	/**
	 * Sets the minimum to
	 */
	@JsonProperty("to_min")
	private Number toMin;
	/**
	 * Sets the maxmium to
	 */
	@JsonProperty("to_max")
	private Number toMax;
	/**
	 * If the slider is disabled
	 */
	private Boolean disabled;
	/**
	 * If keyboard can be used
	 */
	private Boolean keyboard;
	/**
	 * The step to apply when using the keyboard
	 */
	@JsonProperty("keyboard_step")
	private Number keyboardStep;
	/**
	 * The minimum interval to apply
	 */
	@JsonProperty("min_interval")
	private Number minInterval;
	/**
	 * The maximum interval to apply
	 */
	@JsonProperty("max_interval")
	private Number maxInterval;
	/**
	 * The drag interval to apply
	 */
	@JsonProperty("drag_interval")
	private Boolean dragInterval;

	/**
	 * Constructs a new instance of the image range slider
	 */
	public IonRangeSliderOptions()
	{
		//Nothing needed
	}

	/**
	 * How long, in milliseconds, to wait to trigger the ionChange event after each change in the range value. Default 0.
	 *
	 * @return
	 */
	public Integer getDebounce()
	{
		return debounce;
	}

	/**
	 * How long, in milliseconds, to wait to trigger the ionChange event after each change in the range value. Default 0.
	 *
	 * @param debounce
	 *
	 * @return
	 */
	public IonRangeSliderOptions setDebounce(Integer debounce)
	{
		this.debounce = debounce;
		return this;
	}

	/**
	 * Show two knobs. Defaults to false.
	 *
	 * @return
	 */
	public Boolean getDualKnobs()
	{
		return dualKnobs;
	}

	/**
	 * Show two knobs. Defaults to false.
	 *
	 * @param dualKnobs
	 *
	 * @return
	 */
	public IonRangeSliderOptions setDualKnobs(Boolean dualKnobs)
	{
		this.dualKnobs = dualKnobs;
		return this;
	}

	/**
	 * Maximum integer value of the range. Defaults to 100.
	 *
	 * @return
	 */
	public Number getMax()
	{
		return max;
	}

	/**
	 * Maximum integer value of the range. Defaults to 100.
	 *
	 * @param max
	 *
	 * @return
	 */
	public IonRangeSliderOptions setMax(Number max)
	{
		this.max = max;
		return this;
	}

	/**
	 * Minimum integer value of the range. Defaults to 0.
	 *
	 * @return
	 */
	public Number getMin()
	{
		return min;
	}

	/**
	 * Minimum integer value of the range. Defaults to 0.
	 *
	 * @param min
	 *
	 * @return
	 */
	public IonRangeSliderOptions setMin(Number min)
	{
		this.min = min;
		return this;
	}

	/**
	 * If true, a pin with integer value is shown when the knob is pressed. Defaults to false.
	 *
	 * @return
	 */
	public Boolean getPin()
	{
		return pin;
	}

	/**
	 * If true, a pin with integer value is shown when the knob is pressed. Defaults to false.
	 *
	 * @param pin
	 *
	 * @return
	 */
	public IonRangeSliderOptions setPin(Boolean pin)
	{
		this.pin = pin;
		return this;
	}

	/**
	 * If true, the knob snaps to tick marks evenly spaced based on the step property value. Defaults to false.
	 *
	 * @return
	 */
	public Boolean getSnaps()
	{
		return snaps;
	}

	/**
	 * If true, the knob snaps to tick marks evenly spaced based on the step property value. Defaults to false.
	 *
	 * @param snaps
	 *
	 * @return
	 */
	public IonRangeSliderOptions setSnaps(Boolean snaps)
	{
		this.snaps = snaps;
		return this;
	}

	/**
	 * Specifies the value granularity. Defaults to 1.
	 *
	 * @return
	 */
	public Number getStep()
	{
		return step;
	}

	/**
	 * Specifies the value granularity. Defaults to 1.
	 *
	 * @param step
	 *
	 * @return
	 */
	public IonRangeSliderOptions setStep(Number step)
	{
		this.step = step;
		return this;
	}

	/**
	 * The ion Range Slider Types
	 *
	 * @return
	 */
	public IonRangeSliderTypes getType()
	{
		return type;
	}

	/**
	 * The ion Range Slider Types
	 *
	 * @param type
	 *
	 * @return
	 */
	public IonRangeSliderOptions setType(IonRangeSliderTypes type)
	{
		this.type = type;
		return this;
	}

	/**
	 * The number on the slider to place the range first item
	 *
	 * @return
	 */
	public Number getFrom()
	{
		return from;
	}

	/**
	 * The number on the slider to place the range first item
	 *
	 * @param from
	 *
	 * @return
	 */
	public IonRangeSliderOptions setFrom(Number from)
	{
		this.from = from;
		return this;
	}

	/**
	 * The number on the slider to place the second ranger slider
	 *
	 * @return
	 */
	public Number getTo()
	{
		return to;
	}

	/**
	 * The number on the slider to place the second ranger slider
	 *
	 * @param to
	 *
	 * @return
	 */
	public IonRangeSliderOptions setTo(Number to)
	{
		this.to = to;
		return this;
	}

	/**
	 * Whether or not to show a grid
	 *
	 * @return
	 */
	public Boolean getGrid()
	{
		return grid;
	}

	/**
	 * Whether or not to show a grid
	 *
	 * @param grid
	 *
	 * @return
	 */
	public IonRangeSliderOptions setGrid(Boolean grid)
	{
		this.grid = grid;
		return this;
	}

	/**
	 * Any prefix for the number entered
	 *
	 * @return
	 */
	public Character getPrefix()
	{
		return prefix;
	}

	/**
	 * Any prefix for the number entered
	 *
	 * @param prefix
	 *
	 * @return
	 */
	public IonRangeSliderOptions setPrefix(Character prefix)
	{
		this.prefix = prefix;
		return this;
	}

	/**
	 * Use a custom range of numbers for the slider
	 *
	 * @return
	 */
	public List<Number> getValues()
	{
		if (values == null)
		{
			values = new ArrayList<>();
		}
		return values;
	}

	/**
	 * Use a custom range of numbers for the slider
	 *
	 * @param values
	 *
	 * @return
	 */
	public IonRangeSliderOptions setValues(List<Number> values)
	{
		this.values = values;
		return this;
	}

	/**
	 * Whether numbers should be beautified
	 *
	 * @return
	 */
	public Boolean getPrettifyEnabled()
	{
		return prettifyEnabled;
	}

	/**
	 * Whether numbers should be beautified
	 *
	 * @param prettifyEnabled
	 *
	 * @return
	 */
	public IonRangeSliderOptions setPrettifyEnabled(Boolean prettifyEnabled)
	{
		this.prettifyEnabled = prettifyEnabled;
		return this;
	}

	/**
	 * Sets a specific thousand separater
	 *
	 * @return
	 */
	public Character getPrettifySeparater()
	{
		return prettifySeparater;
	}

	/**
	 * Sets a specific thousand separater
	 *
	 * @param prettifySeparater
	 *
	 * @return
	 */
	public IonRangeSliderOptions setPrettifySeparater(Character prettifySeparater)
	{
		this.prettifySeparater = prettifySeparater;
		return this;
	}

	/**
	 * A custom function used to prettify the numbers
	 *
	 * @return
	 */
	public JavascriptFunction getPrettify()
	{
		return prettify;
	}

	/**
	 * A custom function used to prettify the numbers
	 *
	 * @param prettify
	 *
	 * @return
	 */
	public IonRangeSliderOptions setPrettify(JavascriptFunction prettify)
	{
		this.prettify = prettify;
		return this;
	}

	/**
	 * A given postfix for a number
	 *
	 * @return
	 */
	public Character getPostfix()
	{
		return postfix;
	}

	/**
	 * A given postfix for a number
	 *
	 * @param postfix
	 *
	 * @return
	 */
	public IonRangeSliderOptions setPostfix(Character postfix)
	{
		this.postfix = postfix;
		return this;
	}

	/**
	 * A given postfix for the displayed maximum number
	 *
	 * @return
	 */
	public Character getMaxPostfix()
	{
		return maxPostfix;
	}

	/**
	 * A given postfix for the displayed maximum number
	 *
	 * @param maxPostfix
	 *
	 * @return
	 */
	public IonRangeSliderOptions setMaxPostfix(Character maxPostfix)
	{
		this.maxPostfix = maxPostfix;
		return this;
	}

	/**
	 * Show the decoration for both min and max in the value field
	 *
	 * @return
	 */
	public Boolean getDecorateBoth()
	{
		return decorateBoth;
	}

	/**
	 * Show the decoration for both min and max in the value field
	 *
	 * @param decorateBoth
	 *
	 * @return
	 */
	public IonRangeSliderOptions setDecorateBoth(Boolean decorateBoth)
	{
		this.decorateBoth = decorateBoth;
		return this;
	}

	/**
	 * Use your own separator symbol with values_separator option. Like →
	 *
	 * @return
	 */
	public String getValueSeparator()
	{
		return valueSeparator;
	}

	/**
	 * Use your own separator symbol with values_separator option. Like →
	 *
	 * @param valueSeparator
	 *
	 * @return
	 */
	public IonRangeSliderOptions setValueSeparator(String valueSeparator)
	{
		this.valueSeparator = valueSeparator;
		return this;
	}

	/**
	 * Hides the min and max
	 *
	 * @return
	 */
	public Boolean getHideMinMax()
	{
		return hideMinMax;
	}

	/**
	 * Hides the min and max
	 *
	 * @param hideMinMax
	 *
	 * @return
	 */
	public IonRangeSliderOptions setHideMinMax(Boolean hideMinMax)
	{
		this.hideMinMax = hideMinMax;
		return this;
	}

	/**
	 * Hides the from and the to
	 *
	 * @return
	 */
	public Boolean getHideFromTo()
	{
		return hideFromTo;
	}

	/**
	 * Hides the from and the to
	 *
	 * @param hideFromTo
	 *
	 * @return
	 */
	public IonRangeSliderOptions setHideFromTo(Boolean hideFromTo)
	{
		this.hideFromTo = hideFromTo;
		return this;
	}

	/**
	 * slider labels are far away outside it's container by default, can fix it with ease if you wish, with force_edges attribute:
	 *
	 * @return
	 */
	public Boolean getForceEdges()
	{
		return forceEdges;
	}

	/**
	 * slider labels are far away outside it's container by default, can fix it with ease if you wish, with force_edges attribute:
	 *
	 * @param forceEdges
	 *
	 * @return
	 */
	public IonRangeSliderOptions setForceEdges(Boolean forceEdges)
	{
		this.forceEdges = forceEdges;
		return this;
	}

	/**
	 * Specify number of steps in grid number
	 *
	 * @return
	 */
	public Number getGridNumber()
	{
		return gridNumber;
	}

	/**
	 * Specify number of steps in grid number
	 *
	 * @param gridNumber
	 *
	 * @return
	 */
	public IonRangeSliderOptions setGridNumber(Number gridNumber)
	{
		this.gridNumber = gridNumber;
		return this;
	}

	/**
	 * Have predefined step? You can snap grid to it:
	 *
	 * @return
	 */
	public Boolean getGridSnap()
	{
		return gridSnap;
	}

	/**
	 * Have predefined step? You can snap grid to it:
	 *
	 * @param gridSnap
	 *
	 * @return
	 */
	public IonRangeSliderOptions setGridSnap(Boolean gridSnap)
	{
		this.gridSnap = gridSnap;
		return this;
	}

	/**
	 * Sometimes you want to forbid dragging one or both handles. Try to move left handle, you can't.
	 *
	 * @return
	 */
	public Boolean getFromFixed()
	{
		return fromFixed;
	}

	/**
	 * Sometimes you want to forbid dragging one or both handles. Try to move left handle, you can't.
	 *
	 * @param fromFixed
	 *
	 * @return
	 */
	public IonRangeSliderOptions setFromFixed(Boolean fromFixed)
	{
		this.fromFixed = fromFixed;
		return this;
	}

	/**
	 * Sometimes you want to forbid dragging one or both handles. Try to move left handle, you can't.
	 *
	 * @return
	 */
	public Boolean getToFixed()
	{
		return toFixed;
	}

	/**
	 * Sometimes you want to forbid dragging one or both handles. Try to move left handle, you can't.
	 *
	 * @param toFixed
	 *
	 * @return
	 */
	public IonRangeSliderOptions setToFixed(Boolean toFixed)
	{
		this.toFixed = toFixed;
		return this;
	}

	/**
	 * Gets the From Minimum
	 *
	 * @return
	 */
	public Number getFromMin()
	{
		return fromMin;
	}

	/**
	 * Sets the from minimum
	 *
	 * @param fromMin
	 *
	 * @return
	 */
	public IonRangeSliderOptions setFromMin(Number fromMin)
	{
		this.fromMin = fromMin;
		return this;
	}

	/**
	 * Gets the from maximum
	 *
	 * @return
	 */
	public Number getFromMax()
	{
		return fromMax;
	}

	/**
	 * Sets the from maximum
	 *
	 * @param fromMax
	 *
	 * @return
	 */
	public IonRangeSliderOptions setFromMax(Number fromMax)
	{
		this.fromMax = fromMax;
		return this;
	}

	/**
	 * Gets the to minimum
	 *
	 * @return
	 */
	public Number getToMin()
	{
		return toMin;
	}

	/**
	 * Sets the to minimum
	 *
	 * @param toMin
	 *
	 * @return
	 */
	public IonRangeSliderOptions setToMin(Number toMin)
	{
		this.toMin = toMin;
		return this;
	}

	/**
	 * Gets the to maximum
	 *
	 * @return
	 */
	public Number getToMax()
	{
		return toMax;
	}

	/**
	 * Sets the to maximum
	 *
	 * @param toMax
	 *
	 * @return
	 */
	public IonRangeSliderOptions setToMax(Number toMax)
	{
		this.toMax = toMax;
		return this;
	}

	/**
	 * If this slider is disabled
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * If the slider is disabled
	 *
	 * @param disabled
	 *
	 * @return
	 */
	public IonRangeSliderOptions setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return this;
	}

	/**
	 * If the keyboard can be used
	 *
	 * @return
	 */
	public Boolean getKeyboard()
	{
		return keyboard;
	}

	/**
	 * If the keyboard can be used
	 *
	 * @param keyboard
	 *
	 * @return
	 */
	public IonRangeSliderOptions setKeyboard(Boolean keyboard)
	{
		this.keyboard = keyboard;
		return this;
	}

	/**
	 * The keyboard step to apply
	 *
	 * @return
	 */
	public Number getKeyboardStep()
	{
		return keyboardStep;
	}

	/**
	 * Sets the keyboard step to apply
	 *
	 * @param keyboardStep
	 *
	 * @return
	 */
	public IonRangeSliderOptions setKeyboardStep(Number keyboardStep)
	{
		this.keyboardStep = keyboardStep;
		return this;
	}

	/**
	 * Gets the minimum interval
	 *
	 * @return
	 */
	public Number getMinInterval()
	{
		return minInterval;
	}

	/**
	 * Sets the minimum interval
	 *
	 * @param minInterval
	 *
	 * @return
	 */
	public IonRangeSliderOptions setMinInterval(Number minInterval)
	{
		this.minInterval = minInterval;
		return this;
	}

	/**
	 * Gets the maximum interval
	 *
	 * @return
	 */
	public Number getMaxInterval()
	{
		return maxInterval;
	}

	/**
	 * Sets the maximum interval
	 *
	 * @param maxInterval
	 *
	 * @return
	 */
	public IonRangeSliderOptions setMaxInterval(Number maxInterval)
	{
		this.maxInterval = maxInterval;
		return this;
	}

	/**
	 * Gets the drag interval
	 *
	 * @return
	 */
	public Boolean getDragInterval()
	{
		return dragInterval;
	}

	/**
	 * Sets the drag interval
	 *
	 * @param dragInterval
	 *
	 * @return
	 */
	public IonRangeSliderOptions setDragInterval(Boolean dragInterval)
	{
		this.dragInterval = dragInterval;
		return this;
	}

}
