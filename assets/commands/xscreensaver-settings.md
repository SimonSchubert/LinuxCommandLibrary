# TAGLINE

Configure xscreensaver preferences

# TLDR

**Open screensaver settings**

```xscreensaver-settings```

**Preview specific screensaver**

```xscreensaver-settings -prefs```

# SYNOPSIS

**xscreensaver-settings** [_options_]

# DESCRIPTION

**xscreensaver-settings** is the graphical configuration tool for xscreensaver. It allows enabling/disabling individual screensavers, setting idle timeout, lock screen options, and display preferences.

The interface has two main tabs: Display Modes for selecting and previewing screensavers, and Advanced for timing, locking, and power management settings. Changes are saved to ~/.xscreensaver.

Key settings include idle timeout before blanking, lock screen delay, cycle time between screensavers, and whether to blank all monitors or run different screensavers on each.

# SETTINGS

**Blank After**: Idle time before screen blanks.

**Cycle After**: Time before switching screensavers.

**Lock Screen After**: Grace period before password required.

**Power Management**: Monitor power saving options.

**Mode**: Disable, Blank Only, One Random, or Random.

# CAVEATS

Changes saved to ~/.xscreensaver file. GUI not available under Wayland (edit file manually). Requires xscreensaver daemon running. Previously called xscreensaver-demo.

# HISTORY

**xscreensaver-settings** (formerly xscreensaver-demo) is the configuration GUI for xscreensaver, created by Jamie Zawinski in 1992. Xscreensaver became the most popular X11 screensaver, with hundreds of display modules developed over the years.

# SEE ALSO

[xscreensaver](/man/xscreensaver)(1), [xscreensaver-command](/man/xscreensaver-command)(1)
