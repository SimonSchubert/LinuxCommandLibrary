# TAGLINE

Update Mageia package repository lists

# TLDR

Update **all** enabled media

```urpmi.update -a```

Update **specific** media by name

```urpmi.update [medium1] [medium2]```

Update only **update** media (security/bugfix repositories)

```urpmi.update --update```

Update all media with **download speed limit**

```urpmi.update -a --limit-rate [100k]```

Update in **quiet** mode

```urpmi.update -a -q```

Force GPG **key** update

```urpmi.update -a --force-key```

**Force** refreshing the synthesis files

```urpmi.update -a -f```

Mark a medium as **ignored** without updating it

```urpmi.update --ignore [medium]```

# SYNOPSIS

**urpmi.update** [_OPTIONS_] [_MEDIUM_...]

# PARAMETERS

**-a**
> Select all enabled non-removable media.

**--update**
> Update only update media.

**-f**
> Force updating the synthesis files. Use **-ff** to really force it.

**--ignore**, **--no-ignore**
> Do not update; mark the media as ignored or enabled.

**--probe-rpms**
> Use rpm files directly instead of synthesis files.

**--urpmi-root** _path_
> Use another root for the urpmi database and rpm installation.

**--no-md5sum**
> Disable MD5SUM file checking.

**--force-key**
> Force update of GPG keys.

**-q**, **--quiet**
> Quiet mode.

**-v**, **--verbose**
> Verbose mode.

**--limit-rate** _rate_
> Limit download speed in bytes/sec (suffixes k, m accepted).

**--wget**
> Use wget for downloading.

**--curl**
> Use curl for downloading.

**--prozilla**
> Use prozilla for downloading.

**--aria2**
> Use aria2 for downloading.

**--metalink**
> Generate and use a local metalink.

**--proxy** _host[:port]_
> Use specified HTTP proxy. The port defaults to 1080.

**--proxy-user** _user:pass_
> Proxy authentication credentials.

# DESCRIPTION

**urpmi.update** updates the list of packages from configured repositories in Mageia Linux. This should be run before installing or upgrading packages to ensure the latest package lists are available.

In Mageia documentation, "medium" and "repository" are used synonymously.

# CAVEATS

Mageia specific. Network access required for remote media. Should be run regularly to get security updates.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmi.addmedia](/man/urpmi.addmedia)(8), [urpmi.removemedia](/man/urpmi.removemedia)(8), [urpme](/man/urpme)(8), [urpmq](/man/urpmq)(8)

# RESOURCES

```[Source code](https://gitweb.mageia.org/software/rpm/urpmi/)```

```[Documentation](https://wiki.mageia.org/en/URPMI)```

<!-- verified: 2026-11-09 -->
