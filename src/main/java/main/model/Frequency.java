package main.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Fréquence de publication de Nav shortname étant l'itinitiale, longName étant
 * le nom complet, id étant le l'id en base.
 * 
 * @author ngobau050510
 * 
 */
@XmlEnum
public enum Frequency {

	@XmlEnumValue("daily") DAILY("d", "daily", 1, 252, 547, 1),
    //
    @XmlEnumValue("daily-estimated") DAILY_ESTIMATED("d", "daily-estimated", 11, 252, 547, 1),
    //
	@XmlEnumValue("weekly") WEEKLY("w", "weekly", 2, 52, 549, 7),
    //
	@XmlEnumValue("monthly") MONTHLY("m", "monthly", 3, 12, 553, 30),
    //
    @XmlEnumValue("yearly") YEARLY("y", "yearly", 4, 1, 560, 365),
    //
    @XmlEnumValue("monthly-estimated") MONTHLY_ESTIMATED("e", "monthly-estimated", 5, 12, 561, null),
    //
    @XmlEnumValue("official") OFFICIAL("o", "official", 6, 12, null, null),
    //
    @XmlEnumValue("quarterly") QUARTERLY("q", "quarterly", 7, 4, null, null),
    //
    @XmlEnumValue("bi-monthly") BI_MONTHLY("b", "bi-monthly", 8, 24, 555, 15),
    //
    @XmlEnumValue("weekly-eom") WEEKLY_END_OF_MONTH("e", "weekly-eom", 9, 52, 562, 7),
    //
    @XmlEnumValue("weekly-fake") WEEKLY_FAKE("f", "weekly-fake", 10, 52, 549, 7);

	private final String shortName;
    private final String longName;
    private final int id;
    private final Integer annualizedFactor;
    private final Integer periodicityId;
    private final Integer daysInPeriod;

    private Frequency(String shortName, String longName, int id, Integer annualizedFactor, Integer periodicityId, Integer daysInPeriod) {
        this.shortName = shortName;
        this.longName = longName;
        this.id = id;
        this.annualizedFactor = annualizedFactor;
        this.periodicityId = periodicityId;
        this.daysInPeriod = daysInPeriod;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public int getId() {
        return id;
    }

    public Integer getPeriodicityId() {
        return periodicityId;
    }

    /**
     * @return the annualizedFactor
     */
    public Integer getAnnualizedFactor() {
        return annualizedFactor;
    }

    public boolean isGreaterThan(Frequency other) {
        if (other == null) {
            return true;
        }
        return getAnnualizedFactor() < other.getAnnualizedFactor();
    }
    
    public boolean isSmallerThan(Frequency other) {
        if (other == null) {
            return true;
        }
        return getAnnualizedFactor() > other.getAnnualizedFactor();
    }
    
    public Integer getDaysInPeriod() {
        return daysInPeriod;
    }

    public static Frequency fromLongName(String value) {
        for (Frequency f: Frequency.values()) {
            if (f.getLongName().equalsIgnoreCase(value)) {
                return f;
            }
        }
        return null;
    }
    
    public static Frequency fromId(Integer id){
        if(id != null){
            for (Frequency f: Frequency.values()) {
                if (f.getId() == id) {
                    return f;
                }
            }
        }
        return null;
    }
    
    public static Frequency fromPeriodicityId(Integer id){
        if(id != null){
            for (Frequency f: Frequency.values()) {
                if ((f.getPeriodicityId() != null) && (f.getPeriodicityId().intValue() == id)) {
                    return f;
                }
            }
        }
        return null;
    }
}
