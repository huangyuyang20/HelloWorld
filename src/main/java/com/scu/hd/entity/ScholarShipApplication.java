package com.scu.hd.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-26-17:36
 */
@Data
public class ScholarShipApplication {
    Integer schoAppId;

    Integer stuId;

    String schoPersonnalStmt;

    Integer schoApprove;

    Date schoApprovetime;

    Date schoSubmittime;

}
