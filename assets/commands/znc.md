# TAGLINE

Advanced IRC bouncer daemon

# TLDR

Run **initial setup**

```znc -c```

**Start** daemon

```znc```

Setup for **systemd**

```sudo -u znc znc -c -d /var/lib/znc```

Enable on **boot**

```systemctl enable znc --now```

# SYNOPSIS

**znc** [_OPTIONS_]

# PARAMETERS

**-c, --makeconf**
> Run initial configuration wizard

**-d, --datadir** _DIR_
> Use specified data directory

**-f, --foreground**
> Run in foreground (no daemon)

**-D, --debug**
> Enable debug output

# DESCRIPTION

**znc** is an IRC bouncer that maintains a persistent connection to IRC servers on your behalf. When you disconnect your IRC client, ZNC stays connected and buffers all messages, channel activity, and notifications, then plays them back when you reconnect.

ZNC supports multiple simultaneous IRC networks and multiple user accounts, making it suitable for both personal use and shared installations. It provides SSL/TLS encryption, a web-based administration interface, and an extensive module system for features like logging, automated responses, and client-side scripting.

Initial configuration is performed interactively with the **-c** flag, which walks through network, user, and port setup. After configuration, ZNC runs as a background daemon by default.

# CAVEATS

Initial setup required via -c flag. Web interface available on configured port. Requires persistent server for continuous operation.

# SEE ALSO

[irssi](/man/irssi)(1), [weechat](/man/weechat)(1)
