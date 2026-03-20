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

**Export history** as JSON

```dunstctl history-export```

**Clear notification history**

```dunstctl history-clear```

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

**count** [_displayed_|_history_|_waiting_]
> Show notification count (all categories if no argument given).

**history-export**
> Export notification history as JSON.

**history-clear**
> Delete all notifications from history.

**reload**
> Reload configuration.

**rule** _NAME_ _enable_|_disable_|_toggle_
> Enable, disable, or toggle a named rule.

**action** [_N_]
> Perform default action on notification at position N (0 = top).

**get-pause-level**
> Get current pause level (0 = not paused, 100 = fully paused).

**set-pause-level** _LEVEL_
> Set pause level (0-100), combines with notification override_pause_level.

**debug**
> Print debug information.

**context**
> Open context menu with actions/URLs for open notifications.

# DESCRIPTION

**dunstctl** is the command-line control interface for the dunst notification daemon. It provides runtime management capabilities without requiring configuration file changes or daemon restarts.

The tool allows closing notifications programmatically, managing notification history, toggling pause state (do-not-disturb mode), and reloading dunst's configuration. It's commonly used in window manager keybindings and scripts for notification management.

Key features include history navigation (pop the most recent notification from history), pause state management for temporarily suppressing notifications, and live configuration reloading. The close commands can target specific notifications or clear all visible ones at once. Pause levels (0-100) can be combined with per-notification override_pause_level for selective display during do-not-disturb mode.

# SEE ALSO

[dunst](/man/dunst)(1), [dunstify](/man/dunstify)(1), [notify-send](/man/notify-send)(1)

