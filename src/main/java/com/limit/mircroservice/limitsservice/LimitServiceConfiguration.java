/**
 * 
 */
package com.limit.mircroservice.limitsservice;

/**
 * @author Riju
 *
 */
public class LimitServiceConfiguration {

	private int maximum;
	private int minimum;

	/**
	 * 
	 */
	public LimitServiceConfiguration() {
		// TODO Auto-generated constructor stub
	}

	public LimitServiceConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

}
