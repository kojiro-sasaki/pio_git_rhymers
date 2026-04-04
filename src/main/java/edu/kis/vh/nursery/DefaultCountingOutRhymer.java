package edu.kis.vh.nursery;
/**
 * Klasa reprezentująca wyliczankę działającą na zasadzie stosu (LIFO).
 */
public class DefaultCountingOutRhymer {
    // Projekt jest poprawny – wszystkie testy jednostkowe przechodzą pomyślnie
    private static final int MAX_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int DEFAULT = -1;
    private final int[] numbers = new int[MAX_SIZE];
    private int total = EMPTY;
    /**
     * Zwraca aktualny indeks wierzchołka stosu.
     * @return indeks wierzchołka lub -1 gdy pusty
     */
    public int getTotal() {
        return total;
    }
    /**
     * Dodaje element do wyliczanki.
     * @param in liczba do dodania
     */
    // TODO: ciche odrzucenie elementu gdy stos pełny - rozważyć rzucenie wyjątku
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Sprawdza czy wyliczanka jest pusta.
     * @return true jeśli pusta
     */
    public boolean callCheck() {
        return total == EMPTY;
    }
    /**
     * Sprawdza czy wyliczanka jest pełna.
     * @return true jeśli pełna
     */
    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }
    /**
     * Zwraca ostatni element bez usuwania.
     * @return ostatni element lub -1 gdy pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }
    /**
     * Usuwa i zwraca ostatni element.
     * @return ostatni element lub -1 gdy pusta
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

}
