package com.account.account.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 陈孟飞
 * @date 2020/5/18
 */
@Data
@Entity
@Table(name = "t_account")
@org.hibernate.annotations.Table(appliesTo = "t_account",comment = "用户资产表")
//@GenericGenerator(name = "uuid",strategy = "uuid")
public class TAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id", columnDefinition="int(9) COMMENT '用户id'")
    private Long userId;

    @Column(name = "money", columnDefinition="double(11,2) COMMENT '用户余额'")
    private Double money;
}
