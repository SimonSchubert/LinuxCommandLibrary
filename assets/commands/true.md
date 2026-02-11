# TAGLINE

Return successful exit status

# TLDR

**Return success** exit status

```true```

**Use in infinite loop**

```while true; do [command]; sleep [1]; done```

**Use in conditional** as placeholder

```if true; then echo "always runs"; fi```

**Ignore command failure** in scripts

```command || true```

**As no-op command** in shell

```true; echo "continues regardless"```

# SYNOPSIS

**true** [_IGNORED_]

# DESCRIPTION

**true** does nothing except return an exit status of 0 (success). Any arguments provided are ignored.

The command is used in shell scripts where a command is syntactically required but no action is needed. Common uses include:

- Infinite loops: **while true; do ...; done**
- Ignoring failures: **command || true** (prevents script exit with set -e)
- Placeholder in conditionals when logic is still being developed
- Initializing variables with command substitution that must succeed

As a shell builtin in most shells, true executes without spawning a subprocess, making it efficient for frequent use in loops.

# CAVEATS

Although true ignores all arguments, it still parses them. Some implementations treat **--help** and **--version** specially. The external binary /usr/bin/true exists for use when a builtin is not available or when exec is needed.

# HISTORY

true has been part of Unix since Version 7 Unix in **1979**. It was originally implemented as an empty shell script or a program that simply called exit(0). The companion command **false** returns exit status 1. Both are specified by POSIX and exist as both shell builtins and standalone binaries.

# SEE ALSO

[false](/man/false)(1), [test](/man/test)(1), [bash](/man/bash)(1)
