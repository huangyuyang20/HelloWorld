package com.scu.hd.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhong songzhi
 * @create 2019-06-26-17:21
 */
@Data
public class SchloarShip {
    Integer scholarShipId;

    String shoName;

    Integer schoTime;

    Integer schoMoney;

    Integer schoQuota;

    Date schoStartTime;

    Date schoDeadline;

}
