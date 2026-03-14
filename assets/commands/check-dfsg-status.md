# TAGLINE

Report non-free packages on Debian systems

# TLDR

List **non-free** and contrib packages

```check-dfsg-status```

Output only **package names**

```check-dfsg-status -s```

Show **explanations** for non-free classification

```check-dfsg-status -e```

# SYNOPSIS

**check-dfsg-status** [_options_]

# DESCRIPTION

**check-dfsg-status** reports installed packages from the non-free and contrib sections on Debian-based systems. DFSG stands for Debian Free Software Guidelines, which define what software qualifies as free in the Debian project.

The tool was formerly known as **vrms** (Virtual Richard M. Stallman) and helps users identify proprietary or non-free software on their system.

# PARAMETERS

**-s**, **--sparse**
> Output only package names without descriptions

**-e**, **--explain**
> Explain why packages are classified as non-free

# CAVEATS

Only checks packages from official Debian repositories. Manually installed software, Flatpaks, Snaps, or third-party repository packages are not analyzed. Classification depends on Debian's section metadata in package control files.

# HISTORY

The original **vrms** was created as a playful tool named after Richard Stallman, founder of the Free Software Foundation. It was renamed to **check-dfsg-status** for a more neutral and descriptive name.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [vrms](/man/vrms)(1)
