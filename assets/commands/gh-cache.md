# TAGLINE

manage GitHub Actions workflow caches

# TLDR

**List caches** for the current repository

```gh cache list```

**List caches** sorted by size

```gh cache list --sort size_in_bytes --order desc```

**Filter caches** by key prefix

```gh cache list --key [key_prefix]```

**Delete a cache** by ID or key

```gh cache delete [cache_id_or_key]```

**Delete all caches** for a specific ref

```gh cache delete --all --ref refs/heads/[branch]```

**Delete all caches** in the repository

```gh cache delete --all```

# SYNOPSIS

**gh** **cache** _subcommand_ [_options_]

# SUBCOMMANDS

**list**
> List caches for the current repository.

**delete**
> Delete one or more caches by ID, key, or all at once.

# PARAMETERS

**-k**, **--key** _prefix_
> Filter by cache key prefix (list), or match by key (delete).

**-L**, **--limit** _N_
> Maximum number of caches to fetch (default: 30). (list only)

**-S**, **--sort** _field_
> Sort by field: created_at, last_accessed_at, size_in_bytes (default: last_accessed_at). (list only)

**-O**, **--order** _direction_
> Order of results: asc or desc (default: desc). (list only)

**-r**, **--ref** _ref_
> Filter or delete by ref, e.g. refs/heads/main or refs/pull/123/merge.

**-a**, **--all**
> Delete all caches. May be combined with --ref to limit scope.

**--succeed-on-no-caches**
> Return exit code 0 if no caches are found (used with --all).

**--json** _fields_
> Output JSON with specified fields. (list only)

**-q**, **--jq** _expression_
> Filter JSON output using a jq expression. (list only)

**-t**, **--template** _format_
> Format JSON output using a Go template. (list only)

**-R**, **--repo** _owner/repo_
> Target a specific repository.

# DESCRIPTION

**gh cache** manages GitHub Actions caches for a repository. Caches store dependencies and build artifacts to speed up workflow execution by reusing data between runs.

The cache system uses key-based storage, where workflows save and restore cached data using unique keys. Cache entries have size limits and are automatically evicted based on usage policies. Managing caches manually helps troubleshoot workflow issues and reclaim storage.

`gh cache list` can also be invoked as `gh cache ls`.

# SEE ALSO

[gh](/man/gh)(1), [gh-run](/man/gh-run)(1), [gh-secret](/man/gh-secret)(1)
