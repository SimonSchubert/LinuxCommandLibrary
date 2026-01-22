# TLDR

**Add package source**

```poetry source add [name] [url]```

**Remove package source**

```poetry source remove [name]```

**Show configured sources**

```poetry source show```

**Add private repository**

```poetry source add --priority=supplemental [name] [url]```

# SYNOPSIS

**poetry source** _command_ [_options_]

# PARAMETERS

**add** _NAME_ _URL_
> Add package source.

**remove** _NAME_
> Remove source.

**show**
> List sources.

**--priority** _LEVEL_
> Source priority (primary, supplemental, explicit).

# DESCRIPTION

**poetry source** manages package repositories. Configures alternative sources.

The tool adds private repositories. Manages PyPI alternatives.

poetry source configures repos.

# CAVEATS

Modifies pyproject.toml. Priority affects resolution order.

# HISTORY

poetry source provides **repository management** for package sources.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-config](/man/poetry-config)(1)

