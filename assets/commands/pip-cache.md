# TLDR

**Show cache directory**

```pip cache dir```

**List cached packages**

```pip cache list```

**Show cache info**

```pip cache info```

**Remove specific package from cache**

```pip cache remove [package]```

**Clear all cache**

```pip cache purge```

# SYNOPSIS

**pip** **cache** _command_ [_options_]

# PARAMETERS

**dir**
> Show cache directory path.

**info**
> Show cache size and location.

**list**
> List cached packages.

**remove** _pattern_
> Remove matching cached packages.

**purge**
> Clear entire cache.

# DESCRIPTION

**pip cache** manages pip's wheel cache. Pip caches downloaded and built wheels to speed up subsequent installations. Use this command to inspect, clean, or manage cached packages.

# SEE ALSO

[pip](/man/pip)(1), [pip-install](/man/pip-install)(1)

