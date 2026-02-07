# TAGLINE

lightweight notification daemon for desktops

# TLDR

**Start dunst** notification daemon

```dunst```

**Start with a custom config file**

```dunst -config [path/to/dunstrc]```

**Print notifications** to stdout instead of displaying

```dunst -print```

**Test dunst** with a sample notification

```notify-send "Title" "Message body"```

**Check configuration syntax**

```dunst -print```

**Start with verbose output**

```dunst -verbosity debug```

**Print version information**

```dunst -v```

# SYNOPSIS

**dunst** [_-config file_] [_-print_] [_-verbosity level_] [_-startup_notification_]

# PARAMETERS

**-config** _file_
> Use the specified configuration file.

**-print**
> Print notifications to stdout instead of displaying them.

**-verbosity** _level_
> Set verbosity level: crit, warn, mesg, info, debug.

**-startup_notification**
> Display a notification on startup.

**-v**, **-version**
> Print version information.

**-h**, **-help**
> Display help information.

# CONFIGURATION

**~/.config/dunst/dunstrc**
> Main configuration file controlling appearance, behavior, urgency styling, and notification rules.

# DESCRIPTION

**dunst** is a lightweight notification daemon for X11 and Wayland that displays desktop notifications following the freedesktop.org notification specification. It's highly customizable through its configuration file and popular in tiling window manager setups.

Notifications appear as styled popups that can be configured for position, size, colors, fonts, icons, and behavior. Dunst supports notification actions, urgency levels (low, normal, critical), and can execute scripts when notifications arrive based on rules.

Configuration is done through **~/.config/dunst/dunstrc**. The config file defines global settings, urgency-specific styling, and rules for matching notifications by app name, summary, body, or other criteria. Rules can modify notification appearance or trigger actions.

Key features include notification history (accessed via **dunstctl history-pop**), Do Not Disturb mode, keyboard navigation for interacting with notifications, and support for notification actions. Critical notifications can be configured to persist until acknowledged.

Dunst integrates with **dunstctl** for runtime control and **dunstify** for sending notifications with advanced features like notification replacement and progress bars.

# CAVEATS

Only one notification daemon should run at a time; stop others before starting dunst. Some features require compositor support on Wayland. Icon display requires icon theme configuration. Configuration file must be valid; errors prevent startup.

# HISTORY

**dunst** was created by Sascha Kruse around **2012** as a minimalist notification daemon for users of tiling window managers who wanted lightweight, customizable notifications. The project has been actively maintained with contributions from the community, gaining features like Wayland support and improved styling options.

# SEE ALSO

[dunstctl](/man/dunstctl)(1), [dunstify](/man/dunstify)(1), [notify-send](/man/notify-send)(1), [mako](/man/mako)(1)
