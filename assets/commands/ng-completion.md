# TAGLINE

sets up shell autocompletion for Angular CLI commands

# TLDR

**Set up completion** by appending a line to your shell rc file

```ng completion```

**Print the completion script**

```ng completion script```

**Enable completion** for the current shell session only

```source <(ng completion script)```

# SYNOPSIS

**ng completion** [**script**]

# PARAMETERS

**script**
> Output a bash and zsh real-time type-ahead autocompletion script.

# DESCRIPTION

**ng completion** sets up shell autocompletion for Angular CLI commands. It appends **source <(ng completion script)** to the first existing rc file (~/.bashrc, ~/.bash_profile or ~/.profile for bash; ~/.zshrc, ~/.zsh_profile or ~/.profile for zsh). Restart the terminal or source the file to activate it.

The CLI also offers to set this up automatically the first time a command is run in a supported shell.

# CAVEATS

Only bash and zsh are supported. Completion requires a global install (npm install -g @angular/cli) so that ng is on the PATH.

# SEE ALSO

[ng](/man/ng)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/completion)```

<!-- verified: 2026-09-29 -->
