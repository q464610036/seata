package com.order.order.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 陈孟飞
 * @date 2020/5/18
 */
@Data
@Entity
@Table(name = "t_order")
@org.hibernate.annotations.Table(appliesTo = "t_order",comment = "订单表")
//@GenericGenerator(name = "uuid",strategy = "uuid")
public class TOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id", columnDefinition="bigint(20) COMMENT '用户id'")
    private Long userId;

    @Column(name = "money", columnDefinition="double(11,2) COMMENT '金额'")
    private Double money;

    @Column(name = "order_no", columnDefinition="varchar(32) COMMENT '订单号'")
    private String orderNo;

    @Column(name = "order_name", columnDefinition="varchar(50) COMMENT '订单名称'")
    private String orderName;

    @Column(name = "product_id", columnDefinition="bigint(20) COMMENT '产品id'")
    private Long productId;

    @Column(name = "num", columnDefinition="int(9) COMMENT '购买数量'")
    private Integer num;

    @Column(name = "status", columnDefinition="int(2) COMMENT '订单状态(0:未付款,1:已付款,2:已发货,-1:订单取消)'")
    private Integer status;

    @Column(name = "createTime", columnDefinition="datetime COMMENT '创建时间'")
    private Date createTime;

    @Column(name = "updateTime", columnDefinition="datetime COMMENT '修改时间'")
    private Date updateTime;
}
