<!-- Shields from shields.io -->
![Author][author-shield]
[![LinkedIn][linkedin-shield]][linkedin-url] ![Status][status-shield]
<!-- [![Handshake][handshake-shield]][handshake-url]  -->

# Friendly Blazes Fabric Mod for Minecraft 1.21.5

### What if you didn't need to fight blazes for blaze rods? What if these fiery mobs could be loyal companions that can provide you with the same love as your pet dogs and cats? Introducing the Friendly Blazes mod, where blazes give you drops, defend you, and can power furnaces!

![Website Image](/readme_images/blaze_bottle_in_inventory.png)
![Website Image](/readme_images/blaze_block_crafting.png)
![Website Image](/readme_images/blaze_flower_planted.png)

## Table of Contents
* [Mod Overview](#mod-overview)
* [Motivation](#motivation)
* [Technologies](#technologies)
* [Installation](#installation)
* [How To Use](#how-to-use)
* [To-Do List](#to-do-list)
* [Status](#status)
* [Notes](#notes)
* [Credits](#credits)

## Mod Overview
***TODO***

## Motivation
I have been a big fan of Minecraft over the years it has existed, and have always wanted to dip my toes into the game development space. I wanted to do this project to learn the Minecraft Fabric API and dive into the world of Minecraft modding. Regardless of if a mod like this already exists, I am doing it for learning purposes.

## Technologies
* Minecraft 1.21.5 with Fabric Loader 0.16.14
* Adoptium Temurin JDK
* IntelliJ IDEA Community Edition (or your favorite Java IDE)

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
  - [X] Blaze Flower (taming item/block)
  - [X] Blaze Block (lighting block)
- Add textures for items and blocks
  - [X] Blaze Bottle
  - [X] Blaze Flower
  - [X] Blaze Block
- Add item/block functionality, crafting, and/or loot table drop
  - [X] Blaze Bottle
  - [ ] Blaze Flower
  - [X] Blaze Block
- [ ] Add Tamed blaze mob
- Add new mob behavior
  - [ ] Blaze mob can be interacted by clicking with Blaze Flower
  - [ ] Tamed blaze heats up nearby furnaces
  - [ ] Tamed blaze can be interacted by clicking with empty bottle

## Status
Currently working on the project! Working on tamed blaze entity...

## Notes
- (5/31/2025) After a lot of trial and error, and a lot of reading...
  - ![Website Image](/readme_images/blaze_bottle_in_hand.png)
  - I added my first item! This works because when Minecraft is initialized, we add a new item (with its own id) to the registry, and we can also add the item to different categories (resource, redstone, etc.). The item I added is currently not functional...
- (6/1/2025) Reading the Fabric wiki and copying their Blocks.register function, I was able to add the Blaze Block, which will be crafted from 9 Blaze Bottles
  - ![Website Image](/readme_images/blaze_next_to_block.png)
  - When creating a block, you can adjust various "Settings," like luminance, sound effects, and strength. I made the Blaze Block a lighting block that sounds like glass when broken
- (6/1/2025) Implemented an item group for Blaze related items for my mod
  - ![Website Image](/readme_images/blaze_item_group.png)
- (6/2/2025) Custom Recipes
  - Minecraft 1.21.5 changed a lot of syntax, which makes it a lot harder to find documentation online. When you want to make a custom crafting recipe, you need to add a key as so:
  - "key": { "#" "modname/minecraft:item" }
- (6/2/2025) Blaze Flower w/ Collision Behavior
  - Finally added the Blaze Flower!!!
  - Took a long time to implement, but I basically needed to make a new class that extends the FlowerBlock class, then override the FlowerBlock class with a custom onEntityCollision behavior ;-;
  - When walking over the flower, you take damage, like a sweet berry bush. You also are ignited, like if you were to walk in fire.
  - Basically used the same logic as the berry bush
  - ![Website Image](/readme_images/blaze_flower_planted.png)
  - ![Website Image](/readme_images/blaze_flower_damage.png)

## Credits
* [Fabric Modding Docs](https://wiki.fabricmc.net/tutorial:start)
* [Fabric API Docs](https://maven.fabricmc.net/docs)
* [Social Icons](https://fontawesome.com/)

<!-- Links & Images -->
[author-shield]: https://img.shields.io/badge/Author-Khiem_Dam-555?style=for-the-badge&color=999
[linkedin-shield]: https://img.shields.io/badge/LinkedIn-555?style=for-the-badge&logo=linkedIn
[linkedin-url]: https://www.linkedin.com/in/khiemd/
[handshake-shield]: https://img.shields.io/badge/Handshake-555?style=for-the-badge&logo=handshake&logoColor=white
[handshake-url]: https://app.joinhandshake.com/stu/users/31441591
[status-shield]: https://img.shields.io/badge/status-in_progress-555?style=for-the-badge&labelColor=555&color=FFA500
<!-- https://img.shields.io/badge/status-completed-555?style=for-the-badge&labelColor=555&color=03c04a -->