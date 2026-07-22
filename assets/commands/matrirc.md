# TAGLINE

IRC gateway to Matrix with end-to-end encryption

# TLDR

**Run the server** for the first time with registration enabled

```matrirc --allow-register```

**Run the server** in normal mode (after registration is complete)

```matrirc```

**Configure** a directory to store encrypted media files

```matrirc --media-dir [path/to/media]```

**Set the URL prefix** used to serve uploaded media

```matrirc --media-url [https://media.example.com/]```

**Connect from an IRC client** by pointing it at the matrirc port (default 6667) and using your registered Matrix password.

# SYNOPSIS

**matrirc** [_--allow-register_] [_--media-dir path_] [_--media-url url_]

# PARAMETERS

**--allow-register**
> Allow new IRC clients to bind a Matrix account on first connection. Once a nick/password is bound, restart **without** this flag for normal operation.

**--media-dir** _path_
> Local directory where encrypted Matrix media is decrypted and stored when downloaded for IRC clients.

**--media-url** _url_
> URL prefix substituted into messages so IRC clients receive a clickable link to media saved in **--media-dir**.

# DESCRIPTION

**matrirc** is a small, single-binary IRC gateway that lets a standard IRC client connect to a Matrix homeserver. Unlike a server-side application service such as **matrix-appservice-irc**, matrirc runs locally in front of the user's IRC client and translates between the two protocols. It supports Matrix end-to-end encryption (Olm/Megolm) and cross-signing device verification, so encrypted rooms remain readable.

On first launch with **--allow-register**, the server prompts for Matrix login credentials when an IRC client connects with a chosen nick and password. After successful login the nick/password pair is bound to the Matrix session, and subsequent reconnections restore the session without going through registration again. Encrypted media attachments can be decrypted and exposed to the IRC client through a local directory served behind a configurable URL prefix.

The project is written in **Rust** and aimed at users who prefer the IRC client experience but participate in Matrix rooms.

# CAVEATS

Several Matrix features are not yet implemented: topic and icon change notifications, joining rooms from the IRC side, @mentions, and voice/video calls. Media cleanup is manual - downloaded files in **--media-dir** must be pruned by the user. Restarting with **--allow-register** is sometimes required to add a second account; once binding is done, omit the flag.

# CONFIGURATION

State (sessions, encryption keys, room cache) is persisted under matrirc's data directory. The exact path depends on the build but typically lives under **$XDG_DATA_HOME/matrirc** or the directory matrirc is started in. Connect using any IRC client by pointing it at the matrirc-bound port (default IRC port 6667) with the password you registered.

# HISTORY

**matrirc** was created by **Dominique Martinet** (**martinetd**) and is hosted at **github.com/martinetd/matrirc**. It was developed to give long-time IRC users a lightweight, locally-run bridge into Matrix without operating a homeserver-level appservice.

# INSTALL

```aur: yay -S matrirc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[weechat](/man/weechat)(1), [irssi](/man/irssi)(1)
