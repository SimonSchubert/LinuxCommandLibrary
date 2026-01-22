# System control

## Lock screen
```[gnome-screensaver-command](/man/gnome-screensaver-command) -l```
```[dbus-send](/man/dbus-send) --type=method_call --dest=org.freedesktop.ScreenSaver /ScreenSaver org.freedesktop.ScreenSaver.Lock```

## Unlock screen
```[gnome-screensaver-command](/man/gnome-screensaver-command) -a```
```[dbus-send](/man/dbus-send) --type=method_call --dest=org.freedesktop.ScreenSaver /ScreenSaver org.freedesktop.ScreenSaver.SetActive boolean:false```

## Reboot the system
```[reboot](/man/reboot)```
```[shutdown](/man/shutdown) -r```

## Shutdown the system
```[poweroff](/man/poweroff)```
```[shutdown](/man/shutdown) -h now```
```[reboot](/man/reboot) -p```

## Shutdown the system at specific time
```[shutdown](/man/shutdown) -h 18:45 "Server is going down for maintenance"```

## Stop bluetooth service
```[service](/man/service) bluetooth stop```

## Start bluetooth service
```[service](/man/service) bluetooth start```

## Stop wifi service
```[nmcli](/man/nmcli) nm wifi off```

## Start wifi service
```[nmcli](/man/nmcli) nm wifi on```

## Turn off monitor
```[xset](/man/xset) dpms force off```
