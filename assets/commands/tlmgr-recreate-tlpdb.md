# TAGLINE

Reconstruct TeX Live package database

# TLDR

**Print a recreated package database**

```tlmgr recreate-tlpdb```

**Save the recreated database to a file**

```tlmgr recreate-tlpdb > [texlive.tlpdb.new]```

**Specify the default platform when several are installed**

```tlmgr recreate-tlpdb --platform=[x86_64-linux]```

# SYNOPSIS

**tlmgr recreate-tlpdb** [**--platform**=_platform_]

# PARAMETERS

**--platform**=_platform_
> Default platform, needed if the detected one is not installed and several are (alias: **--arch**).

# DESCRIPTION

**tlmgr recreate-tlpdb** reconstructs the TeX Live package database from the package records in **tlpkg/tlpobj** and the platforms found under **bin**. The result is written to standard output; the existing **tlpkg/texlive.tlpdb** is not replaced. Recovery tool for corrupted installations. Part of TeX Live Manager maintenance.

# CAVEATS

Only use if database is corrupted. May not fully restore all package metadata: options are reset to their defaults. This action is not described in the tlmgr manual, so its behavior may change.

# SEE ALSO

[tlmgr-check](/man/tlmgr-check)(1), [tlmgr](/man/tlmgr)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
