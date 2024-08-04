package com.AngButter.dialysisLounge.Question;

import com.AngButter.dialysisLounge.Answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id; //고유 번호

    @Column(length = 200)
    private String subject; //제목

    @Column(columnDefinition = "TEXT")
    private String content; // 내용

    private LocalDateTime createDate; // 작성 일시

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) //질문 삭제시 달린 답변 삭제
    private List<Answer> answerList;
}
