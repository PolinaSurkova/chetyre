public class Division {
    int id;
    String name;

    /**
     * Конструктор
     * @param i id
     * @param n имя подразделения
     */
    public Division(int i, String n)
    {
        id= i;
        name = n;
    }

    /**
     * Геттер id
     * @return id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Геттер имени
     * @return имя
     */
    public String getName()
    {
        return name;
    }
}
