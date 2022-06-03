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

package cn.mall4j.biz.message.domain.repository;

import cn.mall4j.biz.message.domain.entity.MessageSend;

/**
 * 消息发送仓储层
 *
 * @author chen.ma
 * @github https://github.com/mabaiwan
 */
public interface MessageSendRepository {
    
    /**
     * 邮箱消息发送
     *
     * @param messageSend
     * @return
     */
    void mailMessageSave(MessageSend messageSend);
}
