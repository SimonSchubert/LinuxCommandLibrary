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

**znc** is an IRC bouncer that stays connected to IRC servers when you disconnect. It buffers messages and plays them back when you reconnect.

The bouncer supports multiple networks, users, and features like SSL and modules.

# CAVEATS

Initial setup required via -c flag. Web interface available on configured port. Requires persistent server for continuous operation.

# SEE ALSO

[irssi](/man/irssi)(1), [weechat](/man/weechat)(1)
