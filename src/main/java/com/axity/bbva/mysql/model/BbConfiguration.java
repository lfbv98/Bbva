// Generated with g9.

package com.axity.bbva.mysql.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="bb_configuration")
public class BbConfiguration implements Serializable {

    /** Primary key. */
    protected static final String PK = "idConfFk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_conf_fk", unique=true, nullable=false, precision=11)
    private int idConfFk;
    @Column(name="future_days", precision=11)
    private int futureDays;
    @Column(precision=9)
    private int ratio;

    /** Default constructor. */
    public BbConfiguration() {
        super();
    }

    /**
     * Access method for idConfFk.
     *
     * @return the current value of idConfFk
     */
    public int getIdConfFk() {
        return idConfFk;
    }

    /**
     * Setter method for idConfFk.
     *
     * @param aIdConfFk the new value for idConfFk
     */
    public void setIdConfFk(int aIdConfFk) {
        idConfFk = aIdConfFk;
    }

    /**
     * Access method for futureDays.
     *
     * @return the current value of futureDays
     */
    public int getFutureDays() {
        return futureDays;
    }

    /**
     * Setter method for futureDays.
     *
     * @param aFutureDays the new value for futureDays
     */
    public void setFutureDays(int aFutureDays) {
        futureDays = aFutureDays;
    }

    /**
     * Access method for ratio.
     *
     * @return the current value of ratio
     */
    public int getRatio() {
        return ratio;
    }

    /**
     * Setter method for ratio.
     *
     * @param aRatio the new value for ratio
     */
    public void setRatio(int aRatio) {
        ratio = aRatio;
    }

    /**
     * Compares the key for this instance with another BbConfiguration.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbConfiguration and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbConfiguration)) {
            return false;
        }
        BbConfiguration that = (BbConfiguration) other;
        if (this.getIdConfFk() != that.getIdConfFk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbConfiguration.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbConfiguration)) return false;
        return this.equalKeys(other) && ((BbConfiguration)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdConfFk();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[BbConfiguration |");
        sb.append(" idConfFk=").append(getIdConfFk());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idConfFk", Integer.valueOf(getIdConfFk()));
        return ret;
    }

}
