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
> Output format string.

**--sort** _key_
> Sort by key.

**--count** _n_
> Limit output count.

**--points-at** _object_
> Show refs pointing to object.

**--merged** _commit_
> Show refs merged into commit.

**--no-merged** _commit_
> Show refs not merged.

# DESCRIPTION

**git for-each-ref** is a plumbing command that outputs detailed information about Git references (branches, tags, remote branches) in a highly customizable format. It serves as the foundation for many higher-level Git commands and scripts that need to process repository references.

The format string syntax supports field extraction using %(fieldname) placeholders, with available fields including refname, objecttype, objectname, author, committer, and many others. Sorting capabilities enable ordering references by any field, with support for reverse sorting using a minus prefix.

This command is primarily used in scripts and Git aliases rather than direct user interaction. The filtering options (--merged, --no-merged, --points-at) provide powerful selection mechanisms for finding references matching specific criteria.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-tag](/man/git-tag)(1)
