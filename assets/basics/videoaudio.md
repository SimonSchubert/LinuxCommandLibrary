# Video & Audio

## Screenshots
Desktop-environment tools (**gnome-screenshot**, **spectacle**, **flameshot**) come with the desktop; **scrot** and **maim** work anywhere on X11, **grim** on Wayland.
```[flameshot](/man/flameshot) gui```
```[gnome-screenshot](/man/gnome-screenshot)```
```[spectacle](/man/spectacle)```
```[scrot](/man/scrot)```
```[maim](/man/maim) [fileName].png```
```[grim](/man/grim) [fileName].png```
```[import](/man/import) -window root [fileName].png```

## Screen Recording
Record the screen with ffmpeg on X11 or **wf-recorder** on Wayland. For terminal sessions, **asciinema** records text instead of pixels.
```[ffmpeg](/man/ffmpeg) -f x11grab -i :0.0 recording.mp4```
```[wf-recorder](/man/wf-recorder) -f recording.mp4```
```[recordmydesktop](/man/recordmydesktop)```
```[asciinema](/man/asciinema) rec session.cast```

## Webcam
Take a photo from the webcam.
```[fswebcam](/man/fswebcam) [fileName].jpg```
```[ffmpeg](/man/ffmpeg) -f v4l2 -i /dev/video0 -frames:v 1 [fileName].jpg```
```[uvccapture](/man/uvccapture) -d/dev/video0 -o[fileName].jpg```

## Playing Audio & Video
**mpv** and **vlc** play virtually anything. **ffplay** is ffmpeg's bare-bones player; **aplay** and **play** handle simple sound files.
```[mpv](/man/mpv) [file]```
```[vlc](/man/vlc) [file]```
```[ffplay](/man/ffplay) [file]```
```[aplay](/man/aplay) sound.wav```
```[play](/man/play) sound.wav```

## Volume
**alsamixer** and **pavucontrol** are the interactive mixers. From scripts, **pactl** controls the PulseAudio/PipeWire default output.
```[alsamixer](/man/alsamixer)```
```[pavucontrol](/man/pavucontrol)```
```[pactl](/man/pactl) set-sink-volume @DEFAULT_SINK@ +5%```
```[pactl](/man/pactl) set-sink-mute @DEFAULT_SINK@ toggle```
```[amixer](/man/amixer) set Master mute```
```[amixer](/man/amixer) set Master unmute```

## Recording Audio
Record from the default microphone.
```[arecord](/man/arecord) -f cd [fileName].wav```
```[ffmpeg](/man/ffmpeg) -f alsa -i default [fileName].wav```

## Speech & Beep
Make the computer talk, or play the classic PC speaker beep.
```[spd-say](/man/spd-say) "I am a robot"```
```[espeak](/man/espeak) "I am a robot"```
```[beep](/man/beep)```

## Inspect Media Files
Show codecs, resolution, duration, and bitrate.
```[ffprobe](/man/ffprobe) [file]```
```[mediainfo](/man/mediainfo) [file]```

## Converting with ffmpeg
ffmpeg picks the output format from the file extension, so plain conversion needs no flags.
```[ffmpeg](/man/ffmpeg) -i input.avi output.mp4```
```[ffmpeg](/man/ffmpeg) -i input.mp4 output.webm```

Extract the audio track as MP3 (**-vn** drops the video, **-b:a** sets the audio bitrate; **-q:a 0** uses best variable quality instead).
```[ffmpeg](/man/ffmpeg) -i video.mp4 -vn -b:a 192k audio.mp3```
```[ffmpeg](/man/ffmpeg) -i video.mp4 -vn -q:a 0 audio.mp3```

Resize a video; **-1** keeps the aspect ratio.
```[ffmpeg](/man/ffmpeg) -i input.mp4 -vf scale=1280:-1 output.mp4```

## Cutting Video
**-ss** sets the start, **-t** the duration. **-c copy** cuts without re-encoding: instant and lossless, but only accurate to the nearest keyframe.
```[ffmpeg](/man/ffmpeg) -ss 00:01:30 -i input.mp4 -t 00:00:20 -c copy clip.mp4```
```[ffmpeg](/man/ffmpeg) -ss 00:01:30 -i input.mp4 -t 00:00:20 clip.mp4```

## Images & Video
Turn a numbered image sequence into a video and back, or make an animated GIF.
```[ffmpeg](/man/ffmpeg) -framerate 24 -i image%d.jpg video.mp4```
```[ffmpeg](/man/ffmpeg) -i video.mp4 image%d.jpg```
```[ffmpeg](/man/ffmpeg) -i video.mp4 -vf "fps=10,scale=480:-1" animation.gif```

Convert images to the WebP format.
```[gif2webp](/man/gif2webp) [inputFile] -o [outputFile]```
```[img2webp](/man/img2webp) [inputFile] -o [outputFile]```
