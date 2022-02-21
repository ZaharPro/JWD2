package by.epam.zahar.entity;

import java.time.LocalDate;

public class Tariff {
    private String name;
    private String vendorCode;
    private LocalDate localDate;
    private float payroll;
    private float smsPrice;
    private OperatorName operatorName;
    private CallPrices callPrices = new CallPrices();
    private Parameters parameters = new Parameters();

    public Tariff() {
    }

    public Tariff(String name, String vendorCode, LocalDate localDate, float payroll, float smsPrice, OperatorName operatorName, CallPrices callPrices, Parameters parameters) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.localDate = localDate;
        this.payroll = payroll;
        this.smsPrice = smsPrice;
        this.operatorName = operatorName;
        this.callPrices = callPrices;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public OperatorName getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(OperatorName operatorName) {
        this.operatorName = operatorName;
    }

    public float getPayroll() {
        return payroll;
    }

    public void setPayroll(float payroll) {
        this.payroll = payroll;
    }

    public CallPrices getCallPrices() {
        return callPrices;
    }

    public void setCallPrices(CallPrices callPrices) {
        this.callPrices = callPrices;
    }

    public float getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(float smsPrice) {
        this.smsPrice = smsPrice;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\nTariff");
        sb.append("\nname='").append(name).append('\'');
        sb.append(", \nvendorCode='").append(vendorCode).append('\'');
        sb.append(", \nlocalDate=").append(localDate);
        sb.append(", \npayroll=").append(payroll);
        sb.append(", \nsmsPrice=").append(smsPrice);
        sb.append(", \noperatorName=").append(operatorName);
        sb.append(", \ncallPrices").append(callPrices);
        sb.append(", \nparameters").append(parameters);
        sb.append("\n");
        return sb.toString();
    }
}
