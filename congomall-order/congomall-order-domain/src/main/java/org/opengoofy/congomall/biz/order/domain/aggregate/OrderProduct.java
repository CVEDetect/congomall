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

package org.opengoofy.congomall.biz.order.domain.aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.opengoofy.congomall.ddd.framework.core.domain.Entity;

import java.math.BigDecimal;

/**
 * 订单商品
 *
 * @author chen.ma
 * @github https://github.com/opengoofy
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OrderProduct implements Entity {
    
    /**
     * 订单id
     */
    private Long orderId;
    
    /**
     * 订单编号
     */
    private String orderSn;
    
    /**
     * 商品id
     */
    private Long productSkuId;
    
    /**
     * 商品图
     */
    private String productPic;
    
    /**
     * 商品名称
     */
    private String productName;
    
    /**
     * 商品品牌
     */
    private String productBrand;
    
    /**
     * 商品价格
     */
    private BigDecimal productPrice;
    
    /**
     * 商品购买数量
     */
    private Integer productQuantity;
    
    /**
     * 规格，json 格式
     */
    private String productAttribute;
}