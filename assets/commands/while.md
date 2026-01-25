# TLDR

**Basic while loop**

```while [condition]; do [command]; done```

**Infinite loop**

```while true; do [command]; sleep [1]; done```

**Read file line by line**

```while read -r line; do echo "$line"; done < [file.txt]```

**Loop until command fails**

```while [command]; do echo "still running"; done```

**Counter loop**

```i=0; while [ $i -lt 10 ]; do echo $i; i=$((i+1)); done```

**Process command output**

```[command] | while read -r line; do echo "$line"; done```

**Loop with break**

```while true; do if [condition]; then break; fi; done```

# SYNOPSIS

**while** _CONDITION_; **do** _COMMANDS_; **done**

# DESCRIPTION

**while** is a shell control structure that repeatedly executes a block of commands as long as the condition command returns a zero (success) exit status. The loop terminates when the condition returns non-zero.

The condition is typically a **test** command (or its **[** equivalent), but any command can be used. The loop executes as long as the command succeeds.

Common patterns include reading files line by line with **read**, implementing retry logic, and creating daemon-like processes that run indefinitely.

# CONTROL STATEMENTS

**break**
> Exit the loop immediately.

**break** _N_
> Exit N levels of nested loops.

**continue**
> Skip remaining commands and start next iteration.

**continue** _N_
> Continue at the Nth enclosing loop.

# CAVEATS

Using a pipe to while creates a subshell, so variable changes inside the loop are not visible outside. Use process substitution or here-strings to avoid this: **while read line; do ...; done < <(command)**. Always use **read -r** to prevent backslash interpretation.

# HISTORY

The while loop has been a fundamental shell control structure since the original Bourne shell in Unix Version 7 (1979). The syntax is specified by POSIX and works identically across all POSIX-compliant shells including bash, dash, ksh, and zsh.

# SEE ALSO

[for](/man/for)(1), [until](/man/until)(1), [test](/man/test)(1), [bash](/man/bash)(1)
