# TAGLINE

Remove entries from zsh's internal hash tables

# TLDR

**Remove a command** from the command hash table

```unhash [ls]```

**Remove an alias** (equivalent to unalias)

```unhash -a [ll]```

Remove a **shell function**

```unhash -f [my_function]```

Remove a **named directory** (hash -d entry)

```unhash -d [projects]```

Remove a **suffix alias**

```unhash -s [md]```

Remove entries by **pattern**

```unhash -m "[tmp_*]"```

# SYNOPSIS

**unhash** [**-adfms**] _name_ ...

# DESCRIPTION

**unhash** is a Zsh built-in that removes a named entry from one of the shell's internal hash tables. By default it operates on the command hash table, which caches the full path of recently executed commands. Options select an alternate table (aliases, functions, named directories, or suffix aliases) and the **-m** flag treats the remaining arguments as patterns matching multiple entries at once.

The related built-ins **unalias**, **unfunction**, and **unsetopt** are thin wrappers that call **unhash** with the appropriate flag preset. Using **unhash** directly is mainly useful inside scripts and functions where the table being modified is determined dynamically.

# PARAMETERS

**-a**
> Remove regular or global aliases. Equivalent to **unalias**.

**-s**
> Remove suffix aliases.

**-f**
> Remove shell functions. Equivalent to **unfunction**.

**-d**
> Remove named directory entries created with **hash -d**.

**-m**
> Treat each _name_ as a pattern; every matching entry in the selected table is removed. Patterns should be quoted to prevent filename expansion.

# CAVEATS

Available only in **Zsh**; Bash uses **hash -d** to remove a single entry and has no direct equivalent. Removing a name from the command hash table forces Zsh to re-search **$PATH** the next time the command is invoked, which is the usual reason for clearing stale entries after installing new binaries. Global aliases must be quoted when removed because they would otherwise be expanded before reaching **unhash**.

# HISTORY

**unhash** has been part of **Zsh** since its early releases by **Paul Falstad** in **1990**. It mirrors the design of the **hash** built-in but operates in reverse and was generalized to cover multiple internal tables as Zsh grew aliases, named directories, and suffix aliases.

# SEE ALSO

[hash](/man/hash)(1), [unalias](/man/unalias)(1), [unset](/man/unset)(1), [zsh](/man/zsh)(1)
