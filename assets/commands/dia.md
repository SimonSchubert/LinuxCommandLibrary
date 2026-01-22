# TLDR

**Launch Dia** diagram editor

```dia```

**Open a diagram file**

```dia [diagram.dia]```

**Export diagram** to image

```dia -e [output.png] [diagram.dia]```

**Export to specific** format

```dia -t [svg] -e [output.svg] [diagram.dia]```

**Export without GUI**

```dia --export=[output.png] --filter=[png] [diagram.dia]```

**List available export** formats

```dia --list-filters```

# SYNOPSIS

**dia** [_options_] [_file_...]

# PARAMETERS

_FILE_
> Diagram file(s) to open.

**-e**, **--export** _FILE_
> Export to specified file.

**-t**, **--filter** _FORMAT_
> Export format: png, svg, eps, pdf, etc.

**--size** _WxH_
> Size for bitmap export.

**--list-filters**
> List available export filters.

**--nosplash**
> Start without splash screen.

**--help**
> Display help information.

# DESCRIPTION

**Dia** is a diagram creation program similar to Microsoft Visio. It supports various diagram types including flowcharts, network diagrams, UML diagrams, circuit diagrams, and more through customizable shape libraries.

The application features a GTK-based interface with tools for drawing, connecting, and formatting diagram elements. Diagrams are saved in XML format (optionally compressed) and can be exported to numerous image and vector formats.

Dia's extensibility through custom shapes and Python scripting makes it adaptable to specialized diagramming needs. It's widely used for technical documentation and software design.

# CAVEATS

Native file format differs from other diagramming tools. Some export formats may lose features. Complex diagrams can be slow to render. Font rendering varies across platforms.

# HISTORY

Dia was created by **Alexander Larsson** and first released in **1998**. It was developed as a free software alternative to commercial diagramming tools, becoming part of the GNOME project's application suite.

# SEE ALSO

[inkscape](/man/inkscape)(1), [graphviz](/man/graphviz)(1), [drawio](/man/drawio)(1)
