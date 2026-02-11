# TAGLINE

X Window System font server

# TLDR

**Start font server**

```xfs```

**Start with specific config**

```xfs -config [/etc/X11/fs/config]```

**Start on specific port**

```xfs -port [7100]```

**Run as daemon**

```xfs -daemon```

**Start with droppriv user**

```xfs -user [nobody]```

# SYNOPSIS

**xfs** [_options_]

# PARAMETERS

**-config** _file_
> Configuration file (default: /etc/X11/fs/config).

**-port** _num_
> TCP port to listen on (default: 7100).

**-daemon**
> Fork to background.

**-droppriv**
> Drop root privileges after startup.

**-user** _user_
> Run as specified user.

**-ls** _num_
> Listen socket queue length.

# DESCRIPTION

**xfs** is the X Window System font server. It provides fonts to X servers over the network, allowing centralized font management for multiple X displays.

X servers can be configured to request fonts from xfs instead of (or in addition to) local font directories. This was useful for thin clients and diskless workstations sharing fonts from a server.

Configuration defines font paths, client limits, and network settings. The server listens on TCP port 7100 by default.

# CONFIGURATION

Config file: /etc/X11/fs/config

Defines catalogue (font paths), client-limit, and clone-self settings.

# CAVEATS

Deprecated in favor of client-side font rendering (fontconfig/FreeType). Most modern systems don't use xfs. Network font access has security implications. Legacy application only.

# HISTORY

**xfs** was developed for the X Window System to centralize font management. With the transition to client-side rendering using fontconfig and FreeType, xfs became largely obsolete. It remains available for legacy X applications requiring server-side fonts.

# SEE ALSO

[fc-cache](/man/fc-cache)(1), [xlsfonts](/man/xlsfonts)(1), [xset](/man/xset)(1), [mkfontdir](/man/mkfontdir)(1)
