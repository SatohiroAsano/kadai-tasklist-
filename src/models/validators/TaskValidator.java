package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    public static List<String> validate(Task t) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(t.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(t.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String limits_error = _validateLimits(t.getLimits());
        if(!limits_error.equals("")) {
            errors.add(limits_error);
        }
        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タスクのタイトルを入力してください。";
        }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスクの内容を入力してください。";
        }
        return "";
    }

     private static String _validateLimits(String limits) {
        if(limits == null || limits.equals("")) {
            return "タスクの期限を入力してください。";
        }
        return "";
    }
}