# TAGLINE

Arch Linux news reader and pacman hook

# TLDR

**Check** for unread news items

```informant check```

**Read** all unread news interactively

```sudo informant read```

**Mark all news as read** without printing

```sudo informant read --all```

**List** latest news titles

```informant list```

**List only unread** news items

```informant list --unread```

**List news** in reverse order (newest first)

```informant list --reverse```

# SYNOPSIS

**informant** [_options_] _command_

# PARAMETERS

**check**
> Check for unread news items (exit code equals number of unread items). Prints and marks as read if only one unread.

**read**
> Loop through unread items, printing each and prompting to continue. Specify an item by index or title match.

**read --all**
> Mark all items as read without printing them.

**list**
> List recent news titles (read and unread).

**--unread**
> Only show unread items (with `list`).

**--reverse**
> Show items newest first (with `list`).

**-n**, **--count** _NUM_
> Number of items to display.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**informant** is a tool for reading Arch Linux news from the archlinux.org website. It helps users stay informed about important package updates, manual intervention requirements, and system changes.

The tool can be integrated with pacman hooks to prevent updates when unread news items exist, ensuring users review important announcements before proceeding with system updates.

# CAVEATS

Specific to Arch Linux. Requires network access to fetch news. Some operations require root privileges to mark news as read in system-wide cache.

# HISTORY

informant was created to address a common issue in Arch Linux: users updating their systems without reading important news announcements that may require manual intervention. It can block pacman updates until news is acknowledged.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(8), [paru](/man/paru)(8)
