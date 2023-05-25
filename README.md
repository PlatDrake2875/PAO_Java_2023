## About the project

This application's purpose is to mimic most of the core functionality of Spotify and Audible if every song/podcast/audiobook was paid :).

---

This is a work in progress repo, so there'll be quite a bit of activity on 
it, but the end product should follow the following structure, though its subject to change in the course of development:

### Users: 
- User roles -> 
    + Admin  -> has access to all the features
    + Artist -> sells audio products
    + User   -> buys audio products
- All users have a profile interface with data about them (first name, last name, date of birth etc)
- Users can have a profile picture
- Users can make playlists that can be shuffled or replayed


### Audio Content: 
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
    3) Title
    4) Author/Artist/Narrator name

---

### Classes Used:  
1) Menu  
2) AbstractUser  
&#9; 3) Admin  
&#9; 4) Artist  
&#9; 5) User  
6) AbstractAudioContent  
&#9; 7) Song   
&#9; 8) Audiobook   
&#9; 9) Podcast   

### Enums:  
1) UserType   
2) AudioContentType  

### Records:   
1) Playlist   

---

### Types of Queries:
1) Serveral sortings by different crieteria
2) Setters and Getters for every attribute
3) Group by's of objects
4) Create/Remove/Update of some objects
5) Get id of object  

---

### Task check list
- [ ] Definirea sistemului/documentatie (0.5p)
- [ ]  (minim) 10 operatiuni/interogari, 0.05p fiecare. punctaj maxim: 0.5p	 
- [ ] (minim) 8 clase/obiecte, 0.05p fiecare. punctaj maxim: 0.5p	
- [ ] Folosirea corecta a incapsularii si abstractizarii, respectiv a tipurilor de date ale campurilor. punctaj maxim: 0.5p 
- [ ] Implementarea clasei/claselor serviciu. punctaj maxim: 0.3p	
- [ ] programare folosind interfete. punctaj maxim: 0.3p
- [ ] Folosirea clase abstracte. punctaj maxim: 0.2p	
- [ ] folosirea interfetelor. punctaj maxim: 0.2p
- [ ] Folosirea claselor records. punctaj maxim: 0.2p	
- [ ] Sortarea elementelor: 0.1p. folosind streams/comparator/functional interfaces: 0.2p	
- [ ] Folosirea enum-urilor, folosirea optional, punctaj maxim: 0.2p
- [ ]  Folosirea structurilor de date: ArrayList/LinkedList/HashMap/HashSet/TreeMap/TreeSet, inafara sortarii. punctaj maxim: 0.4p	
- [ ] Intrebari generale, de ce am facut pana acum, inclusiv din subiectele discutate pe teams. poate sa includa SOLID principles/intrebari interviu. punctaj maxim: 1p  



TODO: Write some clean markdown
