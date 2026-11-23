# TAGLINE

Remove shell function definitions

# TLDR

**Remove a shell function**

```unfunction [function_name]```

**Remove multiple functions**

```unfunction [function1] [function2]```

**Remove functions matching a pattern** (quote the pattern)

```unfunction -m "[pattern]*"```

**Reload an autoloaded function** after editing its file

```unfunction [function_name] && autoload -Uz [function_name]```

**Remove a function silently**, even if it is not defined

```unfunction [function_name] 2>/dev/null```

# SYNOPSIS

**unfunction** [**-m**] _name_ [_name_ ...]

# PARAMETERS

**-m**
> Treat each _name_ as a pattern (should be quoted) and remove all functions whose names match.

# DESCRIPTION

**unfunction** is a zsh builtin that removes the definition of one or more shell functions from the current session. After removal, calling the function name will result in a "command not found" error unless an external command or alias with the same name exists.

It is exactly equivalent to **unhash -f**, which removes entries from the shell function hash table. zsh also accepts the POSIX form **unset -f**. It is useful for cleaning up function definitions, reloading modified function files, or undoing autoloaded functions.

# CAVEATS

Only available in zsh. In bash, use **unset -f** instead. Naming a function that is not defined prints `no such hash table element` and returns a non-zero status. The removal only affects the current shell session and does not modify function definition files. Removing autoloaded functions allows them to be re-autoloaded on next use if the autoload registration is still active.

# HISTORY

**unfunction** has been part of **zsh** since its early releases, complementing the **autoload** and function definition mechanisms. Today it is documented as the same as the more general **unhash -f**.

# SEE ALSO

[autoload](/man/autoload)(1), [unhash](/man/unhash)(1), [unset](/man/unset)(1), [zsh](/man/zsh)(1)

# RESOURCES

```[Source code](https://github.com/zsh-users/zsh)```

```[Homepage](https://www.zsh.org/)```

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html)```

<!-- verified: 2026-11-23 -->
