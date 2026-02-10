# TAGLINE

enhanced interactive Python shell

# TLDR

**Start IPython shell**

```ipython3```

**Run script in IPython**

```ipython3 [script.py]```

**Start with specific profile**

```ipython3 --profile=[myprofile]```

**Run in no-banner mode**

```ipython3 --no-banner```

**Start Qt console**

```ipython3 qtconsole```

**Start notebook server**

```jupyter notebook```

# SYNOPSIS

**ipython3** [_options_] [_file_] [_args_]

# PARAMETERS

**--profile** _name_
> Use specific profile.

**--no-banner**
> Don't show startup banner.

**-i**
> Run in interactive mode after script.

**-c** _command_
> Execute command.

**--pdb**
> Enable automatic debugger on exceptions.

**--matplotlib** _backend_
> Configure matplotlib backend.

**qtconsole**
> Start Qt GUI console.

**notebook**
> Start Jupyter notebook (deprecated, use jupyter).

# DESCRIPTION

**IPython** is an enhanced interactive Python shell. It provides syntax highlighting, tab completion, magic commands, shell integration, and rich media display.

IPython extends Python's REPL with features like history across sessions, object introspection, and system shell access. It's the kernel behind Jupyter notebooks.

# MAGIC COMMANDS

```
%run script.py     Run Python file
%timeit expr       Time execution
%debug             Enter debugger
%history           Show history
%paste             Paste from clipboard
%cd                Change directory
!command           Run shell command
?object            Get help
??object           Get source code
```

# CAVEATS

Separate from standard Python. Some magic commands are IPython-specific. Jupyter notebooks recommended for notebook interface.

# HISTORY

IPython was created by **Fernando Pérez** in **2001** to improve Python's interactive capabilities. It became the foundation for Jupyter, which generalized the notebook concept to multiple languages.

# SEE ALSO

[python3](/man/python3)(1), [jupyter](/man/jupyter)(1), [bpython](/man/bpython)(1)
