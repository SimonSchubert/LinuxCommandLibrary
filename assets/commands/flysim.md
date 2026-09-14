# TAGLINE

runs a MaleCNS-constrained Drosophila brain and body simulator from the shell

# TLDR

**Run** the lightweight engineering demo (no connectome download)

```flysim run eon-demo --seed [1] --headless```

**Render** a completed run to video

```flysim render [runs/run-id]```

**Download** the starter MaleCNS tables

```flysim data sync --profile starter```

**Checksum** the locked dataset

```flysim data validate```

**Build** the runtime aggregate graph

```flysim data import-aggregate```

**Serve** the browser arena without the full CNS

```flysim web serve --mode preview```

**Estimate** sparse-graph memory at several scales

```flysim benchmark neural --scales [0.01] [0.1] [1.0]```

# SYNOPSIS

**flysim** _command_ [_subcommand_] [_options_]

# SUBCOMMANDS

**data** _subcommand_
> Acquire, validate, and import the MaleCNS dataset. Common subcommands: **sync**, **validate**, **status**, **import-aggregate**.

**run** _scenario_
> Execute a named simulation. **eon-demo** is the labelled engineering storyboard (no dataset). **eon-malecns** runs the traced connectome on GPU. **full-vnc-walk** stays gated until its motor decoder passes.

**render** _run-directory_
> Rasterise a recorded run to video after the simulation has finished.

**validate** _run-directory_
> Check a run directory against the project's validation contracts.

**web serve**
> Host the interactive multi-fly browser arena.

**benchmark** _kind_
> Memory estimates and measured CUDA/graph-load checks (**neural**, **multi-fly**, **circuit**, …).

**evidence** _subcommand_
> Build or validate immutable evidence bundles (**build**, **build-v0**, **validate**).

**showcase** _subcommand_
> Package cinematic / Eon-class demonstration artifacts.

**stage2** _subcommand_
> Fitted-dynamics readiness, holdouts, and exit gates for Stage 2 physiology work.

# PARAMETERS

**--seed** _N_
> RNG seed for a run (default **1** on **eon-demo** / **eon-malecns**).

**--headless**
> Run without a display. On Linux this typically selects OSMesa for MuJoCo.

**--render**
> Produce an MP4 as part of the run (checksum recorded in the run manifest).

**--graph** _PATH_
> Path to an imported MaleCNS aggregate graph. Required for **eon-malecns**.

**--root** _PATH_
> Data root. Defaults to **$FLYSIM_DATA_ROOT** when that variable is set.

**--profile** _NAME_
> Dataset profile for **data sync** / **status** / **validate**: **metadata**, **starter**, or **full**.

**--mode** _preview_|_full-cns_
> **web serve** mode. **preview** is labelled no-CNS; **full-cns** executes the real graph.

**--allow-dirty-tree**
> Record a non-evidence-grade run from an uncommitted git worktree.

**--fps** _N_
> Frames per second for **render** (default **30**).

# DESCRIPTION

**flysim** is the command-line entrypoint of MaleCNS Virtual Fly (the Fly.exe project): a scientifically explicit simulator that can execute the traced universe of the released *Drosophila* male CNS connectome (165,122 neurons and about 25.6 million edges) inside a NeuroMechFly / MuJoCo body.

The Python package is **malecns-flysim**; the console script is **flysim**. Dataset files are not shipped in the repository. **flysim data sync** pulls checksum-locked HHMI Janelia artifacts into **$FLYSIM_DATA_ROOT**, **import-aggregate** builds the sparse runtime graph, and evidence-grade commands refuse to start from a dirty git worktree.

**eon-demo** is an engineering scaffold and neural-bypass control: it runs before FlyGym, CUDA, or MaleCNS data are installed. Full-connectome work needs an NVIDIA GPU, a native GeNN/PyGeNN build, and FlyGym. The production environment is Linux; Windows is supported through WSL2.

# CAVEATS

Pre-alpha research software (GPL-2.0-or-later). Full-graph runs are slow relative to biological time (documented swarm demos run at a small fraction of real time on a consumer GPU). **full-vnc-walk** errors out until the motor-decoder interface gate passes. Rendering in WSL2 is software rasterisation; CUDA compute is a separate path. No command prints a validation tier as a hardcoded literal: **eon-malecns** resolves the project tier from evidence bundles at run time.

# RESOURCES

```[Source code](https://github.com/Ibtisam-Mohammad/Fly.exe)```

```[Documentation](https://github.com/Ibtisam-Mohammad/Fly.exe/blob/main/docs/OPERATIONS.md)```

<!-- verified: 2026-09-14 -->
