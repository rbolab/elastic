package main.service;

import main.dao.MutualFundRepository;
import main.model.MutualFund;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sezin karli
 * @since 2/28/15 1:56 PM
 *        User: Sezin Karli
 */
@Service
public class MutualFundService {

    @Autowired
    private MutualFundRepository repository;

    public void addMutualFund(MutualFund mutualFund) {
        repository.save(mutualFund);
    }
}
