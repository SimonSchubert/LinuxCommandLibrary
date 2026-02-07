# TAGLINE

list container repository tags

# TLDR

**List tags** in a repository

```crane ls [registry/repository]```

**List with full references**

```crane ls --full-ref [registry/repository]```

# SYNOPSIS

**crane** **ls** [_options_] _repository_

# PARAMETERS

**--full-ref**
> Print full image references.

**-O**, **--omit-digest-tags**
> Omit digest-based tags.

# DESCRIPTION

**crane ls** lists all tags in a container repository. This queries the registry's tag list API.

# SEE ALSO

[crane](/man/crane)(1), [crane-catalog](/man/crane-catalog)(1)
