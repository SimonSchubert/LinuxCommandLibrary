# TLDR

**Reference a variable**

```echo $[VARIABLE]```

**Command substitution**

```result=$(command)```

**Arithmetic expansion**

```echo $((1 + 2))```

**Parameter expansion with default**

```echo ${VAR:-[default]}```

**String length**

```echo ${#VAR}```

# SYNOPSIS

**$**_name_
**${**_name_**}**
**$(**_command_**)**
**$((**_expression_**))**

# PARAMETER EXPANSION

**${var}**
> Value of variable

**${var:-default}**
> Use default if var is unset/empty

**${var:=default}**
> Assign default if var is unset/empty

**${var:+alternate}**
> Use alternate if var is set

**${var:?error}**
> Exit with error if var is unset

**${#var}**
> String length

**${var%pattern}**
> Remove shortest suffix match

**${var%%pattern}**
> Remove longest suffix match

**${var#pattern}**
> Remove shortest prefix match

**${var##pattern}**
> Remove longest prefix match

**${var/old/new}**
> Replace first occurrence

**${var//old/new}**
> Replace all occurrences

**${var:offset:length}**
> Substring extraction

# SPECIAL VARIABLES

**$?**
> Exit status of last command

**$$**
> Current shell PID

**$!**
> PID of last background job

**$0**
> Script name

**$1-$9**
> Positional parameters

**$@**
> All positional parameters (separate words)

**$***
> All positional parameters (single word)

**$#**
> Number of positional parameters

# DESCRIPTION

**$** is the shell's expansion operator for variables, commands, and arithmetic. It triggers substitution of values before command execution.

Variable expansion **$VAR** or **${VAR}** retrieves the variable's value. Braces allow modifiers and are required for array access and complex expansions.

Command substitution **$(command)** executes the command and substitutes its output. This replaces the older backtick syntax.

Arithmetic expansion **$((expr))** evaluates mathematical expressions.

# CAVEATS

Unquoted expansions undergo word splitting and glob expansion. Always quote **"$var"** unless you specifically want splitting.

**$*** vs **$@** behave differently in quotes: **"$@"** preserves argument boundaries, **"$*"** joins them.

Command substitution strips trailing newlines from output.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [env](/man/env)(1), [export](/man/export)(1)
