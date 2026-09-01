# TAGLINE

shows the source change for each line of a file

# TLDR

**Annotate** a file in the working copy

```jj file annotate [path/to/file]```

**Annotate** starting at a specific revision

```jj file annotate -r [revision] [path/to/file]```

**Annotate** with a custom template

```jj file annotate -T "[template]" [path/to/file]```

# SYNOPSIS

**jj file annotate** [_options_] _PATH_

# PARAMETERS

_PATH_
> File to annotate. Required.

**-r**, **--revision** _REVSET_
> Revision to start from (default: working-copy commit **@**).

**-T**, **--template** _TEMPLATE_
> Render each line with a custom template. Keywords are the 0-argument methods of the AnnotationLine type. Defaults to the **templates.file_annotate** setting.

# DESCRIPTION

**jj file annotate** prints a file line by line with the source change that introduced each line. It is the Jujutsu equivalent of **git blame**: given a path, it walks history from the chosen revision and labels every line with the change that last touched it.

The default template is configured with **templates.file_annotate**. Override it per invocation with **-T**. See `jj help -k templates` for the template language.

# CAVEATS

Subcommand of **jj**. A path must be provided. Template syntax is Jujutsu-specific.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[jj-file](/man/jj-file)(1), [jj-file-show](/man/jj-file-show)(1), [git-blame](/man/git-blame)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-file-annotate)```

<!-- verified: 2026-09-01 -->
