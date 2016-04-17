# SyrianHaven

JRE: 1.6.0_65-b14-466.1-11M4716 x86_64
Built in Android Studio 1.5.1 on Mac and mainly tested on Nexus 6P.
Target sdk is 23 (Android 6.0 Marshmallow) and minimum sdk is 15 (Android 4.0.3 KitKat).

-----------------------------------------------------------------------------------------------------------------------

TO RUN:
Download APK files from Github or Google Drive folder below and install on your Android device. You might need to modify your Android’s settings to allow the installation of applications from other sources. Under “Settings,” select “Application Settings” and then enable “Unknown Sources.” 

-----------------------------------------------------------------------------------------------------------------------

APP IDEA DOC:

SyrianHaven aka 5 Countries That Are Possible Havens For Syrian Refugees

I chose this project because my family were refugees before, and I want to create something to help Syrian refugees. It is for the beginner's course though, so it's very basic and doesn't do much of anything. That said, it doesn't look bad and is mostly structurally sound (text sizes are in sp, margins and paddings are used carefully and in dp, styles and methods are used to reduce redundant code). It'll be pretty easy to add different language support in the future or even for a non-English speaker to work on because, aside from a few variables, no strings are hard coded in and I've used the official country codes in naming. 

This project's targetted users are Syrians who are looking to become a refugee in a weathy country, because it's much harder than their neighboring countries. The app shows how much each country has given Syria in financial aid, the number of refugees they're accepting right now, how many have resettled in that country, and other information. 

There are two activities in this app: the dashboard (which consists of 5 buttons that open up the next activity) and the country page. Based on which button is pushed, the app will populate the country activity layout with the appropriate content for that country since all the strings required are in the strings file, it's just a matter of swapping them in when called.

The country activity layout is a ScrollView with nested linear and relative layouts so that it can scroll when the bosy text is long. The saved (or bookmarked) button is labeled "star" or "unstar" because right now it only toggles the star on the upper right via if-statements.

----------------------------------------------------------------------------------------------------------------------
SCREENSHOTS of app and APK files can be found here: https://drive.google.com/open?id=0B88A4msSNNqZNUE3Q25oRUxVcnc

For the project source code, see this Github.
