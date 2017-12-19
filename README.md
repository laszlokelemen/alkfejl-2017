# alkfejl-2017
Alkalmazások fejlesztése beadandó - Magic Storage

A projektünk célja, hogy létrehozzunk egy virtuális raktárt.

### Funkcionális követelmények:
+ **Felhasználóként** szeretnék bejelentkezni az oldalra.
+ **Felhasználóként** szeretnék szerkeszteni egy terméket.
+ **Felhasználóként** szeretnék törölni egy terméket.
+ **Felhasználóként** szeretnék keresni egy terméket.
+ **Felhasználóként** szeretnék hozzá adni egy új terméket.

### Nem funkcionális követelmények:
+ Használhatóság
+ Teljesítmény
+ Hatékonyság
+ Rendelkezésre állás
+ Biztonság
+ Karbantarthatóság
+ Platformfüggetlenség
+ Felhasználóbarát design

### Használt technológiák, fejlesztői környezetek, programozási nyelvek:
+ **[H2]** - Adatbáziskezelő
+ **[JPA]** - (Java Persistence API) Relációs adatkezelő
+ **[Thymeleaf]** - Szerveroldali template motor XHTML/HTML5/XML-hez
+ **[Lombok]** - Szerveroldali automatikus erőforrás menedzser
+ **[JAVA Spring Boot]** - JAVA szerveroldali keretrendszer
+ **[Git]** - Verziókezelő rendszer
+ **[NetBeans]** - Fejlesztői környezet
+ **[JAVA 7]** - Programozási nyelv (szerveroldal)
+ **[Angular 2/4]** - Programozási nyelv (HTML, CSS, SCSS, Typescript) (kliensoldal)


### Adatbázis terv:
- ![alt text](https://github.com/laszlokelemen/alkfejl-2017/blob/master/DatabaseBasicModel.PNG)

### Alkalmazott könyvtárstruktúra:
```
alkfejl_magic-storage/
     |-src                                   
     |  |-hu.elte.alkfejl.magicstorage         
     |  |  |-api                              
     |  |  |-controller                        
     |  |  |-model                            
     |  |  |-repository                        
     |  |  |-service                           
     |-resources                               
     |  |-application.properties               
     |  |-data.sql                             
```
### Végpontok
 - `@ALL|           GET / `
     - főoldal megjelenítése
 - `@ADMIN, USER|   GET /storage`:
    - Készlet megjelenítése 
 - `@ALL |          GET /storage/add`:
    - Új elem hozzáadása oldal megjelenítése
 - `@ADMIN, USER|   POST /storage/add`:
    - Egy új elem lementése
 - `@ADMIN, USER|   GET /storage/:id`:
    - Elem módosítás oldal megjelenítése
 - `@ADMIN, USER|   POST /storage/:id`:
    - Elem módosításának lementése
 - Felhasználói végpont:
    - `POST /register`: Alkalmazotti oldal megjelenítése
    - `POST /login`: Alkalmazotti oldal bejelentkező oldal megjelenítése
    - `POST /logout`: Alkalmazotti oldal kijelentkező oldal megjelenítése
   







