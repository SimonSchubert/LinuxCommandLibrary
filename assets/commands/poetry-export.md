# TAGLINE

Export dependencies to other formats

# TLDR

**Export to requirements.txt**

```poetry export -f requirements.txt -o requirements.txt```

**Export with dev dependencies**

```poetry export --with dev -f requirements.txt```

**Export without hashes**

```poetry export --without-hashes -o requirements.txt```

# SYNOPSIS

**poetry** **export** [_options_]

# PARAMETERS

**-f**, **--format** _format_
> Output format (requirements.txt, constraints.txt).

**-o**, **--output** _file_
> Output file path.

**--with** _groups_
> Include optional dependency groups.

**--without** _groups_
> Exclude dependency groups.

**--without-hashes**
> Exclude hashes from output.

**--without-urls**
> Exclude source URLs.

**--dev**
> Include development dependencies.

**-E**, **--extras** _extras_
> Include extras.

# DESCRIPTION

**poetry export** exports the lock file to other formats. Primarily used to generate requirements.txt files for environments that don't use Poetry directly, such as Docker builds or production deployments.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-lock](/man/poetry-lock)(1), [pip](/man/pip)(1)

