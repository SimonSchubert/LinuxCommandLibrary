# TAGLINE

Opinionated Python code formatter

# TLDR

**Format** Python file

```black [script.py]```

Format **entire project**

```black [src/]```

**Check** without modifying

```black --check [script.py]```

**Diff** instead of rewriting

```black --diff [script.py]```

Set **line length**

```black -l [100] [script.py]```

# SYNOPSIS

**black** [_options_] _files_

# DESCRIPTION

**black** is an opinionated Python code formatter. It enforces a consistent style by reformatting code automatically with minimal configuration. Black's approach is to eliminate debate about formatting by providing one correct way.

The tool integrates with editors and CI pipelines to ensure consistent Python code style.

# PARAMETERS

**--check**
> Check if files would be reformatted (exit 1 if yes)

**--diff**
> Show diff instead of rewriting

**-l**, **--line-length** _n_
> Line length (default: 88)

**--target-version** _py_
> Python version (py37, py38, py39, etc.)

**--exclude** _pattern_
> Files/directories to exclude

**--include** _pattern_
> Files/directories to include

**--quiet**
> Minimal output

**--verbose**
> Verbose output

**--color**/**--no-color**
> Colored output

# FEATURES

- Deterministic formatting
- Minimal configuration
- Fast (multi-core processing)
- Editor integration
- Git integration
- Safe (preserves AST)
- PEP 8 compliant
- ipynb support

# CONFIGURATION

**pyproject.toml**
> Project-level configuration under `[tool.black]` section. Supports `line-length`, `target-version`, `include`, and `exclude` settings.

# WORKFLOW

```bash
# Format file
black script.py

# Format directory
black src/

# Check in CI
black --check .

# Show what would change
black --diff script.py

# Specific Python version
black --target-version py39 script.py
```

# CAVEATS

Opinionated (limited configuration). May conflict with other formatters. 88 character default line length differs from PEP 8's 79. Some formatting choices controversial. Requires Python 3.6+.

# HISTORY

**Black** was created by Łukasz Langa in **2018** to provide deterministic Python formatting, eliminating formatting debates and reducing diff noise.

# SEE ALSO

[autopep8](/man/autopep8)(1), [isort](/man/isort)(1), [flake8](/man/flake8)(1)
