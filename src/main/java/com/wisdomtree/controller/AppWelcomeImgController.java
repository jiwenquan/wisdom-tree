package com.wisdomtree.controller;

import com.wisdomtree.common.DataTableSearchCondition;
import com.wisdomtree.common.DataTableSearchResult;
import com.wisdomtree.service.AppWelcomeImgService;
import com.wisdomtree.vo.AppWelcomeImgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/8/16 14:35
 */
@RestController
@RequestMapping("/app/manage/welcome")
public class AppWelcomeImgController {

    @Autowired
    private AppWelcomeImgService appWelcomeImgService;

    @RequestMapping(value = "/pageAll", method = RequestMethod.POST)
    public DataTableSearchResult<AppWelcomeImgVo> searchWelcomeImgs(DataTableSearchCondition condition) {
        return this.appWelcomeImgService.searchWelcomeImgs(condition);
    }
}
