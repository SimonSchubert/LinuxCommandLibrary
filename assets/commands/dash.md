# TLDR

**Run script**

```dash [script.sh]```

**Run command string**

```dash -c '[command]'```

**Check syntax without executing**

```dash -n [script.sh]```

**Debug mode (print commands)**

```dash -x [script.sh]```

**Verbose mode (print input)**

```dash -v [script.sh]```

**Interactive shell**

```dash -i```

# SYNOPSIS

**dash** [_options_] [_script-file_ [_arguments_]]

# DESCRIPTION

**dash** is the Debian Almquist Shell, a POSIX-compliant /bin/sh implementation. Faster and smaller than bash. Default /bin/sh on Debian and Ubuntu. Derived from NetBSD ash.

# PARAMETERS

**-c** _string_
> Read commands from string

**-s**
> Read commands from stdin

**-i**
> Interactive mode

**-l**
> Login shell

**-f**
> Disable filename expansion (noglob)

**-n**
> Check syntax only (noexec)

**-u**
> Error on undefined variables (nounset)

**-v**
> Print input lines (verbose)

**-x**
> Print commands before execution (xtrace)

**-e**
> Exit on error (errexit)

**-I**
> Ignore EOF in interactive mode

**--help**
> Show help

**--version**
> Show version

# PERFORMANCE

Approximately 4x faster than bash for script execution.

# COMPATIBILITY

Strictly POSIX-compliant. Bash-specific features not supported:
- `[[ ... ]]` conditionals
- Process substitution `<()`
- Arrays
- Non-standard globbing

# CAVEATS

Scripts using bash-isms will fail. Use `#!/bin/bash` for bash-specific scripts. dash is /bin/sh on Debian/Ubuntu.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [zsh](/man/zsh)(1)
