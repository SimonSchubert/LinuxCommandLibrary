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

**getln** _name_ [_name_ ...]

# DESCRIPTION

**getln** is a zsh builtin that reads the top entry from the shell's **buffer stack** and assigns it to the named variable. It is equivalent to **read -zr**. The buffer stack is a LIFO (last-in, first-out) data structure where lines can be pushed using **print -z** or **pushln** and later retrieved with **getln**.

If multiple variable names are given, the line is split into words and assigned to each variable in order, similar to **read**. The line is read without word splitting on the whole (the **-r** behavior).

The buffer stack is typically used for programmatic input manipulation, where a script prepares command lines to be executed or processed later.

# CAVEATS

Only available in **zsh**. The buffer stack is a zsh-specific feature not found in bash or other shells. If the buffer stack is empty, **getln** assigns an empty string. The buffer stack is separate from the command history. Lines pushed with **push-line** from the line editor also go onto this stack.

# HISTORY

**getln** is part of the **Z Shell** (zsh) buffer stack mechanism, available since early zsh versions. The buffer stack is a unique zsh feature for programmatic queuing and retrieval of text lines.

# SEE ALSO

[pushln](/man/pushln)(1), [print](/man/print)(1), [read](/man/read)(1), [zsh](/man/zsh)(1)
