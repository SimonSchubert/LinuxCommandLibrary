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

**dunstctl** controls the dunst notification daemon. Provides commands for managing notifications, toggling do-not-disturb mode, and controlling dunst behavior.

# SEE ALSO

[dunst](/man/dunst)(1), [dunstify](/man/dunstify)(1)

