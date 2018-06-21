package com.staging.frame.web.model;


import com.staging.frame.web.annotation.Column;
import com.staging.frame.web.annotation.Table;
import com.staging.frame.web.constants.MySqlTypeConstant;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Created by Li B.
 * @date Created in 2018/6/15.
 */
@Data
@Table(name = "test_a_c_table")
public class TestModel extends BaseModel implements Serializable{
    private static final long serialVersionUID = -1777382647100858274L;

    public TestModel(){
        super();
    }

    @Column(name = "column_one",type = MySqlTypeConstant.VARCHAR)
    private String columnOne;
    @Column(name = "column_two",type = MySqlTypeConstant.VARCHAR)
    private String columnTwo;
    @Column(name = "column_three",type = MySqlTypeConstant.VARCHAR)
    private String columnThree;

}
