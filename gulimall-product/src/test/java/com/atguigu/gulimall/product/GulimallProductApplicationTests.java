package com.atguigu.gulimall.product;

import com.aliyun.oss.OSSClient;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {
    @Autowired
    OSSClient ossClient ;
    @Test
    public void testUpload() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\img\\user-3.jpg");
// 填写Bucket名称和Object完整路径。Object完整路径中不能包含Bucket名称。
        ossClient.putObject("gulimall-station", "user-3.jpg", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传成功");
    }
//    @Autowired
//    BrandService brandService ;
//    @Test
//    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("huawei");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity) ;
//        System.out.println("保存成功。。。");
//    }
//    @Test
//    void contextLoads2() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1l);
//        brandEntity.setDescript("华为手机");
//        brandService.updateById(brandEntity) ;
//        System.out.println("修改成功。。。");
//    }
//    @Test
//    void select() {
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l));
//        list.forEach(brandEntity -> {
//            System.out.println(brandEntity);
//        });
//    }

}
