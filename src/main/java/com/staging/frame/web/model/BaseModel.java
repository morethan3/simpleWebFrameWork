package com.staging.frame.web.model;

import com.staging.frame.web.annotation.Column;
import com.staging.frame.web.constants.MySqlTypeConstant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 表必备字段
 *
 * @author Created by Li B.
 * @date Created in 2018/6/15.
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
class BaseModel implements Serializable {
    private static final long serialVersionUID = -7137339599444177396L;

    /**
     * 主ID
     */
    @Column(name = "key-id",type = MySqlTypeConstant.VARCHAR)
    private String keyId;

    /**
     * 创建时间
     */
    @Column(name = "create_date",type = MySqlTypeConstant.DATETIME)
    private Date createDate;
    /**
     * 创建人
     */
    @Column(name = "create_user",type = MySqlTypeConstant.VARCHAR)
    private String createUser;

    /**
     * 修改时间
     */
    @Column(name = "modify_date",type = MySqlTypeConstant.DATETIME)
    private Date modifyDate;
    /**
     * 修改人
     */
    @Column(name = "modify_user",type = MySqlTypeConstant.VARCHAR)
    private String modifyUser;

}
