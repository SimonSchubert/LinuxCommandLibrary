# TAGLINE

generate shell autocompletion scripts for doctl

# TLDR

**Generate Bash completion** and load it in the current session

```source <(doctl completion bash)```

**Generate Zsh completion** and load it in the current session

```source <(doctl completion zsh)```

**Generate fish completion**

```doctl completion fish```

**Generate PowerShell completion**

```doctl completion powershell```

**Install Bash completion** into the shell profile

```echo 'source <(doctl completion bash)' >> ~/.bashrc```

# SYNOPSIS

**doctl completion** _shell_

# PARAMETERS

_SHELL_
> Target shell. Valid values: `bash`, `zsh`, `fish`, `powershell`.

**bash**
> Print a Bash completion script on stdout.

**zsh**
> Print a Zsh completion script on stdout.

**fish**
> Print a fish completion script on stdout.

**powershell**
> Print a PowerShell completion script on stdout.

**--help**, **-h**
> Display help for this command.

# DESCRIPTION

**doctl completion** prints a shell autocompletion script for **doctl**. Source the output in your shell startup file so tab completion works for commands, subcommands, and flags.

On Linux, a typical setup is `source <(doctl completion bash)` in `~/.bashrc` (or the `zsh`/`fish` equivalent). Homebrew installs of **doctl** often ship completion files automatically, though the shell still has to load them.

This command does not modify files; it only writes the script to stdout.

# CAVEATS

Bash completion needs the **bash-completion** framework. Homebrew-generated completions may already be installed separately from this command. PowerShell and Windows support is limited compared with Unix shells. The generated script must be regenerated after upgrading **doctl** if new commands were added.

# INSTALL

```dnf: sudo dnf install doctl```

```pacman: sudo pacman -S doctl```

```apk: sudo apk add doctl```

```brew: brew install doctl```

```nix: nix profile install nixpkgs#doctl```

<!-- packages: 2026-09-07 -->

# SEE ALSO

[doctl](/man/doctl)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1)

# RESOURCES

```[Source code](https://github.com/digitalocean/doctl)```

```[Documentation](https://github.com/digitalocean/doctl#enabling-shell-auto-completion)```

<!-- verified: 2026-09-07 -->
