package com.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MsZffp {
    private BigDecimal mzxh;

    private BigDecimal jgid;

    private String fphm;

    private String czgh;

    private Date jzrq;

    private BigDecimal mzlb;

    private Date hzrq;

    private Date zfrq;

    private String zfyy;

    private BigDecimal jzlsh;

    private String ddbh;

    private Date ddtksj;

    private String refTraceno;

    private String tRefOrdno;

    private BigDecimal state;

    public BigDecimal getMzxh() {
        return mzxh;
    }

    public void setMzxh(BigDecimal mzxh) {
        this.mzxh = mzxh;
    }

    public BigDecimal getJgid() {
        return jgid;
    }

    public void setJgid(BigDecimal jgid) {
        this.jgid = jgid;
    }

    public String getFphm() {
        return fphm;
    }

    public void setFphm(String fphm) {
        this.fphm = fphm == null ? null : fphm.trim();
    }

    public String getCzgh() {
        return czgh;
    }

    public void setCzgh(String czgh) {
        this.czgh = czgh == null ? null : czgh.trim();
    }

    public Date getJzrq() {
        return jzrq;
    }

    public void setJzrq(Date jzrq) {
        this.jzrq = jzrq;
    }

    public BigDecimal getMzlb() {
        return mzlb;
    }

    public void setMzlb(BigDecimal mzlb) {
        this.mzlb = mzlb;
    }

    public Date getHzrq() {
        return hzrq;
    }

    public void setHzrq(Date hzrq) {
        this.hzrq = hzrq;
    }

    public Date getZfrq() {
        return zfrq;
    }

    public void setZfrq(Date zfrq) {
        this.zfrq = zfrq;
    }

    public String getZfyy() {
        return zfyy;
    }

    public void setZfyy(String zfyy) {
        this.zfyy = zfyy == null ? null : zfyy.trim();
    }

    public BigDecimal getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(BigDecimal jzlsh) {
        this.jzlsh = jzlsh;
    }

    public String getDdbh() {
        return ddbh;
    }

    public void setDdbh(String ddbh) {
        this.ddbh = ddbh == null ? null : ddbh.trim();
    }

    public Date getDdtksj() {
        return ddtksj;
    }

    public void setDdtksj(Date ddtksj) {
        this.ddtksj = ddtksj;
    }

    public String getRefTraceno() {
        return refTraceno;
    }

    public void setRefTraceno(String refTraceno) {
        this.refTraceno = refTraceno == null ? null : refTraceno.trim();
    }

    public String gettRefOrdno() {
        return tRefOrdno;
    }

    public void settRefOrdno(String tRefOrdno) {
        this.tRefOrdno = tRefOrdno == null ? null : tRefOrdno.trim();
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }
}