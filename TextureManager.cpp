//
// Created by sunja on 10/10/2020.
//


#include "TextureManager.h"
// Redeclaring static class variable
std::unordered_map<std::string, sf::Texture> TextureManager::textures;

void TextureManager::LoadTexture(const char *fileName) {
    // "ship.png"
    // Optiminzing not including images
    std::string filePath = "images/";
    filePath += fileName;
    filePath += ".png";
    // Access it by name, will load file
    textures[fileName].loadFromFile(filePath);
}

sf::Texture &TextureManager::GetTexture(const char *textureKey) {
    // TextureManager::GetTexture("ship2")
    if(textures.find(textureKey) == textures.end())// Texture does not exist (key)
    {
        LoadTexture(textureKey); // Key does exist
    }
    return textures[textureKey];
}

void TextureManager::Clear() {
    textures.clear();
}