# TAGLINE

Terminal typing test

# TLDR

**Start** a typing test

```typer```

**Type words from a file**

```typer [file.txt]```

**Pipe text** as the prompt

```echo "[sample text]" | typer```

# SYNOPSIS

**typer** [*file*]

# DESCRIPTION

**typer** is a minimal typing-test TUI written in Go by maaslalani. It shows words to type, tracks WPM/accuracy, and runs entirely in the terminal. Install with **go install github.com/maaslalani/typer@latest**.

Not to be confused with the Python **typer** library for building CLIs.

# PARAMETERS

*file*

> Optional path whose contents are used as the text to type.

stdin may also supply text. Interactive keys are shown in the UI.

# CAVEATS

Name collision with Python's Typer package—ensure the Go binary is first on PATH if both are installed.

# SEE ALSO

[tt](/man/tt)(1), [toipe](/man/toipe)(1)

# RESOURCES

```[Source code](https://github.com/maaslalani/typer)```

<!-- verified: 2026-07-19 -->
