package com.bitstudy.board.repository;

import com.bitstudy.board.domain.Article;
import com.bitstudy.board.domain.QArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Ex05_1_ArticleRepository_검색기능 extends
        JpaRepository<Article, Long>
        , QuerydslPredicateExecutor<Article> /* 얘만 있어도 검색은 됨. 정확한 검색만 가능*/
      //  , QuerydslBinderCustomizer<QArticle> /* like 검색 */
    
    /*  QuerydslPredicateExecutor 는 기본적으로 Article 안에 있는 모든 필드에 대한 기본 검색 기능을 추가해줌. (이거만 있어도 검색은 가능함)

    
     */
{
}
