# TAGLINE

displays all tags in the repository

# TLDR

**List all tags**

```jj tag list```

**List tags matching a glob pattern**

```jj tag list "[v*]"```

**List tags sorted by author date** (descending)

```jj tag list --sort author-date-```

**List tags with a custom template**

```jj tag list -T '[name ++ "\n"]'```

# SYNOPSIS

**jj** **tag** **list** [_options_] [_pattern_]

# PARAMETERS

**-T**, **--template** _TEMPLATE_
> Render output using a custom template.

**--sort** _KEY_
> Sort by key: name, author-name, author-email, author-date, committer-name, committer-email, committer-date. Suffix with - for descending.

# DESCRIPTION

**jj tag list** displays all tags in the repository. Optionally filter by a glob pattern. Shows the tag name and the commit it references. Multiple sort keys can be specified, with the first key being the most significant. Default sort order can be configured via `ui.tag-list-sort-keys` in the config.

# SEE ALSO

[jj](/man/jj)(1), [jj-tag](/man/jj-tag)(1), [jj-tag-set](/man/jj-tag-set)(1), [jj-tag-delete](/man/jj-tag-delete)(1)

