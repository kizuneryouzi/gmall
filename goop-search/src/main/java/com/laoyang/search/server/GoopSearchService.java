package com.laoyang.search.server;

import com.laoyang.search.vo.SearchParams;
import com.laoyang.search.vo.SearchResult;
import org.elasticsearch.action.search.SearchRequest;

/**
 * @author yyy
 * @Date 2020-06-28 19:12
 * @Email yangyouyuhd@163.com
 * @Note  对搜索条件与ES交互
 */
public interface GoopSearchService {


    /**
     * 根据前台搜索条件、检索ES、返回检索结果
     * @param params
     * @return
     */
    SearchResult searchParams(SearchParams params);
}
