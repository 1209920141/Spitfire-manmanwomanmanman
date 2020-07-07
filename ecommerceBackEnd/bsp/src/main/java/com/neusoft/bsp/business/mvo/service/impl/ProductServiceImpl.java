package com.neusoft.bsp.business.mvo.service.impl;

import com.neusoft.bsp.business.mvo.service.ManufacturerService;
import com.neusoft.bsp.business.vo.ProductVO;
import com.neusoft.bsp.common.exception.BusinessException;
import com.neusoft.bsp.business.po.Product;
import com.neusoft.bsp.business.mvo.mapper.ProductMapper;
import com.neusoft.bsp.business.mvo.service.ProductService;
import com.neusoft.bsp.admin.user.po.User;
import com.neusoft.bsp.admin.user.service.UserService;
import com.neusoft.bsp.utils.FileNameUtils;
import com.neusoft.bsp.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Autowired
    UserService userService;
    @Autowired
    ManufacturerService manufacturerService;

    @Override
    public int insert(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public int update(Product product) {
        return productMapper.update(product);
    }

    @Override
    public int delete(int pk) {
        return productMapper.delete(pk);
    }

    @Override
    public List<Product> getAll() {
        return productMapper.getAll();
    }

    @Override
    public List<Product> getAllByFilter(Map<String, Object> map) {

        return productMapper.getAllByFilter(map);
    }

    @Override
    public List<Product> getProducts(User user) {
        int man_id = userService.getById(user.getUser_id()).getMan_buyer_id();
        if(man_id==0){
            throw BusinessException.NO_MAN_ID;
        }

        Map<String, Object> para= new HashMap<>();
        para.put("man_id", man_id);
        List<Product> products = getAllByFilter(para);
        if(products.size()==0){
            return null;
        }
        return products;
    }

    @Override
    public int addProduct(ProductVO productvo, MultipartFile file) {
        // 要上传的目标文件存放路径
//        String localPath = "src/main/resources/static/upload";
        String localPath = "E:/Develop/Files/Photos";
        // 上传成功或者失败的提示
//        ClassPathResource classPathResource = new ClassPathResource("static/upload");
//        InputStream inputStream = classPathResource.getInputStream();

        String fileName = FileNameUtils.getFileName(file.getOriginalFilename());
        long time = System.currentTimeMillis();
        Date date = new java.sql.Date(time);
        Product product = new Product(productvo);
//        System.out.println("INFOPRODUCT"+product.getWarranty());
        if (FileUtils.upload(file, localPath, fileName)){
            String realPath = localPath + "/" + fileName;
            product.setRemark(realPath);
            product.setCreation_date(date);
            product.setLast_update_date(date);

            User user = userService.getById(productvo.getUser_id());
            product.setCreated_by(user.getUsername());
            product.setLast_update_by(user.getUsername());
            product.setMan_id(user.getMan_buyer_id());

//            product.setS
//            product.setCreated_by();
            insert(product);
            return 1;
        }
        return 0;
    }

    @Override
    public int updateProduct(ProductVO productvo, MultipartFile file) {
//        String localPath = "src/main/resources/static/upload";
        String localPath = "E:/Develop/Files/Photos";
        String fileName = FileNameUtils.getFileName(file.getOriginalFilename());

        Product product = new Product(productvo);

        if (FileUtils.upload(file, localPath, fileName)){
            String realPath = localPath + "/" + fileName;
            product.setRemark(realPath);
            //设置时间
            long time = System.currentTimeMillis();
            Date date = new java.sql.Date(time);
            product.setCreation_date(date);
            product.setLast_update_date(date);

            User user = userService.getById(productvo.getUser_id());
            product.setLast_update_by(user.getUsername());
            product.setMan_id(user.getMan_buyer_id());
            update(product);
            return 1;
        }else {
            return 0;

        }
    }

    @Override
    public int deleteProduct(Product product) {
        delete(product.getPro_id());
        return 1;
    }
}
