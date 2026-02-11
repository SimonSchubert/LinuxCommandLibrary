# TAGLINE

Add progress bars to command pipelines

# TLDR

**Add progress bar to pipeline**

```cat [file] | tqdm --bytes | wc -l```

**With estimated total**

```cat [file] | tqdm --total [1000] | process```

**Custom unit**

```cat [files] | tqdm --unit files | process```

**Write to file**

```cat [input] | tqdm > [output]```

**With description**

```seq [100] | tqdm --desc "[Processing]" | process```

# SYNOPSIS

**tqdm** [_--total n_] [_--unit name_] [_--desc text_] [_options_]

# PARAMETERS

**--total** _N_
> Expected iterations.

**--unit** _NAME_
> Unit name.

**--desc** _TEXT_
> Description prefix.

**--bytes**
> Byte mode.

**--null**
> Null separator.

# DESCRIPTION

**tqdm** (from Arabic "taqaddum" meaning progress) adds progress bars to command-line pipelines by wrapping standard input/output streams. It displays real-time statistics including iteration speed, elapsed time, and estimated time remaining.

The tool works as both a CLI pipe wrapper and a Python library. In CLI mode, it counts lines or bytes passing through and renders a visual progress bar on stderr. When **--total** is specified, it shows a percentage-based progress bar; otherwise it displays a simple counter with speed estimation.

# CAVEATS

Python required. stderr output. May slow pipelines slightly.

# HISTORY

**tqdm** (from Arabic for "progress") was created as a fast, extensible progress bar for Python and CLI.

# SEE ALSO

[pv](/man/pv)(1), [progress](/man/progress)(1), [bar](/man/bar)(1)
