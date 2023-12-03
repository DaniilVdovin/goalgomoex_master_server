package ru.goalgomoex.goalgomoex.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "go_tickets")
public class goTicket {
    @Id
    private String SECID;
    private String BOARDID;
    private String SHORTNAME;
    private String PREVPRICE;
    private String LOTSIZE;
    private String FACEVALUE;
    private String STATUS;
    private String BOARDNAME;
    private String DECIMALS;
    private String SECNAME;
    private String REMARKS;
    private String MARKETCODE;
    private String INSTRID;
    private String SECTORID;
    private String MINSTEP;
    private String PREVWAPRICE;
    private String FACEUNIT;
    private String PREVDATE;
    private String ISSUESIZE;
    private String ISIN;
    private String LATNAME;
    private String REGNUMBER;
    private String PREVLEGALCLOSEPRICE;
    private String CURRENCYID;
    private String SECTYPE;
    private String LISTLEVEL;
    private String SETTLEDATE;

    public goTicket(String SECID, String BOARDID, String SHORTNAME, String PREVPRICE, String LOTSIZE, String FACEVALUE, String STATUS, String BOARDNAME, String DECIMALS, String SECNAME, String REMARKS, String MARKETCODE, String INSTRID, String SECTORID, String MINSTEP, String PREVWAPRICE, String FACEUNIT, String PREVDATE, String ISSUESIZE, String ISIN, String LATNAME, String REGNUMBER, String PREVLEGALCLOSEPRICE, String CURRENCYID, String SECTYPE, String LISTLEVEL, String SETTLEDATE) {
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

    public String getPREVPRICE() {
        return PREVPRICE;
    }

    public void setPREVPRICE(String PREVPRICE) {
        this.PREVPRICE = PREVPRICE;
    }

    public String getLOTSIZE() {
        return LOTSIZE;
    }

    public void setLOTSIZE(String LOTSIZE) {
        this.LOTSIZE = LOTSIZE;
    }

    public String getFACEVALUE() {
        return FACEVALUE;
    }

    public void setFACEVALUE(String FACEVALUE) {
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

    public String getDECIMALS() {
        return DECIMALS;
    }

    public void setDECIMALS(String DECIMALS) {
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

    public String getMINSTEP() {
        return MINSTEP;
    }

    public void setMINSTEP(String MINSTEP) {
        this.MINSTEP = MINSTEP;
    }

    public String getPREVWAPRICE() {
        return PREVWAPRICE;
    }

    public void setPREVWAPRICE(String PREVWAPRICE) {
        this.PREVWAPRICE = PREVWAPRICE;
    }

    public String getFACEUNIT() {
        return FACEUNIT;
    }

    public void setFACEUNIT(String FACEUNIT) {
        this.FACEUNIT = FACEUNIT;
    }

    public String getPREVDATE() {
        return PREVDATE;
    }

    public void setPREVDATE(String PREVDATE) {
        this.PREVDATE = PREVDATE;
    }

    public String getISSUESIZE() {
        return ISSUESIZE;
    }

    public void setISSUESIZE(String ISSUESIZE) {
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

    public String getPREVLEGALCLOSEPRICE() {
        return PREVLEGALCLOSEPRICE;
    }

    public void setPREVLEGALCLOSEPRICE(String PREVLEGALCLOSEPRICE) {
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

    public String getLISTLEVEL() {
        return LISTLEVEL;
    }

    public void setLISTLEVEL(String LISTLEVEL) {
        this.LISTLEVEL = LISTLEVEL;
    }

    public String getSETTLEDATE() {
        return SETTLEDATE;
    }

    public void setSETTLEDATE(String SETTLEDATE) {
        this.SETTLEDATE = SETTLEDATE;
    }
}
