# TLDR

**Search Docker Hub**

```docker search [term]```

**Search with limit**

```docker search --limit [25] [term]```

**Filter official images**

```docker search -f is-official=true [term]```

**Filter automated builds**

```docker search -f is-automated=true [term]```

**Filter by stars**

```docker search -f stars=[100] [term]```

# SYNOPSIS

**docker** **search** [_options_] _term_

# PARAMETERS

**-f**, **--filter** _filter_
> Filter output based on conditions.

**--format** _string_
> Format output using Go template.

**--limit** _int_
> Max number of results (default 25).

**--no-trunc**
> Don't truncate output.

# DESCRIPTION

**docker search** searches Docker Hub for images. Returns image name, description, stars, and official/automated status.

# SEE ALSO

[docker-pull](/man/docker-pull)(1), [docker-images](/man/docker-images)(1)

