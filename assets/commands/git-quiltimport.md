# TAGLINE

Import quilt patches to commits

# TLDR

**Import quilt patches**

```git quiltimport```

**Import from specific directory**

```git quiltimport --patches [patches/]```

**Dry run**

```git quiltimport -n```

# SYNOPSIS

**git quiltimport** [_options_]

# PARAMETERS

**--patches** _DIR_
> Patches directory. Defaults to patches or $QUILT_PATCHES.

**--series** _FILE_
> Series file location. Defaults to <patches>/series or $QUILT_SERIES.

**-n**, **--dry-run**
> Show what would be imported.

**--author** _AUTHOR_
> Default author.

**--keep-non-patch**
> Pass -b flag to git mailinfo to keep non-patch content in the commit message.

**--help**
> Display help information.

# DESCRIPTION

**git quiltimport** imports a quilt patchset into Git as a series of commits. Quilt is a patch management system, and this command reads the patches directory and series file, creating one commit per patch in order.

The command enables migration from quilt-based development workflows to Git, which was particularly common in Linux distribution packaging before Git became the standard.

# CAVEATS

Requires properly formatted quilt patches. Author info may need specification. One-way import.

# HISTORY

git quiltimport supports migration from **quilt**, a popular patch management tool used before git became widespread, particularly in Linux distribution development.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-am](/man/git-am)(1), [git-apply](/man/git-apply)(1), [quilt](/man/quilt)(1)
