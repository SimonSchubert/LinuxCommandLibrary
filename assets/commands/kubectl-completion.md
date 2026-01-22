# TLDR

**Generate bash completion**

```kubectl completion bash```

**Generate zsh completion**

```kubectl completion zsh```

**Enable for current session**

```source <(kubectl completion bash)```

**Add to bashrc**

```echo "source <(kubectl completion bash)" >> ~/.bashrc```

**Add to zshrc**

```echo "source <(kubectl completion zsh)" >> ~/.zshrc```

# SYNOPSIS

**kubectl completion** _shell_

# PARAMETERS

_SHELL_
> Shell type (bash, zsh, fish, powershell).

**bash**
> Generate bash completion.

**zsh**
> Generate zsh completion.

**fish**
> Generate fish completion.

**--help**
> Display help information.

# DESCRIPTION

**kubectl completion** generates shell autocompletion scripts. It enables tab completion for kubectl commands.

The command outputs shell-specific completion code. Source it in your shell config for persistent completion.

kubectl completion enables tab complete.

# CAVEATS

Subcommand of kubectl. Requires bash-completion package for bash. Shell-specific.

# HISTORY

kubectl completion provides shell integration for **kubectl**, improving command-line efficiency.

# SEE ALSO

[kubectl](/man/kubectl)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1)
