# TLDR

**View markdown file**

```python -m rich.markdown [file.md]```

**Syntax highlight code**

```python -m rich.syntax [file.py]```

**Pretty print JSON**

```python -m rich.json [file.json]```

**Show colors**

```python -m rich.color```

**Show emoji codes**

```python -m rich.emoji```

**Demo all features**

```python -m rich```

**Inspect object**

```python -m rich.inspect [module]```

# SYNOPSIS

**python -m rich** [_module_] [_options_] [_file_]

# MODULES

**rich.markdown** _FILE_
> Render markdown.

**rich.syntax** _FILE_
> Syntax highlighting.

**rich.json** _FILE_
> Pretty print JSON.

**rich.color**
> Show color palette.

**rich.emoji**
> List emoji codes.

**rich.inspect** _OBJECT_
> Inspect Python object.

# DESCRIPTION

**rich** is a Python library for terminal formatting. The CLI provides quick access to its features.

Markdown rendering shows formatted documents. Headers, lists, and code blocks display beautifully.

Syntax highlighting colors source code. Many languages supported automatically.

JSON pretty printing formats data. Colors highlight structure.

Color display shows terminal capabilities. Helps verify what your terminal supports.

# CAVEATS

Python package, not standalone CLI. Terminal must support colors. Some features need true color.

# HISTORY

**Rich** was created by **Will McGugan** in **2019** for beautiful terminal output in Python. Its CLI modules provide quick utilities.

# SEE ALSO

[bat](/man/bat)(1), [glow](/man/glow)(1), [jq](/man/jq)(1), [pygmentize](/man/pygmentize)(1)
