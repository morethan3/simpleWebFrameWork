package com.staging.frame.web.model.autocreatetable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
public class SaveOrUpdateDataCommand {

	private Integer id;

	private Map<Object, Map<Object, Object>> tableMap;

	
	public SaveOrUpdateDataCommand(Map<Object, Map<Object, Object>> tableMap){
		this.tableMap = tableMap;
	}



}


