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

@Entity(name="bb_cat_procedure")
public class BbCatProcedure implements Serializable {

    /** Primary key. */
    protected static final String PK = "idProcedurePk";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_procedure_pk", unique=true, nullable=false, precision=11)
    private int idProcedurePk;
    @Column(length=35)
    private String procedure;
    @OneToMany(mappedBy="bbCatProcedure")
    private Set<BbCatSubprocedure> bbCatSubprocedure;

    /** Default constructor. */
    public BbCatProcedure() {
        super();
    }

    /**
     * Access method for idProcedurePk.
     *
     * @return the current value of idProcedurePk
     */
    public int getIdProcedurePk() {
        return idProcedurePk;
    }

    /**
     * Setter method for idProcedurePk.
     *
     * @param aIdProcedurePk the new value for idProcedurePk
     */
    public void setIdProcedurePk(int aIdProcedurePk) {
        idProcedurePk = aIdProcedurePk;
    }

    /**
     * Access method for procedure.
     *
     * @return the current value of procedure
     */
    public String getProcedure() {
        return procedure;
    }

    /**
     * Setter method for procedure.
     *
     * @param aProcedure the new value for procedure
     */
    public void setProcedure(String aProcedure) {
        procedure = aProcedure;
    }

    /**
     * Access method for bbCatSubprocedure.
     *
     * @return the current value of bbCatSubprocedure
     */
    public Set<BbCatSubprocedure> getBbCatSubprocedure() {
        return bbCatSubprocedure;
    }

    /**
     * Setter method for bbCatSubprocedure.
     *
     * @param aBbCatSubprocedure the new value for bbCatSubprocedure
     */
    public void setBbCatSubprocedure(Set<BbCatSubprocedure> aBbCatSubprocedure) {
        bbCatSubprocedure = aBbCatSubprocedure;
    }

    /**
     * Compares the key for this instance with another BbCatProcedure.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BbCatProcedure and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BbCatProcedure)) {
            return false;
        }
        BbCatProcedure that = (BbCatProcedure) other;
        if (this.getIdProcedurePk() != that.getIdProcedurePk()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BbCatProcedure.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BbCatProcedure)) return false;
        return this.equalKeys(other) && ((BbCatProcedure)other).equalKeys(this);
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
        i = getIdProcedurePk();
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
        StringBuffer sb = new StringBuffer("[BbCatProcedure |");
        sb.append(" idProcedurePk=").append(getIdProcedurePk());
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
        ret.put("idProcedurePk", Integer.valueOf(getIdProcedurePk()));
        return ret;
    }

}
