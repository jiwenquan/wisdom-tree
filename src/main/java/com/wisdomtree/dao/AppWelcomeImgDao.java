package com.wisdomtree.dao;

import com.wisdomtree.common.DataTableSearchCondition;
import com.wisdomtree.dto.AppWelcomeImgDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/8/16 13:45
 */
@Repository
public interface AppWelcomeImgDao {
    List<AppWelcomeImgDTO> selectAll(DataTableSearchCondition condition);

    int countAll(DataTableSearchCondition condition);
}
