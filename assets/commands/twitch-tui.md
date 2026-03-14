# TAGLINE

Twitch chat client in the terminal

# TLDR

**Launch the Twitch chat TUI**

```twt```

**Display help**

```twt --help```

**Display version**

```twt --version```

# SYNOPSIS

**twt** [_options_]

# PARAMETERS

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**twitch-tui** is a terminal user interface for reading and interacting with Twitch chat. It features Vim and Emacs inspired keybindings and is designed to pair with streamlink, eliminating the need for a browser while watching Twitch streams.

Configuration is managed through a TOML config file generated on first run. The config controls channels, appearance, and keybindings.

# CONFIGURATION

**~/.config/twt/config.toml**
> Main configuration file for channels, appearance, and keybindings.

# HISTORY

**twitch-tui** was created by **Xithrius** and is written in **Rust**.

# SEE ALSO

[streamlink](/man/streamlink)(1), [irssi](/man/irssi)(1), [weechat](/man/weechat)(1)
