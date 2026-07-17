# TAGLINE

Find and replace across tracked files

# TLDR

**Find and replace in tracked files**

```git sed "[old]" "[new]"```

**Replace with sed flags** (e.g. case-insensitive)

```git sed -f [i] "[old]" "[new]"```

**Limit to a path**

```git sed "[old]" "[new]" -- [path/]```

**Replace and commit** the result

```git sed -c "[old]" "[new]"```

# SYNOPSIS

**git** **sed** [_-c_] [_-f_ _flags_] _search_ _replacement_ [_flags_] [_--_ _pathspec_]

# PARAMETERS

_SEARCH_
> Pattern to find.

_REPLACEMENT_
> Text to substitute in.

**-f**, **--flags** _flags_
> sed substitution flags to append (e.g. `g`, `i`); may also be given as a trailing positional argument.

**-c**, **--commit**
> Commit the change afterward; fails if the working tree isn't already clean.

**--** _pathspec_
> Limit the replacement to matching files/paths.

# DESCRIPTION

**git sed** runs `git grep` to find matching files, then pipes them through `sed -i` to replace `search` with `replacement`, limiting changes to files tracked by Git so untracked or ignored files are never touched. Part of git-extras, it saves the separate `grep | xargs sed` pipeline for repository-wide renames.

# SEE ALSO

[sed](/man/sed)(1), [git-grep](/man/git-grep)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-sed)```

<!-- verified: 2026-07-17 -->
