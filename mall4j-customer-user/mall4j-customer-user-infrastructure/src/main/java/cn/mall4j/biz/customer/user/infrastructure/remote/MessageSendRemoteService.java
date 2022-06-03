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

package cn.mall4j.biz.customer.user.infrastructure.remote;

import cn.mall4j.biz.customer.user.infrastructure.remote.dto.MailSendRemoteCommand;
import cn.mall4j.springboot.starter.convention.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 消息发送远程服务调用
 *
 * @author chen.ma
 * @github https://github.com/mabaiwan
 */
@FeignClient("mall4j-message")
public interface MessageSendRemoteService {
    
    /**
     * 邮箱消息发送
     */
    @PostMapping("/api/mall4j-message/message/send/mail")
    Result<Void> mailMessageSend(@RequestBody MailSendRemoteCommand mailSendRemoteCommand);
}
