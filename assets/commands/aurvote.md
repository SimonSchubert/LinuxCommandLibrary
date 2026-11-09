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

Credentials are stored in **$XDG_CONFIG_HOME/aurvote** (usually **~/.config/aurvote**) and must be configured before use. The file contains your AUR username, optionally your password (if left empty it is asked on demand), and optionally a cookie file for persistent logins.

# PARAMETERS

**--configure**
> Interactively create the credentials file.

**-v**, **--vote**
> Vote for specified packages (default action).

**-u**, **--unvote**
> Remove votes from specified packages.

**-c**, **--check**
> Check if packages have been voted.

**-k** _cookie_file_
> Use persistent login with the given cookie file.

**--insecure**
> Pass **--insecure** to curl.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# CAVEATS

Requires an AUR account. A stored password is kept in plain text in the configuration file; leave it empty to be prompted instead. Voting requires authentication with the AUR website, and aurvote works by scraping the AUR pages, so changes to the site can break it. The upstream repository has been inactive since 2016 and the package is no longer listed in the AUR; **aurvote-utils** is a maintained alternative.

# SEE ALSO

[yay](/man/yay)(1), [paru](/man/paru)(1), [auracle](/man/auracle)(1)

# RESOURCES

```[Source code](https://github.com/archlinuxfr/aurvote)```

<!-- verified: 2026-11-09 -->
