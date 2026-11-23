# TAGLINE

Create a user TeX Live tree for tlmgr user mode

# TLDR

Initialize the default user tree (**TEXMFHOME**)

```tlmgr init-usertree```

Initialize a tree in a **chosen directory**

```tlmgr init-usertree --usertree [path/to/texmf]```

After setup, **install** into that tree

```tlmgr --usermode install [package]```

Use a **non-default** tree for one command

```tlmgr --usermode --usertree [path/to/texmf] install [package]```

# SYNOPSIS

**tlmgr** [**--usertree** _dir_] **init-usertree**

# PARAMETERS

**init-usertree**
> Create the directories and the minimal package database a user tree needs

**--usertree** _dir_
> Use _dir_ instead of the default user tree (**TEXMFHOME**)

# DESCRIPTION

**tlmgr init-usertree** prepares a texmf tree for TeX Live user mode. It is a **tlmgr** action, not a separate binary.

User mode lets someone without write access to the system TeX Live installation install and update packages in a tree of their own. The action creates `web2c` and `tlpkg/tlpobj` under the user tree, plus a minimal `tlpkg/texlive.tlpdb`. The default location is the directory named by **TEXMFHOME**. **--usertree** selects another directory.

Initialization does not turn user mode on. Later package commands must pass **--usermode** every time. No configuration-file setting enables it. With a non-default tree, pass **--usertree** on those commands as well.

The user tree's `texlive.tlpdb` lists only packages that **tlmgr** installed there, plus options from the virtual package `00texlive.installation`. Only relocatable packages can be installed in user mode. Packages that ship executables, and a few core packages, are not relocatable. Most of the TeX Live catalogue is relocatable.

# CAVEATS

Run **init-usertree** before **--usermode** package actions. **tlmgr** warns and refuses actions that user mode does not support. **platform** is not supported. **gui** is not supported in current releases.

Actions that do not need write permission behave as in normal mode. Those include **check**, **help**, **list**, **search**, **show**, and **version**.

In user mode, installing a collection installs its dependent packages but not dependent collections. A package that ships map files rewrites `updmap.cfg` under the user tree's `web2c` directory and keeps a backup of the previous file.

User-mode logs are written under **TEXMFVAR** `/web2c/` rather than the system variable tree.

# SEE ALSO

[tlmgr](/man/tlmgr)(1), [tlmgr-install](/man/tlmgr-install)(1), [tlmgr-update](/man/tlmgr-update)(1), [tlmgr-remove](/man/tlmgr-remove)(1), [tlmgr-option](/man/tlmgr-option)(1), [tex](/man/tex)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

```[Source code](https://www.tug.org/texlive/svn/)```

<!-- verified: 2026-11-23 -->
