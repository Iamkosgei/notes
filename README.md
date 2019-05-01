# Notes Rest Api
A rest api to create and store notes.
## Technologies and frameworks used
    1. java 11
    2. Gradle 4.10
    3. Junit 5
    4. Postgres database
    5. Spring Boot

### Installation
    clone repo
    cd to source folder
    $gradle run 
    
### Database
    CREATE DATABASE notes_db;
    CREATE TABLE note(id SERIAL PRIMARY KEY,title varchar,message varchar);

## End Points
### GET 
    Get all notes
        https://notes01.herokuapp.com/notes
    Get a specific note
        https://notes01.herokuapp.com/notes/{id}
### DELETE
    Delete a specific note
        https://notes01.herokuapp.com/notes/{id}
        
### UPDATE
    Update a specific note
        https://notes01.herokuapp.com/notes/{id}

### POST
    Create a new note
        https://notes01.herokuapp.com/notes/{id}
    

## License
[![MIT Licence](https://badges.frapsoft.com/os/mit/mit-125x28.png?v=103)](LICENSE)