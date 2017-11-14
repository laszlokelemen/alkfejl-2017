# alkfejl-2017
Alkalmazások fejlesztése beadandó - Magic Storage

A projektünk célja, hogy létrehozzunk egy virtuális raktárt.

### Funkcionális követelmények:
+ **Vendégként** szeretnék a filmek között szabadon böngészni.
+ **Vendégként** szeretném egy film adatait, leírását, előzeteseit megtekinteni.
+ **Vendégként** szeretnék filmeket keresni.
+ **Vendégként** szeretnék regisztrálni az oldalra.
+ **Felhasználóként** szeretnék bejelentkezni az oldalra.
+ **Felhasználóként** szeretném szerkeszteni a profiladataimat.
+ **Felhasználóként** szeretném a saját foglalásaim, illetve vásárlásaim megtekinteni.
+ **Felhasználóként** szeretném értékelni a filmeket.
+ **Adminisztrátorként** szeretnék új filmeket hozzáadni a műsorlistához, illetve törölni is róla.

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
 - `GET / `
     - főoldal megjelenítése
 - `GET /search`
    - Keresési paraméterek:
        - (Értékek: `kód`, `név`, `méret` ,`szín`,`darabszám`)
 - `GET /storage`:
    - Készlet megjelenítése 
 - `GET /storage/add`:
    - Új elem hozzáadása oldal megjelenítése
 - `PUT /storage/add`:
    - Egy új elem lementése
 - `GET /storage/edit`:
    - Elem módosítás oldal megjelenítése
 - Felhasználói végpont:
    - `GET /employee`: Alkalmazotti oldal megjelenítése
    - `POST /employee/login`: Alkalmazotti oldal bejelentkező oldal megjelenítése
    - `POST /employee/logout`: Alkalmazotti oldal kijelentkező oldal megjelenítése
   







