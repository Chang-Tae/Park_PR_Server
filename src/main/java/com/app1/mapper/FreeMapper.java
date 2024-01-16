package com.app1.mapper;

import com.app1.domain.Free;
import com.app1.domain.FreeComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FreeMapper {

    List<Free> freeList();
    Free getFree(Integer no);
    int insertFree(Free free);
    int updateFree(Free free);
    int deleteFree(Integer no);
    int visitCount(Integer no);

    // 자유게시판 댓글
    List<FreeComment> commentList();
    FreeComment getFreeComment(Integer no);
    int insertFreeComment(FreeComment freeComment);
    int updateFreeComment(FreeComment freeComment);
    int deleteFreeComment(Integer no);
}
