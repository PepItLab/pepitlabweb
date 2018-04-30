package fr.ccva.pepitlab.service.impl;

import fr.ccva.pepitlab.dao.NewDao;
import fr.ccva.pepitlab.dto.NewDto;
import fr.ccva.pepitlab.model.New;
import fr.ccva.pepitlab.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewServiceImpl implements NewService {

    @Autowired
    private NewDao newDao;

    @Transactional(readOnly = true)
    @Override
    public List<NewDto> listNews() {
        List<New> news = newDao.getNews();
        List<NewDto> newsDto = new ArrayList<>();

        news.forEach(n -> {
            NewDto newDto = new NewDto(n);
            newsDto.add(newDto);
        });

        return newsDto;
    }
}
