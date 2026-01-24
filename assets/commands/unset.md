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

**unset** removes shell variables. It's a builtin.

Variable removal. Clear from environment.

Function removal. Delete definitions.

Shell scope. Current shell only.

Clean environment. Remove unwanted.

# CAVEATS

Shell builtin. Cannot unset readonly. Current session only.

# HISTORY

**unset** is a standard shell builtin command for removing variables and functions from the shell environment.

# SEE ALSO

[export](/man/export)(1), [set](/man/set)(1), [env](/man/env)(1)
