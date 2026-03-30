# TAGLINE

Zsh precommand modifier to disable filename globbing

# TLDR

**Install a package without shell expansion** of wildcards

```noglob apt install linux-*```

**Pass a URL with special characters** without quoting

```noglob curl https://example.com/api?key=value&page=2```

**Run find without expanding glob patterns** in the shell

```noglob find . -name *.txt```

**Use with package managers** that have glob-like syntax in names

```noglob pip install package[extra]```

# SYNOPSIS

**noglob** _simple command_

# DESCRIPTION

**noglob** is a zsh precommand modifier that disables filename generation (globbing) for all words in the command that follows. When used, pattern matching characters like **\***, **?**, and **[...]** are treated literally rather than being expanded to match filenames.

This is useful when passing arguments that contain glob characters to commands without needing to quote each argument individually. Common use cases include URLs with query strings, package names with brackets, and commands where wildcard characters should be passed through verbatim.

**noglob** must appear before any other precommand modifier, as it is interpreted immediately before any parsing is done.

# CAVEATS

Only available in **zsh**; not a POSIX shell feature. Has no effect in non-interactive shells. In bash, the equivalent is **set -o noglob** (or **set -f**) which applies globally rather than per-command. Cannot be combined after other precommand modifiers — it must come first.

# HISTORY

**noglob** has been part of **zsh** since its early versions, originating from the csh family of shells. The C shell (**csh**) introduced the concept of selectively disabling globbing, and zsh adopted and refined it as a precommand modifier alongside **nocorrect**, **builtin**, **command**, and **exec**.

# SEE ALSO

[zsh](/man/zsh)(1), [bash](/man/bash)(1), [glob](/man/glob)(7)
