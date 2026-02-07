# TAGLINE

Detect Debian installer system architecture

# TLDR

**Detect** system architecture

```archdetect```

# SYNOPSIS

**archdetect**

# DESCRIPTION

**archdetect** determines the system's architecture and subarchitecture in the format used by Debian installer. It outputs a string like "amd64/generic" or "i386/486".

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
