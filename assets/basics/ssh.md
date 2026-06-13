# SSH

## Connecting
Connect as a user on a remote host, optionally on a non-standard port, or run a single command and return.
```[ssh](/man/ssh) [user]@[host]```
```[ssh](/man/ssh) -p 2222 [user]@[host]```
```[ssh](/man/ssh) [user]@[host] [command]```

End the session with **exit**, **logout**, or **Ctrl+d**.

First connection to a host? SSH shows its key fingerprint and stores it in ~/.ssh/known_hosts. A sudden "host key changed" warning later means the server was reinstalled, or someone is intercepting the connection.

If a session hangs (network drop), type **Enter ~ .** to force-close it.

## Keys & Passwordless Login
Generate a key pair; **ed25519** is the modern default (use **-t rsa -b 4096** only when a legacy server requires RSA). The private key stays on your machine, the public key goes to servers.
```[ssh-keygen](/man/ssh-keygen) -t ed25519```
```[ssh-keygen](/man/ssh-keygen) -t rsa -b 4096```

Install your public key on a server, then log in without a password.
```[ssh-copy-id](/man/ssh-copy-id) [user]@[host]```
```[ssh](/man/ssh) -i [keyFile] [user]@[host]```

The agent keeps decrypted keys in memory, so a passphrase-protected key only has to be unlocked once per session.
```[ssh-add](/man/ssh-add)```
```[ssh-add](/man/ssh-add) -l```

**Always protect private keys with a passphrase**, and keep ~/.ssh/id_ed25519 mode **600**. The .pub file is the one that is safe to share.

## Client Config
Connection settings live in **~/.ssh/config**, one block per host. After that, **ssh myserver** replaces the whole user/host/port/key incantation, and tab completion picks up the alias.
```
Host myserver
    HostName server.example.com
    User admin
    Port 2222
    IdentityFile ~/.ssh/id_ed25519
```
```[ssh](/man/ssh) myserver```

## Transferring Files
**scp** copies files and directories (**-r**); **rsync** does the same but resumes and transfers only differences, which makes it better for anything large or repeated.
```[scp](/man/scp) [localFile] [user]@[host]:[remotePath]```
```[scp](/man/scp) [user]@[host]:[remoteFile] .```
```[scp](/man/scp) -r [localDir] [user]@[host]:[remoteDir]```
```[rsync](/man/rsync) -avz [localDir]/ [user]@[host]:[remoteDir]/```

**sftp** gives an interactive session with **get**, **put**, **ls**, and **cd**; **sshfs** mounts a remote directory like a local disk.
```[sftp](/man/sftp) [user]@[host]```
```[sshfs](/man/sshfs) [user]@[host]:[remoteDir] [localDir]```
```fusermount -u [localDir]```

## Port Forwarding
**-L** makes a remote service reachable locally: the example exposes the database running on the server's localhost:5432 at your own localhost:5432. **-N** opens the tunnel without starting a shell.
```[ssh](/man/ssh) -L 5432:localhost:5432 [user]@[host]```
```[ssh](/man/ssh) -N -L 8080:internal-host:80 [user]@[gateway]```

**-R** is the reverse: a port on the remote server forwards to your machine.
```[ssh](/man/ssh) -R 8080:localhost:3000 [user]@[host]```

**-D** turns the connection into a SOCKS5 proxy; point your browser at localhost:9999 to route its traffic through the server.
```[ssh](/man/ssh) -D 9999 [user]@[host]```

## Jump Hosts & X11
Reach a machine that is only accessible through a bastion with **-J**, and run graphical programs over the connection with **-X**.
```[ssh](/man/ssh) -J [user]@[bastion] [user]@[internalHost]```
```[ssh](/man/ssh) -X [user]@[host]```

## Keeping Sessions Alive
Send keep-alive packets so idle connections survive NAT timeouts; set it per host or globally in ~/.ssh/config.
```
Host *
    ServerAliveInterval 60
```

For work that must survive a disconnect, run **tmux** on the server: reattach after reconnecting and your programs are still running (see the Tmux basics page).
