<!-- Shields from shields.io -->
![Author][author-shield]
[![LinkedIn][linkedin-shield]][linkedin-url] ![Status][status-shield]
<!-- [![Handshake][handshake-shield]][handshake-url]  -->

# Friendly Blazes Fabric Mod for Minecraft

### What if you didn't need to fight blazes for blaze rods? What if these fiery mobs could be loyal companions that can provide you with the same love as your pet dogs and cats? Introducing the Friendly Blazes mod, where blazes give you drops, defend you, and can power furnaces!

![Website Image](/readme_images/blaze_bottle_in_inventory.png)

## Table of Contents
* [Motivation](#motivation)
* [Technologies](#technologies)
* [Installation](#installation)
* [How To Use](#how-to-use)
* [To-Do List](#to-do-list)
* [Status](#status)
* [Notes](#notes)
* [Credits](#credits)

## Motivation
I have been a big fan of Minecraft over the years it has existed, and have always wanted to dip my toes into the game development space. I wanted to do this project to learn the Minecraft Fabric API and dive into the world of Minecraft modding. Regardless of if a mod like this already exists, I am doing it for learning purposes.

## Technologies
* Adoptium Temurin JDK
* IntelliJ IDEA Community Edition (or your favorite Java IDE)
* ***TODO: Add additional technologies***

## Installation
Navigate to your desired directory. In your shell/terminal, type in the following:

With SSH Keys:
```
git clone git@github.com:khiemdam/friendly-blazes-mod-mc.git
```
With HTTPS:
```
git clone https://github.com/khiemdam/friendly-blazes-mod-mc.git
```

## How To Use
***TODO: Write Instructions if necessary?***

## To-Do List
- ***TODO: Write TODO List***
- Add items/blocks
  - [X] Blaze Bottle (crafting item)
  - [ ] Blaze Flower (taming item/block)
  - [ ] Blaze Block (lighting block)
- Add textures for items and blocks
  - [X] Blaze Bottle
  - [ ] Blaze Flower
  - [ ] Blaze Block
- Add item/block functionality
  - [ ] Blaze Bottle
  - [ ] Blaze Flower
  - [ ] Blaze Block
- Add new mob behavior
  - [ ] Tamed blaze mob
  - [ ] Tamed blaze heats up nearby furnaces
  - [ ] Tamed blaze can be interacted by clicking with empty bottle

## Status
Currently working on the project! Learned how to add items to minecraft through the registry.

## Notes
***TODO: Explain important moments/steps taken in the project when the time comes...***
- (5/31/2025) After a lot of trial and error, and a lot of reading...
  - ![Website Image](/readme_images/blaze_bottle_in_hand.png)
  - I added my first item! This works because when Minecraft is initialized, we add a new item (with its own id) to the registry, and we can also add the item to different categories (resource, redstone, etc.). The item I added is currently not functional...

## Credits
* [Fabric Modding Docs](https://wiki.fabricmc.net/tutorial:start)
* [Social Icons](https://fontawesome.com/)

<!-- Links & Images -->
[author-shield]: https://img.shields.io/badge/Author-Khiem_Dam-555?style=for-the-badge&color=999
[linkedin-shield]: https://img.shields.io/badge/LinkedIn-555?style=for-the-badge&logo=linkedIn
[linkedin-url]: https://www.linkedin.com/in/khiemd/
[handshake-shield]: https://img.shields.io/badge/Handshake-555?style=for-the-badge&logo=handshake&logoColor=white
[handshake-url]: https://app.joinhandshake.com/stu/users/31441591
[status-shield]: https://img.shields.io/badge/status-in_progress-555?style=for-the-badge&labelColor=555&color=FFA500
<!-- https://img.shields.io/badge/status-completed-555?style=for-the-badge&labelColor=555&color=03c04a -->