# TAGLINE

minimal terminal typing speed test with programming-language word lists

# TLDR

**Start a 30-second English typing test** (default)

```typtea start```

**Run a 60-second test**

```typtea start --duration [60]```

**Practice Rust keywords**

```typtea start --lang [rust]```

**Combine duration and language**

```typtea start --duration [45] --lang [javascript]```

**List all supported languages**

```typtea start --list-langs```

**Show help**

```typtea --help```

# SYNOPSIS

**typtea** _command_ [_options_]

**typtea start** [**--duration** _SECONDS_] [**--lang** _LANG_] [**--list-langs**]

# PARAMETERS

**start**
> Begin a typing test.

**--duration** _SECONDS_
> Length of the test in seconds (default `30`).

**--lang** _LANG_
> Word list to use. `english` (default) plus 30+ programming languages (e.g. `go`, `rust`, `python`, `javascript`, `typescript`, `c`, `cpp`, `java`, `kotlin`, `swift`, `ruby`, `php`, `lua`, `haskell`, `scala`, `zig`, `elixir`, `shell`).

**--list-langs**
> Print every available word list.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# DESCRIPTION

**typtea** is a minimal terminal typing tester aimed at programmers. It generates an infinite stream of words from an English or language-specific keyword list, shows a scrolling three-line viewport, and reports WPM (words per minute) and accuracy in real time. The UI is built with **Bubble Tea** / **Lipgloss** so it handles resizing, colors, and mouse/keyboard input cleanly.

# CAVEATS

The binary name is lowercase (`typtea`). All modes live under the `start` subcommand — running `typtea` with no args prints help on recent versions.

# HISTORY

**typtea** was created by **Ashish Kumar** (GitHub `ashish0kumar`) and is written in **Go** using **Bubble Tea**. It is distributed via GitHub Releases and packaged in several distros (e.g. FreeBSD ports, AUR).

# SEE ALSO

[typioca](/man/typioca)(1), [tt](/man/tt)(1), [ttyper](/man/ttyper)(1), [smassh](/man/smassh)(1)
