# TAGLINE

Headless SolidCraft CAD: run scripts, measure parts, export, and snapshot

# TLDR

**Run** a command script and print measurements

```solidcraft-cli run [examples/bracket.json]```

Export to **STEP**

```solidcraft-cli run [examples/bracket.json] --out [bracket.step]```

Start from an existing **design** then run a script

```solidcraft-cli run [edit.json] --in [part.solidcraft] --out [part.step]```

**Measure** a design or imported STEP file as JSON

```solidcraft-cli eval [part.step]```

Render a **PNG** snapshot

```solidcraft-cli snapshot [examples/bracket.json] --out [bracket.png] --view [iso]```

Run **one** modelling command on an empty design

```solidcraft-cli exec [sketch.create] '{"plane":"XY"}'```

Dump the **command registry**

```solidcraft-cli commands```

Speak **MCP** on stdio (optional live UI on a port)

```solidcraft-cli mcp --in [part.solidcraft]```

# SYNOPSIS

**solidcraft-cli** **run** [_script_|_design_|_part_] [**--in** _file_] [**--out** _FILE_]... [**--save** _FILE_] [**--quiet**] [**--results**] [**--allow-errors**]

**solidcraft-cli** **eval**|_inspect_ [_file_] [**--in** _file_]

**solidcraft-cli** **snapshot** _file_ **--out** _shot.png_ [**--width** _W_] [**--height** _H_] [**--view** _iso_|_front_|_top_|_...]

**solidcraft-cli** **exec** _command_ [_json-params_]

**solidcraft-cli** **commands**

**solidcraft-cli** **mcp** [**--in** _file_] [**--connect** _HOST:PORT_]

**solidcraft-cli** **recipe**|_oracle_|_fuzz_|_bench-open_|_crashes_|_licences_|_icon_ ...

# DESCRIPTION

**solidcraft-cli** is the headless command line of **SolidCraft**, an open-source parametric 3D CAD application written in Rust. The desktop app is a GUI; this binary runs the same engine without a window: command scripts, measurements, exports, PNG snapshots, and an MCP server so agents can model, measure, and look at parts.

A script is a JSON list of the same commands the UI runs (`sketch.create`, `solid.extrude`, `file.export`, and the rest). `solidcraft-cli commands` prints the registry. **run** loads a script, a `.solidcraft` design, a STEP file, or a mesh (3MF/STL/OBJ), optionally starting from **--in**, then writes each **--out** through `file.export` and **--save** through `file.save_as`. Unless **--quiet**, it prints `inspect.measure` JSON (volume, area, centre of mass, body counts). A timeline feature that fails fails the run and writes nothing, unless **--allow-errors**.

**eval** (alias **inspect**) prints measurements plus timeline, parameters, and sketches. **snapshot** renders a PNG from a standard view. **mcp** speaks MCP on stdio; **--connect** attaches to a running desktop session.

The desktop binary is **solidcraft** (AppImage, .deb, .rpm, Flatpak, Snap). This page is the CLI.

# PARAMETERS

**run**
> Load a script, design, STEP, or mesh; export and/or save; print measurements.

**--in** _file_
> Start from a design or STEP/mesh instead of an empty session. With **run**, a positional script then runs on top of it.

**--out** _FILE_
> Export (repeatable). Extension selects STEP, IGES, 3MF, STL, or OBJ.

**--save** _FILE_
> Write a `.solidcraft` design.

**--quiet**
> Do not print measurements after **run**.

**--results**
> Print every script command's result as JSON (needs a script).

**--allow-errors**
> Write bodies even when a timeline feature failed.

**eval**, **inspect**
> Measurements and document inspect as JSON.

**snapshot**
> Render PNG. **--out** is required. **--width** / **--height** default 1280×800. **--view** is `iso`, `front`, `back`, `top`, `bottom`, `left`, or `right`.

**exec** _command_ [_json-params_]
> Run one command on an empty design.

**commands**
> Pretty-print the command registry.

**mcp**
> MCP server on stdio. **--in** loads a design or script first; **--connect** _HOST:PORT_ talks to the desktop app's JSON-lines channel.

**recipe** _recipe.json_
> Translate an oracle recipe to a command script.

**oracle** _case-dir_...
> Replay recipes and compare with `expected.json`.

**fuzz**
> Geometry fuzzer (`--from`, `--count`, `--jobs`, `--timeout`, `--steps`, `--minimise`, `--out`, `--report`).

**bench-open** _file_ [**--parse-only**]
> Loading timings as JSON lines.

**crashes** **list**|**show**|**replay**|**dir**|**clear**
> Local crash records.

**licences**, **licenses**
> SolidCraft's licence and third-party licences.

**icon** **--out** _F.png_|_F.ico_ [**--size** _N_]
> Draw the app icon (for packaging).

**-V**, **--version**
> Print `solidcraft-cli` and the crate version.

# CAVEATS

This is the headless CLI, not the GUI. A failed timeline feature aborts **run** unless **--allow-errors**; writing anyway can export the bodies from before the failed feature. **snapshot** needs **--out**. Mesh imports (3MF, STL, OBJ) render, measure, move, and export; solid features need B-rep bodies. Status is early but usable for simple parts.

# HISTORY

**SolidCraft** is an open-source parametric CAD in Rust (MIT and Apache-2.0). The project was renamed from **SolveCraft**. **solidcraft-cli** is the `solidcraft-cli` crate in that workspace.

# SEE ALSO

[openscad](/man/openscad)(1), [freecad](/man/freecad)(1), [blender](/man/blender)(1), [meshlab](/man/meshlab)(1)

# RESOURCES

```[Source code](https://github.com/bherbruck/solidcraft)```

```[Documentation](https://bherbruck.github.io/solidcraft/)```

<!-- verified: 2026-10-13 -->
