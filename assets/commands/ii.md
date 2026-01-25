# TLDR

**Connect to IRC server**

```ii -s [irc.libera.chat] -n [nickname]```

**Connect with port**

```ii -s [irc.libera.chat] -p [6697] -n [nickname]```

**Specify IRC directory**

```ii -s [server] -i [~/.irc] -n [nickname]```

**Join channel**

```echo "/j #channel" > ~/irc/server/in```

**Send message**

```echo "Hello world" > ~/irc/server/#channel/in```

# SYNOPSIS

**ii** [_options_]

# PARAMETERS

**-s** _server_
> IRC server address.

**-p** _port_
> Server port (default 6667).

**-n** _nickname_
> IRC nickname.

**-k** _env_var_
> Environment variable for password.

**-f** _fullname_
> Full name (GECOS).

**-i** _prefix_
> IRC directory prefix.

# DESCRIPTION

**ii** (IRC It) is a minimalist filesystem-based IRC client. It creates a directory structure where each server and channel is a directory with **in** (write to send) and **out** (read for messages) files.

This design follows the Unix philosophy, allowing IRC interaction through standard file operations and shell scripts. It can be combined with tools like tail, cat, and custom scripts.

# DIRECTORY STRUCTURE

```
~/irc/
└── irc.libera.chat/
    ├── in          # Send commands
    ├── out         # Server messages
    └── #channel/
        ├── in      # Send to channel
        └── out     # Channel messages
```

# USAGE

```bash
# Monitor channel
tail -f ~/irc/server/#channel/out

# Join channel
echo "/j #linux" > ~/irc/server/in

# Send message
echo "Hello!" > ~/irc/server/#channel/in
```

# CAVEATS

No built-in interface; requires scripts or tools. No SSL support without wrapper. Limited feature set. Manual channel/nick management.

# HISTORY

ii was created as part of the **suckless** project, following their philosophy of minimal, filesystem-based tools. It demonstrates IRC can work with standard Unix file operations.

# SEE ALSO

[irssi](/man/irssi)(1), [weechat](/man/weechat)(1), [sic](/man/sic)(1)
