# TAGLINE

displays repository commit history

# TLDR

**Show commit history**

```hg log```

**Show last n commits**

```hg log -l [5]```

**Show specific file history**

```hg log [file]```

**Show with patch**

```hg log -p```

**Graph view**

```hg log -G```

**Show specific revision**

```hg log -r [revision]```

# SYNOPSIS

**hg log** [_options_] [_file_]

# PARAMETERS

_FILE_
> Limit to specific file.

**-l**, **--limit** _N_
> Limit number of entries.

**-r**, **--rev** _REV_
> Show specific revision.

**-p**, **--patch**
> Show patches.

**-G**, **--graph**
> Show DAG graph.

**-b**, **--branch** _BRANCH_
> Show branch commits.

**--template** _TPL_
> Output template.

**--help**
> Display help information.

# DESCRIPTION

**hg log** displays repository commit history. It shows changesets with author, date, summary, and other metadata.

The command supports filtering by file, branch, or revision range. Graph mode visualizes branch and merge structure.

# CAVEATS

Large histories can be slow. Use -l to limit. Templates for custom output.

# HISTORY

Log is a core **Mercurial** command for viewing repository history since version 1.0.

# SEE ALSO

[hg](/man/hg)(1), [hg-status](/man/hg-status)(1), [hg-diff](/man/hg-diff)(1)
