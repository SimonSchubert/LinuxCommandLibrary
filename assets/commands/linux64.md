# TLDR

Run command in **64-bit** personality

```linux64 command```

Run command with **uname** emulation

```linux64 --uname-2.6 command```

Run command with **verbose** output

```linux64 -v command```

# SYNOPSIS

**linux64** [_options_] [_program_ [_arguments_]]

# DESCRIPTION

**linux64** is an alias for **setarch linux64**, which runs a program with a modified architecture domain and process personality flags. It is primarily used to set the reported architecture for uname calls and control process execution environment.

# PARAMETERS

**-v, --verbose**
> Verbose mode

**--uname-2.6**
> Report kernel version as 2.6.x

**-3, --3gb**
> Limit address space to 3GB (for 32-bit programs)

**--addr-no-randomize**
> Disable address space randomization

**--short-inode**
> Enable short inode mode

# CAVEATS

This command is typically used for compatibility purposes when running programs that check the system architecture. It does not actually change the underlying architecture.

# HISTORY

**linux64** is part of the **util-linux** package, providing architecture personality modification utilities. The companion command **linux32** sets 32-bit personality.

# SEE ALSO

[setarch](/man/setarch)(8), [linux32](/man/linux32)(8), [uname](/man/uname)(1)
