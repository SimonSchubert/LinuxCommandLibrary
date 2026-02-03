# TLDR

**Export repository to stream**

```git fast-export --all > [repo.txt]```

**Export specific branch**

```git fast-export [branch] > [branch.txt]```

**Export with blobs**

```git fast-export --all --signed-tags=strip > [export.txt]```

**Export for reimport**

```git fast-export --all | git fast-import```

# SYNOPSIS

**git** **fast-export** [_options_] [_revs_]

# PARAMETERS

**--all**
> Export all refs.

**--signed-tags** _mode_
> Handle signed tags (warn, strip, verbatim).

**--tag-of-filtered-object** _mode_
> Handle filtered tags.

**--no-data**
> Skip blob contents.

**--anonymize**
> Anonymize data.

# DESCRIPTION

**git fast-export** dumps Git history in a format suitable for git fast-import. Used for repository transformations, migrations, and conversions.

# SEE ALSO

[git-fast-import](/man/git-fast-import)(1), [git-filter-branch](/man/git-filter-branch)(1)

