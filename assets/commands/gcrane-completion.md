# TAGLINE

generates shell autocompletion scripts

# TLDR

Print the completion script for a **shell**

```gcrane completion [bash]```

Print it **without the descriptive comments**

```gcrane completion [bash] --no-descriptions```

Enable it in the **running Bash shell**

```source <(gcrane completion bash)```

Enable it in the **running Zsh shell**

```source <(gcrane completion zsh)```

Enable it in the **running fish shell**

```gcrane completion fish | source```

Install it for **every Bash session**

```gcrane completion bash | sudo tee /etc/bash_completion.d/gcrane```

Install it for **every Zsh session**

```gcrane completion zsh > "${fpath[1]}/_gcrane"```

Install it for **every fish session**

```gcrane completion fish > ~/.config/fish/completions/gcrane.fish```

Load it in **PowerShell**

```gcrane completion powershell | Out-String | Invoke-Expression```

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

# INSTALL

```zypper: sudo zypper install gcrane```

```nix: nix profile install nixpkgs#gcrane```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gcrane](/man/gcrane)(1), [gcrane-gc](/man/gcrane-gc)(1), [gcrane-ls](/man/gcrane-ls)(1), [crane](/man/crane)(1), [docker](/man/docker)(1), [podman](/man/podman)(1)
