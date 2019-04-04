package com.example.firstPro1.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// 接收到信息
@XmlRootElement(name = "xml") // 指定XML的根元素名称
@XmlAccessorType(XmlAccessType.FIELD) // 指定属性的访问方式为字段
public abstract class InMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "ToUserName")
	private String toUserName;

	@XmlElement(name = "FromUserName")
	private String fromUserName;

	@XmlElement(name = "CreateTime")
	private Long createTime;

	@XmlElement(name = "MsgType")
	private String msgType;

	@XmlElement(name = "MsgId")
	private Long msgId;

	// 提供一个有参的构造器，要求必须有消息类型传入
	protected InMessage(String type) {
		this.msgType = type;
	}

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
}
