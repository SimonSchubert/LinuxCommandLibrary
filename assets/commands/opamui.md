# TAGLINE

TUI for browsing and searching OCaml opam packages

# TLDR

**Browse opam packages** interactively

```opamui```

# SYNOPSIS

**opamui**

# DESCRIPTION

**opamui** is a terminal user interface for browsing and searching OCaml opam packages. It launches a full-screen TUI listing the packages available in your opam repository, marks which ones are already installed, filters the list as you type, and shows detailed package information when you press Enter.

It does **not** install or remove packages; it is a read-only browser built on top of **opam**.

# KEY BINDINGS

**Up** / **Down**
> Move selection in the package list.

**Typing**
> Filter packages by name in real time.

**Enter**
> Open the details view for the selected package, or return to the list.

**Backspace**
> Delete the last search character, or return to the list.

**Esc**
> Clear the search, or return to the list.

**q**, **Q**, **Ctrl+C**
> Quit.

# CAVEATS

Requires **opam** to be installed and initialized (**opam init**). The packages shown reflect the currently active switch. Building from source needs OCaml 4.08 or newer and Dune 3.20 or newer.

# HISTORY

**opamui** was created by **Nicolas Lamirault** (nlamirault) in **2025**. It is written in OCaml and uses the Notty library for terminal rendering.

# SEE ALSO

[opam](/man/opam)(1)

# RESOURCES

```[Source code](https://github.com/nlamirault/opamui)```

<!-- verified: 2026-11-23 -->
