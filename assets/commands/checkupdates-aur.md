# TLDR

List pending updates for **AUR packages**

```checkupdates-aur```

List pending updates in **debug mode**

```CHECKUPDATES_DEBUG=1 checkupdates-aur```

# SYNOPSIS

**checkupdates-aur** [_options_]

# DESCRIPTION

**checkupdates-aur** checks for pending updates from the Arch User Repository (AUR). It compares locally installed AUR packages against the latest versions available in the AUR.

This tool complements the standard checkupdates command by covering packages not in the official repositories.

# PARAMETERS

**--help**
> Display help message

# ENVIRONMENT

**CHECKUPDATES_DEBUG**
> Set to 1 to enable debug output

# CAVEATS

Arch Linux specific. Only checks packages that were originally installed from the AUR. Requires network access to query the AUR API.

# SEE ALSO

[checkupdates](/man/checkupdates)(1), [yay](/man/yay)(1), [paru](/man/paru)(1)
