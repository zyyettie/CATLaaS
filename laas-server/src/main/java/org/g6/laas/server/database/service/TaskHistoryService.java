package org.g6.laas.server.database.service;

import org.g6.laas.server.database.repository.ITaskHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TaskHistoryService {
    @Autowired
    private ITaskHistoryRepository taskRepo;


}
