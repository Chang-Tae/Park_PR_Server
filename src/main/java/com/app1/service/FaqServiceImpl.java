package com.app1.service;

import com.app1.domain.Faq;
import com.app1.mapper.FaqMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqServiceImpl implements FaqService{
    @Autowired
    private FaqMapper faqMapper;

    @Override
    public List<Faq> faqList() throws Exception {
        return faqMapper.faqList();
    }
}
