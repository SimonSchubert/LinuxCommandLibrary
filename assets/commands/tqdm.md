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

**tqdm** adds progress bars. It wraps pipe streams.

Progress indication. Visual feedback.

Speed estimation. Rate display.

ETA calculation. Time remaining.

Python library too. Dual interface.

# CAVEATS

Python required. stderr output. May slow pipelines slightly.

# HISTORY

**tqdm** (from Arabic for "progress") was created as a fast, extensible progress bar for Python and CLI.

# SEE ALSO

[pv](/man/pv)(1), [progress](/man/progress)(1), [bar](/man/bar)(1)
