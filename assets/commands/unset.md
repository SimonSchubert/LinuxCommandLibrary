# TAGLINE

Remove shell variables or functions

# TLDR

**Unset variable**

```unset [VARIABLE]```

**Unset function**

```unset -f [function_name]```

**Unset multiple**

```unset [VAR1] [VAR2]```

# SYNOPSIS

**unset** [_-f_] [_-v_] _name_ ...

# PARAMETERS

**-f**
> Unset function.

**-v**
> Unset variable (default).

_name_
> Name to unset.

# DESCRIPTION

**unset** is a shell builtin that removes variables and function definitions from the current shell environment. By default it removes variables, but with the **-f** flag it removes function definitions instead.

Unsetting a variable removes it completely from the environment, unlike setting it to an empty string which leaves the variable defined but empty. This distinction matters for scripts that check whether a variable exists versus whether it has a value. Unsetting exported variables also removes them from the environment inherited by child processes.

Changes made by unset only affect the current shell session. Variables and functions defined in shell startup files like ~/.bashrc will be restored when a new shell session starts. Read-only variables cannot be unset.

# CAVEATS

Shell builtin. Cannot unset readonly. Current session only.

# HISTORY

**unset** is a standard shell builtin command for removing variables and functions from the shell environment.

# SEE ALSO

[export](/man/export)(1), [set](/man/set)(1), [env](/man/env)(1)
