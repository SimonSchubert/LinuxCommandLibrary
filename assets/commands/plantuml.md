# TAGLINE

Generate UML diagrams from text descriptions

# TLDR

**Generate diagram**

```plantuml [diagram.puml]```

**Output as PNG**

```plantuml -tpng [diagram.puml]```

**Output as SVG**

```plantuml -tsvg [diagram.puml]```

**Output to directory**

```plantuml -o [output_dir] [diagram.puml]```

**Read from stdin**

```echo "@startuml\nA -> B\n@enduml" | plantuml -pipe > [diagram.png]```

**Watch for changes**

```plantuml -gui```

# SYNOPSIS

**plantuml** [_options_] _files_...

# DESCRIPTION

**plantuml** generates UML diagrams from text descriptions. It supports sequence diagrams, class diagrams, activity diagrams, and many other types.

The tool uses a simple text-based syntax that can be version-controlled and integrated into documentation workflows.

# PARAMETERS

**-t** _format_
> Output format (png, svg, eps, pdf, txt).

**-o** _dir_
> Output directory.

**-charset** _encoding_
> Input file encoding.

**-pipe**
> Use stdin/stdout.

**-gui**
> Launch GUI.

**-config** _file_
> Include config file.

**-checkversion**
> Check for updates.

**-verbose**
> Verbose output.

# DIAGRAM TYPES

Sequence, Class, Activity, Use Case, Component, State, Object, Deployment, Timing, Wireframe, Gantt, Mind Map

# CAVEATS

Requires Java. Graphviz needed for some diagrams. Large diagrams may be slow. Complex layouts need tuning.

# HISTORY

**PlantUML** was created by **Arnaud Roques** starting in **2009**. It brought text-based diagramming to UML, integrating with wikis, documentation tools, and IDEs.

# INSTALL

```dnf: sudo dnf install plantuml```

```pacman: sudo pacman -S plantuml```

```apk: sudo apk add plantuml```

```zypper: sudo zypper install plantuml```

```brew: brew install plantuml```

```nix: nix profile install nixpkgs#plantuml```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[graphviz](/man/graphviz)(1), [mermaid](/man/mermaid)(1), [ditaa](/man/ditaa)(1), [drawio](/man/drawio)(1)
