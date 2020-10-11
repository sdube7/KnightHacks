package sample;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class file {
    private static ArrayList<String> countries = new ArrayList<>();
    private static String country;
    private static String name = "";
    private static String callingId = "";
    private static String capital = "";
    private static String continent = "";
    private static String subRegion = "";
    private static String population = "";
    private static String area = "";
    private static String border = "";
    private static String border1 = "";
    private static String border2 = "";
    private static String border3 = "";
    private static String border4 = "";
    private static String border5 = "";
    private static String currency = "";
    private static String language = "";
    private static String cc = "";
    private static int counter = 0;

    public static String getCc() {
        return cc;
    }

    public static void reading() {
        try {
            File myObj = new File("C:\\Users\\sraja\\IdeaProjects\\Knight\\src\\sample\\results.txt");
            BufferedReader br = new BufferedReader(new FileReader(myObj));
            String st;
            while ((st = br.readLine()) != null) {
                countries.add(st);
            }
            br.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        file.counter = counter;
    }
    public static String getBorder3() {
        return border3;
    }

    public static void setBorder3(String border3) {
        file.border3 = border3;
    }

    public static String getBorder4() {
        return border4;
    }

    public static void setBorder4(String border4) {
        file.border4 = border4;
    }

    public static String getBorder5() {
        return border5;
    }

    public static void setBorder5(String border5) {
        file.border5 = border5;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void setCurrency(String currency) {
        file.currency = currency;
    }

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        file.language = language;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        file.name = name;
    }

    public static String getCallingId() {
        return callingId;
    }

    public static void setCallingId(String callingId) {
        file.callingId = callingId;
    }

    public static String getCapital() {
        return capital;
    }

    public static void setCapital(String capital) {
        file.capital = capital;
    }

    public static String getContinent() {
        return continent;
    }

    public static void setContinent(String continent) {
        file.continent = continent;
    }

    public static String getSubRegion() {
        return subRegion;
    }

    public static void setSubRegion(String subRegion) {
        file.subRegion = subRegion;
    }

    public static String getPopulation() {
        return population;
    }

    public static void setPopulation(String population) {
        file.population = population;
    }

    public static String getArea() {
        return area;
    }

    public static void setArea(String area) {
        file.area = area;
    }

    public static String getBorder1() {
        return border1;
    }

    public static void setBorder1(String border1) {
        file.border1 = border1;
    }

    public static String getBorder2() {
        return border2;
    }

    public static void setBorder2(String border2) {
        file.border2 = border2;
    }

    public static void values(String input) {
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).substring(0,3).toUpperCase().equals(input.toUpperCase())) {
                cc = countries.get(i).substring(0,3).toUpperCase();
                country = countries.get(i);
            }
        }
        String array1[]= country.split(";");
        name = array1[1];
        callingId = array1[2];
        capital = array1[3];
        subRegion = array1[4];
        continent = array1[5];
        population = array1[6];
        area = array1[7];
        border = array1[8].substring(1, array1[8].length()-1);
        String array2[]= border.split(",");
        int count = 0;
        if (count < array2.length) {
            border1 = array2[0];
            count++;
        }
        if (count < array2.length) {
            border2 = array2[1];
            count++;
        }
        if (count < array2.length) {
            border3 = array2[2];
            count++;
        }
        if (count < array2.length) {
            border4 = array2[3];
            count++;
        }
        if (count < array2.length) {
            border5 = array2[4];
            count++;
        }
        currency = array1[9];
        language = array1[10];
    }
}

