# TLDR

List **non-free** and contrib packages

```check-dfsg-status```

Output only **package names**

```check-dfsg-status -s```

# SYNOPSIS

**check-dfsg-status** [_options_]

# DESCRIPTION

**check-dfsg-status** reports non-free and contrib packages installed on Debian-based systems. DFSG stands for Debian Free Software Guidelines, which define what software qualifies as free.

The tool was formerly known as **vrms** (Virtual Richard M. Stallman) and helps users identify proprietary software on their system.

# PARAMETERS

**-s, --sparse**
> Output only package names without descriptions

**-e, --explain**
> Explain why packages are non-free

# CAVEATS

Only checks packages from Debian repositories. Manually installed software or third-party repositories are not analyzed. Classification depends on Debian's package metadata.

# HISTORY

The original **vrms** was created as a playful tool named after Richard Stallman, founder of the Free Software Foundation. It was renamed to check-dfsg-status for a more neutral and descriptive name.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1)
