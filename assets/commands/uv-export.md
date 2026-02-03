# TLDR

**Export to requirements.txt**

```uv export > requirements.txt```

**Export with hashes**

```uv export --locked > requirements.txt```

**Export without dev dependencies**

```uv export --no-dev > requirements.txt```

# SYNOPSIS

**uv** **export** [_options_]

# PARAMETERS

**--locked**
> Use locked versions with hashes.

**--frozen**
> Don't update lockfile.

**--no-dev**
> Exclude dev dependencies.

**--no-hashes**
> Exclude hashes.

**-o**, **--output-file** _file_
> Output file.

# DESCRIPTION

**uv export** exports project dependencies to requirements format. Creates requirements.txt compatible with pip. Useful for deployment environments that don't use uv.

# SEE ALSO

[uv](/man/uv)(1), [uv-lock](/man/uv-lock)(1), [pip](/man/pip)(1)

