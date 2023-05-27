## About the Project 🚀

This application is designed to simulate core functionalities of platforms like Spotify and Audible, with the twist that every song, podcast, and audiobook has an associated cost 💵.

This is an active repository, witnessing constant updates and enhancements.

### Users: 👥
- **User Roles:** 
    + Admin  🛠️ - Full access to all features
    + Artist 🎤 - Sells audio products
    + User   🎧 - Buys audio products
- All users can personalize their profiles with personal data such as first name, last name, date of birth, etc.
- Users can upload a profile picture 🖼️.
- Users can curate playlists that can be shuffled or replayed.

### Audio Content: 🎵
- Audio products can be sold and accessed by those who own it (either purchased or created).  
- Products can feature limited-time discounts ⏳.
- Content can be sorted by: 
    1) Alphabetical Order 📚
    2) Length ⏰
    3) Upload Date 📅
    4) Original Release Date (especially if the product was released elsewhere first)
- Content can be grouped and displayed by:  
    1) Type (Song, Podcast, Audiobook) 📁 
    2) Genre (Varies with type) 🎸
    3) Title 📘
    4) Author/Artist/Narrator name 🎙️

### Classes Used: 
1) Menu  
2) AbstractUser  
    3) Admin  
    4) Artist  
    5) User  
6) AbstractAudioContent  
    7) Song   
    8) Audiobook   
    9) Podcast   

### Enums: 
1) UserType   
2) AudioContentType  

### Records:    
1) Playlist   

### Types of Queries: 💡
1) Multiple sorts using various criteria
2) Getters and Setters for every attribute
3) Grouping of objects
4) Create/Remove/Update operations on some objects
5) Retrieving object ID

### Updates
- Added database connectivity to MySQL using JDBC. Also added some CRUD operations to tables. 
- Added design patterns (Builder, Singleton, Factory).
- Added lots of logging.
- Added more exceptions, iterators/spliterators, parallel streams, generics and sealed classes.
- Added Threading.
- Added HttpClient and used Jackson.
- Added data exportation with CSV.
### Task Checklist ✅
- [ ] System definition/documentation. Can also be summarized as a brief presentation (0.5p)
- [ ] At least 10 operations/queries, 0.05p each. Maximum score: 0.5p
- [ ] At least 8 classes/objects, 0.05p each. Maximum score: 0.5p
- [ ] Correct use of encapsulation and abstraction, including data types of fields. Maximum score: 0.5p
- [ ] Implementation of the service class/classes. Maximum score: 0.3p
- [ ] Programming using interfaces. Maximum score: 0.3p
- [ ] Using abstract classes. Maximum score: 0.2p
- [ ] Using interfaces. Maximum score: 0.2p
- [ ] Using record classes. Maximum score: 0.2p
- [ ] Sorting elements: 0.1p. Using streams/comparator/functional interfaces: 0.2p
- [ ] Using enums, using optional. Maximum score: 0.2p
- [ ] Using data structures: ArrayList/LinkedList/HashMap/HashSet/TreeMap/TreeSet, excluding sorting. Maximum score: 0.4p
- [ ] General questions, including what we've done so far, and topics discussed on teams. May include SOLID principles/interview questions. Maximum score: 1p
- [ ] Completing documentation/explanations with what you've done. Maximum score: 0.25p
- [ ] Using a database, data persistence using JDBC. Maximum score: 0.5p
- [ ] Using service/repository. Maximum score: 0.5p
- [ ] Using at least one of each type of design pattern: 0.25p each (1 creational, 1 behavioral, 1 structural). Maximum score: 0.75p
- [ ] Using Threads/Runnable. Maximum score: 0.5p
- [ ] Writing to CSV. Maximum score: 0.5p
- [ ] Using Exceptions. Maximum score: 0.25p
- [ ] Using Logger (logging). Maximum score: 0.125p
- [ ] Using Sealed/Non-Sealed Classes. Maximum score: 0.125p
- [ ] Using Generics. Maximum score: 0.125p
- [ ] Using Iterator/Spliterator. Maximum score: 0.125p
- [ ] Using HttpClient and Jackson Library, using mappers. Maximum score: 0.25p
- [ ] Questions from the entire syllabus, including Part 1. Maximum score: 1p


