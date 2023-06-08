package com.example.oauth_resource.repository;

import com.example.oauth_resource.entity.Board;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBoardRepository extends PagingAndSortingRepository<Board, Long> {
}
