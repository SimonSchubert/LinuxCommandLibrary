# TLDR

**Show commit history**

```git log```

**Show compact log**

```git log --oneline```

**Show graph view**

```git log --graph --oneline --all```

**Show specific file history**

```git log [file.txt]```

**Show last N commits**

```git log -n [5]```

# SYNOPSIS

**git log** [_options_] [_revision_] [_--_] [_path_]

# PARAMETERS

**--oneline**
> Compact one-line format.

**--graph**
> Show branch graph.

**--all**
> Show all branches.

**-n** _NUM_
> Limit to N commits.

**--author** _AUTHOR_
> Filter by author.

**--since** _DATE_
> Show commits since date.

**--stat**
> Show changed files.

**-p**, **--patch**
> Show diffs.

**--format** _FORMAT_
> Custom format string.

**--help**
> Display help information.

# DESCRIPTION

**git log** shows the commit history. It displays commits in reverse chronological order with details including author, date, and message. Extensive formatting options enable customized output.

The command supports filtering by author, date, path, and message. Graph mode visualizes branch structure. Custom formats enable scripted log processing.

git log is the primary tool for exploring repository history.

# CAVEATS

Large histories can be slow. Some options don't combine. Graph may need wide terminal.

# HISTORY

git log is a core **Git** command from initial release, providing the essential capability to view commit history.

# SEE ALSO

[git-show](/man/git-show)(1), [git-blame](/man/git-blame)(1), [tig](/man/tig)(1)
