# TLDR

**Repeat the last command**

```!!```

**Repeat last command starting with string**

```![string]```

**Repeat command number N from history**

```![N]```

**Repeat Nth last command**

```!-[N]```

**Substitute and repeat** (replace old with new)

```^[old]^[new]```

**Use last argument of previous command**

```[command] !$```

# SYNOPSIS

**!** [_event_][**:**_word_][**:**_modifier_]

# PARAMETERS

**!!**
> The previous command

**!n**
> Command line number n

**!-n**
> Current command minus n

**!string**
> Most recent command starting with string

**!?string?**
> Most recent command containing string

**!#**
> Current command line typed so far

# WORD DESIGNATORS

**:0**
> Command name

**:n**
> Nth argument (0-indexed)

**:^**
> First argument

**:$**
> Last argument

**:***
> All arguments except command

**:n-m**
> Range of arguments

# MODIFIERS

**:h**
> Remove trailing filename (head/directory)

**:t**
> Remove leading path (tail/filename)

**:r**
> Remove file extension (root)

**:e**
> Remove all but extension

**:s/old/new/**
> Substitute first occurrence

**:gs/old/new/**
> Substitute all occurrences

**:p**
> Print without executing

# DESCRIPTION

**!** (history expansion) allows reusing and modifying previous commands. It's a shell feature (bash, zsh) that expands references to command history before execution.

Common patterns:
- **sudo !!** - Rerun last command with sudo
- **!$** - Last argument of previous command
- **!!:s/foo/bar/** - Repeat last command with substitution
- **!vim** - Run most recent vim command

History expansion happens before other expansions, allowing powerful command reuse with modifications.

# CAVEATS

History expansion can cause unexpected substitutions in strings containing **!**. Use single quotes or escape with backslash.

The **!** character in double quotes may expand. Use **set +H** to disable history expansion if problematic.

Not available in all shells or in non-interactive mode.

# SEE ALSO

[history](/man/history)(1), [fc](/man/fc)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1)
