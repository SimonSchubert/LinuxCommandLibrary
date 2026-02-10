# TAGLINE

pipes two commands but returns the exit status of the first command instead of

# TLDR

**Run pipeline returning first command exit status**

```mispipe "[command1]" "[command2]"```

**Use in shell pipeline**

```mispipe "cat /nonexistent" "head -n 5"; echo $?```

# SYNOPSIS

**mispipe** _command1_ _command2_

# PARAMETERS

_command1_
> First command (source).

_command2_
> Second command (sink).

# DESCRIPTION

**mispipe** pipes two commands but returns the exit status of the first command instead of the last. Unlike regular shell pipes that return the final command's exit status. Part of moreutils collection.

# SEE ALSO

[pee](/man/pee)(1), [sponge](/man/sponge)(1)

