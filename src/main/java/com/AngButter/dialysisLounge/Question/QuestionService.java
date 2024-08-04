package com.AngButter.dialysisLounge.Question;

import com.AngButter.dialysisLounge.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private  final  QuestionRepository questionRepository;

    //int 타입의 페이지 번호를 받아 해당 페이지 페이지 객체를 리턴한다.
    public Page<Question> getList(int page) {
        //page : 조회할 페이지 번호, 10 : 한 페이지에 보여줄 개수를 의미
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("createDate"));
        Pageable pageable = PageRequest.of(page, 4, Sort.by(sorts));
        return this.questionRepository.findAll(pageable);
    }


    public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else {
            throw new DataNotFoundException("question not found");
        }
    }

    //제목과 내용을 입력받아 이를 질문으로 저장하는 create 메서드 생성
    public void create(String subject, String content) {
        Question q = new Question();
        q.setSubject(subject);
        q.setContent(content);
        q.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q);
    }
}
