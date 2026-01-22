# TLDR

**Read** all unread news

```sudo informant read```

**Check** for new news items

```informant check```

**List** latest news

```informant list```

Display **help**

```informant -h```

# SYNOPSIS

**informant** [_options_] _command_

# PARAMETERS

**read**
> Mark all news as read and display unread items

**check**
> Check for unread news items (returns non-zero if unread)

**list**
> List recent news items

**-n**, **--count** _NUM_
> Number of items to display

**-h**, **--help**
> Display help message

# DESCRIPTION

**informant** is a tool for reading Arch Linux news from the archlinux.org website. It helps users stay informed about important package updates, manual intervention requirements, and system changes.

The tool can be integrated with pacman hooks to prevent updates when unread news items exist, ensuring users review important announcements before proceeding with system updates.

# CAVEATS

Specific to Arch Linux. Requires network access to fetch news. Some operations require root privileges to mark news as read in system-wide cache.

# HISTORY

informant was created to address a common issue in Arch Linux: users updating their systems without reading important news announcements that may require manual intervention. It can block pacman updates until news is acknowledged.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(8), [paru](/man/paru)(8)
