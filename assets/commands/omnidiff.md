# TAGLINE

View a word-level diff in a terminal, or print it for scripts

# TLDR

Open the **interactive** viewer on two files

```omnidiff [before] [after]```

Open an empty viewer and pick the files inside it

```omnidiff```

Print a **plain-text** diff (also what a pipe does by itself)

```omnidiff --headless [before] [after]```

Print **JSON**

```omnidiff --mode json [before] [after]```

Exit **1** when the files differ (exit 2 is still an error)

```omnidiff --exit-code --headless [before] [after]```

Keep more unchanged lines around each change (the default is 3)

```omnidiff --headless --context [5] [before] [after]```

Register OmniDiff as the **git** difftool

```omnidiff git configure```

Register it as the **jj** diff tool

```omnidiff jj configure```

# SYNOPSIS

**omnidiff** [_options_] [_before_ _after_]

**omnidiff** **git** **configure**

**omnidiff** **jj** **configure**

# PARAMETERS

_before_ _after_

> Two files to compare. With neither path, the TUI starts empty. Press `o` in the viewer to choose each file

**--headless**, **--batch**

> Print the diff as text instead of opening the TUI. This also happens when stdout is not a terminal

**--mode json**

> Print one JSON object. The field names are in the JSON schema shipped next to the TUI sources

**--context** _N_

> Unchanged lines to keep on each side of a change. The default is 3, matching `diff -u`

**--color** _always_|_never_

> ANSI color is on by default. **never** turns it off. Setting the NO COLOR environment variable to 1 does the same. **always** keeps color even then

**--exit-code**

> Exit 1 when the files differ. Without this flag a successful comparison exits 0 even if the files differ. Errors still exit 2

**git configure**

> Interactive setup of `difftool.omnidiff` for this repository or for the user

**jj configure**

> Interactive setup of the jj merge tool named `omnidiff`

# DESCRIPTION

**omnidiff** is a Rust diff viewer. In a terminal it opens a full-screen TUI. Press `?` there for the key list. The TUI uses 24-bit color when `COLORTERM=truecolor`, and 256 colors otherwise. Set that variable if the terminal can do 24-bit color but does not advertise it.

Headless output collapses long unchanged regions and, when it can, prefixes a hunk with the nearest function, class, or struct line. **--exit-code** is off by default because git and jj treat a non-zero difftool status as a failure. The seven-argument external-diff form (the GIT EXTERNAL DIFF environment variable) stays at exit 0 even with **--exit-code**, because git treats a non-zero status there as fatal.

**git configure** writes the equivalent of `git config difftool.omnidiff.cmd` with **omnidiff** and the local and remote paths. `git difftool` opens the TUI. `git diff` and `git log -p` do not. **jj configure** registers a file-by-file merge tool. `jj diff` itself stays a text formatter unless you set `ui.diff-formatter`.

Highlighting has two presets used when scoring accuracy against other diffs: **--full** keeps brackets, separators, and leading whitespace, and **--minimal** drops them.

# CAVEATS

Exit status without **--exit-code** does not tell you whether the files differed. Scripts that need the `diff` convention must pass **--exit-code**. Do not enable `difftool.trustExitCode` unless you want git to stop at the first difference.

A pipe such as `omnidiff [before] [after] | less` is already headless. You do not need **--headless** for that.

Vendor install paths (a crates.io package, a Homebrew tap, and an apt repository published by the author) are not the same as a distro package named `omnidiff`. This page does not assume those indexes carry it.

# HISTORY

**omnidiff** is an AGPL-3.0-only Rust TUI by ivankovic. Editor companions live in separate repositories (`omnidiff-vscode`, `omnidiff.nvim`). A browser reviewer, **codereview**, is a different project and was still at v0.0.0 when this page was written.

# INSTALL

```aur: yay -S omnidiff```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[diff](/man/diff)(1), [git](/man/git)(1), [git-difftool](/man/git-difftool)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/ivankovic/omnidiff)```

```[Documentation](https://docs.rs/omnidiff)```

<!-- verified: 2026-11-07 -->
