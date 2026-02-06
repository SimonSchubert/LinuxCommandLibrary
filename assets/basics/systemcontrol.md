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
```[systemctl](/man/systemctl) reboot```

## Shutdown the system
```[poweroff](/man/poweroff)```
```[shutdown](/man/shutdown) -h now```
```[reboot](/man/reboot) -p```
```[systemctl](/man/systemctl) poweroff```
```[halt](/man/halt)```

## Shutdown the system at a specific time
```[shutdown](/man/shutdown) -h 18:45 "Server is going down for maintenance"```

## Stop Bluetooth service
```[service](/man/service) bluetooth stop```
```[systemctl](/man/systemctl) stop bluetooth```

## Start Bluetooth service
```[service](/man/service) bluetooth start```
```[systemctl](/man/systemctl) start bluetooth```

## Stop wifi service
```[nmcli](/man/nmcli) nm wifi off```

## Start wifi service
```[nmcli](/man/nmcli) nm wifi on```

## Turn off monitor
```[xset](/man/xset) dpms force off```

## Suspend the system
```[systemctl](/man/systemctl) suspend```
```[pm-suspend](/man/pm-suspend)```

## Hibernate the system
```[systemctl](/man/systemctl) hibernate```

## List running services
```[systemctl](/man/systemctl) list-units --type=service```
```[service](/man/service) --status-all```

## Start a service
```[systemctl](/man/systemctl) start [serviceName]```
```[service](/man/service) [serviceName] start```

## Stop a service
```[systemctl](/man/systemctl) stop [serviceName]```
```[service](/man/service) [serviceName] stop```

## Enable service at boot
```[systemctl](/man/systemctl) enable [serviceName]```

## View service logs
```[journalctl](/man/journalctl) -u [serviceName]```
