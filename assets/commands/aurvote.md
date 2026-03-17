# TAGLINE

Vote for AUR packages from the command line

# TLDR

Interactively **configure** AUR credentials

```aurvote --configure```

**Vote** for one or more AUR packages

```aurvote [package1] [package2] ...```

**Unvote** one or more AUR packages

```aurvote -u [package1] [package2] ...```

**Check** if packages have already been voted

```aurvote -c [package1] [package2] ...```

**Show version** information

```aurvote -V```

# SYNOPSIS

**aurvote** [_options_] [_packages_]

# DESCRIPTION

**aurvote** allows voting for packages in the Arch User Repository from the command line. Voting helps indicate package popularity and is useful feedback for maintainers.

Credentials are stored in **~/.config/aurvote** and must be configured before use. The file contains your AUR username and password.

# PARAMETERS

**--configure**
> Interactively create the credentials file.

**-v**, **--vote**
> Vote for specified packages (default action).

**-u**, **--unvote**
> Remove votes from specified packages.

**-c**, **--check**
> Check if packages have been voted.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# CAVEATS

Requires an AUR account. Credentials are stored in plain text in **~/.config/aurvote**. Voting requires authentication with the AUR website.

# SEE ALSO

[yay](/man/yay)(1), [paru](/man/paru)(1), [auracle](/man/auracle)(1)
