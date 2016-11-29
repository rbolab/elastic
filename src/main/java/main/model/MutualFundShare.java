package main.model;

import org.springframework.data.annotation.Id;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class MutualFundShare {
    @Id
    protected Integer computableId;
    private String name;
    
    private String isin;
    private String riskScore;
    private Date riskScoreAsDate;
    private String ticker;
    private Date inceptionDate;
    private String currency;
    private String currencyHedged;
    private String incomeTreatment;
    private String investorType;
    private String minInvestCurrency;
    private Double minInvestAmount;
    private String formatMinInvestAmount;

	private Double minInvestUnits;
    private Double managementFees;
    private Double performanceFees;
    private String hurdle;
    private String retrocessionTerms;
    private Double retrocessionBps;
    private String fundNetExpenseRatio;
    private String OCF;
    private String ISA;
    private String RDR;
    private String UK;
    private String germanTax;
    private String registeredForSale;
    private Date lastNavDate;
    private Date lastPanoDate;
    protected PerformanceData performanceData;
    private double lastNavUnit;
    private Frequency fundFrequency;
    private String foliometricsId;
    private MutualFund fund;
    
    public Integer getComputableId() {
        return computableId;
    }

    public void setComputableId(Integer computableId) {
        this.computableId = computableId;
    }

    public PerformanceData getPerformanceData() {
        return performanceData;
    }

    public void setPerformanceData(PerformanceData performanceData) {
        this.performanceData = performanceData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(String riskScore) {
        this.riskScore = riskScore;
    }

    public Date getRiskScoreAsDate() {
        return riskScoreAsDate;
    }

    public void setRiskScoreAsDate(Date riskScoreAsDate) {
        this.riskScoreAsDate = riskScoreAsDate;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Date getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(Date inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyHedged() {
        return currencyHedged;
    }

    public void setCurrencyHedged(String currencyHedged) {
        this.currencyHedged = currencyHedged;
    }

    public String getIncomeTreatment() {
        return incomeTreatment;
    }

    public void setIncomeTreatment(String incomeTreatment) {
        this.incomeTreatment = incomeTreatment;
    }

    public String getInvestorType() {
        return investorType;
    }

    public void setInvestorType(String investorType) {
        this.investorType = investorType;
    }

    /*
     * Return the value of minInvestCurrency only
     */
    public String getMinInvestCurrency() {
    	return minInvestCurrency;
    }

    public void setMinInvestCurrency(String minInvestCurrency) {
        this.minInvestCurrency = minInvestCurrency;
    }

    public Double getMinInvestAmount() {
        return minInvestAmount;
    }

    public void setMinInvestAmount(Double minInvestAmount) {
        this.minInvestAmount = minInvestAmount;
        this.formatMinInvestAmount = minInvestAmount.toString();
    }

    public String getFormatMinInvestAmount() {
    	return formatMinInvestAmount;
    }
    
    public void setFormatMinInvestAmount(String formatMinInvestAmount) {
    	this.formatMinInvestAmount = formatMinInvestAmount;
    }
    public Double getMinInvestUnits() {
        return minInvestUnits;
    }

    public void setMinInvestUnits(Double minInvestUnits) {
        this.minInvestUnits = minInvestUnits;
    }

    public Double getManagementFees() {
        return managementFees;
    }

    public void setManagementFees(Double managementFees) {
        this.managementFees = managementFees;
    }

    public Double getPerformanceFees() {
        return performanceFees;
    }

    public void setPerformanceFees(Double performanceFees) {
        this.performanceFees = performanceFees;
    }

    public String getHurdle() {
        return hurdle;
    }

    public void setHurdle(String hurdle) {
        this.hurdle = hurdle;
    }

    public String getRetrocessionTerms() {
        return retrocessionTerms;
    }

    public void setRetrocessionTerms(String retrocessionTerms) {
        this.retrocessionTerms = retrocessionTerms;
    }

    public Double getRetrocessionBps() {
        return retrocessionBps;
    }

    public void setRetrocessionBps(Double retrocessionBps) {
        this.retrocessionBps = retrocessionBps;
    }

    public String getFundNetExpenseRatio() {
        return fundNetExpenseRatio;
    }

    public void setFundNetExpenseRatio(String fundNetExpenseRatio) {
        this.fundNetExpenseRatio = fundNetExpenseRatio;
    }

    public String getOCF() {
        return OCF;
    }

    public void setOCF(String oCF) {
        OCF = oCF;
    }

    public String getISA() {
        return ISA;
    }

    public void setISA(String iSA) {
        ISA = iSA;
    }

    public String getRDR() {
        return RDR;
    }

    public void setRDR(String rDR) {
        RDR = rDR;
    }

    public String getUK() {
        return UK;
    }

    public void setUK(String uK) {
        UK = uK;
    }

    public String getGermanTax() {
        return germanTax;
    }

    public void setGermanTax(String germanTax) {
        this.germanTax = germanTax;
    }

    public String getRegisteredForSale() {
        return registeredForSale;
    }

    public void setRegisteredForSale(String registeredForSale) {
        this.registeredForSale = registeredForSale;
    }

    public Date getLastNavDate() {
        return lastNavDate;
    }

    public void setLastNavDate(Date lastNavDate) {
        this.lastNavDate = lastNavDate;
    }

    public double getLastNavUnit() {
        return this.lastNavUnit;
    }
    
    public void setLastNavUnit(double lastNavUnit) {
        this.lastNavUnit = lastNavUnit;
    }

    public Date getLastPanoDate() {
        return lastPanoDate;
    }

    public void setLastPanoDate(Date lastPanoDate) {
        this.lastPanoDate = lastPanoDate;
    }

    public Frequency getFundFrequency() {
        return fundFrequency;
    }

    public void setFundFrequency(Frequency fundFrequency) {
        this.fundFrequency = fundFrequency;
    }

    public String getFoliometricsId() {
        return foliometricsId;
    }

    public void setFoliometricsId(String foliometricsId) {
        this.foliometricsId = foliometricsId;
    }
    
    public MutualFund getFund() {
    	return fund;
    }
    
    public void setFund(MutualFund fund) {
    	this.fund = fund;
    }

	public boolean isRegisteredInCountries(List<String> countries) {
        if (registeredForSale == null || countries == null) {
            return false;
        }
        
        for (String country : countries)
            if (registeredForSale.contains(country)) {
                return true;
            }
        return false;
    }
}
