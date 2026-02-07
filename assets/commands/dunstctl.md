# TAGLINE

runtime control interface for dunst

# TLDR

**Show notification history**

```dunstctl history-pop```

**Close current notification**

```dunstctl close```

**Close all notifications**

```dunstctl close-all```

**Toggle do-not-disturb**

```dunstctl set-paused toggle```

**Check if paused**

```dunstctl is-paused```

**Show notification count**

```dunstctl count```

**Reload configuration**

```dunstctl reload```

# SYNOPSIS

**dunstctl** _command_ [_args_]

# SUBCOMMANDS

**close**
> Close current notification.

**close-all**
> Close all notifications.

**history-pop**
> Show notification from history.

**set-paused** _state_
> Set pause state (true, false, toggle).

**is-paused**
> Check pause state.

**count**
> Show notification count.

**reload**
> Reload configuration.

**debug**
> Print debug information.

**context**
> Open context menu.

# DESCRIPTION

**dunstctl** is the command-line control interface for the dunst notification daemon. It provides runtime management capabilities without requiring configuration file changes or daemon restarts.

The tool allows closing notifications programmatically, managing notification history, toggling pause state (do-not-disturb mode), and reloading dunst's configuration. It's commonly used in window manager keybindings and scripts for notification management.

Key features include history navigation (pop the most recent notification from history), pause state management for temporarily suspressing notifications, and live configuration reloading. The close commands can target specific notifications or clear all visible ones at once.

# SEE ALSO

[dunst](/man/dunst)(1), [dunstify](/man/dunstify)(1)

