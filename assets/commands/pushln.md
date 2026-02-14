# TAGLINE

Push arguments onto the shell buffer stack

# TLDR

**Push a string onto the buffer stack**

```pushln "[text to push]"```

**Push a command to be edited** before execution

```pushln "ls -la /tmp"```

**Push multiple words** as separate stack entries

```pushln [word1] [word2] [word3]```

# SYNOPSIS

**pushln** [_arg ..._]

# DESCRIPTION

**pushln** is a zsh builtin that pushes each argument onto the shell's **buffer stack** as a separate entry. The buffer stack is a LIFO (last-in, first-out) data structure. Entries on the buffer stack are presented as editor buffer content for the next interactive command line, or can be read programmatically with **getln**.

This is equivalent to **print -z** but handles each argument as a separate stack entry rather than printing them all on one line. The buffer stack provides a way to pre-fill the command line or pass data between shell functions.

# CAVEATS

Only available in zsh. The buffer stack is cleared when the shell exits. In interactive use, pushed lines appear as editable input at the next prompt. Each argument becomes a separate stack entry, unlike **print -z** which concatenates arguments.

# HISTORY

**pushln** is part of **zsh's** buffer stack mechanism, introduced as a complement to **getln** for the Z Shell's unique line buffering system.

# SEE ALSO

[getln](/man/getln)(1), [print](/man/print)(1), [zsh](/man/zsh)(1)
