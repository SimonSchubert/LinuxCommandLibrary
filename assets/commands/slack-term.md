# TAGLINE

Slack client for the terminal

# TLDR

**Launch with default config**

```slack-term```

**Launch with a custom config file**

```slack-term -config [/path/to/config]```

# SYNOPSIS

**slack-term** [**-config** _path_]

# DESCRIPTION

**slack-term** provides a full terminal-based interface for Slack. It supports three modes: command mode for navigation with Vim-like keybindings, insert mode for composing messages, and search mode for finding content. It connects to Slack via an API token and provides channel navigation, messaging, and notifications.

# CONFIGURATION

**~/.slack-term**
> Default configuration file containing the Slack API token and settings.

# HISTORY

**slack-term** was created by **J.P. Bruins Slot** (jpbruinsslot) and is written in **Go**.

# SEE ALSO

[weechat](/man/weechat)(1), [irssi](/man/irssi)(1), [scli](/man/scli)(1)
