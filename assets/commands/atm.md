# TAGLINE

Generate and work with MIDI melody files

# TLDR

**Show help**

```atm -h```

**Generate a single MIDI** from a pitch sequence

```atm gen single 'C:4,D:4,E:4,F:4,G:4,A:4,B:4,C:5' [test.mid]```

**Brute-force generate** melodies into a gzip tar (depth 2 partitions)

```atm gen tar-gz -p [2] 'C:4,D:4,E:4,F:4,G:4,A:4,B:4,C:5' [8] [output.tar]```

**Locate partition** for a melody

```atm partition -p [2] 'C:4,C:4,C:4,C:4,C:4,C:4,C:4,C:5'```

**Estimate** storage backend sizes

```atm estimate --help```

# SYNOPSIS

**atm** *subcommand* [*options*] [*args*]

# DESCRIPTION

**atm** (**atm-cli**) is a command-line tool for generating and working with MIDI files. It was built for All the Music, LLC to help generate large sets of melodies (including brute-force ranges) and to organize output across partitioned storage backends. It uses the **libatm** Rust library.

Subcommands:

- **gen** – generate melodies (single file or bulk backends such as tar/gzip layouts)
- **partition** – map a pitch sequence to its partition path for a given scheme
- **estimate** – estimate output size of storage backends

Pitch sequences use note:**octave** tokens separated by commas (for example **C:4,D:4,E:4**).

Build from source: clone the repo, **git submodule update --init**, then **cargo build --release**. Run **cargo run --release -- -h** for usage without installing.

# PARAMETERS

**gen single** *melody* *outfile*

> Write one MIDI file for the given pitch sequence.

**gen** *backend* ...

> Bulk generation into tar, tar-gz, or other backends documented by **atm gen --help**. **-p** sets partition depth (limits files per directory).

**partition** [**-p** *depth*] *melody*

> Print which partition directory holds the melody (default depth 1).

**estimate**

> Help choose storage backends by estimating output size.

**-h**, **--help** / **-V**, **--version**

> Help and version.

# CAVEATS

Tailored for bulk melody generation, not a general DAW or multi-track MIDI editor. Compiling needs a Rust toolchain and submodules. Output volume for long sequences grows factorially; use **estimate** and partitioned backends carefully. License is CC BY 4.0 (not public domain), unlike some ATM datasets.

# SEE ALSO

[timidity](/man/timidity)(1), [fluidsynth](/man/fluidsynth)(1), [sox](/man/sox)(1)

# RESOURCES

```[Source code](https://github.com/allthemusicllc/atm-cli)```

```[Homepage](http://allthemusic.info)```

```[Documentation](https://allthemusicllc.github.io/atm-cli/atm/index.html)```

<!-- verified: 2026-07-19 -->
