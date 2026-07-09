# TAGLINE

Tree-sitter based static application security testing (SAST) scanner

# TLDR

**Scan** a project with auto-detected language and bundled rules

```sighthound /path/to/project```

**Run** a taint analysis scan and output JSON

```sighthound --taint-analysis --output-format json /path/to/project > findings.json```

**Build** from source

```cargo build --release```

# SYNOPSIS

**sighthound** [options] <ROOT_DIR> [LANGUAGE] [RULES_PATH]

# DESCRIPTION

Sighthound is a fast, AST-aware static vulnerability scanner. It supports pattern matching ("search" mode) and taint tracking ("taint" mode) across many languages using Tree-sitter parsers. Rules are written in RON and bundled by default for common languages.

It can run in parallel, produces text/JSON/CSV output, and supports custom rule packs.

# PARAMETERS

**--taint-analysis**
> Enable taint (source → sink) analysis in addition to or instead of pattern search.

**--output-format** text|json|csv
> Choose report format (default text).

**--help**
> Show full option list.

Language and custom rules path are optional positional arguments after the root directory.

# CAVEATS

- Some runtime-only or heavily dynamic issues will be missed.
- Multi-file taint is supported but may need tuning for complex codebases.
- Best used as part of a broader security program.

# RESOURCES

```[Source code](https://github.com/Corgea/Sighthound)```
```[Documentation](https://github.com/Corgea/Sighthound#readme)```

<!-- verified: 2026-07-10 -->

# SEE ALSO

semgrep(1), codeql(1)