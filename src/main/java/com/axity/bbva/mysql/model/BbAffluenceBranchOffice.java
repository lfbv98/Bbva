// Generated with g9.

package com.axity.bbva.mysql.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="bb_affluence_branch_office")
public class BbAffluenceBranchOffice implements Serializable {

    /** Primary key. */
    protected static final String PK = "affluenceBranchOfficePk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="affluence_branch_office_pk", unique=true, nullable=false, precision=11)
    private int affluenceBranchOfficePk;
    @Column(name="date_affluence", nullable=false)
    private LocalDateTime dateAffluence;
    @Column(name="hour_affluence", nullable=false)
    private LocalTime hourAffluence;
    @Column(name="id_branch_office_fk", nullable=false, precision=11)
    private int idBranchOfficeFk;
    @Column(precision=6)
    private int affluence;

    /** Default constructor. */
    public BbAffluenceBranchOffice() {
        super();
    }

    /**
     * Access method for affluenceBranchOfficePk.
     *
     * @return the current value of affluenceBranchOfficePk
     */
    public int getAffluenceBranchOfficePk() {
        return affluenceBranchOfficePk;
    }

    /**
     * Setter method for affluenceBranchOfficePk.
     *
     * @param aAffluenceBranchOfficePk the new value for affluenceBranchOfficePk
     */
    public void setAffluenceBranchOfficePk(int aAffluenceBranchOfficePk) {
        affluenceBranchOfficePk = aAffluenceBranchOfficePk;
    }

    /**
     * Access method for dateAffluence.
     *
     * @return the current value of dateAffluence
     */
    public LocalDateTime getDateAffluence() {
        return dateAffluence;
    }

    /**
     * Setter method for dateAffluence.
     *
     * @param aDateAffluence the new value for dateAffluence
     */
    public void setDateAffluence(LocalDateTime aDateAffluence) {
        dateAffluence = aDateAffluence;
    }

    /**
     * Access method for hourAffluence.
     *
     * @return the current value of hourAffluence
     */
    public LocalTime getHourAffluence() {
        return hourAffluence;
    }

    /**
     * Setter method for hourAffluence.
     *
     * @param aHourAffluence the new value for hourAffluence
     */
    public void setHourAffluence(LocalTime aHourAffluence) {
        hourAffluence = aHourAffluence;
    }

    /**
     * Access method for idBranchOfficeFk.
     *
     * @return the current value of idBranchOfficeFk
     */
    public int getIdBranchOfficeFk() {
        return idBranchOfficeFk;
    }

    /**
     * Setter method for idBranchOfficeFk.
     *
     * @param aIdBranchOfficeFk the new value for idBranchOfficeFk
     */
    public void setIdBranchOfficeFk(int aIdBranchOfficeFk) {
        idBranchOfficeFk = aIdBranchOfficeFk;
    }

    /**
     * Access method for affluence.
     *
     * @return the current value of affluence
     */
    public int getAffluence() {
        return affluence;
    }

    /**
     * Setter method for affluence.
     *
     * @param aAffluence the new value for affluence
     */
    public void setAffluence(int aAffluence) {
        affluence = aAffluence;
    }

    /**
     * Compares the key for this instance with another BbAffluenceBranchOffice.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbAffluenceBranchOffice and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbAffluenceBranchOffice)) {
            return false;
        }
        BbAffluenceBranchOffice that = (BbAffluenceBranchOffice) other;
        if (this.getAffluenceBranchOfficePk() != that.getAffluenceBranchOfficePk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbAffluenceBranchOffice.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbAffluenceBranchOffice)) return false;
        return this.equalKeys(other) && ((BbAffluenceBranchOffice)other).equalKeys(this);
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
        i = getAffluenceBranchOfficePk();
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
        StringBuffer sb = new StringBuffer("[BbAffluenceBranchOffice |");
        sb.append(" affluenceBranchOfficePk=").append(getAffluenceBranchOfficePk());
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
        ret.put("affluenceBranchOfficePk", Integer.valueOf(getAffluenceBranchOfficePk()));
        return ret;
    }

}
