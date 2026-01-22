# TLDR

**Launch** finch

```finch```

**Quit** finch

```<Alt q>|<Ctrl c>```

Show **actions** menu

```<Alt a>```

Jump to **n-th** window

```<Alt [Number]>```

**Close** current window

```<Alt c>```

Start **moving** a window

```<Alt m>```

Start **resizing** a window

```<Alt r>```

# SYNOPSIS

**finch** [_options_]

# DESCRIPTION

**finch** is a console-based modular messaging client using the libpurple library (same as Pidgin). It supports multiple protocols including XMPP, IRC, and various proprietary services.

Text-based alternative to the Pidgin GUI client.

# PARAMETERS

**-c, --config** _dir_
> Use alternate configuration directory

**-d, --debug**
> Enable debug output

**-v, --version**
> Display version

# CAVEATS

Requires ncurses library. Uses same libpurple plugins as Pidgin. Account configuration shared with Pidgin if using same config directory.

# SEE ALSO

[pidgin](/man/pidgin)(1), [irssi](/man/irssi)(1), [weechat](/man/weechat)(1)
