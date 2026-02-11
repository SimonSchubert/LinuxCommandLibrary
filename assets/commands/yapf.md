# TAGLINE

Google Python code formatter

# TLDR

**Format a Python file** and print to stdout

```yapf [file.py]```

**Format a file in place**

```yapf -i [file.py]```

**Show diff** of formatting changes

```yapf -d [file.py]```

**Format using Google style**

```yapf --style=google [file.py]```

**Format all Python files** recursively

```yapf -r -i [directory/]```

**Format in parallel** for faster processing

```yapf -p -r -i [directory/]```

**Show available style options**

```yapf --style-help```

**Use custom style configuration**

```yapf --style='{based_on_style: pep8, indent_width: 4}' [file.py]```

# SYNOPSIS

**yapf** [_options_] [_files_...]

# PARAMETERS

**-i**, **--in-place**
> Modify files in place

**-d**, **--diff**
> Print diff of changes without modifying files

**-r**, **--recursive**
> Recursively format files in directories

**-p**, **--parallel**
> Run formatting in parallel for multiple files

**-s**, **--style** _style_
> Style: pep8, google, chromium, facebook, or path to config file

**--style-help**
> Show documentation for all style options

**-l**, **--lines** _range_
> Format only specified lines (e.g., 1-10,15-20)

**-e**, **--exclude** _pattern_
> Exclude files matching pattern

**--version**
> Show version and exit

# DESCRIPTION

**yapf** (Yet Another Python Formatter) is a Python code formatter developed by Google. Unlike linters that only warn about style violations, yapf reformats code to match the configured style, producing consistent output regardless of the original formatting.

The algorithm analyzes code structure and calculates optimal formatting based on the configured style. Built-in styles include **pep8** (default), **google**, **chromium**, and **facebook**. Custom styles can be defined by inheriting from a base style and overriding specific options.

Configuration files (**.style.yapf**, **setup.cfg**, or **pyproject.toml**) in the source directory or parent directories are automatically detected. The config file uses INI format with a **[style]** section.

yapf can format specific line ranges with **--lines**, useful for formatting only changed code in version control workflows.

# CAVEATS

yapf may produce different output than other formatters like black. The **-i** option modifies files directly; use **-d** first to preview changes. Some complex expressions may be formatted in unexpected ways. Comments can affect formatting decisions.

# HISTORY

**yapf** was developed at **Google** and first released in **2015** as an open-source project. It was inspired by **clang-format** (for C/C++), applying similar algorithmic formatting to Python. The name follows the Unix tradition of "Yet Another" tools, acknowledging the existence of other Python formatters.

# SEE ALSO

[black](/man/black)(1), [autopep8](/man/autopep8)(1), [isort](/man/isort)(1), [flake8](/man/flake8)(1)
