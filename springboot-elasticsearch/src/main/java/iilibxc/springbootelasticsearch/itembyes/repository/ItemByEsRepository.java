package iilibxc.springbootelasticsearch.itembyes.repository;

import iilibxc.springbootelasticsearch.common.repository.CommonRepository;
import iilibxc.springbootelasticsearch.itembyes.pojo.ItemByEs;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemByEsRepository extends CommonRepository<ItemByEs, String> {
}
