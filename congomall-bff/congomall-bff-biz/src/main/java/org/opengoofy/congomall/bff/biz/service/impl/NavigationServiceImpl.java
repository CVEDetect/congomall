/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opengoofy.congomall.bff.biz.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.opengoofy.congomall.bff.biz.assembler.NavigationAssembler;
import org.opengoofy.congomall.bff.biz.dao.entity.NavigationDO;
import org.opengoofy.congomall.bff.biz.dao.mapper.NavigationMapper;
import org.opengoofy.congomall.bff.biz.dto.req.NavigationReqDTO;
import org.opengoofy.congomall.bff.biz.dto.resp.NavigationRespDTO;
import org.opengoofy.congomall.bff.biz.dto.resp.adapter.NavigationAdapterRespDTO;
import org.opengoofy.congomall.bff.biz.service.NavigationService;
import org.opengoofy.congomall.springboot.starter.common.toolkit.BeanUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 导航栏接口实现
 *
 * @author chen.ma
 * @github <a href="https://github.com/opengoofy" />
 * @公众号 马丁玩编程，关注回复：资料，领取后端技术专家成长手册
 */
@Service
@RequiredArgsConstructor
public class NavigationServiceImpl implements NavigationService {
    
    private final NavigationMapper navigationMapper;
    private final NavigationAssembler navigationAssembler;
    
    @Override
    public List<NavigationAdapterRespDTO> listAllNavigation() {
        List<NavigationDO> navigationDOList = navigationMapper.selectList(Wrappers.emptyWrapper());
        List<NavigationRespDTO> navigationRespDTOList = BeanUtil.convert(navigationDOList, NavigationRespDTO.class);
        return navigationAssembler.convert(navigationRespDTOList);
    }
    
    @Override
    public void saveNavigation(NavigationReqDTO requestParam) {
        navigationMapper.insert(BeanUtil.convert(requestParam, NavigationDO.class));
    }
    
    @Override
    public void updateNavigation(NavigationReqDTO requestParam) {
        navigationMapper.updateById(BeanUtil.convert(requestParam, NavigationDO.class));
    }
    
    @Override
    public void deleteNavigation(Integer id) {
        navigationMapper.deleteById(id);
    }
}
