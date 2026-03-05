# TAGLINE

CLI for displaying Python-based presentations in the terminal

# TLDR

**Display a presentation file**

```pysentation [presentation.py]```

**Display starting from a specific slide**

```pysentation [presentation.py] -s [3]```

# SYNOPSIS

**pysentation** [_options_] _file_

# PARAMETERS

**-s** _NUMBER_
> Start from a specific slide number.

# DESCRIPTION

**pysentation** is a CLI for displaying presentations written as Python files or **.pysent** files in the terminal. Slides are defined using special pysentation commands within the source file. When the interpretable property is enabled, code inside slides is executed by the Python interpreter and the output is displayed in a separate box.

# CAVEATS

Presentation files must follow pysentation's slide definition format. Requires Python.

# HISTORY

**pysentation** was created by **mimseyedi** and is written in **Python**.

# SEE ALSO

[patat](/man/patat)(1), [slides](/man/slides)(1), [presenterm](/man/presenterm)(1)
