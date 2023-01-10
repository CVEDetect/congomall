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

package org.opengoofy.congomall.biz.order.application.filter.base;

import org.opengoofy.congomall.biz.order.application.enums.OrderChainMarkEnum;
import org.opengoofy.congomall.biz.order.application.req.OrderCreateCommand;
import org.opengoofy.congomall.springboot.starter.design.pattern.chain.AbstractChainHandler;

/**
 * 订单创建责任链过滤器
 *
 * @author chen.ma
 * @github https://github.com/opengoofy
 */
public interface OrderCreateChainFilter<T extends OrderCreateCommand> extends AbstractChainHandler<OrderCreateCommand> {
    
    @Override
    default String mark() {
        return OrderChainMarkEnum.ORDER_CREATE_FILTER.name();
    }
}