# TAGLINE

Show how a command name would be interpreted

# TLDR

**Show how a name is resolved** (path, alias, or type)

```whence [command]```

**Verbose description** (like type or command -V)

```whence -v [command]```

**csh-style output** with function bodies (zsh; same as which)

```whence -c [command]```

**Word type only**: alias, builtin, command, function, hashed, reserved, or none (zsh)

```whence -w [command]```

**All matches** along PATH (and other interpretations)

```whence -a [command]```

**Force PATH search** even if name is an alias, function, or builtin

```whence -p [command]```

**Show all occurrences in csh format** (zsh; same as where)

```whence -ca [command]```

# SYNOPSIS

**whence** [**-afpv**] _name_...

**whence** [**-vcwfpamsS**] [**-x** _num_] _name_... (zsh)

# PARAMETERS

**-v**
> Produce a more verbose report

**-a**
> Report all interpretations / search the entire command path (not only the first match)

**-p**
> Do a PATH search even if name is an alias, reserved word, function, or builtin

**-f**
> Skip the search for shell functions (ksh). In zsh, with **-c**, display the contents of a shell function

**-c** (zsh)
> Print results in a csh-like format (takes precedence over **-v**). Equivalent to the zsh **which** builtin when used alone

**-w** (zsh)
> Print `name: word` where word is one of: alias, builtin, command, function, hashed, reserved, or none

**-m** (zsh)
> Treat arguments as patterns and display matching commands (quote pattern characters)

**-s** (zsh)
> If a pathname contains symlinks, also print the symlink-free pathname

**-S** (zsh)
> Like **-s**, but print intermediate symlink resolution steps

**-x** _num_ (zsh)
> Expand tabs when outputting shell functions with **-c** (same idea as **functions -x**)

# DESCRIPTION

**whence** is a shell builtin in **ksh** and **zsh** that reports how each _name_ would be interpreted if used as a command. Unlike the external **which** utility, it understands shell aliases, functions, builtins, reserved words, and hashed commands, not only executables on PATH.

With no options, **whence** typically prints the resolved path for external commands or an indication of the alias or other shell object. **-v** adds a descriptive message similar to **type** or **command -V**. **-p** forces a filesystem PATH search when a name is shadowed by a shell construct.

In **zsh**, **whence** is the underlying implementation for several related builtins:

- **which** is equivalent to **whence -c**
- **where** is equivalent to **whence -ca**
- **type** is equivalent to **whence -v**

**ksh** provides a smaller option set (**-a**, **-f**, **-p**, **-v**). **bash** and POSIX shells do not provide **whence**; use **type**, **command -v**, or **command -V** there instead.

# EXIT STATUS

**0**
> Name was found (recognized as a command form the shell understands)

**non-zero**
> Name was not recognized. In zsh, a not-found message for **-v**, **-c**, or **-w** is written to standard output (not standard error), which differs from some other shells

# EXAMPLES

**Resolve commands in zsh**
```
$ whence ls
/bin/ls

$ whence -v ls
ls is /bin/ls

$ whence -w cd
cd: builtin

$ whence -w for
for: reserved
```

**Find every match on PATH (zsh)**
```
$ whence -a python3
```

# CAVEATS

**whence** is not a standalone program and is not available in bash or plain sh. Scripts that need portability should prefer **command -v** (POSIX) or **type**.

Pattern matching with **-m** (zsh) only applies to the final path component of a command name; pass the basename, not a full path with `/`.

Option letters and output formats differ between ksh and zsh. Features such as **-c**, **-w**, **-m**, **-s**, and **-S** are zsh extensions.

# HISTORY

**whence** originates in the KornShell (**ksh**) as the shell's command-lookup reporter. **zsh** adopted it and built a richer interface on top, with **which**, **where**, and **type** implemented as variants of **whence**. It is not specified by POSIX.

# SEE ALSO

[type](/man/type)(1), [which](/man/which)(1), [command](/man/command)(1), [hash](/man/hash)(1), [whereis](/man/whereis)(1)

# RESOURCES

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html#index-whence)```

```[Source code](https://github.com/zsh-users/zsh)```

<!-- verified: 2026-08-06 -->
