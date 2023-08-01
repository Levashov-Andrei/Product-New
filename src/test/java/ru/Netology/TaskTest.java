package ru.Netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void searchForMatchesMeetingTopic() {
        ru.Netology.Meeting meeting = new ru.Netology.Meeting(
                555,
                "Запрос информации о багах ",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Запрос");
        Assertions.assertTrue(actual);
    }

    @Test
    public void searchForMatchesMeetingProject() {
        ru.Netology.Meeting meeting = new ru.Netology.Meeting(
                555,
                "Запрос информации о багах ",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Нето");
        Assertions.assertTrue(actual);
    }

    @Test
    public void searchForMatchesMeetingFalse() {
        ru.Netology.Meeting meeting = new ru.Netology.Meeting(
                555,
                "Запрос информации о багах ",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Привет");
        Assertions.assertFalse(actual);
    }

    @Test
    public void searchForMatchesSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(
                5,
                "Привет, Андрей"
        );

        boolean actual = simpleTask.matches("Анд");
        Assertions.assertTrue(actual);

    }

    @Test
    public void searchForMatchesSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(
                5,
                "Иван"
        );

        boolean actual = simpleTask.matches("Анд");
        Assertions.assertFalse(actual);

    }

    @Test
    public void searchForMatchesEpic() {
        String[] subtasks = {"Привет"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Привет");
        Assertions.assertTrue(actual);

    }

    @Test
    public void searchForMatchesEpicFalse() {
        String[] subtasks = {"Привет"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Андрей");
        Assertions.assertFalse(actual);

    }

}


