# Video & Audio

## Take screenshot of the desktop
```[import](/man/import) -window root [fileName]```
```[gnome-screenshot](/man/gnome-screenshot)```
```[scrot](/man/scrot)```
```[maim](/man/maim) [fileName]```
```[flameshot](/man/flameshot) gui```
```[spectacle](/man/spectacle)```

## Take webcam photo
```[uvccapture](/man/uvccapture) -d/dev/video0 -oscreenURC.jpg -m```
```[fswebcam](/man/fswebcam) [fileName]```

## Play text by computer voice
```[spd-say](/man/spd-say) "I am a robot"```
```[espeak](/man/espeak) "I am a robot"```

## Play sound file in wav format
```[aplay](/man/aplay) /usr/share/sounds/alsa/Noise.wav```
```[play](/man/play) /usr/share/sounds/alsa/Noise.wav```
```[ffplay](/man/ffplay) /usr/share/sounds/alsa/Noise.wav```
```[mpv](/man/mpv) /usr/share/sounds/alsa/Noise.wav```

## The classical way to play a beep sound through the PC speakers
```[beep](/man/beep)```

## Mute volume
```[amixer](/man/amixer) set Master mute```
```[pactl](/man/pactl) set-sink-mute 0 1```

## Turn images into a video sequence
```[ffmpeg](/man/ffmpeg) -f image2 -i image%d.jpg [fileName].mpg```

## Turn a video into images
```[ffmpeg](/man/ffmpeg) -i video.mpg image%d.jpg```

## Convert audio from video to MP3
```[ffmpeg](/man/ffmpeg) -i source_video.avi -vn -ar 44100 -ac 2 -ab 192k -f mp3 sound.mp3```

## Convert MPG to AVI
```[ffmpeg](/man/ffmpeg) -i video_origine.mpg video_finale.avi```

## Convert AVI to MPG
```[ffmpeg](/man/ffmpeg) -i video_origine.avi video_finale.mpg```

## Convert AVI to FLV
```[ffmpeg](/man/ffmpeg) -i video_origine.avi -ab 56 -ar 44100 -b 200 -r 15 -s 320x240 -f flv video_finale.flv```

## Convert AVI to animated GIF
```[ffmpeg](/man/ffmpeg) -i video_origine.avi gif_anime.gif```

## Convert GIF to WebP
```[gif2webp](/man/gif2webp) [inputFile] -o [outputFile]```

## Convert PNG/JPG to WebP
```[img2webp](/man/img2webp) [inputFile] -o [outputFile]```

## Unmute volume
```[amixer](/man/amixer) set Master unmute```
```[pactl](/man/pactl) set-sink-mute 0 0```

## Record audio
```[arecord](/man/arecord) -f cd [fileName].wav```
```[ffmpeg](/man/ffmpeg) -f alsa -i default [fileName].wav```

## Resize video
```[ffmpeg](/man/ffmpeg) -i [inputFile] -vf scale=[width]:[height] [outputFile]```
