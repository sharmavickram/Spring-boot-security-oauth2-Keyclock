package com.example.oauth_resource.service;

import com.example.oauth_resource.entity.Board;

public interface IBoardService {
    Iterable<Board> findAll();
}
