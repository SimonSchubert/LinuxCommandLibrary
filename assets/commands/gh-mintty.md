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

**gh-mintty** refers to GitHub CLI configuration guidance for MinTTY, the terminal emulator used by Git Bash on Windows. MinTTY has specific requirements for interactive prompts and pseudo-terminal handling.

The gh CLI includes special documentation for MinTTY users addressing common issues like authentication prompts, interactive selections, and color output. Some features may require configuration adjustments or alternative approaches.

gh help mintty provides Windows-specific terminal configuration advice.

# CAVEATS

Windows-specific topic. Some gh features work differently in MinTTY. Git Bash users may need additional configuration.

# HISTORY

MinTTY documentation was added to **GitHub CLI** to address Windows terminal compatibility issues, particularly around pseudo-terminal support.

# SEE ALSO

[gh](/man/gh)(1), [gh-config](/man/gh-config)(1), [mintty](/man/mintty)(1)
