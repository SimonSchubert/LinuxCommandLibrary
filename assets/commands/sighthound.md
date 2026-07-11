# TAGLINE

Tree-sitter based static application security testing (SAST) scanner

# TLDR

**Scan** a project with auto-detected language and bundled rules

```sighthound /path/to/project```

**Run** a taint analysis scan and output JSON

```sighthound --taint-analysis --output-format json /path/to/project > findings.json```

**Emit SARIF** for GitHub Code Scanning

```sighthound --output-format sarif /path/to/project > results.sarif```

**Scan** with an explicit language and custom rules path

```sighthound /path/to/project python rules/python```

**Build** from source

```cargo build --release```

# SYNOPSIS

**sighthound** [options] <ROOT_DIR> [LANGUAGE] [RULES_PATH]

# DESCRIPTION

Sighthound is a fast, AST-aware static vulnerability scanner. It supports pattern matching ("search" mode) and taint tracking ("taint" mode) across many languages using Tree-sitter parsers. Rules are written in RON and bundled by default for common languages (Python, JavaScript/TypeScript, Java, PHP, C#, Go, Ruby, HTML/Django templates).

It can run in parallel, produces text/JSON/CSV/SARIF output, and supports custom rule packs.

# PARAMETERS

**--taint-analysis**
> Enable taint (source → sink) analysis in addition to or instead of pattern search.

**--output-format** text|json|csv|sarif
> Choose report format (default text). SARIF 2.1.0 is suitable for GitHub Code Scanning.

**--help**
> Show full option list.

Language and custom rules path are optional positional arguments after the root directory.

# CAVEATS

- Some runtime-only or heavily dynamic issues will be missed.
- Multi-file taint is supported but may need tuning for complex codebases.
- C/C++ and Razor (`.cshtml`) are not currently supported.
- Best used as part of a broader security program.

# SEE ALSO

[semgrep](/man/semgrep)(1)

# RESOURCES

```[Source code](https://github.com/Corgea/Sighthound)```

```[Homepage](https://corgea.com/sighthound)```

```[Documentation](https://github.com/Corgea/Sighthound#readme)```

<!-- verified: 2026-07-11 -->
