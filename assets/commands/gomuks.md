# TAGLINE

Terminal Matrix client

# TLDR

**Connect** to Matrix homeserver

```gomuks```

**Connect** with specific user

```gomuks -u [@user:example.com]```

**Connect** to specific server

```gomuks -s [https://matrix.example.com]```

# SYNOPSIS

**gomuks** [_options_]

# PARAMETERS

**-u, --user** _MXID_
> Matrix user ID (@user:server)

**-s, --server** _URL_
> Homeserver URL

**-c, --config** _FILE_
> Configuration file path

**-d, --debug**
> Enable debug logging

**--version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gomuks** is a terminal-based Matrix client. It provides a text-based interface for the Matrix protocol, supporting end-to-end encryption, rooms, direct messages, and file sharing.

The client is designed for users who prefer terminal-based workflows and need Matrix access without a GUI.

# KEYBINDINGS

**↑/↓**
> Navigate messages

**Tab**
> Switch between rooms

**Ctrl+N**
> Next room with unread messages

**Ctrl+P**
> Previous room

**/**
> Search messages

**: or /**
> Command mode

**q**
> Quit

**?**
> Show help

# COMMANDS

**/join** _#room:server_
> Join a room

**/part**
> Leave current room

**/nick** _name_
> Change display name

**/me** _action_
> Send action message

**/react** _emoji_
> React to message

# CAVEATS

End-to-end encryption requires device verification. Some Matrix features may not be supported. Media display is limited in terminal. Requires Matrix account.

# HISTORY

**gomuks** was created as a terminal Matrix client for users preferring CLI-based communication tools.

# SEE ALSO

[element](https://element.io/), [fractal](https://gitlab.gnome.org/GNOME/fractal), [matrix-spec](https://spec.matrix.org/)