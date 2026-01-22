# TLDR

**Add** a medium

```sudo urpmi.addmedia [medium] [ftp://ftp.site.com/path/to/Mageia/RPMS]```

Add from **hard drive**

```sudo urpmi.addmedia --distrib HD file://[path/to/repo]```

Add from **mirror**

```sudo urpmi.addmedia --distrib ftp://[mirror_website]/mirror/mageia/distrib/[version]/[arch]```

Add from **mirror list**

```sudo urpmi.addmedia --distrib --mirrorlist [mirrorlist]```

# SYNOPSIS

**urpmi.addmedia** [_OPTIONS_] _NAME_ _URL_

# PARAMETERS

**--distrib**
> Add all standard media from a distribution

**--mirrorlist** _URL_
> Use mirror list for automatic selection

**HD**
> Specify local hard drive media

# DESCRIPTION

**urpmi.addmedia** adds package repositories (media) in Mageia Linux. Media can be added from FTP servers, HTTP servers, local directories, or mirror lists.

In Mageia documentation, "medium" and "repository" are used synonymously.

# CAVEATS

Mageia specific. Local repositories require running genhdlist2 first. Requires root privileges.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmi.removemedia](/man/urpmi.removemedia)(8), [urpmi.update](/man/urpmi.update)(8)
