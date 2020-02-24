package com.lsc.blog.service;

import com.lsc.blog.po.Comment;

import java.util.List;

/**
 * @Description
 * @auther ValarMorghulis
 * @create 2020-01-19 15:14
 **/
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);

}
