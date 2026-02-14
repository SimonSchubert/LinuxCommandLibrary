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

When called without arguments, it changes to the user's home directory. The **CDPATH** variable is searched if the specified directory is not found relative to the current directory.

# CAVEATS

**chdir** is not available in bash (use **cd** instead). For portable scripts, always use **cd**. The command is a shell builtin and does not exist as a standalone executable.

# HISTORY

**chdir** is the original name of the directory-changing system call in **Unix**, dating back to the **First Edition** in **1971**. The **cd** command was introduced as a shorter alias. Shells like **csh** (1978) and later **zsh** retained **chdir** as a builtin alongside **cd**.

# SEE ALSO

[cd](/man/cd)(1), [pushd](/man/pushd)(1), [popd](/man/popd)(1), [pwd](/man/pwd)(1)
