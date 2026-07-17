# TAGLINE

Output information on each reference with custom formatting

# TLDR

**List all refs**

```git for-each-ref```

**List branches**

```git for-each-ref refs/heads```

**List tags**

```git for-each-ref refs/tags```

**Custom format**

```git for-each-ref --format='%(refname:short) %(objectname:short)' refs/heads```

**Sort by date**

```git for-each-ref --sort=-committerdate refs/heads```

**Show latest N refs**

```git for-each-ref --count=[10] --sort=-committerdate refs/heads```

# SYNOPSIS

**git** **for-each-ref** [_options_] [_patterns_...]

# PARAMETERS

**--format** _format_
> Output format string using %(fieldname) placeholders (default: `%(objectname) %(objecttype)\t%(refname)`).

**--sort** _key_
> Sort by field name; prefix with **-** for descending. Repeatable, last key is primary.

**--count** _n_
> Stop after showing _n_ refs.

**--points-at** _object_
> Only list refs pointing at the given object.

**--merged**[=_commit_]
> Only list refs whose tips are reachable from _commit_ (default HEAD).

**--no-merged**[=_commit_]
> Only list refs whose tips are not reachable from _commit_ (default HEAD).

**--contains**[=_commit_]
> Only list refs that contain the given commit.

**--exclude** _pattern_
> Omit refs matching _pattern_.

**--stdin**
> Read the list of patterns from standard input instead of the argument list.

**--ignore-case**
> Case-insensitive sorting and filtering.

**--shell**, **--perl**, **--python**, **--tcl**
> Quote interpolated values as string literals for the given scripting language.

# DESCRIPTION

**git for-each-ref** is a plumbing command that outputs detailed information about Git references (branches, tags, remote branches) in a highly customizable format. It serves as the foundation for many higher-level Git commands and scripts that need to process repository references.

The format string syntax supports field extraction using %(fieldname) placeholders, with available fields including refname, objecttype, objectname, author, committer, and many others. Sorting capabilities enable ordering references by any field, with support for reverse sorting using a minus prefix.

This command is primarily used in scripts and Git aliases rather than direct user interaction. The filtering options (--merged, --no-merged, --points-at) provide powerful selection mechanisms for finding references matching specific criteria.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-tag](/man/git-tag)(1), [git-rev-parse](/man/git-rev-parse)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-for-each-ref)```

<!-- verified: 2026-07-17 -->
