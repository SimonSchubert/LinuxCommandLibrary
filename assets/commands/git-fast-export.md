# TAGLINE

Export Git history in fast-import stream format

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

**git fast-export** generates a complete textual representation of Git repository history in a format designed for consumption by git fast-import. This creates a portable, version-control-system-agnostic representation of commits, trees, tags, and their relationships.

The primary use case is repository migration and transformation. Export streams can be filtered, modified, or split before reimport, enabling powerful repository restructuring operations such as extracting subdirectories, rewriting author information, or converting between Git hosting providers.

The export format is line-oriented and human-readable. Combined with git fast-import, this command pair provides significantly faster repository operations than git filter-branch for large-scale history rewrites. The --anonymize option supports sharing repository structure for debugging while protecting sensitive content.

# SEE ALSO

[git-fast-import](/man/git-fast-import)(1), [git-filter-branch](/man/git-filter-branch)(1)
