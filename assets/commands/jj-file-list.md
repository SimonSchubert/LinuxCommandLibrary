# TAGLINE

lists files in a Jujutsu revision

# TLDR

**List all files** in the working copy

```jj file list```

**List files** in a specific revision

```jj file list -r [revision]```

**List files** under a path prefix

```jj file list [path/to/directory]```

**List files** with a custom template

```jj file list -T "[template]"```

# SYNOPSIS

**jj file list** [_options_] [_filesets_...]

# PARAMETERS

_FILESETS_
> Only list files matching these prefixes. Default: all files in the revision.

**-r**, **--revision** _REVSET_
> Revision to list (default: working-copy commit **@**).

**-T**, **--template** _TEMPLATE_
> Render each file entry with a custom template. Keywords are the 0-argument methods of the TreeEntry type. Defaults to the **templates.file_list** setting.

# DESCRIPTION

**jj file list** prints the files in a revision. With no arguments it lists every file in the working-copy commit; pass filesets to restrict the listing to matching prefixes.

This is the usual way to enumerate versioned paths (Git's `git ls-files`). Combine it with other tools, for example `rg --no-require-git` over the listed paths, when you want a working-tree search that ignores untracked files.

# CAVEATS

Subcommand of **jj**. Template syntax is Jujutsu-specific; see `jj help -k templates`.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[jj-file](/man/jj-file)(1), [jj-file-show](/man/jj-file-show)(1), [jj-file-search](/man/jj-file-search)(1), [git-ls-files](/man/git-ls-files)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-file-list)```

<!-- verified: 2026-09-01 -->
