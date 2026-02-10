# TAGLINE

plan 9's make replacement

# TLDR

**Build default target**

```mk```

**Build specific target**

```mk [target]```

**Parallel build**

```mk -j```

**Use specific mkfile**

```mk -f [mkfile.custom]```

**Dry run**

```mk -n```

**Force rebuild**

```mk -a```

# SYNOPSIS

**mk** [_options_] [_target_]

# PARAMETERS

_TARGET_
> Target to build.

**-f** _FILE_
> Use specified mkfile.

**-j**
> Parallel execution.

**-n**
> Dry run.

**-a**
> Force rebuild all.

**--help**
> Display help information.

# DESCRIPTION

**mk** is Plan 9's make replacement. It provides similar functionality with cleaner syntax.

The tool reads mkfiles for build instructions. Simpler than traditional make.

# CAVEATS

Plan 9/9front tool. Different from GNU make. Simpler rules syntax.

# HISTORY

mk was created for **Plan 9** at Bell Labs as a cleaner replacement for make.

# SEE ALSO

[make](/man/make)(1), [ninja](/man/ninja)(1), [rc](/man/rc)(1)

