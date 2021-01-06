// Generated with g9.

package com.axity.bbva.mysql.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="bb_cat_branch_office")
public class BbCatBranchOffice implements Serializable {

    /** Primary key. */
    protected static final String PK = "idBranchOfficePk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_branch_office_pk", unique=true, nullable=false, precision=11)
    private int idBranchOfficePk;
    @Column(nullable=false, length=75)
    private String name;
    @Column(nullable=false, length=165)
    private String address;
    @Column(nullable=false, precision=9, scale=6)
    private BigDecimal latitude;
    @Column(nullable=false, precision=9, scale=6)
    private BigDecimal longitude;
    @Column(precision=3)
    private short status;
    @Column(name="affluence_total_time_range", nullable=false, precision=4)
    private int affluenceTotalTimeRange;
    @OneToMany(mappedBy="bbCatBranchOffice")
    private Set<BbBranchOfficeDays> bbBranchOfficeDays;
    @OneToMany(mappedBy="bbCatBranchOffice")
    private Set<BbReservations> bbReservations;
    @OneToMany(mappedBy="bbCatBranchOffice")
    private Set<BbCatSchedule> bbCatSchedule;

    /** Default constructor. */
    public BbCatBranchOffice() {
        super();
    }

    /**
     * Access method for idBranchOfficePk.
     *
     * @return the current value of idBranchOfficePk
     */
    public int getIdBranchOfficePk() {
        return idBranchOfficePk;
    }

    /**
     * Setter method for idBranchOfficePk.
     *
     * @param aIdBranchOfficePk the new value for idBranchOfficePk
     */
    public void setIdBranchOfficePk(int aIdBranchOfficePk) {
        idBranchOfficePk = aIdBranchOfficePk;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(String aAddress) {
        address = aAddress;
    }

    /**
     * Access method for latitude.
     *
     * @return the current value of latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Setter method for latitude.
     *
     * @param aLatitude the new value for latitude
     */
    public void setLatitude(BigDecimal aLatitude) {
        latitude = aLatitude;
    }

    /**
     * Access method for longitude.
     *
     * @return the current value of longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Setter method for longitude.
     *
     * @param aLongitude the new value for longitude
     */
    public void setLongitude(BigDecimal aLongitude) {
        longitude = aLongitude;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public short getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(short aStatus) {
        status = aStatus;
    }

    /**
     * Access method for affluenceTotalTimeRange.
     *
     * @return the current value of affluenceTotalTimeRange
     */
    public int getAffluenceTotalTimeRange() {
        return affluenceTotalTimeRange;
    }

    /**
     * Setter method for affluenceTotalTimeRange.
     *
     * @param aAffluenceTotalTimeRange the new value for affluenceTotalTimeRange
     */
    public void setAffluenceTotalTimeRange(int aAffluenceTotalTimeRange) {
        affluenceTotalTimeRange = aAffluenceTotalTimeRange;
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
     * Access method for bbReservations.
     *
     * @return the current value of bbReservations
     */
    public Set<BbReservations> getBbReservations() {
        return bbReservations;
    }

    /**
     * Setter method for bbReservations.
     *
     * @param aBbReservations the new value for bbReservations
     */
    public void setBbReservations(Set<BbReservations> aBbReservations) {
        bbReservations = aBbReservations;
    }

    /**
     * Access method for bbCatSchedule.
     *
     * @return the current value of bbCatSchedule
     */
    public Set<BbCatSchedule> getBbCatSchedule() {
        return bbCatSchedule;
    }

    /**
     * Setter method for bbCatSchedule.
     *
     * @param aBbCatSchedule the new value for bbCatSchedule
     */
    public void setBbCatSchedule(Set<BbCatSchedule> aBbCatSchedule) {
        bbCatSchedule = aBbCatSchedule;
    }

    /**
     * Compares the key for this instance with another BbCatBranchOffice.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbCatBranchOffice and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbCatBranchOffice)) {
            return false;
        }
        BbCatBranchOffice that = (BbCatBranchOffice) other;
        if (this.getIdBranchOfficePk() != that.getIdBranchOfficePk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbCatBranchOffice.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbCatBranchOffice)) return false;
        return this.equalKeys(other) && ((BbCatBranchOffice)other).equalKeys(this);
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
        i = getIdBranchOfficePk();
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
        StringBuffer sb = new StringBuffer("[BbCatBranchOffice |");
        sb.append(" idBranchOfficePk=").append(getIdBranchOfficePk());
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
        ret.put("idBranchOfficePk", Integer.valueOf(getIdBranchOfficePk()));
        return ret;
    }

}
