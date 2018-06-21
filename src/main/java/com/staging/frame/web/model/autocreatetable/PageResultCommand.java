package com.staging.frame.web.model.autocreatetable;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class PageResultCommand<T> implements Serializable{
	
	private static final long serialVersionUID = -8251489884049418166L;
	
	private Integer draw;
	private Integer recordsTotal;
	private Integer recordsFiltered;

	private List<T> data;


}
