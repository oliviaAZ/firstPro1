package com.example.firstPro1.service.impl;

import com.example.firstPro1.domain.InMessage;
import com.example.firstPro1.domain.OUtMessage;
import com.example.firstPro1.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

// 相当于由Spring帮助开发者执行一个new，创建一个对象。
// 当需要使用的时候，可以直接用@Autowirdd注解，把对象注入到需要使用的地方。
@Service
public class MessageServiceImpl implements MessageService {

	private static final Logger LOG = LoggerFactory.getLogger(MessageServiceImpl.class);

	@Override
	public OUtMessage onMessage(InMessage msg) {
		LOG.trace("转换后的消息对象：\n{}\n", msg);
		return null;
	}
}
