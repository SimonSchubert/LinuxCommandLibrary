# TAGLINE

Fuzzy-find and run make, npm, just, and task targets

# TLDR

**Pick and run** a target in the current project

```fzf-make```

**Show help**

```fzf-make --help```

# SYNOPSIS

**fzf-make** [*options*]

# DESCRIPTION

**fzf-make** opens a fuzzy finder with a preview window so you can select and execute build/task targets. Supported task systems:

- **make** (including **include** directives)
- **npm** / **pnpm** / **yarn** (including yarn workspaces scripts)
- **just** recipes
- **task** (Taskfile; uses **task --list-all --json**, including **includes**)

Run it in the project directory that contains the relevant **Makefile**, **package.json**, **justfile**, or **Taskfile**.

Install via Homebrew, AUR, Nix, **cargo install --locked fzf-make**, or Linux release binaries (**linux_amd64** / **linux_arm64**).

# PARAMETERS

See **fzf-make --help** for flags supported by your version (history, config, and UI options evolve between releases). Primary usage is interactive with no required arguments.

# CAVEATS

Needs a terminal UI and the underlying tool (**make**, **npm**, **task**, etc.) installed for the project type you select. Behaviour depends on how targets are declared; malformed Makefiles or Taskfiles may yield incomplete lists.

# SEE ALSO

[make](/man/make)(1), [just](/man/just)(1), [task](/man/task)(1), [fzf](/man/fzf)(1)

# RESOURCES

```[Source code](https://github.com/kyu08/fzf-make)```

<!-- verified: 2026-07-19 -->
