# TAGLINE

performs static code analysis on PlatformIO projects

# TLDR

**Run static analysis**

```pio check```

**Check specific environment**

```pio check -e [native]```

**Check with specific tool**

```pio check --tool [cppcheck]```

**Check with severity filter**

```pio check --severity [high]```

# SYNOPSIS

**pio check** [_options_]

# PARAMETERS

**-e**, **--environment** _name_
> Check specific environment.

**--tool** _name_
> Analysis tool (cppcheck, clangtidy, pvs-studio).

**--severity** _level_
> Minimum severity (low, medium, high).

**--pattern** _pattern_
> Source file patterns.

**--skip-packages**
> Skip package source files.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**pio check** performs static code analysis on PlatformIO projects. Detects bugs, security issues, and code style problems. Supports multiple analysis tools including Cppcheck and Clang-Tidy.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-test](/man/pio-test)(1), [cppcheck](/man/cppcheck)(1)

