# TAGLINE

Remove package repositories in Mageia Linux

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

**-v**
> Be verbose (default)

**-q**
> Be quiet

**--urpmi-root** _DIRECTORY_
> Use the file system tree rooted at _DIRECTORY_ for the urpmi database and configuration

**--wait-lock**
> Wait until the urpmi or rpm database is available if it is busy

# DESCRIPTION

**urpmi.removemedia** removes package repositories (media) from Mageia Linux configuration. Media can be removed by exact name, by fuzzy matching, or all at once.

In Mageia documentation, "medium" and "repository" are used synonymously.

# CAVEATS

Mageia specific. Removing all media leaves no package sources. Requires root privileges.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmi.addmedia](/man/urpmi.addmedia)(8), [urpmi.update](/man/urpmi.update)(8)

# RESOURCES

```[Source code](https://gitweb.mageia.org/software/rpm/urpmi/)```

```[Documentation](https://wiki.mageia.org/en/URPMI)```

<!-- verified: 2026-11-09 -->
