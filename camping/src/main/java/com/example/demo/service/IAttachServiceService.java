package com.example.demo.service;

import com.example.demo.model.AttachService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IAttachServiceService {
    List<AttachService> findAll();


}
