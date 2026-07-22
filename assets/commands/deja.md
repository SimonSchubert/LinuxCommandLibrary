# TAGLINE

Predictive ghost-text autosuggestions for zsh

# TLDR

**Import** existing zsh history into the local database

```deja import```

**Activate** shell integration in the current session

```eval "$(deja init zsh)"```

**Check** that the background daemon answers

```deja ping```

**Show** the current fuzzy-matching preset

```deja fuzzy```

**Tighten** fuzzy matching for near-adjacent character matches

```deja fuzzy tight```

**Query** the daemon for a suggestion (used by the zsh widget)

```deja query```

# SYNOPSIS

**deja** **import** [_options_]

**deja** **init** _zsh_

**deja** **ping**

**deja** **fuzzy** [_preset_|**cycle**|**back**]

**deja** **query** [_options_]

# PARAMETERS

**--file** _path_
> History file for **import** when **$HISTFILE** is unset or not exported (default **~/.zsh_history**).

**DEJA_FUZZY**
> Session override for fuzzy preset (**tight**, **smart**, **loose**) before the daemon starts.

**DEJA_ACCEPT_KEY**, **DEJA_CYCLE_KEY**, **DEJA_TOGGLE_KEY**, **DEJA_DISMISS_KEY**
> Remap key sequences (export before **eval "$(deja init zsh)"**).

# DESCRIPTION

**deja** is a local-first replacement for **zsh-autosuggestions**. A single background Go daemon scores command history with fuzzy matching, directory affinity, frecency decay, and sequence prediction, then returns inline ghost-text suggestions over a Unix socket in under a millisecond.

After **deja import**, add **eval "$(deja init zsh)"** to **~/.zshrc**. The init script spawns the daemon on first use and wires ZLE widgets: **→** accepts the full suggestion, **Tab** cycles ranked alternatives, **Ctrl+X** suppresses suggestions for the session, and **Shift+→** / **Shift+←** cycle fuzzy presets (**tight**, **smart**, **loose**).

State lives in **~/.local/share/deja/deja.db** (SQLite WAL). Nothing is synced to a cloud service. If **zsh-autosuggestions** is already loaded, deja detects it and stands down to avoid conflicting ZLE wrappers.

# CONFIGURATION

Data directory: **~/.local/share/deja/** (**deja.db**, **sock**, generated **init.zsh**). Fuzzy preset persists across restarts via **deja fuzzy** _preset_. Oh My Zsh users can install the **deja** plugin from the upstream repo instead of hand-editing **~/.zshrc**, but should not enable both the plugin and a duplicate **eval "$(deja init zsh)"** line.

# CAVEATS

zsh only. Requires a reachable daemon (**deja ping** → **pong**). After a crash, remove a stale **~/.local/share/deja/sock** and open a new shell. Do not run alongside **zsh-autosuggestions**.

# INSTALL

```nix: nix profile install nixpkgs#deja```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[zsh](/man/zsh)(1), [history](/man/history)(1)