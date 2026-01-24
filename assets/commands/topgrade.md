# TLDR

**Upgrade everything**

```topgrade```

**Upgrade specific steps only**

```topgrade --only [system] --only [brew]```

**Skip specific steps**

```topgrade --disable [flatpak] --disable [snap]```

**Dry run** (show what would run)

```topgrade --dry-run```

**Run without asking confirmation**

```topgrade -y```

**Show available steps**

```topgrade --list```

**Cleanup after upgrade**

```topgrade --cleanup```

**Edit configuration**

```topgrade --edit-config```

# SYNOPSIS

**topgrade** [_--only steps_] [_--disable steps_] [_-y_] [_--dry-run_] [_options_]

# PARAMETERS

**-y**, **--yes**
> Say yes to all prompts.

**-n**, **--dry-run**
> Print commands without running.

**--only** _STEPS_
> Run only specified steps.

**--disable** _STEPS_
> Skip specified steps.

**--cleanup**
> Remove old packages/caches.

**--list**
> List available steps.

**-e**, **--edit-config**
> Open config file in editor.

**-c**, **--config** _FILE_
> Use specific config file.

**--no-retry**
> Don't retry failed steps.

**-t**, **--tmux**
> Run in new tmux session.

**-k**, **--keep**
> Keep going if step fails.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**topgrade** updates everything on your system with a single command. It detects installed package managers, language tools, and applications, running their update commands in sequence.

Supported systems include: OS packages (apt, pacman, brew, dnf, zypper), programming languages (rustup, pip, npm, gem, cargo), containers (docker, flatpak, snap), and applications (firmware, vim plugins, etc.).

Detection is automatic - topgrade checks what's installed and runs appropriate updates. Missing tools are silently skipped. This enables using one config across different machines.

Configuration (~/.config/topgrade.toml) controls behavior: which steps to disable, custom commands to run, and step-specific settings. The --only and --disable flags override config for single runs.

The tool shows what it's updating with colored output. Failures are reported but don't necessarily stop other updates. Retry logic handles transient issues.

Cleanup mode removes old package versions and caches, reclaiming disk space after updates.

# CAVEATS

Running all updates takes time. Some updates require sudo. Network issues may cause failures. Version conflicts possible if mixing update sources. May restart services unexpectedly. Test new versions before production use.

# HISTORY

**topgrade** was created by **Rafael Fernández López** (r12f) around **2018**. Written in Rust, it addresses the challenge of remembering update commands for multiple package managers. The project has grown to support an extensive list of tools and platforms.

# SEE ALSO

[apt](/man/apt)(1), [brew](/man/brew)(1), [pacman](/man/pacman)(8), [flatpak](/man/flatpak)(1)
