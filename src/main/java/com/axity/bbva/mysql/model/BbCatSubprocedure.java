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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="bb_cat_subprocedure")
public class BbCatSubprocedure implements Serializable {

    /** Primary key. */
    protected static final String PK = "idSubprocedurePk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_subprocedure_pk", unique=true, nullable=false, precision=11)
    private int idSubprocedurePk;
    @Column(length=35)
    private String subprocedure;
    @OneToMany(mappedBy="bbCatSubprocedure")
    private Set<BbReservations> bbReservations;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_procedure_fk", nullable=false)
    private BbCatProcedure bbCatProcedure;

    /** Default constructor. */
    public BbCatSubprocedure() {
        super();
    }

    /**
     * Access method for idSubprocedurePk.
     *
     * @return the current value of idSubprocedurePk
     */
    public int getIdSubprocedurePk() {
        return idSubprocedurePk;
    }

    /**
     * Setter method for idSubprocedurePk.
     *
     * @param aIdSubprocedurePk the new value for idSubprocedurePk
     */
    public void setIdSubprocedurePk(int aIdSubprocedurePk) {
        idSubprocedurePk = aIdSubprocedurePk;
    }

    /**
     * Access method for subprocedure.
     *
     * @return the current value of subprocedure
     */
    public String getSubprocedure() {
        return subprocedure;
    }

    /**
     * Setter method for subprocedure.
     *
     * @param aSubprocedure the new value for subprocedure
     */
    public void setSubprocedure(String aSubprocedure) {
        subprocedure = aSubprocedure;
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
     * Access method for bbCatProcedure.
     *
     * @return the current value of bbCatProcedure
     */
    public BbCatProcedure getBbCatProcedure() {
        return bbCatProcedure;
    }

    /**
     * Setter method for bbCatProcedure.
     *
     * @param aBbCatProcedure the new value for bbCatProcedure
     */
    public void setBbCatProcedure(BbCatProcedure aBbCatProcedure) {
        bbCatProcedure = aBbCatProcedure;
    }

    /**
     * Compares the key for this instance with another BbCatSubprocedure.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbCatSubprocedure and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbCatSubprocedure)) {
            return false;
        }
        BbCatSubprocedure that = (BbCatSubprocedure) other;
        if (this.getIdSubprocedurePk() != that.getIdSubprocedurePk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbCatSubprocedure.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbCatSubprocedure)) return false;
        return this.equalKeys(other) && ((BbCatSubprocedure)other).equalKeys(this);
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
        i = getIdSubprocedurePk();
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
        StringBuffer sb = new StringBuffer("[BbCatSubprocedure |");
        sb.append(" idSubprocedurePk=").append(getIdSubprocedurePk());
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
        ret.put("idSubprocedurePk", Integer.valueOf(getIdSubprocedurePk()));
        return ret;
    }

}
