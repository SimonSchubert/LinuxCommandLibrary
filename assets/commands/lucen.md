# TAGLINE

Comment-pragma parallelizer for ordinary Python

# TLDR

**Run a Python script** with Lucen active (rewrite marked loops)

```lucen run [script.py]```

**Explain** which marked blocks would parallelize (static report)

```lucen explain [script.py]```

**Profile** a script and report what actually ran per block

```lucen profile [script.py]```

**JSON explain** report for CI baselines

```lucen explain --format=json [script.py]```

**Strict baseline check** (fail if classification regressed)

```lucen explain --strict --baseline=[baseline.json] [script.py]```

**Run with script arguments**

```lucen run [script.py] -- [arg1] [arg2]```

**Stream live chunk stats** while profiling

```lucen profile --live [script.py]```

# SYNOPSIS

**lucen** [**--version**] *command* [*args*]

**lucen run** *script* [*args*...]

**lucen explain** [*options*] *file*

**lucen profile** [*options*] *script* [*args*...]

# PARAMETERS

**--version**
> Print Lucen version and exit

## run

**script**
> Path to a Python file; marked **# LUCEN START** / **# LUCEN END** loops are rewritten and executed with Lucen active

**args**
> Arguments forwarded to the script as **sys.argv**

## explain

**file**
> Source file to analyze statically (no execution)

**--block** *N*
> Report only block index *N*

**--format** *text*|*json*
> Output format (**json** is the baseline format)

**--assume-gil** / **--assume-free-threaded**
> Report backend choices as if that interpreter mode applied

**--strict**
> Exit nonzero if classification differs from **--baseline**

**--baseline** *FILE*
> Baseline JSON from a prior **--format=json** run (required with **--strict**)

## profile

**script** / **args**
> Script and arguments to execute under Lucen

**--live**
> Stream chunk-completion stats during the run

**--per-block**
> Break the report down per marked block

**--export** *FILE*
> Write the report as JSON instead of text

# DESCRIPTION

**lucen** is a source-to-source compiler and automatic loop parallelizer for ordinary Python, driven by comment pragmas. You mark a loop with **# LUCEN START** and **# LUCEN END**; Lucen parallelizes only loops it can prove are safe and profitable, and guarantees bit-identical results to sequential execution (including float bits and dict insertion order).

The CLI has three main subcommands:

- **lucen run** rewrites the entry script and runs it with Lucen activated. Plain **python script.py** cannot parallelize a marked loop in the entry module after **lucen.activate()**, because that module is already compiled; **run** solves that for one-file scripts.
- **lucen explain** prints a static per-block report: parallel-eligible vs sequential, predicted backend, and reasons or suggestions (for example **depend=none** or **calibrate=false**).
- **lucen profile** executes a script and reports observed dispatch and timings.

For larger applications, you can also **import lucen** and call **lucen.activate()** before importing modules that contain marked loops. Pragmas are ordinary comments: with Lucen uninstalled or deactivated, the program behaves as if the pragmas were never there (the Comment Invariant).

Install from PyPI with **pip install lucen** (Python 3.9+). Optional native acceleration is provided via a Rust core on GIL builds; free-threaded CPython uses a pure-Python fallback.

# CAVEATS

Helper purity is fully proven only when source is readable; C extensions and dynamic callables are trusted and a stateful one can diverge per worker. Process workers re-import the entry module—use **if __name__ == "__main__":** guards. Side-effect order inside a parallelized block is not sequential unless the block falls back. One block per pragma pair, one loop per block, no **async** bodies. Profitability and picklability decisions may only be known at runtime; use **lucen profile** for observed behavior.

# HISTORY

**Lucen** was released as open source under the Apache-2.0 license as a comment-pragma parallelizer focused on correctness: private write slabs, ordered commit, and sequential fallback on conflict or unprofitability. The project ships a diagnostics CLI (**explain**, **profile**, **run**), formal and technical specs, and optional Rust orchestration hot paths.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [pytest](/man/pytest)(1), [ruff](/man/ruff)(1)

# RESOURCES

```[Source code](https://github.com/fcmv/lucen)```

```[Homepage](https://pypi.org/project/lucen/)```

<!-- verified: 2026-07-25 -->
