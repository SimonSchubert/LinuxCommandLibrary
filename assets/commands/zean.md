# TAGLINE

Translate Zig functions into Lean models and check them

# TLDR

Show **commands**

```zean --help```

**Capture** analyzed IR for one function (needs an instrumented Zig compiler)

```zean capture --toolchain [report.json] --source [counter.zig] --root counter.advance --output [capture-dir]```

**Translate** a capture into a Lean model

```zean translate --capture [capture-dir]/report.json --root counter.advance --profile scalar --namespace MyCounter.Generated --output [model-dir]```

Translate with the **translate** word omitted

```zean --capture [capture-dir]/report.json --root counter.advance --output [model-dir]```

**Decode** one captured record under a profile

```zean decode [record.json] memory```

Print **admission** limits as JSON

```zean admission```

# SYNOPSIS

**zean** [**--help**|**--version**]

**zean** [**translate**] **--capture** _report_ **--root** _function_ **--output** _new-directory_ [_options_]

**zean** **capture**|**decode**|**toolchain**|**check-patch**|**audit**|**admission**|**verify-client**|**allocator-evaluate**|**benchmark** [_options_]

**zean** **counter-regenerate**|**buffer-regenerate**|**copy-regenerate**|**calls-regenerate**|**stdlib-replace-regenerate**|**ziglings-regenerate** [_options_]

# PARAMETERS

**translate**
> Read a capture report, check each **--root**, and write `Generated.lean` plus `manifest.json` into a new directory. This is the default when the word **translate** is left out and the next arguments are translate options

**--capture** _report_
> Capture report JSON. Repeat **--root** to select more functions. Final name components must be unique

**--profile** _name_
> Admission profile. One of **scalar** (default), **memory**, **loops**, **aggregate**, **word-bytes**, **word-byte-loops**, **calls**, **call-loops**, **nested-calls**, **recursive-calls**

**--namespace** _name_
> Generated Lean namespace. Default **Zean.Generated**

**--certify** _directory_
> Check supported AIR-to-model correspondence in Lean before publishing, and keep that evidence in _directory_

**--declaration-source** _file_ / **--specialized-source** _file_
> Bind an ordinary captured function, or a standalone type specialization, to an explicit source owner

**--call-machine**
> Emit data-based functions for the resumable call machine

**--lake** _path_
> Lake executable for the pinned Lean toolchain. When omitted, Zean uses elan

**capture**
> Record selected AIR roots with an instrumented compiler. Requires **--toolchain**, **--source**, **--output**, and at least one **--root**. **--mode** defaults to ReleaseFast. **--source-base** defaults to the current directory

**decode** _record_ [_profile_]
> Print one AIR record through the selected profile (default **scalar**)

**toolchain**
> Build an instrumented compiler from a Zig source tree. Requires **--zig-tree**, **--output**, **--llvm-prefix**, **--lld-prefix**, and **--bootstrap** (or **--bootstrap-zig**)

**check-patch**
> Check instrumentation against a clean compiler tree. Requires **--zig-tree** and **--output**

**audit**
> Run a **memory** or **validity** fixture audit. Requires **--profile**, **--toolchain**, and **--output**

**admission**
> Print supported operation obligations and the evidence boundaries that remain open

**verify-client**
> Capture and replay a manifest-driven proof client. Requires **--manifest**, **--toolchain**, and **--output**

**allocator-evaluate**
> Inventory a public standard-library component and record admission results. Requires **--toolchain** and **--output**

**benchmark**
> Measure proof elaboration. Requires **--output**. **--repeat** defaults to 3. Repeat **--proof** to select proofs; otherwise the built-in set is used

**counter-regenerate**, **buffer-regenerate**, **copy-regenerate**, **calls-regenerate**, **stdlib-replace-regenerate**, **ziglings-regenerate**
> Recapture that tutorial and replay its proofs into **--output**. **--check** compares retained program data without replacing recorded capture identities

**atomic-publication-check**
> Check a dispatch-table capture. Requires **--capture** and **--output**

# DESCRIPTION

**zean** is the native command of Zean, a Zig 0.17.1 tool that captures Zig's analyzed intermediate representation (AIR) and emits executable Lean definitions. Specifications and proofs stay in separate Lean files. Regenerating the model after a Zig change leaves those proofs to be updated by hand.

`zig build` installs the binary at `zig-out/bin/zean`. `zig build run --` followed by the same arguments runs it without a separate install. Several `zig build` steps (`capture`, `toolchain`, `admission`, and the tutorial `*-regenerate` targets) are wrappers around this binary.

An ordinary Zig installation can run the repository's retained examples. Producing a new AIR capture needs the instrumented compiler described in the upstream toolchain guide. Native capture runs on Linux and macOS.

**translate** writes a new output directory. The bundle's `Generated.lean` is the program data. `manifest.json` records source, AIR, capture, and model identities. Adding **--certify** checks the lowering from captured AIR to that model in Lean. Source capture, JSON lifting, and native code generation stay outside that check.

Successful commands print a JSON object on standard output. **--version** prints the Zean and Zig versions. **--help**, including after a subcommand, prints the command list.

# CAVEATS

Zean requires Zig 0.17.1. The Lean toolchain is pinned in the repository's `lean-toolchain` file (Lean 4.35.0 for the current tree). Translation admits only the listed profiles, and standalone translation currently admits ReleaseFast AIR. Unsupported operations are rejected rather than silently modeled.

A passing model proof is a proof about execution in the selected model, including its explicit failure outcomes. It does not establish correctness of the Zig frontend or the native backend.

Each **translate** run expects a fresh output directory. On failure the program prints `zean:` plus a diagnostic on standard error and exits with status 1.

# SEE ALSO

[zig](/man/zig)(1)

# RESOURCES

```[Source code](https://github.com/okcontract/zean)```

```[Documentation](https://github.com/okcontract/zean/blob/main/docs/native-tooling.md)```

<!-- verified: 2026-11-23 -->
