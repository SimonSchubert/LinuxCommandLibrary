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

**unalias** removes shell aliases. It's a builtin.

Alias removal. Undefine shortcuts.

All at once. Clear everything.

Session scope. Current shell only.

Debugging help. Test without alias.

# CAVEATS

Shell builtin. Not persistent. Current session only.

# HISTORY

**unalias** is a standard shell builtin for removing command aliases defined with the alias command.

# SEE ALSO

[alias](/man/alias)(1), [type](/man/type)(1), [which](/man/which)(1)
