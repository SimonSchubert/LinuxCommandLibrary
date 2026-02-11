# TLDR

# TAGLINE

Update Mageia package repository lists

# TLDR

Update **all** enabled media

```urpmi.update -a```

Update **specific** media

```urpmi.update [medium1] [medium2]```

Update media by **keyword**

```urpmi.update [keyword]```

Update all **configured** media

```urpmi.update e```

# SYNOPSIS

**urpmi.update** [_OPTIONS_] [_MEDIUM_...]

# PARAMETERS

**-a**
> Update all enabled media

**e**
> Update all configured media including disabled

# DESCRIPTION

**urpmi.update** updates the list of packages from configured repositories in Mageia Linux. This should be run before installing or upgrading packages to ensure the latest package lists are available.

In Mageia documentation, "medium" and "repository" are used synonymously.

# CAVEATS

Mageia specific. Network access required for remote media. Should be run regularly to get security updates.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmi.addmedia](/man/urpmi.addmedia)(8), [urpmi.removemedia](/man/urpmi.removemedia)(8)
