# TAGLINE

Add package repositories in Mageia Linux

# TLDR

**Add** a medium

```sudo urpmi.addmedia [medium] [https://example.com/path/to/media]```

Add from **hard drive**

```sudo urpmi.addmedia [name] file://[path/to/media]```

Add a **distribution** tree from a mirror

```sudo urpmi.addmedia --distrib ftp://[mirror_website]/mirror/mageia/distrib/[version]/[arch]```

Add a distribution using the default **mirror list**

```sudo urpmi.addmedia --distrib --mirrorlist```

Add an **update** medium

```sudo urpmi.addmedia --update [medium] [url]```

# SYNOPSIS

**urpmi.addmedia** [_OPTIONS_] _NAME_ _URL_

**urpmi.addmedia** [_OPTIONS_] **--distrib** [_NAME_] _URL_

**urpmi.addmedia** [_OPTIONS_] **--distrib --mirrorlist** [_URL_]

# PARAMETERS

**--distrib**
> Retrieve a set of media from a distribution; _NAME_ (optional here) is combined with the medium names found

**--mirrorlist** [_URL_]
> Use a mirror list for automatic mirror selection

**--all-media**
> With --distrib, also add media that are skipped by default (such as source rpm media)

**--update**
> Mark the medium as containing updates; with --distrib, add only media flagged "update"

**--raw**
> Add the medium to the configuration without updating it

**--no-verify-rpm**
> Disable rpm signature checking for the new medium

# DESCRIPTION

**urpmi.addmedia** adds package repositories (media) in Mageia Linux. Supported media include http, https, ftp, ssh, rsync, local directories (file://), removable drives (cdrom://), and mirror lists. URLs may contain variables such as $RELEASE, $ARCH, and $MIRRORLIST.

In Mageia documentation, "medium" and "repository" are used synonymously.

# CAVEATS

Mageia specific. Requires root privileges.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmi.removemedia](/man/urpmi.removemedia)(8), [urpmi.update](/man/urpmi.update)(8)

# RESOURCES

```[Source code](https://gitweb.mageia.org/software/rpm/urpmi/)```

```[Documentation](https://wiki.mageia.org/en/URPMI)```

<!-- verified: 2026-11-09 -->
