# SyrianHavenProject
This app shows 5 countries that are possible havens for Syrian refugees.

JRE: 1.6.0_65-b14-466.1-11M4716 x86_64
Built in Android Studio 1.5.1 on Mac and mainly tested on Nexus 6P.
Target sdk is 23 (Android 6.0 Marshmallow) and minimum sdk is 15 (Android 4.0.3 KitKat).
Created for 2016 Seattle Android Study Jam by Isabelle Giuong

-----------------------------------------------------------------------------------------------------------------------

TO RUN:
Download APK files from Github or Google Drive folder below and install on your Android device. You might need to modify your Android’s settings to allow the installation of applications from other sources. Under “Settings,” select “Application Settings” and then enable “Unknown Sources.” 

-----------------------------------------------------------------------------------------------------------------------

APP IDEA DOC:

I chose this project because I've known many refugees in the past, and I wanted to build something for Syrian refugees. This app is set up to be pretty easy to add different language support in the future, or for a non-English speaker to continue the development because most, if not every one, of the strings live in the strings resource folder. Also, I've used the official country codes in naming the IDs and variables. 

This project's targetted users are Syrians who are looking to become a refugee in a weathy country, because it's hard to seek asylum there, even if you have education or skills. It's harder to seek a better life with so many others in the neighboring poorer countries as well. The app shows how much each country has given Syria in financial aid, the number of refugees they're accepting right now, how many have resettled in that country, and other information. 

There are two activities in this app: the dashboard (which consists of 5 buttons that open up the next activity) and the country page. Based on which button is pushed, the app will populate the country activity layout with the appropriate content for that country since all the strings that are required lies in the strings resource file, it's just a matter of calling them in.

The country activity layout is a ScrollView with nested linear and relative layouts so that it can scroll when the text is very long. The saved (or bookmarked) button is labeled "star" or "unstar" because right now it only toggles the star on the upper right via if-statements.

----------------------------------------------------------------------------------------------------------------------
SCREENSHOTS of app and APK files can be found here: https://drive.google.com/open?id=0B88A4msSNNqZNUE3Q25oRUxVcnc

For the project source code, see this Github.

----------------------------------------------------------------------------------------------------------------------


Sources: Images were all from the public domain and facts were from Wikipedia's page on Refugees of the Syrian Civil War (accessed 4/6/2016) https://en.wikipedia.org/wiki/Refugees_of_the_Syrian_Civil_War
