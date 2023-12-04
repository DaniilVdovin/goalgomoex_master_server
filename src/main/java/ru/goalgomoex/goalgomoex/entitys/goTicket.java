package ru.goalgomoex.goalgomoex.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "go_tickets")
public class goTicket {
    @Id
    private String SECID;
    private String BOARDID;
    private String SHORTNAME;
    private double PREVPRICE;
    private int LOTSIZE;
    private double FACEVALUE;
    private String STATUS;
    private String BOARDNAME;
    private int DECIMALS;
    private String SECNAME;
    private String REMARKS;
    private String MARKETCODE;
    private String INSTRID;
    private String SECTORID;
    private double MINSTEP;
    private double PREVWAPRICE;
    private String FACEUNIT;
    private Date PREVDATE;
    private int ISSUESIZE;
    private String ISIN;
    private String LATNAME;
    private String REGNUMBER;
    private double PREVLEGALCLOSEPRICE;
    private String CURRENCYID;
    private String SECTYPE;
    private int LISTLEVEL;
    private Date SETTLEDATE;

    public goTicket(String SECID, String BOARDID, String SHORTNAME, double PREVPRICE, int LOTSIZE, double FACEVALUE, String STATUS, String BOARDNAME, int DECIMALS, String SECNAME, String REMARKS, String MARKETCODE, String INSTRID, String SECTORID, double MINSTEP, double PREVWAPRICE, String FACEUNIT, Date PREVDATE, int ISSUESIZE, String ISIN, String LATNAME, String REGNUMBER, double PREVLEGALCLOSEPRICE, String CURRENCYID, String SECTYPE, int LISTLEVEL, Date SETTLEDATE) {
        this.SECID = SECID;
        this.BOARDID = BOARDID;
        this.SHORTNAME = SHORTNAME;
        this.PREVPRICE = PREVPRICE;
        this.LOTSIZE = LOTSIZE;
        this.FACEVALUE = FACEVALUE;
        this.STATUS = STATUS;
        this.BOARDNAME = BOARDNAME;
        this.DECIMALS = DECIMALS;
        this.SECNAME = SECNAME;
        this.REMARKS = REMARKS;
        this.MARKETCODE = MARKETCODE;
        this.INSTRID = INSTRID;
        this.SECTORID = SECTORID;
        this.MINSTEP = MINSTEP;
        this.PREVWAPRICE = PREVWAPRICE;
        this.FACEUNIT = FACEUNIT;
        this.PREVDATE = PREVDATE;
        this.ISSUESIZE = ISSUESIZE;
        this.ISIN = ISIN;
        this.LATNAME = LATNAME;
        this.REGNUMBER = REGNUMBER;
        this.PREVLEGALCLOSEPRICE = PREVLEGALCLOSEPRICE;
        this.CURRENCYID = CURRENCYID;
        this.SECTYPE = SECTYPE;
        this.LISTLEVEL = LISTLEVEL;
        this.SETTLEDATE = SETTLEDATE;
    }

    public String getSECID() {
        return SECID;
    }

    public void setSECID(String SECID) {
        this.SECID = SECID;
    }

    public String getBOARDID() {
        return BOARDID;
    }

    public void setBOARDID(String BOARDID) {
        this.BOARDID = BOARDID;
    }

    public String getSHORTNAME() {
        return SHORTNAME;
    }

    public void setSHORTNAME(String SHORTNAME) {
        this.SHORTNAME = SHORTNAME;
    }

    public double getPREVPRICE() {
        return PREVPRICE;
    }

    public void setPREVPRICE(double PREVPRICE) {
        this.PREVPRICE = PREVPRICE;
    }

    public int getLOTSIZE() {
        return LOTSIZE;
    }

    public void setLOTSIZE(int LOTSIZE) {
        this.LOTSIZE = LOTSIZE;
    }

    public double getFACEVALUE() {
        return FACEVALUE;
    }

    public void setFACEVALUE(double FACEVALUE) {
        this.FACEVALUE = FACEVALUE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getBOARDNAME() {
        return BOARDNAME;
    }

    public void setBOARDNAME(String BOARDNAME) {
        this.BOARDNAME = BOARDNAME;
    }

    public int getDECIMALS() {
        return DECIMALS;
    }

    public void setDECIMALS(int DECIMALS) {
        this.DECIMALS = DECIMALS;
    }

    public String getSECNAME() {
        return SECNAME;
    }

    public void setSECNAME(String SECNAME) {
        this.SECNAME = SECNAME;
    }

    public String getREMARKS() {
        return REMARKS;
    }

    public void setREMARKS(String REMARKS) {
        this.REMARKS = REMARKS;
    }

    public String getMARKETCODE() {
        return MARKETCODE;
    }

    public void setMARKETCODE(String MARKETCODE) {
        this.MARKETCODE = MARKETCODE;
    }

    public String getINSTRID() {
        return INSTRID;
    }

    public void setINSTRID(String INSTRID) {
        this.INSTRID = INSTRID;
    }

    public String getSECTORID() {
        return SECTORID;
    }

    public void setSECTORID(String SECTORID) {
        this.SECTORID = SECTORID;
    }

    public double getMINSTEP() {
        return MINSTEP;
    }

    public void setMINSTEP(double MINSTEP) {
        this.MINSTEP = MINSTEP;
    }

    public double getPREVWAPRICE() {
        return PREVWAPRICE;
    }

    public void setPREVWAPRICE(double PREVWAPRICE) {
        this.PREVWAPRICE = PREVWAPRICE;
    }

    public String getFACEUNIT() {
        return FACEUNIT;
    }

    public void setFACEUNIT(String FACEUNIT) {
        this.FACEUNIT = FACEUNIT;
    }

    public Date getPREVDATE() {
        return PREVDATE;
    }

    public void setPREVDATE(Date PREVDATE) {
        this.PREVDATE = PREVDATE;
    }

    public int getISSUESIZE() {
        return ISSUESIZE;
    }

    public void setISSUESIZE(int ISSUESIZE) {
        this.ISSUESIZE = ISSUESIZE;
    }

    public String getISIN() {
        return ISIN;
    }

    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }

    public String getLATNAME() {
        return LATNAME;
    }

    public void setLATNAME(String LATNAME) {
        this.LATNAME = LATNAME;
    }

    public String getREGNUMBER() {
        return REGNUMBER;
    }

    public void setREGNUMBER(String REGNUMBER) {
        this.REGNUMBER = REGNUMBER;
    }

    public double getPREVLEGALCLOSEPRICE() {
        return PREVLEGALCLOSEPRICE;
    }

    public void setPREVLEGALCLOSEPRICE(double PREVLEGALCLOSEPRICE) {
        this.PREVLEGALCLOSEPRICE = PREVLEGALCLOSEPRICE;
    }

    public String getCURRENCYID() {
        return CURRENCYID;
    }

    public void setCURRENCYID(String CURRENCYID) {
        this.CURRENCYID = CURRENCYID;
    }

    public String getSECTYPE() {
        return SECTYPE;
    }

    public void setSECTYPE(String SECTYPE) {
        this.SECTYPE = SECTYPE;
    }

    public int getLISTLEVEL() {
        return LISTLEVEL;
    }

    public void setLISTLEVEL(int LISTLEVEL) {
        this.LISTLEVEL = LISTLEVEL;
    }

    public Date getSETTLEDATE() {
        return SETTLEDATE;
    }

    public void setSETTLEDATE(Date SETTLEDATE) {
        this.SETTLEDATE = SETTLEDATE;
    }
}
