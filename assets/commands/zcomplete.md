# TAGLINE

correct mistyped shell commands from your own history

# TLDR

Install shell hooks for **zsh, bash, and fish**

```zcomplete init --all```

**Seed** the database from shell history

```zcomplete import```

Ask what a typo would **resolve** to

```zcomplete query [gti]```

Always map a **shortcut** to a command

```zcomplete bind [gs] [git]```

Never suggest a word

```zcomplete ignore [sl]```

Require confirmation for every correction (**safe**, default)

```zcomplete safe```

Check the **install**

```zcomplete doctor```

# SYNOPSIS

**zcomplete** _command_ [_options_]

# COMMANDS

**init** [**--all** | **--zsh** | **--bash** | **--fish**]
> Append one integration line to each shell's config. `zcomplete init zsh` prints the hook script for `eval "$(zcomplete init zsh)"`.

**import** [_zsh_|_bash_|_fish_]
> Seed from history, aliases, functions, and builtins.

**query** _word_ [_subcommand_]
> Show what a word would become (**--score** for detail).

**stats** [_-n N_ | _command_]
> Learned commands, or subcommands for one command.

**bind** / **unbind** / **ignore** / **forget**
> Pin shortcuts, ignore words, or unlearn.

**safe** | **unsafe** | **bypass** | **off** | **on**
> Correction mode. **unsafe** auto-runs ordinary fixes but still confirms dangerous ones. **bypass** never confirms.

**doctor**
> Installation check.

# DESCRIPTION

**zcomplete** intercepts "command not found" (and, on fish, rewrites the line before it runs). It ranks executables you actually use, then matches typos by prefix, initials, subsequence, and edit distance. After a few confirmed `mkd` → `mkdir` answers, the mapping becomes automatic. Subcommands (`git sttaus`, `cargo tset`) are learned from successful runs and from `--help`, not a hardcoded list.

Dangerous commands (`rm`, `dd`, `mkfs*`, `git push --force`, `curl | sh`, and others in `src/safety.rs`) always ask in **unsafe** mode. Non-interactive shells are never rewritten.

Data lives in `~/.local/share/zcomplete` (or **$XDG_DATA_HOME/zcomplete** / **$ZCOMPLETE_DATA_DIR**): command names only, mode 0600. No config file; mode is stored in the database so open shells pick it up.

# CAVEATS

macOS system bash 3.2 cannot intercept in place; corrections appear at the next prompt. zsh/bash alias correction can lag one prompt because the not-found handler runs in a child. fish rebinds Enter; load zcomplete last. One command per line (`a && b` is not rewritten). `npm run buidl` is out of reach (only the first two words).

# HISTORY

Rust CLI by omarfakih1. Install: project `install.sh` or `cargo install --git https://github.com/omarfakih1/zcomplete`.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [fish](/man/fish)(1)

# RESOURCES

```[Source code](https://github.com/omarfakih1/zcomplete)```

<!-- verified: 2026-08-26 -->
