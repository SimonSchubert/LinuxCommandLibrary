# TLDR

**Remove** a medium

```sudo urpmi.removemedia [medium]```

Remove **all** media

```sudo urpmi.removemedia -a```

Remove with **fuzzy** match

```sudo urpmi.removemedia -y [keyword]```

# SYNOPSIS

**urpmi.removemedia** [_OPTIONS_] [_MEDIUM_...]

# PARAMETERS

**-a**
> Remove all media

**-y**
> Fuzzy match on media names

# DESCRIPTION

**urpmi.removemedia** removes package repositories (media) from Mageia Linux configuration. Media can be removed by exact name, by fuzzy matching, or all at once.

In Mageia documentation, "medium" and "repository" are used synonymously.

# CAVEATS

Mageia specific. Removing all media leaves no package sources. Requires root privileges.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmi.addmedia](/man/urpmi.addmedia)(8), [urpmi.update](/man/urpmi.update)(8)
