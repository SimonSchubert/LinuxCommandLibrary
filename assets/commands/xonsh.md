# TAGLINE

Python-powered cross-platform shell

# TLDR

**Start xonsh**

```xonsh```

**Run command**

```xonsh -c "[print('hello')]"```

**Run script**

```xonsh [script.xsh]```

**Interactive Python mode**

```xonsh -i```

# SYNOPSIS

**xonsh** [_-c command_] [_-i_] [_options_] [_file_]

# PARAMETERS

**-c** _CMD_
> Execute command.

**-i**
> Interactive mode.

**--login**
> Login shell.

**--help**
> Show help.

# DESCRIPTION

**xonsh** is a cross-platform shell that combines the capabilities of Python with the familiarity of traditional Unix shells. It allows users to seamlessly mix Python expressions and standard shell commands in the same session, using Python syntax as the primary language while supporting conventional shell operations.

The shell provides context-aware tab completion, syntax highlighting, and a customizable prompt. Shell commands run natively, and Python code can be used anywhere for variable manipulation, control flow, and data processing. Scripts use the **.xsh** extension and can contain both Python and shell syntax.

xonsh runs on any platform where Python is available, making it a portable choice for users who want Python's expressiveness integrated directly into their shell workflow.

# CAVEATS

Python required. Different from bash. Learning curve.

# HISTORY

**xonsh** was created to combine the power of Python with the familiarity of shell scripting.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1), [python](/man/python)(1), [fish](/man/fish)(1)
