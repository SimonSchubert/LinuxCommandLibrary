# TAGLINE

Inspect, plan, and check moving LDraw mechanisms

# TLDR

Prepare a study directory from a model (this is the documented starting point)

```ldraw-mecha prepare [model.mpd] --output [output/study]```

List parts and candidate roles

```ldraw-mecha inspect [model.mpd] --format table --limit [20]```

Search the offline part catalog

```ldraw-mecha search parts [gear] --limit [8]```

Check a plan (structure, motion, and scope)

```ldraw-mecha check [output/study]```

Evaluate one pose

```ldraw-mecha evaluate [output/study] --set [angle=45]```

Build a rig in Blender

```ldraw-mecha rig [output/study] --animate --reopen```

# SYNOPSIS

**ldraw-mecha** [**--library** _path_] _command_ [_arguments_]

# PARAMETERS

**--library** _path_

> LDraw library. When omitted, the LDRAW DIR or LDRAWDIR environment variable is used

**inspect** _model_

> List occurrences, positions, and candidate roles. **--format** is `json` (default) or `table`. **--limit** defaults to 100, **--offset** to 0, **--max-instances** to 100000. **--mechanical-only** drops non-mechanical parts. **--ref** and **--instances** filter. **--section** selects a submodel

**connectors** _model_ **--instance** _id_

> Local and world connector frames for one occurrence. **--shadow** names a comparison model

**contacts** _model_ **--instances** _ids_

> Measure connector contacts in a bounded selection

**coaxial** _model_ **--instances** _ids_

> Candidate shared axes. **--distance-tolerance** defaults to 0.5 LDU. **--angle-tolerance** defaults to 1 degree

**gear-meshes** _model_

> Candidate gear meshes from the source geometry. Same tolerance flags as **coaxial**

**extract** _model_ **--section** _name_ **--output** _file_

> Copy one section into a standalone MPD. Both **--section** and **--output** are required

**plan** _model_

> Create a draft plan, or adopt a studied recipe (**--recipe**) into an existing study (**--study**)

**convert** _model_ **--output** _file_

> Write a GLB and bind occurrence ids. **--plan** uses the source and section recorded in that plan

**prepare** _model_ **--output** _dir_

> New study directory: identities, evidence, and by default a GLB. **--no-glb** skips the mesh. **--contact-limit** defaults to 300. **--plan** and **--recipe** are mutually exclusive

**check** | **validate** | **evaluate** | **sweep** | **audit** _plan_

> _plan_ is a plan JSON file or a study directory. **validate** checks structure, source freshness, and the default pose. **evaluate** checks one pose (**--set** `CONTROL=VALUE`, repeatable). **sweep** moves each control (**--steps** defaults to 17). **audit** reports reviewed, unresolved, and deferred mechanisms. **check** runs the combination. **--require-constrained** and **--require-reviewed** make **check** and **audit** exit 1 when coverage is missing. **check** writes `check.json` beside the plan unless **--output** is set

**search** **parts** | **models** | **submodels** _query_

> Offline catalog search. **--engine** is `fts` (default), `keyword`, or `jev`. **--raw-fts** passes an FTS5 query through. **--limit** defaults to 8, **--candidates** to 40

**submodels** _model_

> Compare named assemblies. **--match** is a substring. **--sort** defaults to pistons (also parts, rods, crank parts, gears, axles). **--limit** defaults to 30

**diagrams** _plan_

> Mermaid diagnostics. **--view** is `auto` (default), `connections`, or `motion`

**xray** _target_

> Call the separate **ldraw-xray** program on `PATH` to render look boards. _target_ is a model or a study. **--instances** or **--body** chooses what to color. **--point** and **--direction** set a candidate pivot and axis

**rig** _plan_

> Build and verify the plan in a background Blender. **--animate** records motion. **--reopen** checks the saved file in a fresh Blender process. **--tolerance** defaults to 0.002 LDU. **--blender** selects the executable, else the BLENDER BIN environment variable

**jev-status**

> One small availability probe for the optional Jev search backend. There is no balance endpoint

# DESCRIPTION

**ldraw-mecha** is the console script of the `ldraw-mechanisms` Python package (anteloc/ldraw-mecha). It prepares an LDraw model as a study, lets you edit the motion plan, and checks that plan. The documented start is `prepare MODEL --output output/study`, then edit `plan.json`, then `check` and `rig`.

Stdout is JSON unless a command's **--format table** is set. Usage errors exit 2. A check that fails its criteria exits 1.

**xray** does not render by itself. It invokes a **ldraw-xray** binary already on `PATH`. **rig** invokes Blender. **search --engine jev** needs that backend. The default search engine is the local full-text index.

Python 3.12 or newer is required. The package depends on pyldraw3 and numpy.

# CAVEATS

**prepare --output** must be a new study directory. **extract** requires both a section and an output file. **contacts** and **coaxial** require **--instances**. **connectors** requires **--instance**.

**--require-constrained** and **--require-reviewed** turn missing mechanical coverage into a failed exit. Deferred items stay in the report either way.

**rig** starts Blender in the background. A missing Blender executable fails that command only. Geometry commands still run without it.

This tool does not download an LDraw parts library for you. Point **--library** at one, or set the library environment variable.

# HISTORY

**ldraw-mecha** is the command-line front end of the ldraw-mechanisms project for studying gears, axles, and other moving LDraw assemblies, including a path into Blender. Version 0.5.0 is the release whose CLI this page describes.

# SEE ALSO

[python3](/man/python3)(1), [blender](/man/blender)(1)

# RESOURCES

```[Source code](https://github.com/anteloc/ldraw-mecha)```

<!-- verified: 2026-11-07 -->
