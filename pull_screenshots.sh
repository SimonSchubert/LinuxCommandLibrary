#!/bin/bash
adb root
adb pull /data/data/com.inspiredandroid.linuxcommandbibliotheca/files/ .
echo "Move files from device to project"
mv files/*.png art
echo "Move files to art folder"
rmdir files
echo "Move files to fastlane folder"
cp art/screen-1.png fastlane/metadata/android/en-US/images/phoneScreenshots/01.png
cp art/screen-2-dark.png fastlane/metadata/android/en-US/images/phoneScreenshots/02.png
cp art/screen-3.png fastlane/metadata/android/en-US/images/phoneScreenshots/03.png
cp art/screen-4-dark.png fastlane/metadata/android/en-US/images/phoneScreenshots/04.png
cp art/screen-1-tablet.png fastlane/metadata/android/en-US/images/phoneScreenshots/05.png
cp art/screen-2-tablet-dark.png fastlane/metadata/android/en-US/images/phoneScreenshots/06.png