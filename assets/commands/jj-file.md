# TAGLINE

inspects and manages files in a Jujutsu repository

# TLDR

**List files** tracked in the working copy

```jj file list```

**Print a file** from the working copy

```jj file show [path/to/file]```

**Search** tracked files for a pattern

```jj file search -p "[pattern]"```

**Annotate** a file line by line (blame)

```jj file annotate [path/to/file]```

**Track** paths that auto-track skipped

```jj file track [path/to/file]```

**Stop tracking** ignored paths

```jj file untrack [path/to/file]```

**Make a file executable** in the working copy

```jj file chmod x [path/to/file]```

# SYNOPSIS

**jj file** _subcommand_ [_options_]

# PARAMETERS

**annotate** _PATH_
> Show the source change for each line of a file.

**chmod** _MODE_ _FILESETS_...
> Set or clear the executable bit. _MODE_ is **x** (executable) or **n** (non-executable).

**list** [_FILESETS_...]
> List files in a revision (default: working-copy commit **@**).

**search** **--pattern** _PATTERN_ [_FILESETS_...]
> Search file contents for a string pattern.

**show** _FILESETS_...
> Print file contents from a revision.

**track** _FILESETS_...
> Start tracking specified paths in the working copy.

**untrack** _FILESETS_...
> Stop tracking specified paths. They must already be ignored.

# DESCRIPTION

**jj file** groups file operations in a Jujutsu repository: listing, showing, searching, annotating, tracking, and changing the executable bit. Most subcommands take a fileset and default to the working-copy commit (**@**). Use **-r** / **--revision** on annotate, chmod, list, search, and show to operate on another revision.

Unlike Git, the working copy is a first-class commit, so these commands read and update that commit rather than an index. New files are tracked automatically unless **snapshot.auto-track** is narrowed; **track** and **untrack** then become the manual controls.

# CAVEATS

Subcommand of **jj**. **untrack** only accepts paths that are already ignored (for example by `.gitignore`). **search** is an early command and does not search files concurrently. Template syntax is Jujutsu-specific; see `jj help -k templates`.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-file-list](/man/jj-file-list)(1), [jj-file-show](/man/jj-file-show)(1), [jj-file-search](/man/jj-file-search)(1), [jj-file-annotate](/man/jj-file-annotate)(1), [jj-diff](/man/jj-diff)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-file)```

<!-- verified: 2026-09-01 -->
