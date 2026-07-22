# TAGLINE

Run merge program for unmerged files

# TLDR

**Run merge for unmerged files**

```git merge-index [merge-program] -a```

**Merge specific file**

```git merge-index [merge-program] [file]```

# SYNOPSIS

**git** **merge-index** [_options_] _merge-program_ _files_...

# PARAMETERS

**-a**
> Run on all unmerged entries.

**-o**
> Don't stop on error.

**-q**
> Quiet mode.

# DESCRIPTION

**git merge-index** runs a specified merge program for each file needing merging. This low-level plumbing command is part of Git's internal merge machinery, invoked during three-way merge operations to handle unmerged files in the index.

The command passes file information (including base, ours, and theirs versions with their object IDs) to the specified merge program. Most users never need to call this directly, as `git merge` handles it automatically. It is exposed for custom merge workflows and understanding Git internals.

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

[git-merge](/man/git-merge)(1), [git-mergetool](/man/git-mergetool)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-merge-index)```

<!-- verified: 2026-07-17 -->
