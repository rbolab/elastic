package main.dao;

import main.model.MutualFund;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author sezin karli
 * @since 2/28/15 1:56 PM
 *        User: Sezin Karli
 */
public interface MutualFundRepository extends ElasticsearchRepository<MutualFund, Integer> {
}
