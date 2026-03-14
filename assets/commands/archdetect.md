# TAGLINE

Detect Debian installer system architecture

# TLDR

**Detect** system architecture

```archdetect```

# SYNOPSIS

**archdetect** [**-g**]

# PARAMETERS

**-g**
> Guess a generic subarchitecture that may be compatible with this machine, useful for new subarchitectures not yet recognized.

# DESCRIPTION

**archdetect** displays the current machine architecture and subarchitecture in the format used by the Debian installer. The architecture corresponds to that built into dpkg and describes CPU (and possibly kernel) types. The subarchitecture distinguishes machines with different boot arrangements.

This is primarily used by the Debian installer to determine which kernel and packages to install.

# OUTPUT FORMAT

```
architecture/subarchitecture
```

Examples:
- amd64/generic
- i386/686
- arm64/generic

# CAVEATS

Specific to Debian-based systems. Output format is for installer use, not general system identification. May not be available on all distributions.

# HISTORY

**archdetect** was created for the Debian installer to standardize architecture detection across installation media.

# SEE ALSO

[arch](/man/arch)(1), [uname](/man/uname)(1), [dpkg](/man/dpkg)(1)
