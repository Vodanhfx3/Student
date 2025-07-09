package com.lms.studentmanagement.client.exam;

import com.lms.studentmanagement.dto.exam.response.ExamDto;
import com.lms.studentmanagement.dto.exam.request.ExamAttemptRequestDto;
import com.lms.studentmanagement.dto.exam.response.ExamAttemptHistoryDto;

public interface ExamClient {
    ExamDto getExamByLessonId(Long lessonId);
    ExamAttemptHistoryDto submitExamAttempt(Long examId, ExamAttemptRequestDto attemptRequestDto, String userId);
}
