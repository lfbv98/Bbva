// Generated with g9.

package com.axity.bbva.mysql.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="bb_cat_days")
public class BbCatDays implements Serializable {

    /** Primary key. */
    protected static final String PK = "idDayPk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_day_pk", unique=true, nullable=false, precision=6)
    private int idDayPk;
    @Column(length=11)
    private String day;
    @OneToMany(mappedBy="bbCatDays")
    private Set<BbBranchOfficeDays> bbBranchOfficeDays;

    /** Default constructor. */
    public BbCatDays() {
        super();
    }

    /**
     * Access method for idDayPk.
     *
     * @return the current value of idDayPk
     */
    public int getIdDayPk() {
        return idDayPk;
    }

    /**
     * Setter method for idDayPk.
     *
     * @param aIdDayPk the new value for idDayPk
     */
    public void setIdDayPk(int aIdDayPk) {
        idDayPk = aIdDayPk;
    }

    /**
     * Access method for day.
     *
     * @return the current value of day
     */
    public String getDay() {
        return day;
    }

    /**
     * Setter method for day.
     *
     * @param aDay the new value for day
     */
    public void setDay(String aDay) {
        day = aDay;
    }

    /**
     * Access method for bbBranchOfficeDays.
     *
     * @return the current value of bbBranchOfficeDays
     */
    public Set<BbBranchOfficeDays> getBbBranchOfficeDays() {
        return bbBranchOfficeDays;
    }

    /**
     * Setter method for bbBranchOfficeDays.
     *
     * @param aBbBranchOfficeDays the new value for bbBranchOfficeDays
     */
    public void setBbBranchOfficeDays(Set<BbBranchOfficeDays> aBbBranchOfficeDays) {
        bbBranchOfficeDays = aBbBranchOfficeDays;
    }

    /**
     * Compares the key for this instance with another BbCatDays.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbCatDays and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbCatDays)) {
            return false;
        }
        BbCatDays that = (BbCatDays) other;
        if (this.getIdDayPk() != that.getIdDayPk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbCatDays.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbCatDays)) return false;
        return this.equalKeys(other) && ((BbCatDays)other).equalKeys(this);
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
        i = getIdDayPk();
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
        StringBuffer sb = new StringBuffer("[BbCatDays |");
        sb.append(" idDayPk=").append(getIdDayPk());
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
        ret.put("idDayPk", Integer.valueOf(getIdDayPk()));
        return ret;
    }

}
