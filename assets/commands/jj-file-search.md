# TAGLINE

searches file contents in a Jujutsu revision

# TLDR

**Search** the working copy for a regex

```jj file search -p "[regex]"```

**Search** with a glob that must match the whole line

```jj file search -p "glob:*[pattern]*"```

**Search** a specific revision

```jj file search -r [revision] -p "[pattern]"```

**Search** only under given paths

```jj file search -p "[pattern]" [path/to/file_or_directory]```

**Print matching paths only**

```jj file search -p "[pattern]" --name-only```

**Prefix each match** with its line number

```jj file search -p "[pattern]" -n```

# SYNOPSIS

**jj file search** [_options_] **--pattern** _PATTERN_ [_filesets_...]

# PARAMETERS

**-p**, **--pattern** _PATTERN_
> Pattern to search for on a single line. Uses Jujutsu string-pattern syntax (`kind:pattern`). The kind defaults to **regex** when omitted.

_FILESETS_
> Only search files matching these prefixes. Default: all files in the revision.

**-r**, **--revision** _REVSET_
> Revision to search (default: working-copy commit **@**).

**--name-only**
> Print only paths of files that contain a match, not the matched lines.

**-n**, **--line-number**
> Prefix each matched line with its 1-based line number within the file.

# DESCRIPTION

**jj file search** prints each line that matches the given pattern, prefixed by the file path. It searches the tree of a revision (default **@**), not an on-disk working tree that may include untracked files.

Patterns use the same string-pattern syntax as revsets. Omit the kind to treat the pattern as a regular expression. For a glob, the whole line must match, so wrap the text: `--pattern 'glob:*foo*'`. See the revsets documentation for the full pattern language.

# CAVEATS

Subcommand of **jj**. **--pattern** is required. This is an early version of the command and does not search files concurrently. Glob patterns match the entire line, not a substring.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[jj-file](/man/jj-file)(1), [jj-file-list](/man/jj-file-list)(1), [grep](/man/grep)(1), [git-grep](/man/git-grep)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-file-search)```

<!-- verified: 2026-09-01 -->
