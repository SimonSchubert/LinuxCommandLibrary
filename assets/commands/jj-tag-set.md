# TLDR

**Create tag on current revision**

```jj tag set [tagname]```

**Create tag on specific revision**

```jj tag set [tagname] -r [revision]```

# SYNOPSIS

**jj** **tag** **set** [_options_] _name_

# PARAMETERS

**-r**, **--revision** _rev_
> Revision to tag.

# DESCRIPTION

**jj tag set** creates or updates a tag pointing to a revision. Tags are lightweight references useful for marking release points or important commits. By default, tags the current working copy parent.

# SEE ALSO

[jj](/man/jj)(1), [jj-tag](/man/jj-tag)(1), [jj-tag-delete](/man/jj-tag-delete)(1)

