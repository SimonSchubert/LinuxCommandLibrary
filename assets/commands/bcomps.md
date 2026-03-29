# TAGLINE

Decompose graphs into biconnected components

# TLDR

**Decompose graph into biconnected components**

```bcomps [input.gv] > [output.gv]```

**Print number of blocks and cutvertices**

```bcomps -v [input.gv]```

**Print each component as separate graph**

```bcomps -x [input.gv]```

**Print block-cutvertex tree**

```bcomps -t [input.gv]```

**Write components to separate files**

```bcomps -o [output.gv] [input.gv]```

**Silent mode with statistics only**

```bcomps -sv [input.gv]```

# SYNOPSIS

**bcomps** [_-stvx?_] [_-o_ _outfile_] [_files_]

# DESCRIPTION

**bcomps** decomposes graphs into their biconnected components, printing the components to standard output. A biconnected component is a maximal subgraph that remains connected after removal of any single vertex.

The tool is part of the Graphviz graph visualization suite and works with DOT language graph files.

# PARAMETERS

**-s**
> Silent mode; no output graph printed (implies -v)

**-t**
> Print the underlying block-cutvertex tree

**-v**
> Print number of blocks and cutvertices

**-x**
> Print each biconnected component as separate root graph

**-o** _outfile_
> Write each root graph to different file derived from outfile

**-?**
> Display help information

# OUTPUT FORMAT

By default, each input graph is printed with blocks as subgraphs. Subgraph names concatenate the input graph name, "_bcc_", and the block number.

When both -o and -x are used, each block is written to a separate file. If _outfile_ does not have a suffix, the nth block of the ith graph is written to outfile_n_i (the 0th block of the 0th graph is written to _outfile_ itself). If _outfile_ has a suffix (e.g., base.sfx), the files follow the same pattern with .sfx appended. Block-cutvertex trees are written to outfile_n_T.

# RETURN VALUES

**0**
> All input graphs are biconnected

**non-zero**
> Any graph has multiple blocks or an error occurred

# CAVEATS

Input files must be in Graphviz DOT format. The tool identifies articulation points (cutvertices) that separate components. Large graphs may require significant processing time.

# SEE ALSO

[ccomps](/man/ccomps)(1), [gc](/man/gc)(1), [dot](/man/dot)(1), [gvpr](/man/gvpr)(1), [sccmap](/man/sccmap)(1), [tred](/man/tred)(1), [acyclic](/man/acyclic)(1)
