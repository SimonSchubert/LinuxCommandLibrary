# TAGLINE

generate shell completion scripts

# TLDR

**Generate bash completions**

```gh completion -s bash > ~/.local/share/bash-completion/completions/gh```

**Generate zsh completions**

```gh completion -s zsh > "${fpath[1]}/_gh"```

**Generate fish completions**

```gh completion -s fish > ~/.config/fish/completions/gh.fish```

**Generate PowerShell completions**

```gh completion -s powershell | Out-String | Invoke-Expression```

# SYNOPSIS

**gh completion** **-s** _shell_

# PARAMETERS

**-s** _SHELL_, **--shell** _SHELL_
> Shell type: bash, zsh, fish, powershell.

**--help**
> Display help information.

# DESCRIPTION

**gh completion** generates shell completion scripts for the GitHub CLI. These scripts enable tab completion for gh commands, subcommands, flags, and dynamic values like repository names and branches.

The completions integrate with each shell's native completion system, providing context-aware suggestions. Dynamic completions query GitHub for repositories, issues, and pull requests.

Completion scripts should be regenerated after gh updates to include new commands.

# CAVEATS

Output must be saved to appropriate shell completion directory. Shell may need restart or sourcing to load completions. Dynamic completions require authentication.

# HISTORY

gh completion is built into the **GitHub CLI**, following Unix conventions for providing shell integration via completion scripts.

# INSTALL

```apt: sudo apt install gh```

```dnf: sudo dnf install gh```

```pacman: sudo pacman -S github-cli```

```apk: sudo apk add github-cli```

```zypper: sudo zypper install gh```

```brew: brew install gh```

```nix: nix profile install nixpkgs#gh```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gh](/man/gh)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1)
