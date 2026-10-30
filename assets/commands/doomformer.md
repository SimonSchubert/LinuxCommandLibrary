# TAGLINE

Compile integer neural networks into DOOM maps and check them in ViZDoom

# TLDR

**Smoke-test** a tiny MLP (about 2 seconds after the first ACS build)

```doomformer hello```

Check Python, ViZDoom, Freedoom, and the ACS compiler

```doomformer doctor```

Have the marine **walk a digit** and let the level read it

```doomformer draw --digit [7]```

Read **MNIST** test digits in one map

```doomformer mnist --digits [2] --seed [1]```

Let a transformer **write a level name** (tile maps)

```doomformer demo```

**Count** dolls and sectors without building a map

```doomformer plan [mnist] --opt [3] --explain```

# SYNOPSIS

**doomformer** [**--version**] _command_ [_options_]

# DESCRIPTION

**doomformer** compiles integer neural networks (MLPs, spiking nets, transformers) into ZDoom maps and runs them in ViZDoom. Voodoo dolls (extra player-1 starts) do the arithmetic; sector light levels and plane heights hold the values. Python reads every exposed value back from the running game and compares it with a NumPy integer reference at tolerance 0.

Install from Git with `pip install git+https://github.com/mottopanikeiku/doomformer` (Python 3.11+, Linux or macOS). The first map build needs **git**, **cmake**, a C compiler, and network access to fetch ACC, the ACS compiler. `doomformer doctor` checks that stack. Runs that open a window need a display; `--digit` and most other commands are headless.

`--opt` selects the one-map schedule: **0** original, **1** dolls that cannot hit the same plane share a wave, **2** also uses tuned timing from the package, **3** also copies each layer through light accumulators with ACS. Tile-map mode (`demo` default, `mnist --tiles`) splits layers across maps and is not controlled by `--opt`.

# COMMANDS

**hello**
> Compile a tiny 4-6-5-3 integer MLP, run random inputs, and check every value. **--cases** _N_ (default 5), **--seed**, **--opt**.

**doctor**
> Check Python, ViZDoom, Freedoom, and ACC; build ACC and compile an ACS probe if needed.

**draw**
> DrawPad: a 28x28 floor canvas, a READ switch, and a 7-segment display. Without **--digit** this opens a window (arrows to walk, Ctrl to ink, Space on READ). With **--digit** _0-9_ the marine walks a built-in stroke headless. Default **--opt 3**. **--seed** picks stroke variant.

**mnist**
> Run the DrawPad MLP on MNIST test digits (default 4). **--digits** _N_, **--all** (10,000), **--image** _PATH_ (your own digit), **--tiles**, **--workers**, **--opt**, **--record** _PATH_, **--ray** [_ADDRESS_].

**demo**
> A trained transformer writes a DOOM level name. Default: tile maps in a pool of games. **--one-map** puts one forward pass in a single map; **--loop** lets that map write the whole text; **--until-eos** stops at the end-of-text token; **--softmax**, **--nightmare** (doombrain), **--fast** (random-weight toy), **--model**, **--prompt**, **--letters**, **--temperature**, **--seed**, **--workers**, **--png** _PATH_.

**ask** _question_
> A 2-layer transformer answers a question about DOOM from a small fact set. **--workers**.

**plan** _model_
> Count dolls and sectors without building. _model_ is a shipped name, a model directory, an MLP `.npz`, or a spiking-net `.json`. **--opt**, **--explain**.

**play** _wad_
> Walk a compiled map in a ViZDoom window (needs a display).

**museum** _action_
> Playable seven-segment museum map. _action_ is **build**, **verify**, **export**, or **shots**.

**machine** [_program_ [_args_...]]
> A counter machine or SUBLEQ machine in one map. `list` prints programs; example: `doomformer machine multiply 7 9`.

**learn** **digits**
> Online perceptron whose weights are ceiling heights. **--steps**, **--classes**, **--opt** (default 3).

**facts**
> Probe maps for engine limits (PASS/FAIL per fact). See `doomformer facts --help`.

**fuzz**, **verify**, **extract**, **lint**, **tune**, **bench**
> Differential fuzzing, domain verification, static netlist extraction, wave-schedule lint, timing calibration, and engine-time measurements. Each has its own flags; start from `doomformer` _command_ **--help**.

# PARAMETERS

**--version**
> Print the installed package version.

**--opt** _0-3_
> One-map schedule (see DESCRIPTION). Default **0** except **draw** and **learn**, which default to **3**. Not valid on the tile-map **demo**.

**--workers** _N_
> Parallel ViZDoom processes (default: min of CPU count and 8).

**--seed** _N_
> Sampling or example seed. Meaning depends on the command.

# CAVEATS

The first ACS build needs a compiler toolchain and GitHub access. Later runs reuse it.

EXACT means DOOM matched the integer network. It does not mean a drawn digit was classified correctly.

Without **--digit**, **draw** and **play** need a display. ViZDoom, Freedoom, and a working IWAD are required for almost every command.

`--ray` needs the optional extra `pip install "doomformer[ray]"`.

# SEE ALSO

[python3](/man/python3)(1), [pip](/man/pip)(1), [doom](/man/doom)(6), [git](/man/git)(1), [cmake](/man/cmake)(1)

# RESOURCES

```[Source code](https://github.com/mottopanikeiku/doomformer)```

```[Documentation](https://github.com/mottopanikeiku/doomformer/blob/main/docs/README.md)```

<!-- verified: 2026-10-30 -->
