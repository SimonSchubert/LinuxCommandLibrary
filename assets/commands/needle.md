# TAGLINE

Needleman-Wunsch global pairwise sequence alignment (EMBOSS)

# TLDR

**Globally align** two sequences from FASTA files

```needle -asequence [seq1.fasta] -bsequence [seq2.fasta] -gapopen [10] -gapextend [0.5] -outfile [out.needle]```

**Align by database accession** (e.g. UniProt)

```needle -asequence sp:[hba_human] -bsequence sp:[hbb_human] -gapopen [10] -gapextend [0.5] -outfile [result.needle]```

**Use a specific scoring matrix**

```needle -asequence [a.fa] -bsequence [b.fa] -datafile [EBLOSUM62] -gapopen [10] -gapextend [0.5] -outfile [out.needle]```

**Choose an alternative output format**

```needle -asequence [a.fa] -bsequence [b.fa] -gapopen [10] -gapextend [0.5] -aformat3 [markx10] -outfile [out.txt]```

**Run non-interactively** (no prompts)

```needle -auto -asequence [a.fa] -bsequence [b.fa] -gapopen [10] -gapextend [0.5] -outfile [a_vs_b.needle]```

# SYNOPSIS

**needle** **-asequence** _seqfile_ **-bsequence** _seqfile_ **-gapopen** _f_ **-gapextend** _f_ **-outfile** _file_ [_options_]

# PARAMETERS

**-asequence** _file_
> First input sequence (single sequence, any EMBOSS-supported format).

**-bsequence** _file_
> Second input sequence (one or many sequences to align against the first).

**-gapopen** _float_
> Penalty for opening a gap (typical: 10.0 for proteins, 10.0 for DNA).

**-gapextend** _float_
> Penalty for extending an existing gap (typical: 0.5).

**-datafile** _matrix_
> Scoring matrix name (e.g. _EBLOSUM62_, _EDNAFULL_).

**-endweight**
> Apply end-gap penalties (default: false; end gaps are free).

**-outfile** _file_
> Path to the alignment report.

**-aformat3** _format_
> Output alignment format (_pair_, _markx0_..._markx10_, _msf_, _fasta_, ...).

**-brief**
> Print a brief alignment summary instead of the full pairwise view.

**-auto**
> Skip all interactive prompts (suitable for scripts).

# DESCRIPTION

**needle** computes the optimal **global** pairwise alignment of two sequences using the **Needleman-Wunsch** dynamic programming algorithm. It ships as part of **EMBOSS** (European Molecular Biology Open Software Suite) and is intended for nucleotide or protein sequences of comparable length where the entire sequences should be aligned end-to-end.

Gap-open and gap-extend penalties are mandatory parameters that shape the alignment, and a scoring matrix (BLOSUM, PAM, EDNAFULL, ...) determines how matches and mismatches are weighted. The output is a formatted alignment that reports score, length, percentage identity, similarity, and gap statistics; many alternative formats are available via **-aformat3**.

For local alignment of subsequences use **water**; for very long sequences where memory is a concern use **stretcher**, which implements a linear-space variant of the algorithm.

# CAVEATS

Time and memory complexity are O(m·n) in the lengths of the two sequences, so **needle** is not appropriate for very long sequences — use **stretcher** instead. Option syntax is EMBOSS-specific (long names introduced by a single dash) and is not interchangeable with GNU-style flags. End gaps are free by default; enable **-endweight** if you want them penalized.

# HISTORY

**needle** was written by **Alan Bleasby** as part of **EMBOSS**, a project started in **1996** at the **Sanger Centre / MRC** to provide an open, integrated suite of bioinformatics tools. The Needleman-Wunsch algorithm itself was published in **1970** by **Saul B. Needleman** and **Christian D. Wunsch**.

# SEE ALSO

[water](/man/water)(1), [stretcher](/man/stretcher)(1), [matcher](/man/matcher)(1), [blastp](/man/blastp)(1)
