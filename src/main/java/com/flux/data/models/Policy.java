package com.flux.data.models;

import com.flux.data.AbstractEntity;
import jakarta.persistence.Entity;

import java.time.Month;
import java.util.Date;

@Entity
public class Policy extends AbstractEntity {
    private String policyNumber;
    private Date originalEffectiveDate;
    private Date writtenDate;
    private String renewalMonth;
    private boolean isAutoRenewed;
    private String status;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Date getOriginalEffectiveDate() {
        return originalEffectiveDate;
    }

    public void setOriginalEffectiveDate(Date originalEffectiveDate) {
        this.originalEffectiveDate = originalEffectiveDate;
    }

    public Date getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Date writtenDate) {
        this.writtenDate = writtenDate;
    }

    public String getRenewalMonth() {
        return renewalMonth;
    }

    public void setRenewalMonth(String renewalMonth) {
        this.renewalMonth = renewalMonth;
    }

    public boolean isAutoRenewed() {
        return isAutoRenewed;
    }

    public void setAutoRenewed(boolean autoRenewed) {
        isAutoRenewed = autoRenewed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
