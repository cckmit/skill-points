package iilibxc.springbootelasticsearch.itembyes.service;

import iilibxc.springbootelasticsearch.common.pojo.PageInfo;
import iilibxc.springbootelasticsearch.common.pojo.Result;
import iilibxc.springbootelasticsearch.common.service.CommonService;
import iilibxc.springbootelasticsearch.itembyes.pojo.ItemByEs;
import iilibxc.springbootelasticsearch.itembyes.vo.ItemByEsVo;

public interface ItemByEsService  extends CommonService<ItemByEsVo,ItemByEs, String> {

    Result<PageInfo<ItemByEsVo>> searchByNative(ItemByEsVo itemByEsVo);
}
