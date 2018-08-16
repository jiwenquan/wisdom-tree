package com.wisdomtree.service;

import com.wisdomtree.common.DataTableSearchCondition;
import com.wisdomtree.common.DataTableSearchResult;
import com.wisdomtree.vo.AppWelcomeImgVo;
import org.springframework.stereotype.Service;

/**
 *
 * @author jiwenquan
 * @create 2018/8/16 14:16
 */
public interface AppWelcomeImgService {

    public DataTableSearchResult<AppWelcomeImgVo> searchWelcomeImgs(DataTableSearchCondition condition);
}
