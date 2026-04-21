# TAGLINE

upgrade everything on a system with a single command

# TLDR

**Upgrade everything**

```topgrade```

**Run only specific steps**

```topgrade --only [system] --only [brew]```

**Skip specific steps**

```topgrade --disable [flatpak] --disable [snap]```

**Dry run** (show what would run)

```topgrade --dry-run```

**Answer yes to all prompts**

```topgrade -y```

**List available steps**

```topgrade --show-skipped```

**Only check for updates**, do not install

```topgrade --check```

**Edit the configuration file**

```topgrade --edit-config```

# SYNOPSIS

**topgrade** [_options_]

# PARAMETERS

**-y**, **--yes**
> Answer yes to all confirmation prompts.

**-n**, **--dry-run**
> Print the commands that would run without executing them.

**--only** _STEP_
> Run only the specified step. May be passed multiple times.

**--disable** _STEP_
> Skip the specified step for this run. May be passed multiple times.

**--check**
> Only check for available updates without installing them.

**-c**, **--cleanup**
> Clean up old package versions and caches after upgrading.

**--show-skipped**
> List steps that would be skipped with the current configuration.

**-e**, **--edit-config**
> Open the topgrade configuration file in `$EDITOR`.

**--config** _FILE_
> Use an alternate configuration file.

**--no-retry**
> Do not prompt to retry failed steps.

**-t**, **--tmux**
> Run topgrade inside a new tmux session.

**-k**, **--keep**
> Keep the terminal open after execution finishes.

**-v**, **--verbose**
> Produce verbose output.

**--remote-host-limit** _REGEX_
> Limit remote execution to hosts matching the regex (when using the remote-hosts feature).

**-V**, **--version**
> Print version information.

**-h**, **--help**
> Show help.

# DESCRIPTION

**topgrade** detects which package managers, language toolchains, and applications are installed, and runs the appropriate update command for each in sequence. Missing tools are silently skipped, so the same binary and configuration can be reused across machines with different software sets.

Supported sources include OS package managers (apt, pacman, dnf, zypper, brew), language ecosystems (rustup, pip, pipx, npm, gem, cargo, go), container tools (docker, flatpak, snap, nix), editor plugins (vim, neovim, emacs), shells (fisher, zinit, oh-my-zsh), firmware (fwupd), and many more.

Behavior is driven by a TOML configuration file at `$XDG_CONFIG_HOME/topgrade.toml` (or `~/.config/topgrade.toml`). Steps can be disabled by default there, and custom pre/post commands and remote hosts can be defined. The **--only** and **--disable** flags override configuration for the current run.

# CAVEATS

A full upgrade can take a long time and may prompt for `sudo`. Transient network or mirror issues may cause individual steps to fail; topgrade keeps going and reports a summary at the end. Mixing several package sources can lead to version conflicts, and some updates may restart services.

# HISTORY

**topgrade** was created by **Roey Darwish Dror** (**r-darwish**) in **2018** as a Rust utility to avoid remembering the update command for every package manager. After the original author stepped away, the project was forked and is now maintained by the community-run **topgrade-rs** organization on GitHub.

# SEE ALSO

[apt](/man/apt)(1), [brew](/man/brew)(1), [pacman](/man/pacman)(8), [flatpak](/man/flatpak)(1), [snap](/man/snap)(1)
