# TAGLINE

GitHub CLI configuration guidance for MinTTY terminal on Windows

# TLDR

**Show MinTTY help**

```gh help mintty```

**Configure MinTTY for gh**

```gh config set prompt disabled```

**Set git protocol**

```gh config set git_protocol https```

# SYNOPSIS

**gh help mintty**

# PARAMETERS

**--help**
> Display help information.

# DESCRIPTION

**gh-mintty** provides GitHub CLI configuration guidance for MinTTY, the terminal emulator used by Git Bash on Windows. MinTTY has specific requirements for interactive prompts and pseudo-terminal handling that can affect **gh** behavior.

The documentation addresses common issues like authentication prompts, interactive selections, and color output. Workarounds include reinstalling Git for Windows with "Enable experimental support for pseudo consoles" checked, or using a different terminal emulator like Windows Terminal.

# CAVEATS

Windows-specific topic. Some gh features work differently in MinTTY. Git Bash users may need additional configuration.

# HISTORY

MinTTY documentation was added to **GitHub CLI** to address Windows terminal compatibility issues, particularly around pseudo-terminal support.

# SEE ALSO

[gh](/man/gh)(1), [gh-config](/man/gh-config)(1)
