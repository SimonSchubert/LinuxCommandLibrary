# TAGLINE

List remote branches by author and last commit date

# TLDR

**Show** all remote branches by author

```git-who```

**Show** branches for specific author

```git-who [author-name]```

**Show** only stale branches (older than 30 days)

```git-who --stale```

**Sort** by last commit date

```git-who --sort date```

# SYNOPSIS

**git-who** [_options_] [_author_]

# PARAMETERS

**--stale**
> Show only stale branches (30+ days old)

**--sort** _FIELD_
> Sort by: date, author, name (default: date)

**--remote** _REMOTE_
> Specify remote (default: origin)

**--format** _FORMAT_
> Output format: table, csv, json

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**git-who** lists remote Git branches showing the author and date of the last commit on each branch. It helps identify who owns which branches and how stale they are.

The tool is useful for repository cleanup, finding old branches, and understanding branch ownership in teams.

# OUTPUT

Displays branches with:
- Branch name
- Author of last commit
- Date of last commit
- Days since last commit

# CAVEATS

Requires access to remote repository. Fetch may be needed for accurate data. Performance depends on number of branches.

# HISTORY

**git-who** was created to help teams manage their Git branches by providing visibility into branch ownership and activity.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-for-each-ref](/man/git-for-each-ref)(1), [git](/man/git)(1)