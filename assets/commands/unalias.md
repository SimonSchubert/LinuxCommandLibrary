# TAGLINE

Remove shell command aliases

# TLDR

**Remove a specific alias**

```unalias [name]```

**Remove all aliases**

```unalias -a```

**Remove multiple aliases**

```unalias [name1] [name2]```

# SYNOPSIS

**unalias** [**-a**] _name_ ...

# PARAMETERS

**-a**
> Remove all alias definitions from the current shell execution environment.

_name_
> One or more alias names to remove.

# DESCRIPTION

**unalias** is a shell builtin that removes previously defined command aliases. It can remove specific aliases by name or all aliases at once with the **-a** flag.

The removal only affects the current shell session. Aliases defined in shell startup files like ~/.bashrc or ~/.zshrc will be restored when a new shell is started. This makes unalias useful for temporarily bypassing an alias to test the underlying command's behavior or for debugging shell configuration issues.

Returns 0 on success, or a value greater than 0 if a specified alias name does not exist.

# CAVEATS

Shell builtin. Not persistent across sessions. Only affects the current shell execution environment.

# HISTORY

**unalias** is a POSIX-standard shell builtin for removing command aliases defined with the alias command.

# SEE ALSO

[alias](/man/alias)(1), [type](/man/type)(1), [which](/man/which)(1), [bash](/man/bash)(1), [hash](/man/hash)(1)
