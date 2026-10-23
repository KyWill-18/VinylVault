# Vinyl Vault - Your Personal Vinyl Tracker

A Java command-line application for tracking a vinyl collection across Want, Have, and Favorite lists, with automatic JSON save and load using Gson.

## Features

- Organize vinyls into three lists: **Want** (vinyls you're looking for), **Have** (vinyls you own), and **Favorite** (vinyls you love the most)
- Add vinyls with a title, artist, release year, and genre
- Remove a vinyl from any list
- Move a vinyl between any two lists
- Confirmation prompts before removing or moving a vinyl
- Save the collection to `collection.json` on exit and load it on startup


## Demo

Here's an example of what a user sees when they run Vinyl Vault:

```
Welcome to Vinyl Vault! Your Personal Vinyl Tracker!

What would you like to do?

0) Exit
1) View Want List
2) View Have List
3) View Favorite List
4) Add Vinyl
5) Remove Vinyl
6) Move Vinyl
1
Viewing Your Want List...
1. Hit Me Hard And Soft by Billie Eilish Released: 2024 Genre: Alt
2. Pylon by Beabadoobee Released: 2026 Genre: Rock
3. GO:OD AM by Mac Miller Released: 2015 Genre: Hip-Hop
4. Sunburn by Dominic Fike Released: 2023 Genre: Alt
Press ENTER to return to the Main Menu...
```


## Getting Started

**Requirements:**
- Java JDK 24
- IntelliJ IDEA (or any IDE that supports Maven)
- An internet connection on the first build, so Maven can download Gson

**Run it:**
    1. Clone the repository:
    ```
    git clone https://github.com/KyWill-18/VinylVault.git
    ```

    2. In IntelliJ IDEA, choose **Open** and select the `main` folder, which contains `pom.xml`. Wait for Maven to finish loading.

    3. Open `Main.java`, right-click it, and select **Run `Main.main()`**

On first launch there is no saved collection, so the program prints a message saying so. It creates `collection.json` when you exit, and loads it the next time you run the program.


## Vinyl Vault Behind The Code

- `Vinyl`: Stores a vinyl's title, artist, year, genre, and status (Want, Have, or Favorite)
- `VinylCollection`: Owns the three lists and handles adding, removing, and sorting vinyls by status
- `VinylStorage`: Saves the collection to JSON and loads it back using Gson
- `Main`: Displays the menus and handles user input


## What I learned
Vinyl Vault began as a small final project for my CS121 Data Structures class my freshman year. After the semester ended, I kept building it into a personal project with features I wanted as a vinyl collector. Along the way I learned how to use Gson to save the three lists as one flat JSON file and re-sort each vinyl by status when loading it back. Testing a missing file and an empty file showed me crashes I hadn't expected, and fixing them taught me why error handling matters. Next I plan to refactor `Main.java` and add input validation.

## Future Update Roadmap

- [ ] Break `Main.java` into smaller methods
- [ ] Validate user input (numbers, empty fields, out-of-range choices)
- [ ] Handle a malformed `collection.json`
- [ ] Add JUnit tests
- [ ] Possibly add a GUI