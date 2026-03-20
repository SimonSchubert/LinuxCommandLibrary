# TAGLINE

Update PlatformIO packages and libraries (deprecated)

# TLDR

**Update all packages**

```pio update```

**Update core packages only**

```pio update --core-packages```

**Check for updates without installing**

```pio update --dry-run```

# SYNOPSIS

**pio update** [_options_]

# PARAMETERS

**--core-packages**
> Update core packages only.

**--dry-run**
> Check for new versions without installing.

**-c**, **--only-check**
> Deprecated alias for **--dry-run**.

# DESCRIPTION

**pio update** updates installed PlatformIO Core packages, development platforms, and global libraries. It is a combination of **pio platform update** and **pio lib update**.

# CAVEATS

Deprecated since PlatformIO 6.0 and will be removed in a future release. Use **pio pkg update** instead.

# SEE ALSO

[pio-upgrade](/man/pio-upgrade)(1), [pio-pkg](/man/pio-pkg)(1), [pio-platform](/man/pio-platform)(1), [pio-lib](/man/pio-lib)(1)

