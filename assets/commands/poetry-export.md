# TAGLINE

Export Poetry dependencies to other formats

# TLDR

**Export to requirements.txt**

```poetry export -f requirements.txt -o requirements.txt```

**Export with dev dependencies**

```poetry export --with dev -f requirements.txt```

**Export without hashes**

```poetry export --without-hashes -o requirements.txt```

**Export only specific dependency groups**

```poetry export --only [main,docs] -f requirements.txt```

**Export to standard output**

```poetry export -f requirements.txt```

**Export including extras**

```poetry export -f requirements.txt -E [extra_name]```

# SYNOPSIS

**poetry** **export** [_options_]

# PARAMETERS

**-f**, **--format** _format_
> Output format (requirements.txt, constraints.txt, pylock.toml).

**-o**, **--output** _file_
> Output file path. If omitted, prints to standard output.

**--with** _groups_
> Include optional dependency groups.

**--without** _groups_
> Exclude dependency groups.

**--only** _groups_
> Include only the specified dependency groups.

**--without-hashes**
> Exclude hashes from output.

**--without-urls**
> Exclude source URLs from output.

**-E**, **--extras** _extras_
> Include extras.

# DESCRIPTION

**poetry export** exports the lock file to other formats. It is provided by the **poetry-plugin-export** plugin. Primarily used to generate requirements.txt files for environments that don't use Poetry directly, such as Docker builds or production deployments.

# CAVEATS

Requires the **poetry-plugin-export** plugin to be installed. The `--dev` flag is deprecated in favor of `--with dev`.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-lock](/man/poetry-lock)(1), [poetry-install](/man/poetry-install)(1), [pip](/man/pip)(1)

