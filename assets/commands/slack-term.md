# TAGLINE

Slack client for the terminal

# TLDR

**Launch with default config**

```slack-term```

**Launch with a custom config file**

```slack-term -config [/path/to/config]```

**Launch with a Slack token directly**

```slack-term -token [xoxp-your-slack-token]```

**Launch with debugging enabled**

```slack-term -debug```

# SYNOPSIS

**slack-term** [**-config** _path_] [**-token** _token_] [**-debug**]

# PARAMETERS

**-config** _path_
> Location of the config file. Defaults to ~/.config/slack-term/config.

**-token** _token_
> Slack authentication token. Overrides the token in the config file.

**-debug**
> Enable debugging mode.

# DESCRIPTION

**slack-term** provides a full terminal-based interface for Slack. It supports three modes: command mode for navigation with Vim-like keybindings, insert mode for composing messages, and search mode for finding content. It connects to Slack via an API token and provides channel navigation, messaging, and notifications.

# CONFIGURATION

**~/.config/slack-term/config**
> Default JSON configuration file containing the Slack API token and settings.

# HISTORY

**slack-term** was created by **J.P. Bruins Slot** (erroneousboat) and is written in **Go**.

# SEE ALSO

[weechat](/man/weechat)(1), [irssi](/man/irssi)(1), [scli](/man/scli)(1), [screen](/man/screen)(1)
