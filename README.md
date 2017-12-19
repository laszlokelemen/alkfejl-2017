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

## Szerepkörök
| Szereplő |  |
| ------ | ----------- |
| Látogató   | Böngészheti az oldalt. |
| Felhasználó | Láthatja a termékeket és mennyiségeket, új terméket vihet fel |
| Admin    | Láthatja a termékeket és mennyiségeket, új terméket és készletet vihet fel illetve törölheti azokat |

### Adatbázis terv:
- ![alt text](https://github.com/laszlokelemen/alkfejl-2017/blob/master/DatabaseBasicModel.PNG)

### Alkalmazott backend könyvtárstruktúra:
```
your-storage/
     |-src                                   
     |  |-hu.elte.alkfejl.yourstorage         
     |  |  |-api                        //apicontrollerek
     |  |  |-config                     //login kezelő
     |  |  |-controller                 //login controller
     |  |  |-model                      //modellek  
     |  |  |-repository                 //repositoryk           
     |  |  |-service                    //szervizek   
     |-resources                               
     |  |-application.properties        //adatbázik elérhetőség      
     |  |-data.sql                      //adatbázik feltöltő      
```
### Végpontok
 - `@ALL|           GET / `
     - Főoldal megjelenítése
 - `@ADMIN, USER|   GET /storage`:
    - Termékek megjelenítése 
 - `@ALL |          GET /storage/add`:
    - Új elem hozzáadása oldal megjelenítése
 - `@ADMIN, USER|   POST /storage/add`:
    - Egy új elem lementése
 - `@ADMIN, USER|   GET /storage/:id`:
    - Elem módosítás oldal megjelenítése
 - `@ADMIN|   POST /storage/:id`:
    - Elem módosításának lementése
  - `@ADMIN, USER|   GET /qantity`:
    - Készlet megjelenítése 
 - `@ADMIN, USER|   GET /qantity/:id`:
    - Elem módosítás oldal megjelenítése
 - `@ADMIN|   POST /qantity/:id`:
    - Elem módosításának lementése
 - Felhasználói végpont:
    - `POST /register`: Alkalmazotti oldal megjelenítése
    - `POST /login`: Alkalmazotti oldal bejelentkező oldal megjelenítése
    - `POST /logout`: Alkalmazotti oldal kijelentkező oldal megjelenítése
   

### Alkalmazott frontend könyvtárstruktúra:
```
your-storage/
     |-src                                   
     |  |-app         
     |  |  |-components  
     |  |  |  |-menu  
     |  |  |-model         
     |  |  |-pages
     |  |  |  |-error
     |  |  |  |-help
     |  |  |  |-issues
     |  |  |  |  |-issue-detail
     |  |  |  |  |-issue-list
     |  |  |  |  |-new-issue
     |  |  |  |-login
     |  |  |  |-quantity
     |  |  |  |  |-quantity-detail
     |  |  |  |  |-quantity-list
     |  |  |  |  |-quantity-issue
     |  |  |  |-register
     |  |  |  |-stat
     |  |  |  |-storage
     |  |  |  |  |-storage-detal
     |  |  |  |  |-storage-list
     |  |  |  |  |-storage-issue
     |  |  |-service                            
     |  |  |-utils                           
     |  |-assets                               
     |  |-enviroments                          
```





