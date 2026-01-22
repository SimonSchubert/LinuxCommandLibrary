# TLDR

**Describe current commit**

```git describe```

**Describe with all tags**

```git describe --tags```

**Describe specific commit**

```git describe [commit]```

**Long format always**

```git describe --long```

**Match tag pattern**

```git describe --match "v*"```

# SYNOPSIS

**git describe** [_options_] [_commit_]

# PARAMETERS

_COMMIT_
> Commit to describe (default: HEAD).

**--tags**
> Use any tag, not just annotated.

**--long**
> Always output long format.

**--match** _PATTERN_
> Only consider matching tags.

**--abbrev** _N_
> Abbreviation length.

**--always**
> Show commit abbrev if no tag found.

**--help**
> Display help information.

# DESCRIPTION

**git describe** gives a human-readable name to a commit based on available tags. It finds the most recent tag reachable from the commit and describes distance from it.

Output format is tag-distance-gSHA, like "v1.0.2-14-g2414721" meaning 14 commits after v1.0.2. If on a tag, just the tag name is returned.

git describe is commonly used for version strings in build systems.

# CAVEATS

Requires tags in history. Annotated tags preferred by default. Distance counting can be slow.

# HISTORY

git describe is a core **Git** command, essential for generating version strings from repository state.

# SEE ALSO

[git-tag](/man/git-tag)(1), [git-log](/man/git-log)(1), [git-rev-parse](/man/git-rev-parse)(1)
