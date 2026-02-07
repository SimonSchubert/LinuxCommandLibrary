# TAGLINE

Gentoo news item reader and manager

# TLDR

**List** news items

```eselect news list```

List only **new** items

```eselect news list new```

**Read** all unread news

```eselect news read```

Read **specific** news items

```eselect news read 1 2 3```

Mark items as **unread**

```eselect news unread 1 2```

**Delete** read news items

```eselect news purge```

**Count** news items

```eselect news count new```

# SYNOPSIS

**eselect news** _action_ [_arguments_]

# DESCRIPTION

**eselect news** is an eselect module for reading Gentoo news items. Portage prints a notice when news is available after repository synchronization.

# PARAMETERS

**list [all|new]**
> List available news items (all by default)

**read [NUMBERS...]**
> Read specified news items or all unread if none specified

**unread NUMBERS...**
> Mark specified news items as unread

**purge**
> Delete all read news items

**count [all|new]**
> Show the number of news items (new by default)

# CAVEATS

News items are repository-specific announcements from Gentoo developers about important changes. Reading news items marks them as read and they won't be announced again.

# HISTORY

**eselect news** is part of the **eselect** framework on Gentoo Linux, providing a modular system for configuration management.

# SEE ALSO

[eselect](/man/eselect)(1), [emerge](/man/emerge)(1)
