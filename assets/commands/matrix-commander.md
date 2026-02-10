# TAGLINE

CLI client for the Matrix communication protocol

# TLDR

**Login and create session**

```matrix-commander --login password```

**Send text message**

```matrix-commander -m "[message]" -r "[!roomid:server]"```

**Send file**

```matrix-commander -f [file.pdf] -r "[!roomid:server]"```

**Send image**

```matrix-commander -i [image.jpg] -r "[!roomid:server]"```

**Listen for messages**

```matrix-commander --listen once```

**List rooms**

```matrix-commander --rooms```

# SYNOPSIS

**matrix-commander** [_options_]

# PARAMETERS

**--login** _method_
> Login (password, sso).

**-m**, **--message** _text_
> Send text message.

**-r**, **--room** _id_
> Target room ID.

**-f**, **--file** _file_
> Send file.

**-i**, **--image** _file_
> Send image.

**--listen** _mode_
> Listen for messages.

**--rooms**
> List joined rooms.

**--verify**
> Verify devices.

**--logout**
> End session.

# DESCRIPTION

**matrix-commander** is a CLI client for the Matrix communication protocol. It enables sending messages, files, and images from scripts and automation, and can listen for incoming messages.

Ideal for bots, notifications, and scripted Matrix interactions.

# CONFIGURATION

```
~/.config/matrix-commander/
├── credentials.json
└── store/
```

# CAVEATS

Requires Python 3. Session must be created first. Encryption requires verification. Room IDs needed for messaging.

# HISTORY

matrix-commander was created to provide a simple command-line interface for Matrix, enabling shell scripting and automation with the Matrix protocol.

# SEE ALSO

[element](/man/element)(1), [gomuks](/man/gomuks)(1), [weechat](/man/weechat)(1)
