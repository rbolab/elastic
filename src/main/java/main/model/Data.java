package main.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by rbouzoua091916 on 29/11/2016.
 */
@XmlRootElement
public class Data {
    private List<MutualFund> mutualFunds;


    public List<MutualFund> getMutualFunds() {
        return mutualFunds;
    }

    public void setMutualFunds(List<MutualFund> mutualFunds) {
        this.mutualFunds = mutualFunds;
    }
}
