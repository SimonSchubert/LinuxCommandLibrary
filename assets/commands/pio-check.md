# TAGLINE

run static code analysis on a PlatformIO project

# TLDR

**Check every configured environment**

```pio check```

**Check a specific environment only**

```pio check -e [native]```

**Choose the analysis tool**

```pio check --tool [cppcheck]```

**Fail only on defects of a given severity or higher**

```pio check --fail-on-defect [high]```

**Pass extra flags to the tool**

```pio check --flags "cppcheck: --std=c++17 --platform=unix64"```

**Limit analysis to specific paths**

```pio check --src-filters "+<src/app/>"```

**Skip third-party packages** (frameworks/toolchains)

```pio check --skip-packages```

**Emit JSON for CI**

```pio check --json-output```

# SYNOPSIS

**pio check** [_options_]

# PARAMETERS

**-e**, **--environment** _NAME_
> Run the check only for the named build environment (as defined in `platformio.ini`).

**-d**, **--project-dir** _PATH_
> Project directory. Defaults to the current directory.

**-c**, **--project-conf** _FILE_
> Alternate `platformio.ini` path.

**--tool** _NAME_
> Analysis tool: `cppcheck`, `clangtidy`, `pvs-studio`. May be repeated for multiple tools.

**--severity** _LEVEL_
> Minimum defect severity to report: `low`, `medium`, `high`.

**--fail-on-defect** _LEVEL_
> Return a non-zero exit code if defects of _LEVEL_ or higher are reported.

**--pattern** _PATTERN_
> Glob patterns of files to analyze (alternative to `--src-filters`).

**--src-filters** _FILTER_
> Include/exclude filter (e.g. `+<src/app/>`, `-<src/vendor/>`). Repeatable.

**--flags** _FLAGS_
> Extra flags passed to the tool. Prefix with `<tool>:` to target one tool (e.g. `cppcheck: --std=c++17`).

**--skip-packages**
> Skip third-party frameworks and toolchain sources.

**--json-output**
> Emit results as JSON instead of human-readable text.

**-s**, **--silent**
> Suppress output except errors.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**pio check** runs a static code analyzer over the sources of a PlatformIO project and reports defects grouped by severity (low, medium, high). Without `--tool` it uses the tool(s) configured in `platformio.ini`'s `check_tool` option; without `--environment` it iterates over every environment in the project.

The check integrates the project's build flags, include paths, and target platform definitions so the analyzer sees the same macros and headers the compiler does — important for embedded code where `#ifdef` branches differ per MCU.

# CONFIGURATION

`platformio.ini` options consumed by `pio check`:

- `check_tool` — one or more tools (`cppcheck`, `clangtidy`, `pvs-studio`).
- `check_flags` — extra per-tool flags (`cppcheck: --std=c++17`).
- `check_severity` — minimum severity to report.
- `check_src_filters` — files/folders to include/exclude.
- `check_skip_packages` — skip framework/toolchain sources.

# CAVEATS

Requires PlatformIO Core 4.0+. The chosen analyzer (e.g. `cppcheck`) must be installable via PlatformIO's package manager or already on PATH. PVS-Studio requires a license key. Analyzers only see what the preprocessor sees — code guarded by unset `#ifdef`s is skipped.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-test](/man/pio-test)(1), [pio-debug](/man/pio-debug)(1), [cppcheck](/man/cppcheck)(1), [clang-tidy](/man/clang-tidy)(1)
