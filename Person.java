public class Person {
    String id;
    String name;
    String sex;
    String date;
    Division div;
    String zp;

    /**
     * Конструктор
     * @param i id
     * @param n имя
     * @param s пол
     * @param d дата
     * @param di подразделение
     * @param z зарплата
     */
    public Person(String i, String n, String s, String d, Division di, String z)
    {
        id = i;
        name= n;
        sex=s;
        date= d;
        div = di;
        zp = z;
    }

    /**
     * Сеттер id
     * @param i id
     */
    public void setId(String i)
    {
        id = i;
    }

    /**
     * Геттер id
     * @return id
     */
    public String getId()
    {
        return id;
    }

    /**
     * Сеттер имени
     * @param n имя
     */
    public void setDiv(String n)
    {
        name = n;
    }

    /**
     * Геттер имени
     * @return name имя
     */
    public String getName()
    {
        return name;
    }

    /**
     * Сеттер пола
     * @param s пол
     */
    public void setSex(String s)
    {
        sex = s;
    }

    /**
     * геттер пола
     * @return sex пол
     */
    public String getSex()
    {
        return sex;
    }

    /**
     * Сеттер подразделения
     * @param di подразделение
     */
    public void setDiv(Division di)
    {
        div = di;
    }

    /**
     * Геттер подразделения
     * @return div подразделение
     */
    public Division getDiv()
    {
        return div;
    }

    /**
     * Сеттер зарплаты
     * @param z зарплата
     */
    public void setZp(String z)
    {
        zp = z;
    }

    /**
     * Геттер зарплаты
     * @return zp зарплата
     */
    public String getZp()
    {
        return zp;
    }

    /**
     * Сеттер даты
     * @param d дата
     */
    public void setDate(String d)
    {
        date = d;
    }

    /**
     * Геттер даты
     * @return date дата
     */
    public String getDate()
    {
        return date;
    }
}