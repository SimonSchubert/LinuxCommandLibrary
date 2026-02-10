# TAGLINE

high-performance multiple sequence alignment program

# TLDR

**Align sequences (auto strategy)**

```mafft --auto [input.fasta] > [aligned.fasta]```

**Fast alignment**

```mafft --retree 1 [input.fasta] > [aligned.fasta]```

**Accurate alignment**

```mafft --maxiterate 1000 --localpair [input.fasta] > [aligned.fasta]```

**Use multiple threads**

```mafft --thread [8] --auto [input.fasta] > [aligned.fasta]```

**Add sequences to existing alignment**

```mafft --add [new.fasta] [existing.fasta] > [combined.fasta]```

# SYNOPSIS

**mafft** [_options_] _input_ > _output_

# PARAMETERS

**--auto**
> Auto-select strategy.

**--maxiterate** _n_
> Number of iterations.

**--localpair**
> Use L-INS-i (accurate).

**--globalpair**
> Use G-INS-i.

**--thread** _n_
> Number of threads.

**--add** _file_
> Add to alignment.

**--reorder**
> Reorder by similarity.

**--quiet**
> Suppress messages.

# DESCRIPTION

**MAFFT** (Multiple Alignment using Fast Fourier Transform) is a high-performance multiple sequence alignment program. It offers various algorithms balancing speed and accuracy.

MAFFT is widely used in bioinformatics for aligning DNA, RNA, and protein sequences.

# STRATEGIES

```
FFT-NS-1  - Fast, large datasets
FFT-NS-2  - Default progressive
L-INS-i   - Accurate, <200 sequences
G-INS-i   - Global alignment
```

# CAVEATS

Memory scales with sequence count. Very long sequences may need adjustments. Auto mode selects strategy based on input size.

# HISTORY

MAFFT was developed by **Kazutaka Katoh** and colleagues, first published in **2002**. It's one of the most cited alignment tools in bioinformatics.

# SEE ALSO

[clustalw](/man/clustalw)(1), [muscle](/man/muscle)(1), [t-coffee](/man/t-coffee)(1)
