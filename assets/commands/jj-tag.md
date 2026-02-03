# TLDR

**List all tags**

```jj tag list```

**Create a tag**

```jj tag set [tagname]```

**Delete a tag**

```jj tag delete [tagname]```

# SYNOPSIS

**jj** **tag** _subcommand_ [_options_]

# PARAMETERS

**list** [_pattern_]
> List tags, optionally filtered.

**set** _name_
> Create or update a tag.

**delete** _name_
> Delete a tag.

# DESCRIPTION

**jj tag** manages tags in a Jujutsu repository. Tags are lightweight references pointing to specific commits, useful for marking releases or important points in history. Unlike bookmarks, tags don't move.

# SEE ALSO

[jj](/man/jj)(1), [jj-bookmark](/man/jj-bookmark)(1)

