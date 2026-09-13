# TAGLINE

starts tracking specified paths in the Jujutsu working copy

# TLDR

**Track all non-ignored** untracked files

```jj file track```

**Track a file or directory**

```jj file track [path/to/file]```

Track **several paths**

```jj file track [path/to/file1] [path/to/directory]```

Track a path even if it is **ignored or too large**

```jj file track --include-ignored [path/to/file]```

# SYNOPSIS

**jj file track** [**--include-ignored**] [_filesets_...]

# PARAMETERS

_FILESETS_
> Paths to start tracking. With no filesets, every non-ignored untracked path is tracked.

**--include-ignored**
> Track paths even when they match **.gitignore** or exceed the maximum file size.

# DESCRIPTION

**jj file track** starts tracking specified paths in the working copy so they are snapshotted into the working-copy commit.

By default new files are tracked automatically (`snapshot.auto-track` is `all()`), so this command does nothing until that setting is narrowed (for example to `"none()"` or `"glob:**/*.rs"`). Paths that fall outside the auto-track pattern can then be added with this command.

# CAVEATS

Subcommand of **jj**. Ignored files and files over the size limit are skipped unless **--include-ignored** is given. Tracking is a working-copy operation; it is not the same as **jj bookmark track**.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-13 -->

# SEE ALSO

[jj-file](/man/jj-file)(1), [jj-file-untrack](/man/jj-file-untrack)(1), [jj-file-list](/man/jj-file-list)(1), [git-add](/man/git-add)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-file-track)```

<!-- verified: 2026-09-13 -->
