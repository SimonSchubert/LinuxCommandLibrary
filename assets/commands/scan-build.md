# TAGLINE

Clang static analyzer build integration tool

# TLDR

**Analyze build**

```scan-build make```

**Analyze with output directory**

```scan-build -o [reports/] make```

**Use specific checkers**

```scan-build -enable-checker [alpha.security] make```

**Open results in browser**

```scan-build --view make```

**With CMake**

```scan-build cmake --build [build/]```

**List available checkers**

```scan-build --list-checkers```

**Verbose output**

```scan-build -v make```

# SYNOPSIS

**scan-build** [_-o dir_] [_--view_] [_options_] _build-command_

# PARAMETERS

**-o** _DIR_
> Output directory.

**--view**
> Open results in browser.

**-v**
> Verbose output.

**-enable-checker** _CHECKER_
> Enable checker.

**-disable-checker** _CHECKER_
> Disable checker.

**--list-checkers**
> Show available checkers.

**--status-bugs**
> Exit non-zero if bugs found.

**-plist**
> Generate plist files.

# DESCRIPTION

**scan-build** wraps build commands to run Clang's static analyzer on each compiled source file. It intercepts compilation, analyzing C, C++, and Objective-C code for bugs including null pointer dereferences, memory leaks, use-after-free errors, and API misuse without executing the code.

Analysis results are presented as HTML reports with interactive path visualizations showing the exact sequence of events leading to each bug. Additional checker categories can be enabled with **-enable-checker** for deeper analysis including security vulnerabilities and experimental checks. The **--status-bugs** flag returns a non-zero exit code when bugs are found, useful for CI integration.

# CAVEATS

Increases build time significantly. False positives require tuning. C/C++ and Objective-C only.

# HISTORY

**scan-build** is part of the **Clang** project. It provides an accessible interface to Clang's static analysis capabilities.

# SEE ALSO

[clang](/man/clang)(1), [cppcheck](/man/cppcheck)(1), [make](/man/make)(1)
