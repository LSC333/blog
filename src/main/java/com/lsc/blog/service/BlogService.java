package com.lsc.blog.service;

import com.lsc.blog.po.Blog;
import com.lsc.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @auther ValarMorghulis
 * @create 2020-01-17 10:14
 **/
public interface BlogService {

    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);

    Page<Blog> listBlog(Pageable pageable);

    List<Blog> listRecommendBlogTop(Integer size);

    Page<Blog> listBlog(String query, Pageable pageable);

    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Long tagId, Pageable pageable);

    Map<String, List<Blog>> archiveBlog();

    Long countBlog();

}
