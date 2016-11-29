package main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@XmlRootElement
@Document(indexName = "amethyst", type = "mutualfund")
public class MutualFund {

    @Id
    private Integer computableId;
    @Field(type = FieldType.Nested)
    private Collection<MutualFundShare> shares = new ArrayList<MutualFundShare>();
    private String baseName;
    private String baseManager;
    private String baseManagerWebsite;
    private String analystsNames;
    private Integer financialRatio;
    private String fundBenchmark;
    private String fundCategory1;
    private String fundCategory2;
    private String fundCategory3;
    private String fundCategory4;
    private Double fundNetExpenseRatio;
    private String fundRating;
    private String peerIndex;
    private String provider;
    private String qfpFundObj;
    private String qfpStrategy;
    private String referencedCcy;
    private Date tenure;
    private Date tenureCoManager;
    private String valuationPoint;
    private String fundId;
    private String investmentRestriction;
    private String otherAvailableStructures;
    private String pricingFrequency;
    private String lyxorRanking;
    private String morningStarRating;
    private String jurisdiction;
    private String type;
    private String administrator;
    private String custodianTrustee;
    private String auditor;
    private String transferAgent;
    private String managementGroup;
    private String underlyingSubAdvisor;
    private String portfolioManager;
    private String currency;
    private String ucits;
    private String pea;
    private String eustdstatus;
    private String financialRatioMax;
    private String mifid;
    private String mainShareName;
    private String mainShareId;
    private Date dateOfInitiationOfCoverage;
    private String fundProvider;
    //FIXME MOCKED DATA TO BE REMOVED (LRE-5467)
    private String structureType = "";
    
    public Collection<MutualFundShare> getShares() {
        return shares;
    }

    public void setShares(Collection<MutualFundShare> shares) {
        this.shares = shares;
    }


    public Integer getComputableId() {
        return computableId;
    }

    public void setComputableId(Integer computableId) {
        this.computableId = computableId;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getBaseManager() {
        return baseManager;
    }

    public void setBaseManager(String baseManager) {
        this.baseManager = baseManager;
    }

    public String getAnalystsNames() {
        return analystsNames;
    }

    public void setAnalystsNames(String analystsNames) {
        this.analystsNames = analystsNames;
    }

    public Integer getFinancialRatio() {
        return financialRatio;
    }

    public void setFinancialRatio(Integer financialRatio) {
        this.financialRatio = financialRatio;
    }

    public String getFundBenchmark() {
        return fundBenchmark;
    }

    public void setFundBenchmark(String fundBenchmark) {
        this.fundBenchmark = fundBenchmark;
    }

    public String getFundCategory1() {
        return fundCategory1;
    }

    public void setFundCategory1(String fundCategory1) {
        this.fundCategory1 = fundCategory1;
    }

    public String getFundCategory2() {
        return fundCategory2;
    }

    public void setFundCategory2(String fundCategory2) {
        this.fundCategory2 = fundCategory2;
    }

    public String getFundCategory3() {
        return fundCategory3;
    }

    public void setFundCategory3(String fundCategory3) {
        this.fundCategory3 = fundCategory3;
    }

    public String getFundCategory4() {
        return fundCategory4;
    }

    public void setFundCategory4(String fundCategory4) {
        this.fundCategory4 = fundCategory4;
    }

    public Double getFundNetExpenseRatio() {
        return fundNetExpenseRatio;
    }

    public void setFundNetExpenseRatio(Double fundNetExpenseRatio) {
        this.fundNetExpenseRatio = fundNetExpenseRatio;
    }

    public String getFundRating() {
        return fundRating;
    }

    public void setFundRating(String fundRating) {
        this.fundRating = fundRating;
    }

    public String getPeerIndex() {
        return peerIndex;
    }

    public void setPeerIndex(String peerIndex) {
        this.peerIndex = peerIndex;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getQfpFundObj() {
        return qfpFundObj;
    }

    public void setQfpFundObj(String qfpFundObj) {
        this.qfpFundObj = qfpFundObj;
    }

    public String getQfpStrategy() {
        return qfpStrategy;
    }

    public void setQfpStrategy(String qfpStrategy) {
        this.qfpStrategy = qfpStrategy;
    }

    public String getReferencedCcy() {
        return referencedCcy;
    }

    public void setReferencedCcy(String referencedCcy) {
        this.referencedCcy = referencedCcy;
    }

    public Date getTenure() {
        return tenure;
    }

    public void setTenure(Date tenure) {
        this.tenure = tenure;
    }

    public Date getTenureCoManager() {
        return tenureCoManager;
    }

    public void setTenureCoManager(Date tenureCoManager) {
        this.tenureCoManager = tenureCoManager;
    }

    public String getValuationPoint() {
        return valuationPoint;
    }

    public void setValuationPoint(String valuationPoint) {
        this.valuationPoint = valuationPoint;
    }

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId;
    }

    public String getInvestmentRestriction() {
        return investmentRestriction;
    }

    public void setInvestmentRestriction(String investmentRestriction) {
        this.investmentRestriction = investmentRestriction;
    }

    public String getOtherAvailableStructures() {
        return otherAvailableStructures;
    }

    public void setOtherAvailableStructures(String otherAvailableStructures) {
        this.otherAvailableStructures = otherAvailableStructures;
    }

    public String getPricingFrequency() {
        return pricingFrequency;
    }

    public void setPricingFrequency(String pricingFrequency) {
        this.pricingFrequency = pricingFrequency;
    }

    public String getLyxorRanking() {
        return lyxorRanking;
    }

    public void setLyxorRanking(String lyxorRanking) {
        this.lyxorRanking = lyxorRanking;
    }

    public String getMorningStarRating() {
        return morningStarRating;
    }

    public void setMorningStarRating(String morningStarRating) {
        this.morningStarRating = morningStarRating;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getCustodianTrustee() {
        return custodianTrustee;
    }

    public void setCustodianTrustee(String custodianTrustee) {
        this.custodianTrustee = custodianTrustee;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getTransferAgent() {
        return transferAgent;
    }

    public void setTransferAgent(String transferAgent) {
        this.transferAgent = transferAgent;
    }

    public String getManagementGroup() {
        return managementGroup;
    }

    public void setManagementGroup(String managementGroup) {
        this.managementGroup = managementGroup;
    }

    public String getUnderlyingSubAdvisor() {
        return underlyingSubAdvisor;
    }

    public void setUnderlyingSubAdvisor(String underlyingSubAdvisor) {
        this.underlyingSubAdvisor = underlyingSubAdvisor;
    }

    public String getPortfolioManager() {
        return portfolioManager;
    }

    public void setPortfolioManager(String portfolioManager) {
        this.portfolioManager = portfolioManager;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getUcits() {
        return ucits;
    }

    public void setUcits(String ucits) {
        this.ucits = ucits;
    }

    public String getPea() {
        return pea;
    }

    public void setPea(String pea) {
        this.pea = pea;
    }

    public String getEustdstatus() {
        return eustdstatus;
    }

    public void setEustdstatus(String eustdstatus) {
        this.eustdstatus = eustdstatus;
    }

    public String getFinancialRatioMax() {
        return financialRatioMax;
    }

    public void setFinancialRatioMax(String financialRatioMax) {
        this.financialRatioMax = financialRatioMax;
    }

    public String getMifid() {
        return mifid;
    }

    public void setMifid(String mifid) {
        this.mifid = mifid;
    }

    public String getMainShareName() {
        return mainShareName;
    }

    public void setMainShareName(String mainShareName) {
        this.mainShareName = mainShareName;
    }

    public Date getDateOfInitiationOfCoverage() {
        return dateOfInitiationOfCoverage;
    }

    public void setDateOfInitiationOfCoverage(Date dateOfInitiationOfCoverage) {
        this.dateOfInitiationOfCoverage = dateOfInitiationOfCoverage;
    }

    public String getMainShareId() {
        return mainShareId;
    }

    public void setMainShareId(String mainShareId) {
        this.mainShareId = mainShareId;
    }

    public String getFundProvider() {
        return fundProvider;
    }

    public void setFundProvider(String fundProvider) {
        this.fundProvider = fundProvider;
    }
    
    public String getBaseManagerWebsite() {
		return baseManagerWebsite;
	}

	public void setBaseManagerWebsite(String baseManagerWebsite) {
		this.baseManagerWebsite = baseManagerWebsite;
	}

    public String getStructureType() {
		return structureType;
	}

	public void setStructureType(String structureType) {
		this.structureType = structureType;
	}

	public boolean isInJuridiction(List<String> juridictions) {
        if (juridictions == null || jurisdiction == null) {
            return false;
        }
        
        for (String country : juridictions)
            if (jurisdiction.contains(country)) {
                return true;
            }
        return false;
    }
}
