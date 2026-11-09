# TAGLINE

Manage TeX Live platform binaries (old name of tlmgr platform)

# TLDR

**List available platforms**

```tlmgr arch list```

**Add platform binaries**

```tlmgr arch add [aarch64-linux]```

**Remove platform binaries**

```tlmgr arch remove [i386-linux]```

**Preview adding a platform**

```tlmgr arch add --dry-run [aarch64-linux]```

# SYNOPSIS

**tlmgr arch** list|add|remove [_platform_...]

**tlmgr arch** set _platform_|auto

# PARAMETERS

**list**
> List platforms available at the repository; installed ones are marked with (i). This is the default.

**add** _platform_...
> Add platform binaries.

**remove** _platform_...
> Remove platform binaries; the currently running platform is always kept.

**set** _platform_|auto
> Always use the given platform, or return to auto detection.

**--dry-run**
> Print the actions without installing anything.

# DESCRIPTION

**tlmgr arch** manages TeX Live platform support. Install binaries for additional architectures for cross-platform TeX distribution. **arch** is the old name of the **platform** action; tlmgr treats the two identically.

# SEE ALSO

[tlmgr-platform](/man/tlmgr-platform)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
