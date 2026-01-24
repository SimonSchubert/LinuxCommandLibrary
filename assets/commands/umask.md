# TLDR

**Show current mask**

```umask```

**Show symbolic**

```umask -S```

**Set mask**

```umask [022]```

**Restrictive mask**

```umask [077]```

**Permissive mask**

```umask [000]```

# SYNOPSIS

**umask** [_-S_] [_mode_]

# PARAMETERS

**-S**
> Symbolic output.

_mode_
> Octal mask value.

# DESCRIPTION

**umask** sets file creation mask. It affects permissions.

Default permissions. New files and directories.

Octal notation. Bits to remove.

Shell builtin. Session scope.

Security setting. Restrict access.

# COMMON VALUES

- **022** - Standard (files 644, dirs 755)
- **077** - Private (files 600, dirs 700)
- **002** - Group writable

# CAVEATS

Shell builtin. Not persistent across sessions. Inverted logic.

# HISTORY

**umask** is a standard Unix command for setting the file mode creation mask, present since early Unix.

# SEE ALSO

[chmod](/man/chmod)(1), [chown](/man/chown)(1), [stat](/man/stat)(1)
