package com.wisdomtree.service.impl;

import com.wisdomtree.common.DataTableSearchCondition;
import com.wisdomtree.common.DataTableSearchResult;
import com.wisdomtree.dao.AppWelcomeImgDao;
import com.wisdomtree.dto.AppWelcomeImgDTO;
import com.wisdomtree.service.AppWelcomeImgService;
import com.wisdomtree.vo.AppWelcomeImgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/8/16 14:22
 */
@Service
public class AppWelcomeImgServiceImpl implements AppWelcomeImgService {

    @Autowired
    private AppWelcomeImgDao appWelcomeImgDao;

    @Override
    public DataTableSearchResult<AppWelcomeImgVo> searchWelcomeImgs(DataTableSearchCondition condition) {
        DataTableSearchResult<AppWelcomeImgVo> result = new DataTableSearchResult();
        int recordsTotal = this.appWelcomeImgDao.countAll(condition);
        result.setRecordsTotal(recordsTotal);
        result.setRecordsFiltered(recordsTotal);
        List<AppWelcomeImgDTO> dtoList = this.appWelcomeImgDao.selectAll(condition);
        List<AppWelcomeImgVo> voList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(dtoList)) {
            for (AppWelcomeImgDTO appWelcomeImgDTO : dtoList) {
                voList.add(this.buildDtoToVo(appWelcomeImgDTO));
            }
            result.setData(voList);
        }
        return result;
    }

    private AppWelcomeImgVo buildDtoToVo(AppWelcomeImgDTO appWelcomeImgDTO) {
        if (null == appWelcomeImgDTO) {
            return null;
        }
        AppWelcomeImgVo appWelcomeImgVo = new AppWelcomeImgVo();
        appWelcomeImgVo.setSummary(appWelcomeImgDTO.getSummary());
        appWelcomeImgVo.setImgPath(appWelcomeImgDTO.getImgPath());
        appWelcomeImgVo.setDelFlag(appWelcomeImgDTO.getDelFlag());
        appWelcomeImgVo.setCreated(appWelcomeImgDTO.getCreated());
        appWelcomeImgVo.setUpdated(appWelcomeImgDTO.getUpdated());
        return appWelcomeImgVo;
    }
}
