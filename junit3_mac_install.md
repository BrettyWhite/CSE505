# Install Legacy JUnit 3.8.x On OSX 

### Prior

* Pre-Req: you need java installed on your mac. Test by opening the terminal and pasting ``` java -version ```
* It should respond with something along the lines of java version "1.8.0_102" (your numbers may be different)

### This has been tested on OS Sierra and OSX El Capitan

* Download JUnit folder from Moodle
* For ease of use, rename the folder from junit3.x to just junit
* Copy the Junit folder to the root drive '/' (also commonly called Macintosh HD) this will require authentication - be sure you aren't using your home folder
* Open terminal and copy, paste and open:
``` nano .bash_profile  ``` (feel free to use your favorite editor if you dont like nano)
* paste these lines exactly:
```
export JUNIT_HOME="/junit"
export CLASSPATH="$CLASSPATH:$JUNIT_HOME/junit.jar:."
```
* Save the file. In nano it is ctrl+x then you press y then enter
* Log out of your mac completely (click the apple, logout)
* Log back in
* Test the installation by opening terminal and pasting:
```
java -classpath /junit/junit.jar:/junit junit.swingui.TestRunner junit.samples.AllTests  
```
* It should open up a GUI and run through the tests successfully

#### NOTE: THE GREEN BAR DOES NOT SHOW UP ON A MAC
