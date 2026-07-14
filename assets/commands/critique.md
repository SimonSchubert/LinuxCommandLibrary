# TAGLINE

terminal TUI for reviewing git diffs with syntax highlighting

# TLDR

**Review** unstaged working tree changes

```critique```

Review **staged** changes only

```critique --staged```

Review changes **since a ref** or between two refs

```critique [main]
critique [main] [HEAD]```

Review a **single commit**

```critique --commit [abc1234]```

**Watch** the working tree and refresh on file changes

```critique --watch```

**Filter** files by glob pattern

```critique --filter "[src/**/*.ts]"```

Upload a **web preview** to critique.work

```critique --web "[title]"```

Generate an **AI code review** of the current diff

```critique review --agent [claude|opencode]```

# SYNOPSIS

**critique** [_options_] [_ref_ [_ref2_]]

**critique review** [_options_] [_ref_]

# PARAMETERS

**--staged**
> Show staged changes only

**--commit** _ref_
> Show the changes introduced by one commit

**--watch**
> Refresh the view when files change

**--filter** _pattern_
> Restrict review to files matching a glob (repeatable)

**--web** [_title_]
> Upload a shareable web preview to critique.work

**--pdf** [_filename_]
> Generate a PDF of the diff or review

**--stdin**
> Read a patch from standard input (for example as a git pager)

**--agent** _name_
> For **critique review**: use **opencode** or **claude**

# DESCRIPTION

**critique** is a terminal user interface for reviewing Git changes. It follows the same mental model as **git diff**: with no arguments it shows the working tree (including untracked files); **--staged** shows the index; one or two refs compare history in the usual ways.

The TUI uses Tree-sitter for syntax highlighting, word-level diffs, split or unified layouts, and keyboard navigation between files. Optional modes upload previews to **critique.work**, export PDFs for e-readers, or run **critique review** through OpenCode or Claude Code for AI explanations.

It requires **Bun** (not Node.js). Install with **bun install -g critique** or run via **bunx critique**.

# CAVEATS

Requires Bun. Web uploads send rendered diff HTML and the raw patch to critique.work (uploads expire unless licensed). Lock files and very large file diffs may be hidden automatically.

# SEE ALSO

[git-diff](/man/git-diff)(1), [delta](/man/delta)(1), [lazygit](/man/lazygit)(1)

# RESOURCES

```[Source code](https://github.com/remorses/critique)```

```[Homepage](https://critique.work)```

<!-- verified: 2026-07-14 -->
