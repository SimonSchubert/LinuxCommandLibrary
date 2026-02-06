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
```[scp](/man/scp) [localFile] [user]@[host]:[remoteFile]```
```[rsync](/man/rsync) [localFile] [user]@[host]:[remoteFile]```

## Pull file
```[scp](/man/scp) [user]@[host]:[remoteFile] .```
```[rsync](/man/rsync) [user]@[host]:[remoteFile] .```

## Copy SSH key to server
```[ssh-copy-id](/man/ssh-copy-id) [user]@[host]```

## Connect with specific key
```[ssh](/man/ssh) -i [keyFile] [user]@[host]```

## Push directory
```[scp](/man/scp) -r [localDir] [user]@[host]:[remoteDir]```

## Sync files
```[rsync](/man/rsync) -avz [localDir] [user]@[host]:[remoteDir]```

## Interactive file transfer
```[sftp](/man/sftp) [user]@[host]```

## Mount remote directory
```[sshfs](/man/sshfs) [user]@[host]:[remoteDir] [localDir]```
