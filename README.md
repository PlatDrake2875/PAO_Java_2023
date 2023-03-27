# Spotable

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


Audio Content:
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
1) Menu  
2.1, 2.2) User (Abstract), UserService (Interface) 
    3) Artist
    4) User
5.1, 5.2) Product (Abstract), ProductService (Interface)
	6) Song
	7) Podcast
	8) Audiobook
9) Playlist 

There are also some ENUMS and RECORDS involved in there that I didn't mentioned explicitly because they are of little concern.


TODO: Write some clean markdown :) 
