# TAGLINE

Compare contents of Slackware packages

# TLDR

**Compare** two packages

```pkgdiff [package1.txz] [package2.txz]```

Compare with **color** output

```pkgdiff -c [package1.txz] [package2.txz]```

Output **unified diff** format

```pkgdiff -a [package1.txz] [package2.txz]```

# SYNOPSIS

**pkgdiff** [**-a**] [**-c**] _package1_ _package2_

# PARAMETERS

**-a**
> Output simple unified diff format

**-c**
> Colorize output for readability

# DESCRIPTION

**pkgdiff** compares the contents of two Slackware packages and displays the differences. It shows files that were added, removed, or modified between package versions, useful for reviewing package updates.

The tool extracts both packages temporarily and compares their file listings and contents, similar to diff but specialized for package archives.

# CAVEATS

Slackware-specific tool. Requires txz/tgz package format. Temporary disk space needed for extraction. Large packages may take time to compare.

# HISTORY

**pkgdiff** is part of Slackware's **pkgtools** package management suite. Slackware uses a simple tar-based package format, and pkgdiff helps maintainers and users understand what changes between package versions.

# SEE ALSO

[installpkg](/man/installpkg)(8), [removepkg](/man/removepkg)(8), [upgradepkg](/man/upgradepkg)(8)
