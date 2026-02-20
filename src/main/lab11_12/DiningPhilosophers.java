package main.lab11_12;

import java.util.*;

/**
 * Решение задачи об "Обедающих философах".
 * Решение, которое я выбрал это добавить официанта.
 * Так как задача весь абстратная в роли официанта выступает пользователь,
 * контролируя параллельные процессы через консоль.
 */
public class DiningPhilosophers
{
    private List<Character> _philosophers;
    private Queue<Character> _dinersPhilosophers;
    private Queue<Character> _freePhilosophers;

    private int _forkCount;

    private Scanner _scanner;

    public DiningPhilosophers()
    {
        _philosophers = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        _forkCount = 4;
    }

    public void StartLunch()
    {
        _freePhilosophers = new ArrayDeque<>();
        for (Character c : _philosophers) {
            _freePhilosophers.offer(c);
        }

        _dinersPhilosophers = new ArrayDeque<>();
        for (int i = 0; i < 4; i++) {
            _dinersPhilosophers.add(_freePhilosophers.poll());
        }

        _scanner = new Scanner(System.in);
        boolean running = true;

        while (running)
        {
            DisplayState();

            System.out.println("Введите команду (serve / stop): ");
            String command = _scanner.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                running = false;
                System.out.println("Обед завершён.");
            } else if (command.equalsIgnoreCase("serve")) {
                ServePhilosopher();
            } else {
                System.out.println("Неизвестная команда.");
            }
        }
    }

    private void ServePhilosopher()
    {
        System.out.println("Введите действие (releasePast / eatNext): ");
        String command = _scanner.nextLine();

        if (command.equalsIgnoreCase("releasePast")) {
            ReleasePast();
        } else if (command.equalsIgnoreCase("eatNext")) {
            EatNext();
        } else {
            System.out.println("Неизвестная команда.");
        }
    }

    private void ReleasePast()
    {
        if (_dinersPhilosophers.stream().count() > 0)
        {
            _freePhilosophers.add(_dinersPhilosophers.poll());
        }
        else
        {
            System.out.println("Все философы спят.");
        }
    }

    private void EatNext()
    {
        if (_forkCount > _dinersPhilosophers.stream().count())
        {
            _dinersPhilosophers.add(_freePhilosophers.poll());
        }
        else
        {
            System.out.println("Свободные вилки отсутствуют.");
        }
    }

    private void DisplayState()
    {
        System.out.println("\nСвободные философы: " + _freePhilosophers);
        System.out.println("Обедающие философы: " + _dinersPhilosophers);
    }
}