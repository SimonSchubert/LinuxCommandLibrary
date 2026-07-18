# TAGLINE

Quality evaluation harness for DwarfStar model outputs

# TLDR

**Run the first N built-in evaluation questions**

```ds4-eval --questions [10] --ctx [100000]```

**Disable thinking and cap generation length**

```ds4-eval --plain --nothink --tokens [512]```

**Write a full evaluation trace**

```ds4-eval --questions [10] --trace [eval.trace]```

**Regrade a previous trace** without reloading the model

```ds4-eval --regrade-trace [eval.trace]```

**CPU diagnostic pass** on a single question

```ds4-eval --cpu --questions [1] --tokens [32]```

**Run selected case numbers** in order

```ds4-eval --case-sequence [1,3,5] --ctx [100000]```

# SYNOPSIS

**ds4-eval** [_options_]

# PARAMETERS

**-m**, **--model** _FILE_
> Path to the GGUF model. Default: **ds4flash.gguf**.

**-c**, **--ctx** _N_
> Allocated context length in tokens.

**-n**, **--tokens** _N_
> Maximum generated tokens per question.

**--questions** _N_
> Run only the first _N_ embedded evaluation questions.

**--case-sequence** _LIST_
> Comma-separated 1-based case numbers to run in that order.

**--trace** _FILE_
> Write a detailed evaluation trace.

**--regrade-trace** _FILE_
> Regrade a prior trace without loading the model again.

**--plain**
> Disable the split-screen ANSI UI.

**--think** / **--think-max** / **--nothink**
> Control thinking/reasoning mode for answers.

**--metal** | **--cuda** | **--rocm** | **--cpu**
> Select the inference backend explicitly.

**--power** _N_
> GPU duty-cycle target from 1 to 100.

**--pause-ms** _N_
> Pause after each result in the TTY UI. Default: **350**.

**--self-test-extractors**
> Run answer-extractor self-tests and exit.

# DESCRIPTION

**ds4-eval** is the quality-evaluation tool for **DwarfStar** (**ds4**). It runs a built-in set of questions against the loaded GGUF, extracts answers, and grades them so contributors can catch regressions when changing kernels, quantizations, or sampling defaults.

Unlike **ds4-bench** (speed), **ds4-eval** focuses on correctness and answer quality. Traces can be saved and regraded later with **--regrade-trace**, which is useful when iterating on grading logic without paying the full inference cost again. A plain mode drops the ANSI UI for log-friendly CI or remote sessions.

# CAVEATS

Requires a DwarfStar-compatible GGUF for meaningful scores. Embedded cases and extractors are project-specific; they are not a general LLM leaderboard. CPU mode is slow and intended for diagnostics. Thinking modes and context size strongly affect both quality and runtime.

# HISTORY

**ds4-eval** ships with **DwarfStar** by **Salvatore Sanfilippo** (**antirez**) and contributors as part of the project's emphasis on official-vector validation and regression testing alongside speed benchmarks.

# SEE ALSO

[ds4-bench](/man/ds4-bench)(1), [ds4-server](/man/ds4-server)(1), [ds4-agent](/man/ds4-agent)(1), [llama-cli](/man/llama-cli)(1)

# RESOURCES

```[Source code](https://github.com/antirez/ds4)```

```[Documentation](https://github.com/antirez/ds4/blob/main/docs/ENGINE_REFERENCE.md)```

<!-- verified: 2026-07-18 -->
