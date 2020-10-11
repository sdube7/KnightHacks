#include <SFML/Graphics.hpp>
#include <iostream>
#include <fstream>
#include <sstream>
#include "TextureManager.h"
using namespace std;

class Country
{
    string name;
public:
    const string &getName() const {
        return name;
    }

    void setName(const string &name) {
        Country::name = name;
    }

    const string &getCallingId() const {
        return callingID;
    }

    void setCallingId(const string &callingId) {
        callingID = callingId;
    }

    const string &getCapital() const {
        return capital;
    }

    void setCapital(const string &capital) {
        Country::capital = capital;
    }

    const string &getContinent() const {
        return continent;
    }

    void setContinent(const string &continent) {
        Country::continent = continent;
    }

    const string &getSubArea() const {
        return subArea;
    }

    void setSubArea(const string &subArea) {
        Country::subArea = subArea;
    }

    const string &getPopulation() const {
        return population;
    }

    void setPopulation(const string &population) {
        Country::population = population;
    }

    const string &getArea() const {
        return area;
    }

    void setArea(const string &area) {
        Country::area = area;
    }

    const string &getBorders() const {
        return borders;
    }

    void setBorders(const string &borders) {
        Country::borders = borders;
    }

    const string &getCurrency() const {
        return currency;
    }

    void setCurrency(const string &currency) {
        Country::currency = currency;
    }

    const string &getLanguage() const {
        return language;
    }

    void setLanguage(const string &language) {
        Country::language = language;
    }

private:
    string callingID;
    string capital;
    string continent;
    string subArea;
    string population;
    string area;
    string borders;
    string currency;
    string language;
public:
    Country(string name, string callingId, string capital, string continent, string subArea, string population, string area, string borders, string currency, string language)
    {
        this-> name = name;
        this-> callingID = callingId;
        this-> capital = capital;
        this-> continent = continent;
        this-> subArea = subArea;
        this-> population = population;
        this-> area = area;
        this-> borders = borders;
        this-> currency = currency;
        this-> language = language;
    }
};
Country* constructNewCountry(string countryLine)
{

    // Name
    // Calling ID
    // Capital
    // Continent
    // Sub area
    // Population
    // Area
    // Borders
    // Currencie
    // Language
    string name;
    string callingID;
    string capital;
    string subRegion;
    string continent;
    string population;
    string currencies;
    string callingCards;
    string area;
    string language;
    try {
        string borders;
        int index = countryLine.find(";");
        name = countryLine.substr(0, index + 1);
        countryLine = countryLine.substr(index, countryLine.size());
        countryLine.erase(0, 1);
        index = countryLine.find(";");
        callingID = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());
        countryLine.erase(0, 1);
        index = countryLine.find(";");
        capital = countryLine.substr(0, index );
        countryLine = countryLine.substr(index, countryLine.size());
        countryLine.erase(0, 1);
        index = countryLine.find(";");
        continent = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());
        countryLine.erase(0, 1);
        index = countryLine.find(";");
        subRegion = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());
        countryLine.erase(0, 1);
        index = countryLine.find(";");
        population = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());
        countryLine.erase(0, 1);
        index = countryLine.find(";");
        area = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());
        countryLine.erase(0, 1);
        index = countryLine.find(";");
        borders = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());
        countryLine.erase(0, 1);
        index = countryLine.find(";");
        currencies = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());

        index = countryLine.find("]");

        callingCards = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());

        countryLine.erase(0, 1);
        index = countryLine.find(" ");
        language = countryLine.substr(0, index);
        countryLine = countryLine.substr(index, countryLine.size());


        // Name
        // Calling ID
        // Capital
        // Continent
        // Sub area
        // Population
        // Area
        // Borders
        // Currencie
        // Language

        return new Country(name, callingID, capital, continent, subRegion, population, area, borders, currencies, language);
    } catch (...) {

    }


}

int main()
{

    std::vector<std::string> vectorOfCountries;
    //ifstream reader("test.txt");


    std::string newThing;
    std::string value;
    int hexValue = 0;
    //reader.open("test.txt");
    string myText;

// Read from the text file
    ifstream MyReadFile("results (3).txt");

// Use a while loop together with the getline() function to read the file line by line
    while (getline (MyReadFile, myText)) {
        // Output the text from the file
        vectorOfCountries.push_back(myText);
    }
    std::vector<Country*> actualCountries;
    for(int i = 0; i < vectorOfCountries.size(); i++)
    {
        actualCountries.push_back(constructNewCountry(vectorOfCountries.at(i)));
    }


// Close the file
    MyReadFile.close();

    // Time to populate a vector of vectors where each vector is a country object

    sf::RenderWindow window(sf::VideoMode(1280, 800), "Countries");
    // List of nodes
    sf::Text languages;
    sf::Text nativeName;
    sf::Text continent;
    sf::Text subRegion;
    sf::Text capital;
    sf::Text population;
    sf::Text currencies;
    sf::Text callingCodes;
    sf::Text area;
    sf::Text borders;
    sf::Font font;

    if (!font.loadFromFile("arial_narrow_7.ttf"))
    {
        std::cout << "error";
    }else
    {
        languages.setFont(font);
        languages.setString("Languages");
        nativeName.setFont(font);
        nativeName.setString("Native Name");
        continent.setFont(font);
        continent.setString("Continent");
        subRegion.setFont(font);
        subRegion.setString("Sub Region");
        capital.setFont(font);
        capital.setString("Capital");
        population.setFont(font);
        population.setString("Population");
        currencies.setFont(font);
        currencies.setString("Currencies");
        callingCodes.setFont(font);
        callingCodes.setString("Calling Codes");
        area.setFont(font);
        area.setString("Area");
        borders.setFont(font);
        borders.setString("Borders");
    }

    languages.setFillColor(sf::Color::Black);
    //text.setStyle(sf::Text::Bold);
    vector<sf::Text> textVector;
    textVector.push_back(languages);
    textVector.push_back(nativeName);
    textVector.push_back(continent);
    textVector.push_back(subRegion);
    textVector.push_back(capital);
    textVector.push_back(population);
    textVector.push_back(currencies);
    textVector.push_back(callingCodes);
    textVector.push_back(area);
    textVector.push_back(borders);



// Currency 970 160
// Sub region 55 450

    // Text boxes used for buttons
    sf::RectangleShape languagesTextBox(sf::Vector2f(100, 100));
    languagesTextBox.setPosition(sf::Vector2f(140, 190));
    languagesTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape nativeNameTextBox(sf::Vector2f(100,100));
    nativeNameTextBox.setPosition(sf::Vector2f(215, 660));
    nativeNameTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape continentTextBox(sf::Vector2f(100,100));
    continentTextBox.setPosition(sf::Vector2f(580, 80));
    continentTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape subRegionTextBox(sf::Vector2f(100,100));
    subRegionTextBox.setPosition(sf::Vector2f(55, 450));
    subRegionTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape capitalTextBox(sf::Vector2f(100,100));
    capitalTextBox.setPosition(sf::Vector2f(330, 80));
    capitalTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape populationTextBox(sf::Vector2f(100,100));
    populationTextBox.setPosition(sf::Vector2f(830, 85));
    populationTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape currenciesTextBox(sf::Vector2f(100,100));
    currenciesTextBox.setPosition(sf::Vector2f(970, 670));
    currenciesTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape callingCodesTextBox(sf::Vector2f(100,100));
    callingCodesTextBox.setPosition(sf::Vector2f(1100, 450));
    callingCodesTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape areaTextBox(sf::Vector2f(100,100));
    areaTextBox.setPosition(sf::Vector2f(1075, 190));
    areaTextBox.setFillColor(sf::Color::Black);

    sf::RectangleShape bordersTexBox(sf::Vector2f(100,100));
    bordersTexBox.setPosition(sf::Vector2f(365, 500));
    bordersTexBox.setFillColor(sf::Color::Black);


    sf::Sprite background(TextureManager::GetTexture("start"));

    while(window.isOpen())
    {
        // Event System:
        /*
         * Jobs to manipulate window. Works with the operating system
         */
        sf::Event event;
        while (window.pollEvent(event))
        {
            if (event.type == sf::Event::Closed)
                window.close();
        }
        window.clear();
        window.draw(languagesTextBox);
        window.draw(nativeNameTextBox);
        window.draw(continentTextBox);
        window.draw(subRegionTextBox);
        window.draw(capitalTextBox);
        window.draw(populationTextBox);
        window.draw(currenciesTextBox);
        window.draw(callingCodesTextBox);
        window.draw(areaTextBox);
        window.draw(bordersTexBox);
        window.draw(background);

        languages.setPosition(sf::Vector2f(140, 190));
        nativeName.setPosition(sf::Vector2f(215, 660));
        continent.setPosition(sf::Vector2f(580,80));
        subRegion.setPosition(sf::Vector2f(55,440));
        capital.setPosition(sf::Vector2f(330,80));
        population.setPosition(sf::Vector2f(830,85));
        currencies.setPosition(sf::Vector2f(970,670));
        callingCodes.setPosition(sf::Vector2f(1090,440));
        area.setPosition(sf::Vector2f(1075,190));
        borders.setPosition(sf::Vector2f(590,590));

        if (event.type == sf::Event::MouseButtonPressed)
        {
            // And it was the left mouse button
            if(event.mouseButton.button == sf::Mouse::Left)
            {
                // Do something
                // Count get mouse position
                auto position = sf::Mouse::getPosition(window);
                //std::cout << position.x << std::endl;
                //std::cout << position.y << std::endl;
                if(languagesTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {

                    languages.setString(actualCountries.at(1)->getLanguage());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(120,140));
                    window.draw(background1);
                    window.draw(languages);

                }
                if(nativeNameTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    //std::cout << "Native Button was clicked";
                    nativeName.setString(actualCountries.at(1)->getCallingId());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(190,610));
                    window.draw(background1);
                    window.draw(nativeName);
                }
                if(continentTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    continent.setString(actualCountries.at(1)->getContinent());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(570,30));
                    window.draw(background1);
                    window.draw(continent);
                }
                if(subRegionTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    //std::cout << "Native Button was clicked";
                    subRegion.setString(actualCountries.at(1)->getCurrency());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(45,390));
                    window.draw(background1);
                    window.draw(subRegion);
                }
                if(capitalTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    //std::cout << "Native Button was clicked";
                    capital.setString(actualCountries.at(2)->getCapital());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(330,20));
                    window.draw(background1);
                    window.draw(capital);
                }
                if(populationTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    //std::cout << "Native Button was clicked";
                    population.setString(actualCountries.at(2)->getPopulation());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(820,40));
                    window.draw(background1);
                    window.draw(population);
                }
                if(currenciesTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    //std::cout << "Native Button was clicked";
                    currencies.setString(actualCountries.at(2)->getArea());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(950,600));
                    window.draw(background1);
                    window.draw(currencies);
                }
                if(callingCodesTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    //std::cout << "Native Button was clicked";
                    callingCodes.setString(actualCountries.at(2)->getSubArea());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(1090,400));
                    window.draw(background1);
                    window.draw(callingCodes);
                }
                if(areaTextBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    //std::cout << "Native Button was clicked";
                    area.setString(actualCountries.at(2)->getCallingId());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(1020,140));
                    window.draw(background1);
                    window.draw(area);
                }
                if(bordersTexBox.getGlobalBounds().contains(sf::Vector2f(position.x, position.y)))
                {
                    //std::cout << "Native Button was clicked";
                    borders.setString(actualCountries.at(2)->getBorders());
                    sf::Sprite background1(TextureManager::GetTexture("black_circle_nomask (1)"));
                    background1.setPosition(sf::Vector2f(590,590));
                    window.draw(background1);
                    window.draw(borders);
                }
            }
        } else
        {

        }
//        window.draw(languages);
//        window.draw(nativeName);
//        window.draw(continent);
//        window.draw(subRegion);
//        window.draw(capital);
//        window.draw(population);
//        window.draw(currencies);
//        window.draw(callingCodes);
//        window.draw(area);
//        window.draw(borders);
        window.display();
    }



    return 0;
}
