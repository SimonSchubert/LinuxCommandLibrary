# TAGLINE

Zsh history store with directory and exit-status context

# TLDR

**Hook zhist into zsh** (add to `.zshrc`)

```eval "$(zhist init)"```

**Import** an existing zsh history file once

```zhist import ~/.zsh_history```

**List** stored commands for the fzf picker (newest first, deduplicated)

```zhist list```

**List** only commands recorded in the current directory

```zhist list -dir "$PWD"```

**Print** the full command text for an entry

```zhist get -id [id]```

**Delete** one stored entry

```zhist delete -id [id]```

**Delete every entry** with the same command text

```zhist delete -id [id] -all```

**Record** a command from stdin with directory and exit status

```print -r -- "[command]" | zhist add -dir "$PWD" -exit 0```

# SYNOPSIS

**zhist** **init**

**zhist** **add** **-dir** _dir_ **-exit** _n_ [**-ts** _unix_]

**zhist** **list** [**-dir** _dir_]

**zhist** **get** **-id** _id_

**zhist** **delete** **-id** _id_ [**-all**]

**zhist** **import** _file_

# DESCRIPTION

**zhist** is a zsh-only shell history tool written in Go. It replaces the zsh history file as the persistent store and records each command together with its working directory and exit status. Native zsh history keeps only the command and a timestamp; zhist keeps that extra context so the picker can highlight failures and switch between global history and the current directory.

The interactive UI is **fzf**, not a custom TUI. `eval "$(zhist init)"` emits zsh hooks and keybindings that call the **zhist** binary: a **preexec**/**precmd** pair appends each command via **zhist add**, and **ctrl-r** (plus bare up/down on an empty line) opens **zhist list** in fzf. Failed commands render in red. **ctrl-g** toggles global versus directory-scoped history.

Entries are appended as JSON lines to **~/.local/share/zhist/history.jsonl** (mode **0600**), or to the path in **ZHIST_FILE**. Imported zsh **EXTENDED_HISTORY** lines have no directory or exit status; they show a blank directory and never render red.

# PARAMETERS

**init**
> Print the zsh integration script (hooks, fzf picker, and keybindings). Intended for `eval "$(zhist init)"`.

**add** **-dir** _dir_ **-exit** _n_ [**-ts** _unix_]
> Append one entry. Command text is read from stdin. **-ts** defaults to the current Unix time.

**list** [**-dir** _dir_]
> Print entries for fzf: newest first, one unique command per line, tab-separated id / relative time / command. **-dir** keeps only entries recorded in that directory.

**get** **-id** _id_
> Print the full command for an entry (including embedded newlines).

**delete** **-id** _id_ [**-all**]
> Delete the entry with that id. **-all** also deletes every other entry with the same command text.

**import** _file_
> Import a zsh **EXTENDED_HISTORY** file (`: timestamp:elapsed;command` lines). Prints `imported N entries`.

# KEY BINDINGS

These bindings are installed by **zhist init**:

**ctrl-r**
> Open the history picker.

**up** / **down**
> Open the picker when the line is empty; otherwise step native line history.

**ctrl-g**
> Toggle global versus current-directory history.

**ctrl-d**
> Delete the selected entry.

**ctrl-x**
> Delete all entries with the same command.

**tab**
> Accept and leave the command on the line.

**ctrl-/**
> Toggle the command preview pane. Visibility is remembered in **${XDG_STATE_HOME:-$HOME/.local/state}/zhist/preview-hidden**.

# CONFIGURATION

Add to **~/.zshrc** after any plugin that binds **ctrl-r** or the arrow keys (the last bind wins):

```
eval "$(zhist init)"
```

Skip recording by first word with a **HIST_EXCLUDE** array. Matching is exact and case-sensitive on the first word only (`ls` skips `ls -la` but not `lsd`). A leading space also skips the command, matching **HIST_IGNORE_SPACE**.

```
HIST_EXCLUDE=(cd ls clear pwd exit)
```

**ZHIST_FILE**
> Override the JSONL store path (default **~/.local/share/zhist/history.jsonl**).

Because zhist owns persistence, keep native zsh history in memory only:

```
unset HISTFILE
HISTSIZE=100000
SAVEHIST=0
```

Do not set **SHARE_HISTORY**, **INC_APPEND_HISTORY**, or **EXTENDED_HISTORY**; they only affect the history file zhist replaces.

# CAVEATS

zsh only; there is no bash or fish integration. The picker requires **fzf** 0.45 or newer. `eval "$(zhist init)"` must run after atuin, zsh-history-substring-search, or other widgets that bind the same keys. Building from source via **go install** needs the Go version declared in the module. Imported history has no directory or exit status. The record hook prepends itself to **precmd_functions** and passes **$?** through so later prompt hooks still see the real exit status.

# HISTORY

**zhist** was created by **overflowy** in **August 2026**. It is written in Go and released under the MIT license. The store is JSON Lines; the search UI is delegated to fzf.

# SEE ALSO

[atuin](/man/atuin)(1), [mcfly](/man/mcfly)(1), [hishtory](/man/hishtory)(1), [hstr](/man/hstr)(1), [fzf](/man/fzf)(1), [history](/man/history)(1), [zsh](/man/zsh)(1)

# RESOURCES

```[Source code](https://github.com/overflowy/zhist)```

<!-- verified: 2026-08-12 -->
