package com.xd.pre.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Classname UserDto
 * @Description 菜单Dto
 * @Author 李号东 lihaodongmail@163.com
 * @Date 2019-04-23 21:26
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MenuDto {

    private static final long serialVersionUID = 1L;

    private Integer menuId;
    private String name;
    private String perms;
    private String url;
    private Boolean isFrame;
    private Integer parentId;
    private String component;
    private String icon;
    private Integer sort;
    private Integer type;
    private String delFlag;

}
