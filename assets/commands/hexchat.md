# TAGLINE

graphical IRC client for Linux, Windows, and macOS

# TLDR

**Start HexChat**

```hexchat```

**Connect to server**

```hexchat [irc://irc.libera.chat/channel]```

**Start minimized**

```hexchat --minimize=2```

**Specify config directory**

```hexchat -d [~/.config/hexchat]```

# SYNOPSIS

**hexchat** [_options_] [_url_]

# PARAMETERS

_url_
> IRC URL to connect to.

**-d**, **--cfgdir** _dir_
> Configuration directory.

**-n**, **--no-plugins**
> Don't load plugins.

**--minimize**=_level_
> Start window minimized: **0** = none, **1** = window minimized, **2** = tray-only.

**-a**, **--no-auto**
> Don't auto-connect to any servers on startup.

**-e**, **--existing**
> Open in existing instance.

**--url** _url_
> Connect to IRC URL.

**-v**, **--version**
> Show version.

# DESCRIPTION

**HexChat** is a graphical IRC client for Linux, Windows, and macOS. It provides a tabbed interface for multiple channels and servers, with features like DCC file transfer, scripting, and extensive customization.

HexChat supports plugins in C, Perl, Python, and Lua. It's a fork of XChat, continuing development with modern features and active maintenance.

# FEATURES

- Tabbed interface for channels
- DCC file transfers
- SSL/TLS support
- Scripting (Python, Perl, Lua)
- Spell checking
- Desktop notifications
- Auto-join and reconnect

# CAVEATS

Configuration stored in ~/.config/hexchat. IRC connections may need SSL. Some networks require registration. Plugin compatibility varies.

# HISTORY

HexChat was forked from **XChat** in **2009** when XChat's Windows builds became shareware. It's maintained by a community of developers and is the most popular graphical IRC client on Linux.

# INSTALL

```apt: sudo apt install hexchat```

```dnf: sudo dnf install hexchat```

```zypper: sudo zypper install hexchat```

```nix: nix profile install nixpkgs#hexchat```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[irssi](/man/irssi)(1), [weechat](/man/weechat)(1)
