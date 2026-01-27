# TLDR

**Enable an option** in zsh

```setopt [autocd]```

**Enable multiple options**

```setopt [autocd] [extendedglob] [noclobber]```

**Enable an option** using uppercase naming

```setopt AUTO_CD```

**List all currently set options**

```setopt```

**Enable options matching a pattern**

```setopt -m '[a-z]*glob*'```

**Disable an option** by prefixing with NO

```setopt noautocd```

# SYNOPSIS

**setopt** [**-m**] [_option_ ...]

# PARAMETERS

**-m**
> Treat arguments as patterns and set all options matching those patterns. Patterns should be quoted to prevent filename expansion.

# DESCRIPTION

**setopt** is a zsh shell builtin command that enables shell options. These options control various aspects of shell behavior including command completion, globbing, history, and compatibility with other shells.

Option names are case insensitive and underscores are ignored, so **AUTO_CD**, **autocd**, and **auto_cd** all refer to the same option. Options can be negated by prefixing the name with **no** (e.g., **noautocd** disables the autocd option).

When called without arguments, setopt lists all options that are currently set. The command **unsetopt** performs the inverse operation, disabling options.

# COMMON OPTIONS

**autocd**
> Change to a directory by typing its name without cd.

**extendedglob**
> Enable extended pattern matching operators.

**noclobber**
> Prevent overwriting existing files with > redirection.

**histignorealldups**
> Remove older duplicate entries from history.

**sharehistory**
> Share command history between all running zsh sessions.

**correct**
> Try to correct spelling of commands.

**autopushd**
> Make cd push the old directory onto the directory stack.

**promptsubst**
> Enable parameter and command substitution in prompts.

# CAVEATS

Unlike **set -o**, a bad option name does not abort execution of subsequent shell code. This is because **set** is a POSIX special builtin while **setopt** is not. Options set with setopt only affect the current shell session unless added to **.zshrc** for persistence.

# HISTORY

**setopt** has been part of zsh since its early development. Zsh was created by Paul Falstad in **1990** while a student at Princeton University. The extensive option system distinguishes zsh from other shells, providing fine-grained control over shell behavior and compatibility modes for sh, ksh, and csh.

# SEE ALSO

[unsetopt](/man/unsetopt)(1), [zshoptions](/man/zshoptions)(1), [zshbuiltins](/man/zshbuiltins)(1), [zsh](/man/zsh)(1), [set](/man/set)(1)
