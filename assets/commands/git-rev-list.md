# TAGLINE

List commit objects in reverse chronological order

# TLDR

**List all commits**

```git rev-list HEAD```

**Count commits**

```git rev-list --count HEAD```

**List commits in range**

```git rev-list [commit1]..[commit2]```

**List with date order**

```git rev-list --date-order HEAD```

**List reachable from multiple**

```git rev-list [branch1] [branch2] --not [main]```

**First parent only**

```git rev-list --first-parent HEAD```

# SYNOPSIS

**git** **rev-list** [_options_] _commits_... [_--_] [_paths_...]

# PARAMETERS

**--count**
> Show count only.

**--max-count** _n_
> Limit output.

**--since** _date_
> Commits after date.

**--until** _date_
> Commits before date.

**--author** _pattern_
> Filter by author.

**--first-parent**
> Follow first parent only.

**--ancestry-path**
> Show ancestry path.

**--objects**
> Include all referenced object IDs (trees, blobs), useful for packing.

**--all**
> Walk every ref under `refs/`, plus HEAD.

**--branches**[=_pattern_], **--tags**[=_pattern_], **--remotes**[=_pattern_]
> Walk matching refs under the respective namespace.

**--no-merges**, **--merges**
> Exclude or include merge commits (equivalent to `--max-parents=1` / `--min-parents=2`).

**--min-parents** _n_, **--max-parents** _n_
> Filter commits by parent count.

**--reverse**
> Print commits in chronological order.

**--topo-order**, **--date-order**
> Order output topologically or by commit date.

**--left-right**
> With `A...B`, mark commits as `<` (from A) or `>` (from B).

**--boundary**
> Include excluded boundary commits, prefixed with `-`.

**--grep** _pattern_, **--committer** _pattern_
> Filter by commit message / committer identity, in addition to **--author**.

# DESCRIPTION

**git rev-list** lists commit objects in reverse chronological order. It is a low-level plumbing command used for enumerating reachable commits and objects, forming the basis for many higher-level Git commands.

Common uses include counting commits, finding merge bases, and building commit ranges for other tools.

# SEE ALSO

[git-log](/man/git-log)(1), [git-rev-parse](/man/git-rev-parse)(1), [git-cherry](/man/git-cherry)(1)
