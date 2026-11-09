# TAGLINE

Change the current working directory

# TLDR

**Change to a specific directory**

```chdir [path/to/directory]```

**Change to home directory**

```chdir ~```

**Change to parent directory**

```chdir ..```

**Change to previous directory**

```chdir -```

# SYNOPSIS

**chdir** [_directory_]

# DESCRIPTION

**chdir** changes the current working directory of the shell to the specified path. It is functionally equivalent to **cd** and available as a builtin in zsh, csh, and tcsh.

When called without arguments, it changes to the user's home directory. The **CDPATH** variable in zsh, or **cdpath** in csh and tcsh, is searched if the specified directory is not found relative to the current directory.

# CAVEATS

**chdir** is not available in bash (use **cd** instead). For portable scripts, always use **cd**. The command is a shell builtin and does not exist as a standalone executable.

# HISTORY

**chdir** was the name of the directory-changing command in early **Unix** shells, as documented in the **Sixth Edition** manual, and remains the name of the underlying system call. The **Seventh Edition** shell documents **cd** instead. Shells like **csh** and later **zsh** kept **chdir** as a builtin alongside **cd**.

# SEE ALSO

[cd](/man/cd)(1), [pushd](/man/pushd)(1), [popd](/man/popd)(1), [pwd](/man/pwd)(1)

# RESOURCES

```[Homepage](https://www.zsh.org)```

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html)```

<!-- verified: 2026-11-09 -->
