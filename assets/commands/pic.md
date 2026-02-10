# TAGLINE

troff preprocessor for drawing diagrams

# TLDR

**Process pic to troff**

```pic [diagram.pic] | troff```

**Generate output**

```pic [diagram.pic] > [output.troff]```

**Safe mode**

```pic -S [diagram.pic]```

**Check syntax only**

```pic -n [diagram.pic]```

**Show version**

```pic --version```

# SYNOPSIS

**pic** [_-S_] [_-n_] [_-C_] [_options_] [_files_]

# PARAMETERS

**-S**
> Safe mode (no shell commands).

**-n**
> Suppress output, check syntax.

**-C**
> Compatible mode.

**-D**
> Define macro.

**-T** _DEVICE_
> Output device.

**-z**
> GNU extensions.

# DESCRIPTION

**pic** is a troff preprocessor for drawing diagrams. It converts textual descriptions into troff drawing commands.

Diagrams use geometric primitives: boxes, circles, lines, arrows. Positioning is relative or absolute.

Objects connect with lines and arrows. Labels and text annotate elements.

The language supports macros and variables. Complex diagrams build from reusable components.

Output integrates with groff/troff document processing. Pic diagrams embed in technical documents.

# EXAMPLE

```
.PS
box "Start"
arrow
circle "Process"
arrow
box "End"
.PE
```

# CAVEATS

Limited compared to modern diagramming tools. Troff output only. Steep learning curve.

# HISTORY

**pic** was created by **Brian Kernighan** at **Bell Labs** in the **1980s**. It was part of the troff/groff document preparation system and influenced later diagramming languages.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [tbl](/man/tbl)(1), [eqn](/man/eqn)(1)
