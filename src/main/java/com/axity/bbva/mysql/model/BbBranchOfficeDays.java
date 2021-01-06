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

@Entity(name="bb_branch_office_days")
public class BbBranchOfficeDays implements Serializable {

    /** Primary key. */
    protected static final String PK = "idBranchOfficeDayPk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_branch_office_day_pk", unique=true, nullable=false, precision=11)
    private int idBranchOfficeDayPk;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_branch_office_fk", nullable=false)
    private BbCatBranchOffice bbCatBranchOffice;
    @ManyToOne
    @JoinColumn(name="id_day_fk")
    private BbCatDays bbCatDays;

    /** Default constructor. */
    public BbBranchOfficeDays() {
        super();
    }

    /**
     * Access method for idBranchOfficeDayPk.
     *
     * @return the current value of idBranchOfficeDayPk
     */
    public int getIdBranchOfficeDayPk() {
        return idBranchOfficeDayPk;
    }

    /**
     * Setter method for idBranchOfficeDayPk.
     *
     * @param aIdBranchOfficeDayPk the new value for idBranchOfficeDayPk
     */
    public void setIdBranchOfficeDayPk(int aIdBranchOfficeDayPk) {
        idBranchOfficeDayPk = aIdBranchOfficeDayPk;
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
     * Access method for bbCatDays.
     *
     * @return the current value of bbCatDays
     */
    public BbCatDays getBbCatDays() {
        return bbCatDays;
    }

    /**
     * Setter method for bbCatDays.
     *
     * @param aBbCatDays the new value for bbCatDays
     */
    public void setBbCatDays(BbCatDays aBbCatDays) {
        bbCatDays = aBbCatDays;
    }

    /**
     * Compares the key for this instance with another BbBranchOfficeDays.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbBranchOfficeDays and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbBranchOfficeDays)) {
            return false;
        }
        BbBranchOfficeDays that = (BbBranchOfficeDays) other;
        if (this.getIdBranchOfficeDayPk() != that.getIdBranchOfficeDayPk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbBranchOfficeDays.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbBranchOfficeDays)) return false;
        return this.equalKeys(other) && ((BbBranchOfficeDays)other).equalKeys(this);
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
        i = getIdBranchOfficeDayPk();
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
        StringBuffer sb = new StringBuffer("[BbBranchOfficeDays |");
        sb.append(" idBranchOfficeDayPk=").append(getIdBranchOfficeDayPk());
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
        ret.put("idBranchOfficeDayPk", Integer.valueOf(getIdBranchOfficeDayPk()));
        return ret;
    }

}
