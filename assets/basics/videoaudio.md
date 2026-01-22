# Video & Audio

## Take screenshot of the desktop
```[import](/man/import) -window root [fileName]```
```[gnome-screenshot](/man/gnome-screenshot)```

## Take webcam photo
```[uvccapture](/man/uvccapture) -d/dev/video0 -oscreenURC.jpg -m```

## Play text by computer voice
```[spd-say](/man/spd-say) "I am a robot"```

## Play sound file in wav format
```[aplay](/man/aplay) /usr/share/sounds/alsa/Noise.wav```
```[play](/man/play) /usr/share/sounds/alsa/Noise.wav```

## The classical way to play a beep sound through the PC speakers
```[beep](/man/beep)```

## Mute volume
```[amixer](/man/amixer) set Master mute```
```[pactl](/man/pactl) set-sink-mute 0 1```

## Turn images to a video sequence
```[ffmpeg](/man/ffmpeg) -f image2 -i image%d.jpg [fileName].mpg```

## Turn a video to images
```[ffmpeg](/man/ffmpeg) -i video.mpg image%d.jpg```

## Convert sound from a video to mp3
```[ffmpeg](/man/ffmpeg) -i source_video.avi -vn -ar 44100 -ac 2 -ab 192k -f mp3 sound.mp3```

## Convert mpg to avi
```[ffmpeg](/man/ffmpeg) -i video_origine.mpg video_finale.avi```

## Convert avi to mpg
```[ffmpeg](/man/ffmpeg) -i video_origine.avi video_finale.mpg```

## Convert avi to flv
```[ffmpeg](/man/ffmpeg) -i video_origine.avi -ab 56 -ar 44100 -b 200 -r 15 -s 320x240 -f flv video_finale.flv```

## Convert avi to animated gif
```[ffmpeg](/man/ffmpeg) -i video_origine.avi gif_anime.gif```

## Convert gif to webp
```[gif2webp](/man/gif2webp) [inputFile] -o [outputFile]```

## Convert png/jpg to webp
```[img2webp](/man/img2webp) [inputFile] -o [outputFile]```
