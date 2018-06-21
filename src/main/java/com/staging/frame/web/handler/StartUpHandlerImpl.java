package com.staging.frame.web.handler;

import com.staging.frame.web.manager.SysMysqlCreateTableManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;




/**
 * 该类来自ACTable，为自动创建表的起点
 * 启动时进行处理的实现类
 * @author Li
 *
 */
@SuppressWarnings("restriction")
@Service
@Slf4j
public class StartUpHandlerImpl{

	@Autowired
	private SysMysqlCreateTableManager sysMysqlCreateTableManager;

	@PostConstruct
	public void startHandler() {
			log.info("databaseType=mysql，开始执行mysql的处理方法");
			sysMysqlCreateTableManager.createMysqlTable();
	}
}
