# TAGLINE

Deprecated programmable two-view graphics editor from Graphviz

# TLDR

This program is **deprecated**. Graphviz still ships it.

Open a **Lefty program**

```lefty [path/to/file.lefty]```

Read the program from **standard input**

```lefty -```

**Evaluate** an expression

```lefty -e '[expression]'```

**Exit** after loading the file

```lefty -x [path/to/file.lefty]```

Set the **error level** (0 through 5)

```lefty -el [2] [path/to/file.lefty]```

Show **help**

```lefty -?```

Show the **version**

```lefty -V```

# SYNOPSIS

**lefty** [_options_] [_file_]

# PARAMETERS

**-x**
> Exit after processing the file.

**-e** _expression_
> Parse and run one expression.

**-el** _num_
> Error reporting level. The default is 0, which prints nothing. 1 prints severe errors (the only level the manual calls a real error). 2 reports function calls that cannot run. 3 also warns about bad variable names. 4 and 5 warn about expressions that return no value.

**-sd** _num_
> How much of the stack to show on an error. The default is 2. 0 shows none, 1 shows the top frame, 2 shows the full stack.

**-sb** _num_
> How much of each function to show. The default is 2.

**-df** _string_
> Default X font. An empty string draws boxes instead of text.

**-ps** _file_
> Default PostScript output name. The default is **out.ps**.

**-V**
> Print the version and exit.

**-?**
> Print usage and exit.

# DESCRIPTION

**lefty** is a two-view graphics editor for technical pictures, shipped with Graphviz. The picture is a program: functions draw it and functions edit it. Mouse and keyboard events are bound to those functions. Beside the drawing, the editor shows the program text.

The file argument is optional. **-** reads the program from standard input.

Two environment variables apply. Put them in a context that keeps the underscores:

```LEFTYPATH```

A colon-separated list of directories. Lefty searches that path when it opens a file, and it searches that path before **PATH** when it starts another process.

```LEFTYOPTIONS```

Default options. Options on the command line override them.

# CAVEATS

Graphviz marks lefty as deprecated. New pictures should be drawn with **dot** and the other layout programs.

# HISTORY

Lefty predates the current Graphviz layout tools as a programmable editor that could talk to external layout processes. The binary remains in the Graphviz package.

# INSTALL

```apt: sudo apt install graphviz```

```dnf: sudo dnf install graphviz```

```pacman: sudo pacman -S graphviz```

```zypper: sudo zypper install graphviz```

```brew: brew install graphviz```

```nix: nix profile install nixpkgs#graphviz```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [twopi](/man/twopi)(1), [circo](/man/circo)(1), [graphviz](/man/graphviz)(7)

# RESOURCES

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Homepage](https://graphviz.org)```

```[Documentation](https://graphviz.org/docs/cli/lefty/)```

<!-- verified: 2026-11-17 -->
