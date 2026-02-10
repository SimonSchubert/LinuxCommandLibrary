# TAGLINE

terminal-based Google Hangouts client

# TLDR

**Start Google Hangouts client**

```hangups```

**Connect and save credentials**

```hangups --login```

**Manual login**

```hangups --manual-login```

**Use custom key bindings**

```hangups -k [keyfile]```

# SYNOPSIS

**hangups** [_options_]

# PARAMETERS

**--login**
> Force new login.

**--manual-login**
> Manual OAuth login.

**-k**, **--key-bindings** _FILE_
> Custom key bindings file.

**-c**, **--config** _FILE_
> Configuration file.

**--debug**
> Enable debug logging.

**--help**
> Display help information.

# DESCRIPTION

**hangups** is a terminal-based Google Hangouts client. It provides chat functionality from the command line with a text user interface.

The application supports conversations, notifications, and multimedia sharing. It uses Google's authentication for secure access.

# CAVEATS

Requires Google account. Hangouts being deprecated. TUI may have display issues.

# HISTORY

hangups was created by **Tom Dryer** as an unofficial Google Hangouts client for terminal users.

# SEE ALSO

[weechat](/man/weechat)(1), [irssi](/man/irssi)(1), [finch](/man/finch)(1)
