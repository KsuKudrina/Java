package OOP.LessonOOP.Lesson_02.Ex006.Interface;

import OOP.LessonOOP.Lesson_02.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
