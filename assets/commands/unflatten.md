# TLDR

**Adjust graph layout**

```unflatten [input.dot] -o [output.dot]```

**Set chain limit**

```unflatten -l [3] [input.dot]```

**Fan out**

```unflatten -f [input.dot]```

**Chain length**

```unflatten -c [5] [input.dot]```

# SYNOPSIS

**unflatten** [_-l limit_] [_-f_] [_-c len_] [_-o file_] _input_

# PARAMETERS

**-l** _LIMIT_
> Stagger depth.

**-f**
> Fan out leaves.

**-c** _LEN_
> Chain length.

**-o** _FILE_
> Output file.

# DESCRIPTION

**unflatten** improves graph layout. It adjusts for drawing.

Chain breaking. Avoid long chains.

Better aesthetics. Improved readability.

Preprocessor for dot. Use before layout.

Part of Graphviz. Graph tools.

# CAVEATS

Preprocessing tool. Use with dot. Graphviz required.

# HISTORY

**unflatten** is part of **Graphviz**, used to improve the aspect ratio of graphs with long chains of nodes.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [gvpr](/man/gvpr)(1)
