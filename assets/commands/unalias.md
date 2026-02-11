# TAGLINE

Remove shell command aliases

# TLDR

**Remove alias**

```unalias [name]```

**Remove all aliases**

```unalias -a```

**Remove multiple**

```unalias [name1] [name2]```

# SYNOPSIS

**unalias** [_-a_] _name_ ...

# PARAMETERS

**-a**
> Remove all aliases.

_name_
> Alias to remove.

# DESCRIPTION

**unalias** is a shell builtin that removes previously defined command aliases. It can remove specific aliases by name or all aliases at once with the **-a** flag.

The removal only affects the current shell session. Aliases defined in shell startup files like ~/.bashrc will be restored when a new shell is started. This makes unalias useful for temporarily bypassing an alias to test the underlying command's behavior or for debugging shell configuration issues.

# CAVEATS

Shell builtin. Not persistent. Current session only.

# HISTORY

**unalias** is a standard shell builtin for removing command aliases defined with the alias command.

# SEE ALSO

[alias](/man/alias)(1), [type](/man/type)(1), [which](/man/which)(1)
