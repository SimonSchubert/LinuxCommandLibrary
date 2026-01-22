# SSH

## Connect to host
```[ssh](/man/ssh) [user]@[host]```

## Generate SSH key
```[ssh-keygen](/man/ssh-keygen) -b 4096```

## Run a command and exit
```[ssh](/man/ssh) [user]@[host] [command]```

## X11 Session Forwarding
```[ssh](/man/ssh) -X [user]@[host]```

## TCP Port Forwarding
```[ssh](/man/ssh) -L [localPort]:[host]:[port] [user]@[host]```

## SOCKS5 proxying
```[ssh](/man/ssh) -D 9999 [user]@[host]```

## End session
```[exit](/man/exit)```
```[logout](/man/logout)```
```Ctrl+d```

## Push file
```[scp](/man/scp) [localeFile] [user]@[host]:[remoteFile]```

## Pull file
```[scp](/man/scp) [remoteFile] [user]@[host]:.```
