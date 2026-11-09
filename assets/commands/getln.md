# TAGLINE

read a line from the zsh buffer stack

# TLDR

**Read a line from the buffer stack into a variable**

```getln [variable_name]```

**Read a line and process it**

```getln line && echo $line```

**Push a line then retrieve it**

```print -z "hello world" && getln [variable_name]```

# SYNOPSIS

**getln** [**-AclneE**] _name_ [_name_ ...]

# DESCRIPTION

**getln** is a zsh builtin that reads the top entry from the shell's **buffer stack** and assigns it to the named variable. It is equivalent to **read -zr**. The buffer stack is a LIFO (last-in, first-out) data structure where lines can be pushed using **print -z** or **pushln** and later retrieved with **getln**.

If multiple variable names are given, the line is split into words and assigned to each variable in order, with the last variable receiving the rest of the line, similar to **read**. With a single name the whole line is assigned unchanged. Because **-r** is implied, backslashes are not treated as escape characters.

The buffer stack is typically used for programmatic input manipulation, where a script prepares command lines to be executed or processed later.

# PARAMETERS

**-A**
> Treat the first _name_ as an array and assign all words to it.

**-e**
> Print the words to standard output and do not assign them.

**-E**
> Print the words to standard output and also assign them.

**-c**, **-l**, **-n**
> Read the current command line or words. Only valid in functions called for compctl-style completion, see **read** in zshbuiltins(1).

# CAVEATS

Only available in **zsh**. The buffer stack is a zsh-specific feature not found in bash or other shells. If the buffer stack is empty, **getln** assigns an empty string and returns status **1**. The buffer stack is separate from the command history. Lines pushed with **push-line** from the line editor also go onto this stack.

# HISTORY

**getln** is part of the **Z Shell** (zsh) buffer stack mechanism, available since early zsh versions. The buffer stack is a unique zsh feature for programmatic queuing and retrieval of text lines.

# SEE ALSO

[pushln](/man/pushln)(1), [print](/man/print)(1), [read](/man/read)(1), [zsh](/man/zsh)(1)

# RESOURCES

```[Source code](https://github.com/zsh-users/zsh)```

```[Homepage](https://www.zsh.org/)```

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html)```

<!-- verified: 2026-11-09 -->
