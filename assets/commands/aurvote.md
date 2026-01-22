# TLDR

Interactively **configure** AUR credentials

```aurvote --configure```

**Vote** for one or more AUR packages

```aurvote [package1] [package2] ...```

**Unvote** one or more AUR packages

```aurvote -u [package1] [package2] ...```

**Check** if packages have already been voted

```aurvote -c [package1] [package2] ...```

# SYNOPSIS

**aurvote** [_options_] [_packages_]

# DESCRIPTION

**aurvote** allows voting for packages in the Arch User Repository from the command line. Voting helps indicate package popularity and is useful feedback for maintainers.

Credentials are stored in **~/.config/aurvote** and must be configured before use. The file contains your AUR username and password.

# PARAMETERS

**--configure**
> Interactively create the credentials file

**-u, --unvote**
> Remove votes from specified packages

**-c, --check**
> Check if packages have been voted

**-h, --help**
> Display help information

# CAVEATS

Requires an AUR account. Credentials are stored in plain text in the config file. Voting requires authentication with the AUR website.

# SEE ALSO

[yay](/man/yay)(1), [paru](/man/paru)(1), [auracle](/man/auracle)(1)
