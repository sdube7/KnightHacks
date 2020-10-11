//
// Created by sunja on 10/10/2020.
//

#ifndef SPOTIFYPROJECT_TEXTUREMANAGER_H
#define SPOTIFYPROJECT_TEXTUREMANAGER_H


#include <unordered_map>
#include <string>
#include <SFML/Graphics/Texture.hpp>

class TextureManager {
    static std::unordered_map<std::string, sf::Texture> textures;
    static void LoadTexture(const char* fileName);
public:
    static sf::Texture& GetTexture(const char* textureKey);
    static void Clear(); // Clean up our mess (clear all textures from map
};


#endif //SPOTIFYPROJECT_TEXTUREMANAGER_H
