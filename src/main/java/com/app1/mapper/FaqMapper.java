package com.app1.mapper;

import com.app1.domain.Faq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FaqMapper {
    List<Faq> faqList() throws Exception;
}
