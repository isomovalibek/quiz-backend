package com.quiz.service.withoutDto;

import com.quiz.entity.Exam;
import com.quiz.entity.QuestionLevel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionLevelService extends CommonService<QuestionLevel> {
    public Page<QuestionLevel> search(String key, Pageable pageable);
}