# TAGLINE

Smart tmux session manager that uses zoxide

# TLDR

**List** sessions, hiding the one you are attached to

```sesh list -H```

**List** with a source icon in front of each name

```sesh list -i```

**Connect**, creating the session when it is not running yet

```sesh connect [name]```

**Jump back** to the previous tmux session

```sesh last```

**Open** the built-in picker

```sesh picker -i```

**Preview** a session

```sesh preview [name]```

**Clone** a git repo and open it as a session

```sesh clone [url]```

**Create** a directory and connect to it

```sesh mkdir [my-new-project]```

**List windows** in the attached session

```sesh window list```

# SYNOPSIS

**sesh** [**-C** _file_] [_command_] [_options_]

# DESCRIPTION

**sesh** creates and switches tmux sessions. Josh Medeski wrote it in Go. A session name comes from the git repository, the git remote, or the directory. Directory history comes from **zoxide** unless you point the frecency table at another jumper, so projects you visit often show up in **sesh list** next to sessions that are already running.

**connect** attaches to a name and creates the session when it is not running. **last** switches to the previous attached session, including the case where tmux's own last-session binding no longer has one. **picker** is a built-in fuzzy selector. **preview** prints the active window of a session or a directory. **clone** clones a repository and then connects. **mkdir** creates a relative, absolute, or home-relative path and connects to it. **window** lists or selects windows inside a session. **root** prints the root of the attached session. **rename --enrich** adds a GitHub issue title to the session name when the **gh** command can resolve the branch.

**sesh list** with no source flags includes tmux sessions, zoxide results, configured sessions, and tmuxinator configs. Pass **-t**, **-z**, **-c**, or **-T** to keep one source.

This binary is not the AWS SSO tool that is also started by typing **sesh**. That project is **awsesh**.

# PARAMETERS

**-C** _file_, **--config** _file_
> Config file to load instead of the default. The file must already exist. This flag is global.

**--version**
> Print the version and exit.

**list** (alias **l**)
> Print sessions. With no source flags, every source is included.

**-t**, **--tmux**
> On **list** and **picker**, only tmux sessions.

**-z**, **--zoxide**
> On **list** and **picker**, only zoxide results.

**-c**, **--config**
> On **list** and **picker**, only sessions from the config file. Do not confuse this with the global **-C** path flag.

**-T**, **--tmuxinator**
> On **list** and **picker**, include tmuxinator configs. On **connect**, start a missing session with tmuxinator.

**-H**, **--hide-attached**
> Omit the session you are attached to.

**-i**, **--icons**
> Show a source icon. A Nerd Font is needed for the glyphs.

**--icons-exclude** _source_
> On **list**, skip the source icon for the named sources (for example tmux). Repeatable.

**-n**, **--no-color**
> On **list**, draw icons without color. Requires **--icons**.

**-d**, **--hide-duplicates**
> Drop entries that point at the same session.

**-p**, **--panes**
> On **list**, show panes in the current session. This requires an attached tmux client. If it is the only source flag, the list is panes only.

**-j**, **--json**
> On **list** and **window list**, print JSON. On **list**, this cannot be combined with **--format**.

**-b**, **--blacklisted**
> On **list**, show sessions the config blacklist would otherwise hide.

**--format** _template_
> On **list**, render each row yourself. Placeholders cover the display name, the raw session name, the source, the path, and the active window name (plus a prefix form of that window name). Color spans use **{fg:yellow}** and **{/fg}**. Supported color names are black, red, green, yellow, blue, magenta, cyan, white, and the bright- variants. gray and grey mean bright-black.

**--no-cache**
> On **list** and **picker**, read live sessions instead of the cache. The cache is still refreshed.

**connect** (alias **cn**) _name_
> Attach, or create the session. Further words are joined into one name.

**-s**, **--switch**
> On **connect**, **mkdir**, **window connect**, and **worktree**, switch the client instead of attaching. Use this when sesh is started from outside the terminal.

**-c** _command_, **--command** _command_
> On **connect**, run this only when the session is created. On **mkdir** and **window connect**, run it in the new session or window. On an existing window the text is sent into whatever is already running there.

**-r**, **--root**
> On **connect**, resolve the argument to the git root (worktree or repository) before connecting. **sesh root** (alias **r**) prints that root for the attached session instead.

**last** (alias **L**)
> Switch to the previous tmux session. Fails when there is no previous session.

**picker** (aliases **pick**, **pk**)
> Interactive selector. Source flags match **list**. **--preview** shows the highlighted session beside the list, and **--no-preview** hides that pane. **--query** prefills the filter. **--prompt** and **--placeholder** change the TUI text. **-s** / **--separator-aware** treats a space as a hyphen, underscore, slash, or backslash. **--no-alias-auto** does not connect the moment an alias is typed in full.

**preview** (alias **p**) _name_
> Preview one session or directory. **-w** / **--watch** refreshes an active tmux session. **--interval** sets that period (default 500ms) and must be greater than zero. Directories and config-only sessions are rendered once.

**clone** (alias **cl**) _repo_
> Clone, then connect. **-c** / **--cmdDir** is the directory git runs in. **-d** / **--dir** is the checkout directory name. Arguments after **--** are extra git flags.

**mkdir** (alias **md**) _path_
> Create the directory if it is missing, then connect. The path may be relative, absolute, or start with a tilde.

**rename** [_name_] **--enrich**
> Rename the named session, or the attached one, so the name includes its GitHub issue title. **gh** must be installed and authenticated. A branch with no issue is renamed back to the plain name. Without **--enrich** the command does nothing.

**window** (alias **w**) **list** | **connect**
> **window list** (aliases **l**, **ls**) prints windows of the attached session. **window connect** (aliases **cn**, **c**) selects a window by name, or creates it. A directory argument names the window after its basename and starts there. **--new** always creates a fresh window. **-b** / **--background** creates it without moving you. **--path** sets the start directory. **-t** / **--target** names another session, which is started if needed. **--session** is a deprecated alias of **--target**.

**worktree** (alias **wt**) **list** | **connect** | **picker** | **browse**
> Treat git worktrees as sessions. **list** prints worktrees and issue titles. **connect** takes an issue or pull-request number and creates the worktree when it is missing. **--repo** is an owner/repo name. **--pr** treats the number as a pull request (on **browse**, **-p** is that flag). **browse** opens the issue or pull request in a browser, or prints the URL with **--print**. **picker** is the interactive form. **--refresh** ignores the title cache. **connect --browser** reads the issue from the active browser tab, and that path is macOS-only.

**cache refresh**
> Rebuild the session-list cache from live data.

**completion** _shell_
> Write a completion script for bash, zsh, fish, or powershell.

# CONFIGURATION

The default file is **~/.config/sesh/sesh.toml**, or **sesh/sesh.toml** under the XDG config directory. **--config** replaces the path.

A schema line at the top of the file turns on editor completion:

```
#:schema https://github.com/joshmedeski/sesh/raw/main/sesh.schema.json
```

The example below sets the multiplexer binary, so psmux can stand in for tmux. It also hides a session name from **list** (show it again with **list -b**) and uses the last two directory components in a generated name. The default for that length is 1. A name-substitution table rewrites the home-collapsed path before the name is chosen. **find** is literal unless **regex** is true, and **replace** is the substitution. Rules run in order.

A frecency table replaces zoxide. Each value is one program, not a shell pipeline. A **{}** placeholder is replaced in the query, add, and remove commands. Omitted fields keep the zoxide default. The source label in **list** stays **zoxide**.

```
tmux_command = "psmux"
blacklist = ["scratch"]
dir_length = 2

[frecency]
list_command = "fasd -d -l -R"
query_command = "fasd -d {}"
add_command = "fasd -A {}"
remove_command = "fasd -D {}"
```

# CAVEATS

**tmux** has to be available, and **zoxide** has to be installed unless the frecency table names another directory jumper. **awsesh** installs a different binary that is also invoked as **sesh**. Short flags change meaning by subcommand: **-s** is **--switch** on **connect** and **--separator-aware** on **picker**; **-c** is **--config** on **list** and **--command** on **connect**; **-p** is **--panes** on **list** and **--pr** on **worktree browse**. **list --format** rows are display text. **connect** does not parse them back into a session name, so keep the raw name in a separate field when you pipe the list into **fzf**. **rename** without **--enrich** is a no-op. **worktree connect --browser** only reads the active tab on macOS.

# HISTORY

Josh Medeski publishes sesh on GitHub. The Go module path is github.com/joshmedeski/sesh/v2. The license is MIT.

# INSTALL

```aur: yay -S sesh-bin```

```brew: brew install sesh```

```nix: nix profile install nixpkgs#sesh```

<!-- packages: 2026-10-28 -->

# SEE ALSO

[tmux](/man/tmux)(1), [zoxide](/man/zoxide)(1), [fzf](/man/fzf)(1), [tmuxinator](/man/tmuxinator)(1), [gum](/man/gum)(1), [television](/man/television)(1), [gh](/man/gh)(1), [awsesh](/man/awsesh)(1)

# RESOURCES

```[Source code](https://github.com/joshmedeski/sesh)```

```[Documentation](https://github.com/joshmedeski/sesh#how-to-use)```

<!-- verified: 2026-10-28 -->
