# TAGLINE

Manage TeX Live platform binaries

# TLDR

**List platforms**

```tlmgr platform list```

**Add platform**

```tlmgr platform add [universal-darwin]```

**Remove platform**

```tlmgr platform remove [i386-linux]```

**Force a specific platform**

```tlmgr platform set [x86_64-linux]```

**Return to platform auto detection**

```tlmgr platform set auto```

**Show the detected platform**

```tlmgr print-platform```

# SYNOPSIS

**tlmgr platform** list|add|remove [_platform_...]

**tlmgr platform** set _platform_|auto

# PARAMETERS

**list**
> List platforms available at the repository; installed ones are marked with (i). This is the default.

**add** _platform_...
> Add platform binaries.

**remove** _platform_...
> Remove platform binaries; the currently running platform is always kept.

**set** _platform_
> Always use the given platform instead of auto detection.

**set auto**
> Switch back to auto detection.

**--dry-run**
> Print the actions without installing anything.

# DESCRIPTION

**tlmgr platform** manages TeX Live platform binaries. Same functionality as tlmgr arch, which is a synonym. Install support for multiple operating systems. Part of TeX Live Manager.

# CAVEATS

Not supported on Windows or in user mode.

# SEE ALSO

[tlmgr-arch](/man/tlmgr-arch)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
