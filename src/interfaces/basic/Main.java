package interfaces.basic;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Musician> musicians = new ArrayList<>();
        Person person1 = new Person("Tolya", 1);
        Person person2 = new Person("Vanya",2);
        Person person3 = new Person("Sasha",3);
        Human human1 = new Human("Jenia");
        Human human2 = new Human("Masha");
        Human human3 = new Human("Dmytro");
        Student student1 = new Student("Mykola", 1, "Kyiv Universtiy Of Economy", 4, Sportsman.SPORT_TYPE1, Musician.INSTUMENT2);
        Student student2 = new Student("Artem", 2, "Kyiv Politech Institut", 2, Sportsman.SPORT_TYPE2, Musician.INSTUMENT3);
        Student student3 = new Student("Diana", 3, "Lviv University Of Economy", 6,Sportsman.SPORT_TYPE1, Musician.INSTUMENT1);
        Barber barber = new Barber("Vasya", 1, "GP barbershop", Musician.INSTUMENT2, 7, Sportsman.SPORT_TYPE2);
        PartTimeStudent partTimeStudent1 = new PartTimeStudent("Mira", 1, "Kyiv Universtiy Of Economy", 3, Sportsman.SPORT_TYPE1, Musician.INSTUMENT3);
        PartTimeStudent partTimeStudent2 = new PartTimeStudent("Tima", 2, "Kyiv Universtiy Of Economy", 8, Sportsman.SPORT_TYPE2, Musician.INSTUMENT1);
        PartTimeStudent partTimeStudent3 = new PartTimeStudent("Danya", 3, "Kyiv Universtiy Of Economy", 1, Sportsman.SPORT_TYPE1, Musician.INSTUMENT2);
        FullTimeStudent fullTimeStudent1 = new FullTimeStudent("Anya", 1, "Lviv University Of Economy", 6, Sportsman.SPORT_TYPE2, Musician.INSTUMENT1);
        FullTimeStudent fullTimeStudent2 = new FullTimeStudent("Valya", 2, "Lviv University Of Economy", 9, Sportsman.SPORT_TYPE2, Musician.INSTUMENT2);
        FullTimeStudent fullTimeStudent3 = new FullTimeStudent("Vika", 3, "Lviv University Of Economy", 4, Sportsman.SPORT_TYPE2, Musician.INSTUMENT3);
        MusicBand musicBand = new MusicBand();
        Gym gym = new Gym();
        musicBand.addMusician(student1);
        musicBand.addMusician(barber);
        gym.addSportsmen(student2);
        gym.addSportsmen(partTimeStudent1);
        gym.addSportsmen(fullTimeStudent1);
        musicBand.addMusician(fullTimeStudent1);
        musicBand.perform();
        gym.competition();
        Collections.addAll(musicians, student1, student2, student3, partTimeStudent1, partTimeStudent2, partTimeStudent3,
                fullTimeStudent1, fullTimeStudent2, fullTimeStudent3, barber);
        Musician theLoudestMusician = Musician.theMostLoudMusician(musicians);
        System.out.println(theLoudestMusician);
    }
}
