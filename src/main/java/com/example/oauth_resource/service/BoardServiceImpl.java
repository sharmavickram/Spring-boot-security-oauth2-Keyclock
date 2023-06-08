package com.example.oauth_resource.service;

import com.example.oauth_resource.entity.Board;
import com.example.oauth_resource.repository.IBoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements IBoardService {
    private final IBoardRepository boardRepository;

    public BoardServiceImpl(IBoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Iterable<Board> findAll() {
        return boardRepository.findAll();
    }
}
