# TAGLINE

Paint and animation CLI that agents and humans share

# TLDR

**Open** the editor on the start window

```klad open```

Open a **drawing**

```klad open [scene.klad]```

**Create** an empty drawing

```klad new [art.klad]```

Paint a **stroke** with a brush

```klad stroke [art.klad] [l4] --brush oil --path 'M100 400 C 300 200 500 600 700 400'```

**List** strokes on a layer as JSON

```klad strokes [art.klad] [l4] --json```

**Change** a stroke

```klad set [art.klad] [c4:s12] size=3.5 color=#3355aa```

**Export** to Godot

```klad export [art.klad] --godot [../game/art]```

**Undo** the last change

```klad undo [art.klad]```

Put **klad** on PATH

```klad install```

Print the **agent skill**

```klad skill```

# SYNOPSIS

**klad** _command_ [_options_] [_bundle_]

# PARAMETERS

**open** [_bundle_]
> Open the editor on a drawing, or the start window with no argument.

**new** _bundle_
> Create an empty bundle with paint layers.

**stroke** _bundle_ _layer_ [_--brush_] [_--path_]
> Paint a stroke along an SVG path or explicit points.

**fill** _bundle_ _layer_ [_--at_] [_--color_]
> Fill a region of a paint layer.

**set** _bundle_ _id_ _key=value..._
> Change properties of a layer, cel, stroke, or fill.

**strokes** _bundle_ _layer_ [_--json_]
> List strokes and fills of a paint cel.

**ls** _bundle_
> Layer tree with ids, kinds, and bounds.

**export** _bundle_ [_--godot_ _dir_]
> Export PNGs, sprite sheets, numbered frames, or a Godot SpriteFrames scene.

**inbetween** _bundle_ [_--layers_] [_--from_] [_--to_]
> Drawings between two keys.

**undo** / **redo** _bundle_
> Undo or redo the last change (CLI or editor).

**notes** / **selection** _bundle_
> Notes pinned on the canvas, or the current editor selection.

**apply** _bundle_ [_--file_]
> Apply JSON-line edits in one write (stdin or a file).

**install**
> Put klad on the terminal PATH for you and for agents.

**skill** [_drawing_]
> Print the agent skill (tool use, or `drawing` for craft).

**samples**
> List shipped sample drawings, or copy one out.

# DESCRIPTION

**klad** is a 2D painting and animation tool. The same drawing is a folder of files on disk. The editor is a GUI; every editor action also has a **klad** command, so a script or coding agent paints with the same brushes, layers, and timeline.

A drawing is a `.klad` directory. Addresses look like `l4` (layer) and `c4:s12` (cel and stroke). **klad apply** takes JSON lines, one transaction per call. **klad-client** is a Rust crate that runs the same commands.

Linux builds live under `target/linux/release/` after `just compile`. The editor starts on Linux with the mouse; tablet pressure is documented as macOS-first.

# CAVEATS

Source-available, not open source: free to build and use for yourself, and inside a company under 500000 euros yearly revenue (see the project licence). You currently build it yourself. Bones commands may still change. Drawings migrate when the format version changes. **klad-editor** is the GUI binary; this page is the **klad** CLI.

# SEE ALSO

[cargo](/man/cargo)(1)

# RESOURCES

```[Homepage](https://klad.studio)```

```[Source code](https://github.com/klad-app/klad)```

```[Documentation](https://github.com/klad-app/klad/blob/main/docs/cli.md)```

<!-- verified: 2026-11-12 -->
