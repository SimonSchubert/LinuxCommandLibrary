# TAGLINE

Syntax-aware structural code diff

# TLDR

Open the **interactive viewer** (press **o** to pick files, **?** for keys)

```codediff```

Diff **two files** in the TUI

```codediff [old.rs] [new.rs]```

Print a **plain-text** diff (also used when stdout is not a terminal)

```codediff --headless [old.rs] [new.rs]```

Emit **JSON** for an editor integration

```codediff --mode json [old.rs] [new.rs]```

Configure as **git's difftool** (interactive wizard)

```codediff git configure```

Drive **git diff** / **git log -p** through codediff (always non-interactive)

```GIT_EXTERNAL_DIFF=codediff git diff```

Open on the **git review picker** (unstaged, staged, recent commits)

```codediff --review```

Exit **1** when the files differ (diff(1) convention; headless and JSON only)

```codediff --headless --exit-code [old.rs] [new.rs]```

# SYNOPSIS

**codediff** [_options_] [_before_ _after_]

**codediff** **git** **configure**

**codediff** **jj** **configure**

**codediff** **util** **completions** _shell_

**codediff** **util** **man**

# PARAMETERS

_before_ _after_
> Files to diff. Also accepts git's 7- or 9-argument **GIT_EXTERNAL_DIFF** list (`path old-file old-hex old-mode new-file new-hex new-mode [new-path score]`). With no paths the TUI starts empty.

**--mode** _tui_|_headless_|_json_
> How to show the diff. Default **tui**. **headless** and **json** need two files. **headless** is also chosen when stdout is not a terminal; **json** never is.

**--headless**, **--batch**
> Shorthand for **--mode headless**. Conflicts with **--mode**.

**--minimal**
> Paint only ranges that carry meaning (the TUI **M** panel's Minimal preset). Applies for this run only and is not saved. Conflicts with **--full**.

**--full**
> Paint the fullest reading (the **M** panel's Full preset, except whole-pair updates). This run only.

**--whole-updates**
> Highlight an updated node's matched pair as a whole, not only the part that differs. Combines with **--minimal** / **--full**.

**--paint-reindent-moves**
> Paint a node as moved even when only indentation changed. Turns that **M** panel option on for this run.

**--color** _auto_|_always_|_never_
> When to ANSI-color headless output. Default **auto**: color unless **NO_COLOR** is set (even when stdout is a pipe, so git's pager shows color). **always** and **never** override **NO_COLOR**.

**--exit-code**
> Exit **1** when the files differ (**0** identical, **2** on error). Headless and JSON only. Off by default: version-control tools treat a non-zero exit from a display tool as a failure. Ignored under git's **GIT_EXTERNAL_DIFF** argument form.

**--context** _N_
> Unchanged lines to keep around each change in headless output, like **diff -U**. Default **3**.

**--review**
> Open the TUI on the git review picker for the repository around the current directory. TUI only; takes no file pair. Conflicts with paths, **--headless**, and **--mode**.

**git configure**
> Interactive wizard that writes **difftool.codediff.cmd**, optionally **diff.tool** / **difftool.prompt**, and optionally **diff.external**. Needs a terminal on stdin.

**jj configure**
> Interactive wizard that registers codediff as a jj merge tool with **diff-invocation-mode** **file-by-file**, and optionally sets **ui.diff-formatter**.

**util completions** _shell_
> Print a completion script for **bash**, **zsh**, **fish**, **elvish**, or **powershell** on stdout.

**util man**
> Print a roff man page (section 1) on stdout.

**-h**, **--help**
> Print usage and exit.

**-V**, **--version**
> Print the version and exit.

# DESCRIPTION

**codediff** compares two files by parsing them with tree-sitter and matching their syntax trees, so a change is reported as an insertion, deletion, update, or move rather than as whichever lines happened to align. It is a command-line tool: an interactive two-panel TUI, a numbered plain-text formatter, or a JSON emitter for editors.

Language is taken from the file extension. Twenty-four languages are parsed with a compiled grammar (C, C++, C#, CSS, Go, HTML, Java, JavaScript, JSON, Kotlin, Lua, PHP, Python, R, Ruby, Rust, Scala, Bash, Swift, TSX, TypeScript, Vimscript, XML, YAML). An unknown extension is diffed as plain text. Bazel, Dart, Emacs Lisp, Markdown, Protocol Buffers, and SQL are recognised by extension but still diffed as text.

With no arguments, the TUI starts empty. Press **o** to pick each file, **?** for keybindings, **G** for the git review picker, and **M** for render options. **--review** is the same as **G** at startup. The TUI uses 24-bit color when the terminal sets **COLORTERM=truecolor**, otherwise the nearest 256 colors.

**--headless** (alias **--batch**) prints the diff as text. Headless mode also starts whenever stdout is not a terminal, so `codediff BEFORE AFTER | less` and `GIT_EXTERNAL_DIFF=codediff git diff` work without the flag. Each printed line is prefixed with its line number. Long unchanged runs are collapsed. Each hunk is prefixed with the nearest enclosing function, class, or struct line when that line is not otherwise visible. Binary files print `Binary file <path> differs` and do not fail the rest of a git diff.

**--mode json** prints one JSON object: each side has a path, a detected language, and hunks with an operation (`delete`, `insert`, `update`, `move`) and a 0-indexed range (rows; columns are byte offsets). JSON is never chosen automatically.

Exit **0** on success and **2** on error. Pass **--exit-code** to get **1** when the files differ.

`codediff git configure` sets git to use codediff as **git difftool**. `git diff` and `git log -p` never open the TUI: git pipes through a pager, so codediff always falls back to text there. For the interactive viewer from git, use **git difftool**. `codediff jj configure` registers **jj diff --tool codediff**. jj has no equivalent of git difftool's per-file TUI, so for the full-screen viewer on a jj repo run **codediff** on two files directly.

# CONFIGURATION

**$CODEDIFF_CONFIG**
> If set and non-empty, this file is the only config used.

**.codediff.toml**
> Nearest existing file at or above the current directory. Never created automatically.

**$XDG_CONFIG_HOME/codediff/config.toml**
> User config (or **$HOME/.config/codediff/config.toml**). Holds TUI theme, panel layout, recent pairs, custom palette, syntax theme, node highlight, and render options (the **M** panel). **--minimal** / **--full** override render options for one run and are not saved.

**difftool.codediff.cmd**, **diff.tool**, **diff.external**
> Written by **codediff git configure** (git config, global or local).

**merge-tools.codediff.***, **ui.diff-formatter**
> Written by **codediff jj configure** (jj config, user or repo). **diff-invocation-mode** must be **file-by-file**.

# CAVEATS

Licensed **AGPL-3.0-or-later**. A commercial license is sold separately for organisations that cannot use AGPL software.

A source build (`cargo install --locked codediff`) needs rustc **1.88** or later and a C compiler; the first install compiles every tree-sitter grammar and takes several minutes. The crate's default features include the TUI binary.

The first positional path cannot be a file literally named **git**, **jj**, or **util** (those are subcommands).

**--exit-code** is ignored in the 7-argument **GIT_EXTERNAL_DIFF** form: git treats a non-zero exit there as fatal and aborts the whole diff.

# HISTORY

Written by **Marko Ivankovic**. First user release **0.1.0** (2026-09-25); **0.1.1** (2026-09-27) dropped the bundled browser front end in favour of the separate **codereview** project.

# SEE ALSO

[diff](/man/diff)(1), [git-diff](/man/git-diff)(1), [git-difftool](/man/git-difftool)(1), [git-log](/man/git-log)(1), [jj](/man/jj)(1), [delta](/man/delta)(1), [difft](/man/difft)(1), [colordiff](/man/colordiff)(1)

# RESOURCES

```[Source code](https://github.com/ivankovic/codediff)```

```[Homepage](https://ivankovic.github.io/codediff/showcase/)```

```[Documentation](https://github.com/ivankovic/codediff/blob/main/README.md)```

<!-- verified: 2026-09-30 -->
