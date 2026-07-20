# TAGLINE

Fast keyboard-driven terminal UI for Git written in Zig

# TLDR

**Open ziggity** in the current Git repository

```ziggity```

**Install via Homebrew** (macOS / Linux)

```brew install simoarpe/ziggity/ziggity```

**Build from source** (requires Zig 0.16)

```zig build -Doptimize=ReleaseSafe```

**Point at a shared config file** from the shell

```export ZIGGITY_CONFIG="$HOME/.config/ziggity/config.ini"```

**Show in-app keybindings** (once running)

```?```

**Quit**

```q```

# SYNOPSIS

**ziggity**

# DESCRIPTION

**ziggity** is a terminal user interface (TUI) for Git that provides a lazygit-style workflow in a small Zig binary. It drives plain **git** as a subprocess (no libgit2) and uses libvaxis for the UI. Split panels cover Status, Files, Branches, Commits, and Stash, with a live diff preview and a context-sensitive footer.

Core operations are keyboard-driven: stage or unstage whole files or individual hunks and lines, commit with an in-app summary/body editor, manage branches and tags, stash with optional messages, fetch/pull/push without blocking the UI, and run interactive rebases through a visual plan editor. Additional features include a real **git log --graph** viewer, multi-selection ranges, custom patch building, merge-conflict resolution, GPG signature checks, worktree and submodule navigation, remappable keys, and themeable colours.

Run **ziggity** inside any Git repository. Press **?** for the keybinding overlay (scrolled to the focused panel) and **q** to quit. Prebuilt static binaries are published for macOS, Linux (musl), and Windows; Homebrew installs the macOS/Linux package from the project's tap.

# KEYBOARD SHORTCUTS

**1**–**5**: Focus Status / Files / Branches / Commits / Stash
**h** **l** / arrows: Move focus between side panels
**j** **k** / arrows: Move selection
**tab**: Focus the Diff panel (and back)
**space**: Stage file · checkout branch · apply stash (by focus)
**c**: Commit
**a**: Stage/unstage all (Files)
**d** / **D**: Discard menu / discard all
**f** / **p** / **P**: Fetch / pull / push
**i**: Interactive rebase plan editor
**ctrl+l**: Commit graph viewer
**ctrl+z**: Undo last operation
**?**: Keybindings help
**q**: Quit

# CONFIGURATION

**ZIGGITY_CONFIG**
> Environment variable pointing at an INI config file applied globally. There is no auto-loaded XDG path; set this in the shell profile to share settings across repositories.

**\<repo\>/.ziggity.ini**
> Per-repository INI file that overrides **ZIGGITY_CONFIG**. Without any config file, settings fall back to defaults and per-repo auto-detection (notably the editor).

Common settings include panel layout (**side_panel_width_percent**, **expand_focused_side_panel**), commit editor guides (**commit_summary_limit**, **commit_body_guide**), refresh/fetch intervals, editor presets (**editor_preset**, **editor_command**), remappable keys (**key.\<name\>**), theme colours (**color.\<name\>** as terminal palette indices 0–255), and custom commands (**command.\<key\>**).

# CAVEATS

Requires **git** on **PATH** at runtime. Destructive history operations (hard reset, force push, rebase) should be used carefully. macOS prebuilt binaries may need a one-time quarantine clear (**xattr -d com.apple.quarantine**). Windows builds are cross-compiled and experimental. Feature parity with lazygit is intentionally incomplete in places (for example, redo after undo is not implemented).

# HISTORY

**ziggity** was created by **Simone Arpe** and is written in **Zig**. It aims for a lazygit-like feel without being a line-by-line port, emphasizing a small dependency-light binary, explicit memory ownership, and plain git subprocesses.

# SEE ALSO

[git](/man/git)(1), [lazygit](/man/lazygit)(1), [gitui](/man/gitui)(1), [tig](/man/tig)(1)

# RESOURCES

```[Source code](https://github.com/simoarpe/ziggity)```

<!-- verified: 2026-07-20 -->
