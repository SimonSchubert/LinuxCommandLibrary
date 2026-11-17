# TAGLINE

Require type annotations on Python assignments

# TLDR

Check **annotations**, then run the type checker

```gawain check [src/]```

Check **annotations only**

```gawain check [src/] --no-types```

Use **pyrefly** instead of ty

```gawain check [src/] --checker pyrefly```

Require an annotation on **every assignment**

```gawain check [src/] --mode strict```

Emit one **JSON** object

```gawain check [src/] --format json```

# SYNOPSIS

**gawain check** [_OPTIONS_] _PATHS_...

# PARAMETERS

_PATHS_
> Files or directories to check. At least one path is required.

**--no-types**
> Skip the type-checker pass. Presence checks still run.

**--format** _text|json_
> **text** (the default) or one JSON object.

**--mode** _MODE_
> How obvious values are judged. Overrides **mode** in **[tool.gawain]**. **obvious** is the default. **strict** requires an annotation on every assignment.

**--checker** _CHECKER_
> Type checker for the types phase. Overrides **checker** in **[tool.gawain]**. **ty** is the default. **pyrefly** is the other built-in choice.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**gawain** checks that Python variables, parameters, returns, and class attributes are annotated, then optionally runs a type checker. The only subcommand is **check**.

The default mode, **obvious**, allows a name to omit an annotation when the value's type is obvious and the name is not assigned again: a literal, a container of literals, or a constructor call. **strict** asks for an annotation on every assignment.

Rules reported by the presence pass:

- GW001 — assignment with no annotation
- GW002 — parameter with no annotation
- GW003 — function with no return annotation
- GW004 — class attribute with no annotation, or **self.x** not declared on the class
- GW010 — constant not annotated **Final[T]**
- GW011 — bare **Final** with no type
- GW020 — **Any** in an annotation
- GW000 — file cannot be read
- GW900 and GW901 — broken or unused suppression

Silence one line with a comment that names the code:

```# gawain: ignore[GW001]```

Configuration is a **[tool.gawain]** table. **--mode** and **--checker** override it for one run.

Install the checker extra you want. **gawain[ty]** pins ty 0.0.100. **gawain[pyrefly]** pins pyrefly 1.4.1 and does not install ty. A bare install of **gawain** provides the command only. It then needs a checker on **PATH**, or **--no-types**.

A pre-commit hook with id **gawain** builds from the repository and needs Rust 1.97 or newer.

# EXIT STATUS

- **0** — nothing to report. Warnings from the type checker do not fail the run.
- **1** — presence or the type checker reported a problem
- **2** — usage error, or the type checker could not run

# SEE ALSO

[python3](/man/python3)(1), [pip](/man/pip)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/matheuzgomes/gawain)```

```[Documentation](https://github.com/matheuzgomes/gawain/blob/main/docs/rules.md)```

<!-- verified: 2026-11-17 -->
