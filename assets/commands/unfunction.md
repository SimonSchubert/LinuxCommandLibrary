# TAGLINE

Remove shell function definitions

# TLDR

**Remove a shell function**

```unfunction [function_name]```

**Remove multiple functions**

```unfunction [function1] [function2]```

**Remove functions matching a pattern**

```unfunction -m "[pattern]*"```

# SYNOPSIS

**unfunction** [_-m_] _name_ [_name ..._]

# PARAMETERS

**-m**
> Treat arguments as patterns and remove all matching functions

# DESCRIPTION

**unfunction** is a zsh builtin that removes the definition of one or more shell functions from the current session. After removal, calling the function name will result in a "command not found" error unless an external command or alias with the same name exists.

This is the zsh equivalent of **unset -f** in bash and is useful for cleaning up function definitions, reloading modified function files, or undoing autoloaded functions.

# CAVEATS

Only available in zsh. In bash, use **unset -f** instead. The removal only affects the current shell session and does not modify function definition files. Removing autoloaded functions allows them to be re-autoloaded on next use if the autoload registration is still active.

# HISTORY

**unfunction** was introduced in **zsh** as a dedicated command for function removal, complementing the **autoload** and function definition mechanisms in the Z Shell.

# SEE ALSO

[autoload](/man/autoload)(1), [unset](/man/unset)(1), [zsh](/man/zsh)(1)
