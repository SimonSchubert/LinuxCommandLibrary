# TAGLINE

Manage symbolic links for default commands

# TLDR

This command is an **alias** of update-alternatives

View documentation for the original command

```tldr update-alternatives```

# SYNOPSIS

**alternatives**

# DESCRIPTION

**alternatives** maintains symbolic links that determine the default command run for a given generic name (for example which **java** or **editor** is used). It lets several packages provide the same functionality and select between them.

On Debian and Ubuntu, **alternatives** is simply another name for **update-alternatives**, which ships as part of dpkg. On Fedora, RHEL, and related distributions it is a separate implementation provided by the chkconfig package, with similar but not identical behavior. See **update-alternatives** for the full Debian documentation.

# SEE ALSO

[update-alternatives](/man/update-alternatives)(1)

# RESOURCES

```[Source code](https://git.dpkg.org/cgit/dpkg/dpkg.git)```

```[Documentation](https://manpages.ubuntu.com/manpages/noble/man1/update-alternatives.1.html)```

<!-- verified: 2026-06-11 -->
