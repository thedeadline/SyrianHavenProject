# SyrianHaven
JRE: 1.6.0_65-b14-466.1-11M4716 x86_64
Built in Android Studio 1.5.1 on Mac and mainly tested on Nexus 6P. Works for API 15 (Android 4.0.3) and later, but works best on API 23 (Android 6.0).

To Run:
Download APK zip from Github or Google Drive folder below and install on your Android device. You might need to modify your Android’s settings to allow the installation of applications from other sources. Under “Settings,” select “Application Settings” and then enable “Unknown Sources.” 

APP IDEA DOC:

SyrianHaven aka 5 Countries That Are Possible Havens For Syrian Refugees

I chose this project because my family were refugees before, and I want to create something to help Syrian refugees. It is for the beginner's course though, s it's very basic and doesn't do much of anything, but I think the way it looks and it's mostly structurally sound (text sizes are in sp, margins and paddings are used carefully and in dp, styles and string files are used to reduced redundant code).

This project's targetted users are Syrians who are looking to become a refugee in a weathy country. 
It tells them about 5 wealthy countries and how much they have given Syria in financial aid, how many refugees they're accepting right now, how many have resettled, and other information. 

There are two activities in this app: the dashboard (which consists of 5 buttons that open up the next activity) and the country page. I think everything accept for a few variables are not hard coded in. Based on which button is pushed, the app will populate the country activity layout with the appropriate content for that country.

The country activity layout is a ScrollView with nested linear and relative layouts so that it can scroll. The saved (or bookmarked) button is labeled "star" or "unstar" because right now it only toggles the star on the upper right.


SCREENSHOTS of app and APK files can be found here: https://drive.google.com/open?id=0B88A4msSNNqZNUE3Q25oRUxVcnc

For the project source code, see this Github.
