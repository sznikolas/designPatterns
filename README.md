# Tervezési minták összefoglalója (Hungarian)

1. **Builder (Építő) minta**
- Leírás: A Builder minta segít összetett objektumok fokozatos felépítésében anélkül, hogy az összes kötelező mezőt egy konstruktorba kellene tennünk. Hasznos, amikor az objektum sok mezőt tartalmaz, és az összes lehetséges kombináció különböző konstruktorokat eredményezne.
- Használat: Akkor alkalmazzuk, ha az objektumunk összetett, sok mezővel rendelkezik, és különböző konfigurációk szerint kell létrehozni. Például, ha egy User objektumot akarunk létrehozni név, cím, életkor stb. mezőkkel, de ezek nem kötelezőek mindenkor.
- Példa:
```User user = new UserBuilder().setName("John Doe").setAge(30).build();```

2. **Factory (Gyár) minta**
- Leírás: A Factory minta lehetővé teszi különböző típusú objektumok létrehozását ugyanazon interfészen keresztül anélkül, hogy az osztály pontos típusát meg kellene adni. Ezáltal az ügyfélkód nem függ a konkrét osztályoktól.
- Használat: Akkor érdemes használni, ha hasonló típusú objektumokat akarunk létrehozni, de a konkrét implementáció típusa változhat. Például, ha különböző autókat akarunk létrehozni (elektromos vagy benzines), de az interfészen keresztül kell kezelnünk őket.
- Példa:
```Car car = CarFactory.createCar("Electric");```

3. **Adapter minta**
- Leírás: Az Adapter minta két inkompatibilis interfész közötti átalakítást biztosít, hogy együttműködjenek. Ezáltal egy osztály meg tud felelni egy másik osztály elvárásainak anélkül, hogy meg kellene változtatnunk a forráskódot.
- Használat: Akkor használjuk, ha különböző rendszerek vagy régebbi kódok integrálása szükséges, és azok interfészei nem kompatibilisek. Például, ha egy régi logolási osztályt akarunk használni egy új rendszeren belül.
- Példa:
```MediaPlayer player = new MediaAdapter(new OldMediaPlayer());```


4. **Observer (Megfigyelő) minta**
- Leírás: Az Observer minta lehetővé teszi, hogy egy objektum értesítse a hozzá kapcsolt megfigyelőket, amikor egy állapotváltozás történik. Ez a minta különösen hasznos eseményvezérelt rendszerek esetén.
- Használat: Akkor alkalmazzuk, ha szükség van arra, hogy egy objektum változásait több másik objektum is kövesse. Például értesítési rendszereknél, mint a hírcsatornák, vagy bármilyen esemény alapú rendszer.
- Példa:
```Channel channel = new Channel();
Subscriber sub = new Subscriber();
channel.subscribe(sub);
channel.upload("New Video");
```

&nbsp;&nbsp;&nbsp;
# Design Patterns Summary (English)

1. **Builder Pattern**
- Description: The Builder pattern aids in creating complex objects step-by-step without the need to cram all required fields into a single constructor. It's beneficial when the object has multiple fields, and constructing it requires different combinations of parameters.
- Usage: Use it when the object has many fields and you may want to configure them selectively. For example, creating a User object with optional fields like name, address, age, etc.
- Example:
```User user = new UserBuilder().setName("John Doe").setAge(30).build();```

2. **Factory Pattern**
- Description: The Factory pattern allows the creation of different types of objects through a common interface without specifying the exact class. This enables client code to be decoupled from specific class implementations.
- Usage: Use it when you need to create objects of similar type but want to encapsulate the creation logic. For instance, creating different types of cars (electric or petrol) handled through the same interface.
- Example:
```Car car = CarFactory.createCar("Electric");```

3. **Adapter Pattern**
- Description: The Adapter pattern provides an interface conversion between incompatible interfaces to allow them to work together. This enables a class to meet the expectations of another class without altering the source code.
- Usage: Useful when integrating different systems or legacy code with incompatible interfaces. For example, using an old logging class in a modern system.
- Example:
```MediaPlayer player = new MediaAdapter(new OldMediaPlayer());```

4. **Observer Pattern**
- Description: The Observer pattern enables an object to notify attached observers when there is a state change. This pattern is particularly useful in event-driven systems.
- Usage: Use it when changes to one object need to be observed and responded to by other objects. It’s common in notification systems like news feeds or any event-based setup.
- Example:
```Channel channel = new Channel();
Subscriber sub = new Subscriber();
channel.subscribe(sub);
channel.upload("New Video");
```



