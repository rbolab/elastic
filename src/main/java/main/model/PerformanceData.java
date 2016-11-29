package main.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PerformanceData {
    protected Double annualizedReturnSI;
    protected Double sharpeRatio;
    protected Double maxDrawdown;
    protected Double volatility;
    protected Double volatility1Year;
    protected Double perfWeekly;
    protected Double perfMTD;
    protected Double perfYTD;
    protected Double perf3months;
    protected Double perf6months;
    protected Double perf12months;
    protected Double perf3years;
    protected Double perf5years;
    protected Double perfSI;
    
    public Double getAnnualizedReturnSI() {
        return annualizedReturnSI;
    }
    public void setAnnualizedReturnSI(Double annualizedReturnSI) {
        this.annualizedReturnSI = annualizedReturnSI;
    }
    public Double getSharpeRatio() {
        return sharpeRatio;
    }
    public void setSharpeRatio(Double sharpeRatio) {
        this.sharpeRatio = sharpeRatio;
    }
    public Double getMaxDrawdown() {
        return maxDrawdown;
    }
    public void setMaxDrawdown(Double maxDrawdown) {
        this.maxDrawdown = maxDrawdown;
    }
    public Double getVolatility() {
        return volatility;
    }
    public void setVolatility(Double volatility) {
        this.volatility = volatility;
    }
    public Double getPerfWeekly() {
        return perfWeekly;
    }
    public void setPerfWeekly(Double perfWeekly) {
        this.perfWeekly = perfWeekly;
    }
    public Double getPerfMTD() {
        return perfMTD;
    }
    public void setPerfMTD(Double perfMTD) {
        this.perfMTD = perfMTD;
    }
    public Double getPerfYTD() {
        return perfYTD;
    }
    public void setPerfYTD(Double perfYTD) {
        this.perfYTD = perfYTD;
    }
    public Double getPerf3months() {
        return perf3months;
    }
    public void setPerf3months(Double perf3months) {
        this.perf3months = perf3months;
    }
    public Double getPerf6months() {
        return perf6months;
    }
    public void setPerf6months(Double perf6months) {
        this.perf6months = perf6months;
    }
    public Double getPerf12months() {
        return perf12months;
    }
    public void setPerf12months(Double perf12months) {
        this.perf12months = perf12months;
    }
    public Double getPerf3years() {
        return perf3years;
    }
    public void setPerf3years(Double perf3years) {
        this.perf3years = perf3years;
    }
    public Double getPerf5years() {
        return perf5years;
    }
    public void setPerf5years(Double perf5years) {
        this.perf5years = perf5years;
    }
    public Double getPerfSI() {
        return perfSI;
    }
    public void setPerfSI(Double perfSI) {
        this.perfSI = perfSI;
    }
	public Double getVolatility1Year() {
		return volatility1Year;
	}
	public void setVolatility1Year(Double volatility1Year) {
		this.volatility1Year = volatility1Year;
	}
    
}
