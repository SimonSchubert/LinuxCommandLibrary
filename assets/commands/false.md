# TLDR

**Return failure status**

```false```

**Use in conditional**

```if false; then echo "never"; fi```

**Chain with or**

```false || echo "false returned failure"```

**Infinite loop idiom**

```while false; do :; done```

# SYNOPSIS

**false**

# PARAMETERS

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**false** does nothing and returns a failure exit status (1). It's the counterpart to true and is used in shell scripts for flow control, testing, and as a placeholder.

The command takes no operands and always exits with status 1, indicating failure. This makes it useful in conditional statements, loops that should never execute, and testing error handling.

false is a POSIX-standard command and shell builtin, providing a guaranteed failure exit status.

# CAVEATS

As a builtin, behavior may vary slightly between shells. Exit status is always 1 (or non-zero). Does absolutely nothing else.

# HISTORY

false has been part of Unix since **Version 7** (1979). It's one of the simplest Unix commands, existing solely to return a failure status. It's specified by POSIX and implemented as both a standalone utility and shell builtin.

# SEE ALSO

[true](/man/true)(1), [test](/man/test)(1), [bash](/man/bash)(1)
