package com.product.product.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 陈孟飞
 * @date 2020/5/19
 */
@Data
@Entity
@Table(name = "t_product")
@org.hibernate.annotations.Table(appliesTo = "t_product",comment = "产品库存表")
public class TProduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", columnDefinition="varchar(100) COMMENT '产品名称'")
    private String name;

    @Column(name = "num", columnDefinition="int(9) COMMENT '库存数'")
    private Integer num;
}
