# TAGLINE

Report non-free packages on Debian systems

# TLDR

**List** non-free packages

```vrms```

Output **names** only

```vrms --sparse```

Print nothing if **no non-free** packages are installed

```vrms --quiet```

Hide the **explanations** of why packages are non-free

```vrms --noexplain```

# SYNOPSIS

**vrms** [_OPTIONS_]

# PARAMETERS

**-s**, **--sparse**
> Output only package names, suitable for piping to other tools.

**-e**, **--explain**, **--noexplain**
> Show (default) or hide the reasons why packages are considered non-free, read from the reason directory.

**-q**, **--quiet**
> Print nothing if no non-free or contrib packages are installed.

**--reason-dir** _DIR_
> Read the non-free reason files from _DIR_.

**-d**, **--debug**
> Print debug output; repeat for more detail.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**vrms** (Virtual Richard M. Stallman) reports non-free and contrib packages installed on Debian-based systems. It helps identify software that doesn't meet the Debian Free Software Guidelines.

The tool lists packages from non-free and contrib repositories along with their descriptions.

# CAVEATS

Since **Debian 12** (bookworm) the tool ships as **check-dfsg-status**; Debian 11 is the last release with a **vrms** package. Debian-based systems only. Package classification depends on repository metadata. Some packages may be misclassified.

# HISTORY

**vrms** was originally written by **Bdale Garbee** and **Bill Geddes** as a playful tool named after Richard M. Stallman, founder of the Free Software Foundation. It was renamed to **check-dfsg-status** following Debian bug #962696.

# SEE ALSO

[check-dfsg-status](/man/check-dfsg-status)(1), [apt](/man/apt)(8), [dpkg](/man/dpkg)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/debian/check-dfsg-status)```

```[Documentation](https://manpages.debian.org/bullseye/vrms/vrms.1.en.html)```

<!-- verified: 2026-11-23 -->
