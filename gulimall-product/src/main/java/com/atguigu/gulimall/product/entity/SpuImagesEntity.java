package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuͼƬ
 * 
 * @author deng_you_ping
 * @email 971572657@qq.com
 * @date 2021-05-27 22:48:19
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ͼƬ??
	 */
	private String imgName;
	/**
	 * ͼƬ??ַ
	 */
	private String imgUrl;
	/**
	 * ˳?
	 */
	private Integer imgSort;
	/**
	 * ?Ƿ?Ĭ??ͼ
	 */
	private Integer defaultImg;

}
