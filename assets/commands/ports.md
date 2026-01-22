# TLDR

**Update** ports tree

```ports -u```

**List** ports in current tree

```ports -l```

Show **differences** between installed and ports

```ports -d```

# SYNOPSIS

**ports** [**-u**] [**-l**] [**-d**]

# PARAMETERS

**-u**
> Update the ports tree from configured sources

**-l**
> List all ports in the current tree

**-d**
> Show differences between installed packages and ports

# DESCRIPTION

**ports** manages the ports collection on CRUX Linux. The ports tree contains build recipes (Pkgfiles) for software packages. This tool synchronizes the local ports tree with remote repositories.

The differences option helps identify packages that need updating or are installed from outside the ports system.

# CAVEATS

CRUX-specific tool. Requires network access for updates. Configuration in /etc/ports/. Does not build or install packages directly.

# HISTORY

**ports** is part of the CRUX Linux package management system. CRUX uses a ports-based system inspired by BSD, where package recipes are downloaded and built locally.

# SEE ALSO

[pkgmk](/man/pkgmk)(8), [pkgadd](/man/pkgadd)(8), [prt-get](/man/prt-get)(8)
