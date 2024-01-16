package com.app1.service;

import com.app1.domain.Notice;

import java.util.List;

public interface NoticeService {
    public List<Notice> noticeList();
    public Notice getNotice(Integer no);
    public int insertNotice(Notice notice);
    public int updateNotice(Notice notice);
    public int deleteNotice(Integer no);
    public int visitCount(Integer no);
}
