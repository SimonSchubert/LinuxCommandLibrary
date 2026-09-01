# TAGLINE

prints file contents from a Jujutsu revision

# TLDR

**Print a file** from the working copy

```jj file show [path/to/file]```

**Print a file** from a specific revision

```jj file show -r [revision] [path/to/file]```

**Print every file** under a directory, recursively

```jj file show [path/to/directory]```

**Print file metadata** with a custom template

```jj file show -T "[template]" [path/to/file]```

# SYNOPSIS

**jj file show** [_options_] _filesets_...

# PARAMETERS

_FILESETS_
> Paths to print. Required. A directory is visited recursively.

**-r**, **--revision** _REVSET_
> Revision to read (default: working-copy commit **@**).

**-T**, **--template** _TEMPLATE_
> Render each file's metadata with a custom template. Keywords are the 0-argument methods of the TreeEntry type. Defaults to the **templates.file_show** setting.

# DESCRIPTION

**jj file show** prints the contents of files from a revision. Pass one or more filesets; if a path is a directory, every file under it is printed. Unlike **jj show**, which displays a change (description plus diff), this command dumps blob contents.

Use **-r** to read a file as it existed in another commit. The default template for metadata is **templates.file_show**; override it with **-T**. See `jj help -k templates`.

# CAVEATS

Subcommand of **jj**. At least one fileset is required. Template syntax is Jujutsu-specific.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[jj-file](/man/jj-file)(1), [jj-show](/man/jj-show)(1), [jj-file-list](/man/jj-file-list)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-file-show)```

<!-- verified: 2026-09-01 -->
