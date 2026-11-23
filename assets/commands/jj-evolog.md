# TAGLINE

shows the evolution history of a change

# TLDR

**Show evolution log**

```jj evolog```

**Evolog for specific revision(s)**

```jj evolog -r [revset]```

**Show with diff**

```jj evolog -p```

**Limit entries**

```jj evolog -n [10]```

**Flat list (no graph)**

```jj evolog --no-graph```

**Show evolution of a specific change** with diffs

```jj evolog -r [change_id] -p```

**Show oldest entries first**

```jj evolog --reversed```

# SYNOPSIS

**jj evolog** [_options_]

# PARAMETERS

**-r**, **--revisions** _REVSETS_
> Follow evolution of these revisions (default: _@_, the working-copy commit).

**-n**, **--limit** _LIMIT_
> Limit the number of revisions to show.

**--reversed**
> Show revisions in opposite order (older first).

**-G**, **--no-graph**
> Hide the ASCII graph and show a flat list of revisions.

**-T**, **--template** _TEMPLATE_
> Render output using a custom template expression.

**-p**, **--patch**
> Show a diff against the previous version of each change.

**-s**, **--summary**
> For each path, show only whether it was modified, added, or deleted.

**--stat**
> Show a histogram of the changes per file.

**--git**
> Format diffs in Git-compatible form.

**--name-only**
> Show only path names of changed files.

**--help**
> Display help information.

# DESCRIPTION

**jj evolog** (evolution log) shows how a change has evolved over time: it lists the previous commits that a change ID has pointed to. Every time a change is amended, rebased, squashed into, or snapshotted from the working copy, a new commit replaces the old one while the change ID stays the same.

With **-p**, each entry is diffed against its predecessor; if the predecessor had different parents, it is temporarily rebased first so the diff only shows the actual edit. This makes evolog useful for recovering an earlier version of a change (e.g. with **jj restore --from** _commit_) after an unwanted edit. Since jj 0.30, the operation that created each entry is also shown.

# CAVEATS

Entries are commit IDs that are usually hidden; they remain reachable until the operation log is garbage collected. The output format defaults to the **templates.evolog** setting. **-n** is applied before **--reversed**.

# HISTORY

The command was originally called **jj obslog** (obsolescence log, after Mercurial's concept). It was renamed to **jj evolog** / **jj evolution-log** in **jj 0.22** (October 2024), and **jj 0.30** (June 2025) moved evolution history into the operation log.

# SEE ALSO

[jj](/man/jj)(1), [jj-log](/man/jj-log)(1), [jj-show](/man/jj-show)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-evolog)```

<!-- verified: 2026-11-23 -->
