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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="bb_cat_schedule")
public class BbCatSchedule implements Serializable {

    /** Primary key. */
    protected static final String PK = "idSchedulePk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_schedule_pk", unique=true, nullable=false, precision=11)
    private int idSchedulePk;
    @Column(length=10)
    private String schedule;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_branch_office_fk", nullable=false)
    private BbCatBranchOffice bbCatBranchOffice;

    /** Default constructor. */
    public BbCatSchedule() {
        super();
    }

    /**
     * Access method for idSchedulePk.
     *
     * @return the current value of idSchedulePk
     */
    public int getIdSchedulePk() {
        return idSchedulePk;
    }

    /**
     * Setter method for idSchedulePk.
     *
     * @param aIdSchedulePk the new value for idSchedulePk
     */
    public void setIdSchedulePk(int aIdSchedulePk) {
        idSchedulePk = aIdSchedulePk;
    }

    /**
     * Access method for schedule.
     *
     * @return the current value of schedule
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Setter method for schedule.
     *
     * @param aSchedule the new value for schedule
     */
    public void setSchedule(String aSchedule) {
        schedule = aSchedule;
    }

    /**
     * Access method for bbCatBranchOffice.
     *
     * @return the current value of bbCatBranchOffice
     */
    public BbCatBranchOffice getBbCatBranchOffice() {
        return bbCatBranchOffice;
    }

    /**
     * Setter method for bbCatBranchOffice.
     *
     * @param aBbCatBranchOffice the new value for bbCatBranchOffice
     */
    public void setBbCatBranchOffice(BbCatBranchOffice aBbCatBranchOffice) {
        bbCatBranchOffice = aBbCatBranchOffice;
    }

    /**
     * Compares the key for this instance with another BbCatSchedule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbCatSchedule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbCatSchedule)) {
            return false;
        }
        BbCatSchedule that = (BbCatSchedule) other;
        if (this.getIdSchedulePk() != that.getIdSchedulePk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbCatSchedule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbCatSchedule)) return false;
        return this.equalKeys(other) && ((BbCatSchedule)other).equalKeys(this);
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
        i = getIdSchedulePk();
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
        StringBuffer sb = new StringBuffer("[BbCatSchedule |");
        sb.append(" idSchedulePk=").append(getIdSchedulePk());
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
        ret.put("idSchedulePk", Integer.valueOf(getIdSchedulePk()));
        return ret;
    }

}
