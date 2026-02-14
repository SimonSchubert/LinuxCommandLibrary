# TAGLINE

Read a line from the shell buffer stack

# TLDR

**Read a line from the buffer stack** into a variable

```getln [variable_name]```

**Read a line and process it**

```getln line && echo $line```

# SYNOPSIS

**getln** _name_ [_name ..._]

# DESCRIPTION

**getln** is a zsh builtin that reads the top entry from the shell's **buffer stack** and assigns it to the named variable. The buffer stack is a LIFO (last-in, first-out) data structure where lines can be pushed using **print -z** or **pushln** and later retrieved with **getln**.

If multiple variable names are given, the line is split into words and assigned to each variable in order, similar to **read**.

The buffer stack is typically used for programmatic input manipulation, where a script prepares command lines to be executed or processed later.

# CAVEATS

Only available in zsh. The buffer stack is a zsh-specific feature not found in other shells. If the buffer stack is empty, **getln** will assign an empty string. The buffer stack is separate from the command history.

# HISTORY

**getln** is part of **zsh's** buffer stack mechanism, a unique feature of the Z Shell that allows programmatic queuing and retrieval of text lines within the shell environment.

# SEE ALSO

[pushln](/man/pushln)(1), [print](/man/print)(1), [read](/man/read)(1), [zsh](/man/zsh)(1)
