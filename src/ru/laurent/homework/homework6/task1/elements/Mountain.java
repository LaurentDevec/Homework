package ru.laurent.homework.homework6.task1.elements;

public class Mountain {
    private int highMount;
    private String nameMount;
    private String countryMount;

    public int getHighMount(){
        return highMount;
    }

    public void setHighMount(int high) {
        if (high < 100) {
            throw new IllegalArgumentException("высота горы не может быть меньше 100 м");
        }
        highMount = high;
    }


    public String getNameMount() {
        return nameMount;
    }

    public void setNameMount(String nameMount) {
        if (nameMount == null) {
            throw new IllegalArgumentException("Название горы не м.б. null");
        }
        this.nameMount = nameMount;
    }

    public String getCountryMount() {
        return countryMount;
    }

    public void setCountryMount(String countryMount) {
        if (countryMount == null) {
            throw new IllegalArgumentException("Название страны, где есть горы не м.б. null");
        }
        this.countryMount = countryMount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "countryMount='" + countryMount + '\'' +
                ", highMount=" + highMount +
                ", nameMount=" + nameMount +
                '}';
    }
}
