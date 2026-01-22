# TLDR

Generate the autocompletion script for your **shell**

```gcrane completion [shell_name]```

**Disable** completion descriptions

```gcrane completion [shell_name] --no-descriptions```

Load completions in your **current shell session** (Bash/Zsh)

```source <(gcrane completion bash)```

Load completions in your current shell session (**fish**)

```gcrane completion fish | source```

Load completions for **every new Bash session**

```gcrane completion bash > /etc/bash_completion.d/gcrane```

Load completions for **every new Zsh session**

```gcrane completion zsh > "${fpath[1]}/_gcrane"```

Load completions for **every new fish session**

```gcrane completion fish > ~/.config/fish/completions/gcrane.fish```

Display **help**

```gcrane completion [shell_name] -h```

# SYNOPSIS

**gcrane completion** _shell_ [_options_]

# PARAMETERS

**bash**
> Generate Bash completion script

**zsh**
> Generate Zsh completion script

**fish**
> Generate fish completion script

**powershell**
> Generate PowerShell completion script

**--no-descriptions**
> Disable completion descriptions

**-h**, **--help**
> Display help for completion command

# DESCRIPTION

**gcrane completion** generates shell autocompletion scripts for the gcrane command-line tool. gcrane is a tool for working with container registries, part of Google's go-containerregistry project.

Completions provide tab-completion for gcrane commands, flags, and arguments, improving command-line efficiency. The generated scripts must be sourced or installed according to your shell's completion system.

For persistent completions, install the output to the appropriate location for your shell (bash_completion.d for Bash, fpath for Zsh, or ~/.config/fish/completions for fish).

# CAVEATS

Installation paths vary by system configuration. Zsh requires the completion directory to be in fpath before compinit is called. Some systems may require logging out and back in for changes to take effect.

# SEE ALSO

[gcrane](/man/gcrane)(1), [crane](/man/crane)(1), [docker](/man/docker)(1), [podman](/man/podman)(1)
