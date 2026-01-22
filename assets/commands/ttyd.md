# TLDR

**Share a bash shell** over the web

```ttyd bash```

**Share on a specific port**

```ttyd -p [8080] bash```

**Share with authentication**

```ttyd -c [username]:[password] bash```

**Share in read-only mode**

```ttyd -R bash```

**Share vim** editor over the web

```ttyd vim [file.txt]```

**Share a tmux session** with multiple clients

```ttyd tmux new -A -s [session_name]```

**Share with SSL** encryption

```ttyd --ssl --ssl-cert [cert.pem] --ssl-key [key.pem] bash```

**Bind to specific interface**

```ttyd -i [eth0] bash```

# SYNOPSIS

**ttyd** [_options_] _command_ [_arguments_...]

# PARAMETERS

**-p**, **--port** _port_
> Port to listen on (default: 7681, use 0 for random)

**-i**, **--interface** _interface_
> Network interface to bind (e.g., eth0) or Unix socket path

**-c**, **--credential** _user:pass_
> Basic authentication credentials

**-u**, **--uid** _uid_
> User ID to run command with

**-g**, **--gid** _gid_
> Group ID to run command with

**-R**, **--readonly**
> Do not allow clients to write to the TTY

**-W**, **--writable**
> Allow clients to write (readonly by default with multiple clients)

**-s**, **--signal** _signal_
> Signal to send on exit (default: 1, SIGHUP)

**--ssl**
> Enable SSL/TLS encryption

**--ssl-cert** _file_
> SSL certificate file path

**--ssl-key** _file_
> SSL key file path

**-O**, **--once**
> Accept only one client and exit when disconnected

**-d**, **--debug** _level_
> Set log level (0-9, default: 7)

# DESCRIPTION

**ttyd** shares a terminal session over the web using WebSockets. It starts a web server (default port 7681) that serves a terminal interface accessible from any web browser. This enables remote terminal access, collaboration, and demonstrations without requiring SSH setup.

Any command can be shared, not just shells. Running **ttyd vim** provides a web-based vim editor. Combining with **tmux** allows multiple users to share the same session simultaneously.

The tool supports basic authentication via **-c**, SSL encryption for secure connections, and can restrict clients to read-only mode. It handles Unicode, CJK characters, and supports file transfer via ZMODEM.

ttyd works on Linux, macOS, FreeBSD, OpenBSD, and Windows.

# CAVEATS

By default, ttyd provides no authentication; always use **-c** or firewall rules in production. Multiple clients connecting without tmux each get separate sessions. The default port 7681 may need firewall configuration for external access.

# HISTORY

**ttyd** was created by **Shuanglei Tao** (tsl0922) and first released around **2016**. Written in C, it uses libwebsockets for WebSocket communication and xterm.js for the browser-based terminal. The project was inspired by older tools like shellinabox but with modern web technologies.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [gotty](/man/gotty)(1), [ssh](/man/ssh)(1)
