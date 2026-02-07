# TAGLINE

Programmable tab completion for Bash commands.

# TLDR

**Load bash completions** in current session

```source /usr/share/bash-completion/bash_completion```

**Install completions** for a command (copy to system directory)

```sudo cp [command_completion.bash] /usr/share/bash-completion/completions/[command]```

**Install completions** for current user only

```cp [command_completion.bash] ~/.local/share/bash-completion/completions/[command]```

**List loaded completions**

```complete -p```

**Remove a completion**

```complete -r [command]```

**Create a simple completion** for a command

```complete -W "[option1 option2 option3]" [command]```

# SYNOPSIS

**complete** [_options_] _command_

# PARAMETERS

**complete -p** [_command_]
> Print current completion specification for command(s).

**complete -r** _command_
> Remove completion specification for command.

**complete -W** _wordlist_ _command_
> Define completion using a word list.

**complete -F** _function_ _command_
> Use a shell function for completion.

**complete -C** _command_ _command_
> Use a command's output for completion.

**complete -o** _option_ _command_
> Enable completion options (filenames, dirnames, default, etc.).

**compgen**
> Generate completions programmatically in completion functions.

# DESCRIPTION

**bash-completion** is a collection of shell functions that provide programmable command-line completion for Bash. When you press Tab, it completes not just filenames but command options, subcommands, hostnames, and other context-specific values.

The system works by defining completion specifications that tell Bash how to generate suggestions for specific commands. Specifications can use word lists, functions, or external commands to generate completions dynamically.

Completions are stored in **/usr/share/bash-completion/completions/** (or **/etc/bash_completion.d/** on older systems). They are loaded on-demand when Tab is first pressed for a command, improving shell startup time.

# CONFIGURATION

**/etc/bash_completion**
> System-wide bash-completion configuration sourced at shell startup.

**/usr/share/bash-completion/completions/**
> System-wide per-command completion scripts, loaded on demand.

**/etc/bash_completion.d/**
> Legacy directory for system-wide completion scripts, loaded eagerly at startup.

**~/.local/share/bash-completion/completions/**
> User-specific per-command completion scripts.

# CAVEATS

Completions are Bash-specific and won't work in other shells (Zsh has its own system). The bash-completion package must be installed and sourced in your profile. Completion functions can slow down Tab completion for commands with complex completions. Not all commands have completion scripts available.

# HISTORY

Bash programmable completion was added to Bash in version **2.04** (2000). The bash-completion project, which provides a collection of completions for common commands, was started by **Ian Macdonald** around **2000** and has been maintained by various contributors since. It is now included by default in most Linux distributions and macOS Homebrew.

# SEE ALSO

[bash](/man/bash)(1), [complete](/man/complete)(builtin), [compgen](/man/compgen)(builtin)
