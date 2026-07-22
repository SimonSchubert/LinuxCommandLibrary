# TAGLINE

lightweight notification daemon for desktops

# TLDR

**Start dunst** notification daemon

```dunst```

**Start with a custom config file**

```dunst -config [path/to/dunstrc]```

**Print notifications** to stdout as well as displaying them

```dunst -print```

**Test dunst** with a sample notification

```notify-send "Title" "Message body"```

**Show the most recent** notification again

```dunstctl history-pop```

**Toggle Do Not Disturb**

```dunstctl set-paused toggle```

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

Notification daemons are **D-Bus activated**, and only one can own the `org.freedesktop.Notifications` name at a time. If a desktop environment already ships one (GNOME and KDE both do), dunst will refuse to start, or will start and never receive anything, depending on who claimed the name first. This is why dunst is mostly seen alongside tiling window managers, which ship no daemon of their own.

The corollary is that dunst does not need to be launched at all in the ordinary case: D-Bus starts it on the first notification. Adding it to an autostart script *and* relying on activation is a common way to end up with two instances.

Note that the flags take a **single dash**, even the long ones: `-config`, `-verbosity`, not `--config`.

Configuration is reloaded on SIGUSR2 in recent versions, but many settings are still read at startup, and an invalid `dunstrc` prevents dunst from starting at all, which on a bare window manager means notifications silently stop working with no visible error. Check with `dunst -verbosity debug` from a terminal when that happens.

# HISTORY

**dunst** was created by **Sascha Kruse** around **2012**, for people running a tiling window manager who found that the notification daemons on offer were either tied to a full desktop environment or drew popups they could not restyle. Its configuration file, which lets any notification be matched on app name, summary, body, or urgency and then restyled or acted upon, is what set it apart and is still the reason people choose it. Wayland support arrived later, and **mako** now fills much the same role for those who want a Wayland-native daemon.

# INSTALL

```apt: sudo apt install dunst```

```dnf: sudo dnf install dunst```

```pacman: sudo pacman -S dunst```

```apk: sudo apk add dunst```

```zypper: sudo zypper install dunst```

```nix: nix profile install nixpkgs#dunst```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dunstctl](/man/dunstctl)(1), [dunstify](/man/dunstify)(1), [notify-send](/man/notify-send)(1), [mako](/man/mako)(1)

# RESOURCES

```[Source code](https://github.com/dunst-project/dunst)```

```[Homepage](https://dunst-project.org)```

<!-- verified: 2026-07-14 -->

