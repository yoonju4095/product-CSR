package com.kh.product.svc;

import com.kh.product.dao.Product;

import java.util.List;
import java.util.Optional;

public interface ProductSVC {
  //등록
  Long save(Product product);
  //조회;
  Optional<Product> findById(Long pid);
  //수정
  int update(Long pid,Product product);
  //삭제
  int delete(Long pid);
  /**
   * 부분삭제
   * @param pids
   * @return
   */
  int deleteParts(List<Long> pids);
  //목록
  List<Product> findAll();
  /**
   * 상품존재유무
   * @param pid 상품아이디
   * @return
   */
  boolean isExist(Long pid);
}
