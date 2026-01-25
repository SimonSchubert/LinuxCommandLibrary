# TLDR

**Make variable readonly**

```readonly [VAR]="[value]"```

**Make existing variable readonly**

```readonly [VAR]```

**List readonly variables**

```readonly```

**Make function readonly**

```readonly -f [function_name]```

**Make array readonly**

```readonly -a [ARRAY]```

# SYNOPSIS

**readonly** [_options_] [_name_[=_value_]...]

# PARAMETERS

**-p**
> Print readonly variables.

**-f**
> Make functions readonly.

**-a**
> Make arrays readonly.

**-A**
> Make associative arrays readonly.

# DESCRIPTION

**readonly** is a shell builtin that marks variables or functions as read-only, preventing modification or unsetting. Useful for constants and protecting configuration values.

# EXAMPLES

```bash
# Create readonly variable
readonly PI=3.14159

# Attempting to change fails
PI=3  # bash: PI: readonly variable

# Make existing readonly
CONFIG_FILE="/etc/app.conf"
readonly CONFIG_FILE

# Readonly function
myfunc() { echo "Hello"; }
readonly -f myfunc

# List all readonly
readonly -p

# Readonly array
readonly -a COLORS=("red" "green" "blue")
```

# IN SCRIPTS

```bash
#!/bin/bash
readonly SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
readonly CONFIG="${SCRIPT_DIR}/config.ini"
readonly VERSION="1.0.0"
```

# CAVEATS

Cannot unset readonly variables (until shell exits). Subshells don't inherit readonly status. Bash specific.

# HISTORY

readonly is a **POSIX** shell builtin, with extended options in bash and other modern shells.

# SEE ALSO

[declare](/man/declare)(1), [export](/man/export)(1), [typeset](/man/typeset)(1), [bash](/man/bash)(1)
