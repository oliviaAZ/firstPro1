package com.example.firstPro1.service;

import com.example.firstPro1.domain.InMessage;
import com.example.firstPro1.domain.OUtMessage;

public interface MessageService {

	OUtMessage onMessage(InMessage msg);
}
