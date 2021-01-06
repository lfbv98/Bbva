// Generated with g9.

package com.axity.bbva.mysql.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="bb_reservations")
public class BbReservations implements Serializable {

    /** Primary key. */
    protected static final String PK = "idReservationPk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_reservation_pk", unique=true, nullable=false, precision=11)
    private int idReservationPk;
    @Column(name="reservation_date", nullable=false)
    private LocalDate reservationDate;
    @Column(name="reservation_hour", nullable=false)
    private LocalTime reservationHour;
    @Column(length=75)
    private String name;
    @Column(nullable=false, length=75)
    private String email;
    @Column(nullable=false, length=10)
    private String code;
    @Column(precision=3)
    private short status;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_branch_office_fk", nullable=false)
    private BbCatBranchOffice bbCatBranchOffice;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_subprocedure_fk", nullable=false)
    private BbCatSubprocedure bbCatSubprocedure;

    /** Default constructor. */
    public BbReservations() {
        super();
    }

    /**
     * Access method for idReservationPk.
     *
     * @return the current value of idReservationPk
     */
    public int getIdReservationPk() {
        return idReservationPk;
    }

    /**
     * Setter method for idReservationPk.
     *
     * @param aIdReservationPk the new value for idReservationPk
     */
    public void setIdReservationPk(int aIdReservationPk) {
        idReservationPk = aIdReservationPk;
    }

    /**
     * Access method for reservationDate.
     *
     * @return the current value of reservationDate
     */
    public LocalDate getReservationDate() {
        return reservationDate;
    }

    /**
     * Setter method for reservationDate.
     *
     * @param aReservationDate the new value for reservationDate
     */
    public void setReservationDate(LocalDate aReservationDate) {
        reservationDate = aReservationDate;
    }

    /**
     * Access method for reservationHour.
     *
     * @return the current value of reservationHour
     */
    public LocalTime getReservationHour() {
        return reservationHour;
    }

    /**
     * Setter method for reservationHour.
     *
     * @param aReservationHour the new value for reservationHour
     */
    public void setReservationHour(LocalTime aReservationHour) {
        reservationHour = aReservationHour;
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
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for code.
     *
     * @return the current value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for code.
     *
     * @param aCode the new value for code
     */
    public void setCode(String aCode) {
        code = aCode;
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
     * Access method for bbCatSubprocedure.
     *
     * @return the current value of bbCatSubprocedure
     */
    public BbCatSubprocedure getBbCatSubprocedure() {
        return bbCatSubprocedure;
    }

    /**
     * Setter method for bbCatSubprocedure.
     *
     * @param aBbCatSubprocedure the new value for bbCatSubprocedure
     */
    public void setBbCatSubprocedure(BbCatSubprocedure aBbCatSubprocedure) {
        bbCatSubprocedure = aBbCatSubprocedure;
    }

    /**
     * Compares the key for this instance with another BbReservations.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbReservations and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbReservations)) {
            return false;
        }
        BbReservations that = (BbReservations) other;
        if (this.getIdReservationPk() != that.getIdReservationPk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbReservations.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbReservations)) return false;
        return this.equalKeys(other) && ((BbReservations)other).equalKeys(this);
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
        i = getIdReservationPk();
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
        StringBuffer sb = new StringBuffer("[BbReservations |");
        sb.append(" idReservationPk=").append(getIdReservationPk());
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
        ret.put("idReservationPk", Integer.valueOf(getIdReservationPk()));
        return ret;
    }

}
