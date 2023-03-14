# -AndroidKtSharedPreferencesModule
Android Shared Preferences class in Kotlin language + Single UI using some of its methods + picture of it's actual path

# **Usage**
***
[1] **Put [SharedPrefs class](https://github.com/mossssama/-AndroidKtSharedPreferencesModule/blob/main/SharedPrefsKtModule/app/src/main/java/com/example/sharedprefsktmodule/SharedPrefs.kt) in your app folder**

***
[2] **Use the following in the place you want to use SharedPrefs**; substitute the i/p parameters by their equivalent in your project

    // Making an instance of the module
    val sharedPrefs = SharedPrefs.getInstance(applicationContext);

    // Writing in sharedPrefs
    sharedPrefs.write(key,value)


    // Reading from sharedPrefs
    var name = sharedPrefs.read(key,value)

    // Deleting from sharedPrefs
    sharedPrefs.remove(key)
        
- - - - 
## **To Track the actual place of the sharedPrefs xml file**
![Screenshot (760)](https://user-images.githubusercontent.com/92642692/220457185-cf1aafc7-c007-40f1-a81b-38f0e2bdf98f.png)
![Screenshot (761)](https://user-images.githubusercontent.com/92642692/220457191-72ff911e-a7a5-40e3-be5d-3894dfdb8bcc.png)
