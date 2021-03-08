/**
 * 
 */
package edu.learn.beanstalk.vo;

import java.io.Serializable;

/**
 * @author royma
 *
 */
public class LenderFeatureConfig implements Serializable {
	
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 8607805769386572306L;
	private String lenderId;
	private String featureName;
	private String featureValue;
	
	public LenderFeatureConfig(String lenderId, String featureName, String featureValue) {
		super();
		this.lenderId = lenderId;
		this.featureName = featureName;
		this.featureValue = featureValue;
	}
	public String getLenderId() {
		return lenderId;
	}
	public void setLenderId(String lenderId) {
		this.lenderId = lenderId;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getFeatureValue() {
		return featureValue;
	}
	public void setFeatureValue(String featureValue) {
		this.featureValue = featureValue;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((featureName == null) ? 0 : featureName.hashCode());
		result = prime * result + ((featureValue == null) ? 0 : featureValue.hashCode());
		result = prime * result + ((lenderId == null) ? 0 : lenderId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LenderFeatureConfig other = (LenderFeatureConfig) obj;
		if (featureName == null) {
			if (other.featureName != null)
				return false;
		} else if (!featureName.equals(other.featureName))
			return false;
		if (featureValue == null) {
			if (other.featureValue != null)
				return false;
		} else if (!featureValue.equals(other.featureValue))
			return false;
		if (lenderId == null) {
			if (other.lenderId != null)
				return false;
		} else if (!lenderId.equals(other.lenderId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LenderFeatureConfig [lenderId=" + lenderId + ", featureName=" + featureName + ", featureValue="
				+ featureValue + "]";
	}
	
	

}
