# TAGLINE

Push arguments onto the shell buffer stack

# TLDR

**Push a string onto the buffer stack**

```pushln "[text to push]"```

**Pre-fill the next prompt** with a command to edit before running

```pushln "ls -la /tmp"```

**Push multiple words** onto the buffer stack as one entry

```pushln [word1] [word2] [word3]```

**Read the top entry back** into a variable

```getln [variable]```

# SYNOPSIS

**pushln** [_arg ..._]

# DESCRIPTION

**pushln** is a zsh builtin that pushes its arguments (concatenated with spaces) onto the shell's **buffer stack**. The buffer stack is a LIFO (last-in, first-out) data structure. Entries on the buffer stack are presented as editor buffer content for the next interactive command line, or can be read programmatically with **getln**.

This is equivalent to **print -nz** (push onto the editing buffer stack without a trailing newline). The buffer stack provides a way to pre-fill the command line or pass data between shell functions.

# CAVEATS

Only available in zsh. The buffer stack is cleared when the shell exits. In interactive use, pushed lines appear as editable input at the next prompt. Arguments are concatenated with spaces (like **print -nz**), not pushed as separate stack entries.

# SEE ALSO

[getln](/man/getln)(1), [print](/man/print)(1), [read](/man/read)(1), [zsh](/man/zsh)(1)

# RESOURCES

```[Homepage](https://www.zsh.org)```

```[Documentation](https://zsh.sourceforge.io/Doc/Release/Shell-Builtin-Commands.html)```

<!-- verified: 2026-11-09 -->
