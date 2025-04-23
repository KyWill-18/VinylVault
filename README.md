
# Vinyl Vault - Your Personal Vinyl Tracker
# CS 121 Final Project


## Overview
```
Vinyl Vault is a program that will allow the user to input and keep track of vinyls using different lists.
What they have (Have List), what they want (Want List), and their current favorites (Favorites List).
There will be a user menu that will let the user choose which list they would like to view.
There will also be an add and remove vinyl option, and they will be asked if from which list they would like to do that.
This program will be for vinyl lovers who just want to keep track of their vinyls.

This project will be in Java using object-oriented programming principles.
Arraylists will be used for the three lists:
-Want List
-Have List
-Favorites List

Each vinyl will be given a specific status (have, want, favorite)
To view a specific list the program will print out all the vinyls
with the same status as that list.
After talking with Andy I decided to remove the original Collection class I had
Using getStatus is a lot easier and makes the code look clearer
(learned how to get status from an arrayList and just more about arrayList in general so yeah pretty cool!)

```


## Use Case Analysis 
```
Add Vinyl - Allow the user to add a vinyl to a specific list.

Remove Vinyl - Allow the user to remove vinyl from a specific list. 

View List - This will print out the whole list for the user to view.
```


## UI Design
```
Welcome to Vinyl Vault!
What would you like to do?

0.) Exit
1.) View Want List 
2.) View Have List 
3.) View Favorite List
4.) Add Vinyl
5.) Remove Vinyl

1.) View Want List
Here are the vinyls you have on your wishlist
====================================
******
******
******


2.) View Have List
Here are the current vinyls you have in your collection
========================================
******
******
*****


3.) View Favorite List
Your current favorite vinyl is…
************


4.) Add Vinyl
What list would you like to add a vinyl to?

0.) Exit
1.) Want List
2.) Have List
3.) Favorite List

What is the title of the vinyl?
“Frank”

Who is the artist?
“Amy Winehouse”

What is the release year?
“2003”

What is the genre?
“Jazz”

“Ok! Frank by Amy Winehouse has been added to your ____ list!”

5.) Remove Vinyl
What list would you like to remove a vinyl from?

0.) Exit
1.) Want List
2.) Have List
3.) Favorite List

What is the title of the vinyl?
“Frank”

Who is the artist?
“Amy Winehouse”

Ok! Frank by Amy Winehouse has been removed from your _____ list!”
```

## Algorithm
```
Class Main: 
menu() 
main()
wantList()
haveList()
favList()
userAdd()
userRemove()
------------------
Class Vinyl:
vinyls()
toString()
getTitle()
getArtist()
getYear()
getGenre()
getStatus
```
