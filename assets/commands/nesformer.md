# TAGLINE

Run an NES CPU compiled into Qwen3.5 model weights

# TLDR

**Play** a bundled NROM game and save a GIF

```nesformer run [roms/thwaite.nes] --frames [600] --show```

Walk **Mario** right and jump on a Super Mario Bros. ROM

```nesformer run [roms/smb.nes] --frames [600] --show --buttons [start@60-65,right@200-600,a@250-265+300-315+360-375]```

Compare the weights against the **reference 6502**

```nesformer check [roms/thwaite.nes] --tokens [50000]```

Print the first **40 tokens** of the model's trace

```nesformer trace [roms/thwaite.nes]```

**Compile** a checkpoint into `weights/` (about 10 seconds)

```nesformer build```

Describe a **checkpoint**

```nesformer info```

Use a **weights directory** that is not next to the package

```nesformer run [roms/thwaite.nes] --weights [/path/to/weights] --frames [120]```

Run the checkpoint in stock **transformers** (slow)

```nesformer run [roms/thwaite.nes] --frames [3] --engine [hf]```

# SYNOPSIS

**nesformer** _command_ [_options_]

# DESCRIPTION

**nesformer** is the console script from the **dbreunig/nesformer** Python package. It runs a Nintendo Entertainment System **6502** (the core of the 2A03), 2 KB of work RAM, and a cartridge's program ROM inside a compiled **Qwen3.5** causal language-model checkpoint. The weights are not trained: a compiler writes every parameter. When a game runs, the model predicts the CPU execution log one token at a time. A host program around the model draws the picture, reads the controller, and injects the vblank NMI.

The same command is `python -m nesformer`. Python **3.11** or newer is required. Default weights live in a `weights/` directory beside the `nesformer` package (the CLI looks next to the installed package, not in the current working directory). Pass **--weights** to `run`, `check`, or `trace`, or give the path to **info**, to use another folder. The folder is an ordinary Hugging Face snapshot: `config.json`, `model.safetensors`, and `nesformer.json`.

Only **NROM** cartridges (iNES mapper 0) run, such as Super Mario Bros., Donkey Kong, or Excitebike. Other boards stop with a message. The repository ships three freely licensed test ROMs in `roms/`; you supply commercial ROMs yourself. The same compiled weights run any NROM game without a rebuild: the CLI loads the cartridge into the model's state at startup.

Expect it to be slow. The first **fast** (numba) run spends about 20 seconds compiling the engine. After that a frame takes about 1 to 6 seconds, so 600 frames (10 seconds of NES time) take around 25 minutes. Overall the README measures 150 to 290 times slower than a real console. Games spend most of each frame waiting for vblank; unless **--no-skip** is set, the host advances idle wait loops, which cuts the token count.

**--show** draws each frame in the terminal as 24-bit-color half-block characters (needs a terminal such as iTerm2 or Windows Terminal). When `run` finishes it writes an animated GIF named after the ROM unless **--gif** or **--png** changes that.

The project builds on **Qwenputer** by Divyansh Agrawal, which compiled a CHIP-8 and then a RISC-V CPU into Qwen3.5-4B. The model's Gated DeltaNet state is the machine's memory. The PPU, controllers, and NMI timing stay in the host program; they are not in the weights. There is no sound.

# PARAMETERS

**run** _ROM_
> Play _ROM_ on the weights and save frames. **--frames** _N_ stops after _N_ frames (default **120**). **--buttons** _SCRIPT_ is a controller script (see below). **--show** draws frames in the terminal. **--gif** _PATH_ sets the animated GIF path (default: the ROM's file name with `.gif`). **--png** _DIR_ writes each kept frame as a PNG in _DIR_; with **--png** alone no GIF is saved, add **--gif** to get both. **--every** _N_ keeps every N-th frame (default **1**). **--scale** _N_ enlarges saved frames _N_ times (default **2**). **--max-tokens** _N_ stops after _N_ tokens. **--trace** _FILE_ writes token ids to _FILE_.

**check** _ROM_
> Run the weights and the reference CPU side by side and stop at the first difference. **--tokens** _N_ is how far to compare (default **50000**). **--frames** _N_ is an optional frame cap (default is effectively unlimited).

**trace** _ROM_
> Print the model's token stream. **--tokens** _N_ is how many tokens to print (default **40**). Idle-loop skipping is off for this command.

**build**
> Compile the circuit and write a checkpoint. **--out** _DIR_ is the destination (default: the package's `weights/` directory). About 10 seconds.

**info** [_DIR_]
> Print JSON describing a checkpoint: machine, architecture, hidden size, layers, vocabulary, and circuit layout. _DIR_ defaults to the package `weights/` directory.

**--weights** _DIR_
> Checkpoint directory for **run**, **check**, and **trace**. Default is `weights/` beside the `nesformer` package.

**--engine** _kind_
> Forward pass for **run**, **check**, and **trace**. `fast` (default) is numba. `numpy` is a plain numpy engine. `hf` is stock Hugging Face transformers (`Qwen3.5` causal LM) and needs torch; about 10 tokens per second.

**--buttons** _SCRIPT_
> Controller input for **run**, **check**, and **trace**. Comma-separated entries. Each entry is one or more buttons joined by `+`, then `@`, then one or more inclusive frame ranges joined by `+`. Buttons are `a`, `b`, `select`, `start`, `up`, `down`, `left`, and `right`. Frames count from power-on at 60 per second. Examples: `start@60-65`, `right@200-600`, `a@250-265+300-315`, `right+b@200-600`.

**--no-skip**
> Run every iteration of idle wait loops (slower; identical frames). Applies to **run**, **check**, and **trace**.

# CAVEATS

Only iNES mapper **0** (NROM) works. Mapper chips such as MMC1 or MMC3 are not followed, because program ROM lives in a fixed 32 KB table inside the model. Unofficial opcodes and jumps into RAM emit **HALT**. There are no IRQs (APU frame IRQ, DMC); BRK and NMI work. Read-modify-write instructions on I/O registers do not produce an I/O write. Addresses `$4020` through `$7FFF` read as 0 (no PRG-RAM). The PPU renders one scanline at a time, so mid-scanline effects are missing. Sprite-0 hit and sprite overflow are approximate. There is no audio.

The README install path is a venv plus `pip install numpy scipy numba pillow`, then `python -m nesformer` from the cloned tree with `weights/` unzipped next to the package. `pip install .` from the tree also installs the `nesformer` console script. The `hf` extra needs `torch>=2.6` and `transformers>=5.22`.

Confirm unzipped weights with `shasum -a 256 -c weights/SHA256SUMS` from the top folder. `--show` needs 24-bit color. The CLI does not download weights.

# HISTORY

**nesformer** was released in **October 2026** by **dbreunig**. It reuses Qwenputer's compiler (MIT, Divyansh Agrawal) to compile an NES 6502 into Qwen3.5 weights. The package is MIT. Bundled test ROMs keep their own licenses (see `roms/SOURCES.md` in the repository): nestest by Kevin Horton, Full Game by Doug Fraker (MIT), and Thwaite by Damian Yerrick (GPL-3.0).

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [qwen](/man/qwen)(1), [mame](/man/mame)(1), [retroarch](/man/retroarch)(1)

# RESOURCES

```[Source code](https://github.com/dbreunig/nesformer)```

<!-- verified: 2026-10-31 -->
