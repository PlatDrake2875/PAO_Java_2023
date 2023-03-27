-> About the project

This application's purpose is to mimic most of the core functionality of Spotify and Audible if every song/podcast/audiobook was paid :).

This is a work in progress repo, so there'll be quite a bit of activity on 
it, but the end product should support the following features:

Users: 
- User roles -> 
    + Artist -> sells audio products
    + User -> buys audio products
- All users have a profile interface with data about them (first name, last name, date of birth etc)
- Users can have a profile picture
- Users can make playlists that can be shuffled or replayed


Audio Content: <br\>
- Can be put up for sale and listened to if you own it (you either purchased it or made it).  
- Products can be discounted for a limited amounted of time. 
- Content can be ordered by: 
    1) Alphabetical Order 
    2) Length 
    3) Upload date 
    4) Original release date (You might've first released the product on another platform and people tend to find it easier by the release date) 
- Content can be grouped and displayed by:  
    1) Type (Song, Podcast, Audiobook)  
    2) Genre (Depends on the type) 


Classes Used:
1) Menu \
2.1, 2.2) User (Abstract), UserService (Interface) \
    3) Artist\
    4) User\
5.1, 5.2) Product (Abstract), ProductService (Interface)\
    6) Song\
    7) Podcast\
    8) Audiobook\
9) Playlist \

There are also some ENUMS and RECORDS involved in there that I 
didn't mentioned explicitly because they are of little concern.

Queries:
1) Create User 
2) Display User Data (getters for each member. Should count as individual queries, but I prefer omitting this fact) 
3) Sort Users 
4) Display longest audio product
5) Change a product's price 
6) Add discount to a product 
7) Purchase a product 
8) Make a playlist (Should use a HashMap for it) 
9) Play the playlist  


1) Definirea sistemului/documentatie (0.5p)
2) (minim) 10 operatiuni/interogari, 0.05p fiecare. punctaj maxim: 0.5p	
3) (minim) 8 clase/obiecte, 0.05p fiecare. punctaj maxim: 0.5p	
4) Folosirea corecta a incapsularii si abstractizarii, respectiv a tipurilor de date ale campurilor. punctaj maxim: 0.5p 
5) Implementarea clasei/claselor serviciu. punctaj maxim: 0.3p	programare folosind interfete. punctaj maxim: 0.3p
6) Folosirea clase abstracte. punctaj maxim: 0.2p	folosirea interfetelor. punctaj maxim: 0.2p
7) Folosirea claselor records. punctaj maxim: 0.2p	
8) Sortarea elementelor: 0.1p. folosind streams/comparator/functional interfaces: 0.2p	
9) Folosirea enum-urilor, folosirea optional, punctaj maxim: 0.2p 10) Folosirea structurilor de date: ArrayList/LinkedList/HashMap/HashSet/TreeMap/TreeSet, inafara sortarii. punctaj maxim: 0.4p	
11) Intrebari generale, de ce am facut pana acum, inclusiv din subiectele discutate pe teams. poate sa includa SOLID principles/intrebari interviu. punctaj maxim: 1p



TODO: Write some clean markup
