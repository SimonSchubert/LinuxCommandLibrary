# TLDR

Count word frequencies with **interactive prompt**

```compseq [path/to/file.fasta]```

Count **amino acid pairs** from protein sequence

```compseq [path/to/input_protein.fasta] -word 2 [path/to/output_file.comp]```

Count **hexanucleotides**, ignoring zero counts

```compseq [path/to/input_dna.fasta] -word 6 [path/to/output_file.comp] -nozero```

Count **codons** in a specific reading frame

```compseq -sequence [path/to/input_rna.fasta] -word 3 [path/to/output_file.comp] -nozero -frame [1]```

**Compare** frequencies to a previous run

```compseq -sequence [path/to/file.fasta] -word 3 [path/to/output.comp] -nozero -infile [path/to/previous.comp]```

Calculate **expected frequencies** from input

```compseq -sequence [path/to/file.fasta] -word 3 [path/to/output.comp] -nozero -calcfreq```

# SYNOPSIS

**compseq** [_options_] _sequence_ _outfile_

# DESCRIPTION

**compseq** calculates the composition of unique words (k-mers) in biological sequences. It counts the frequency of nucleotide or amino acid patterns in FASTA files.

Part of the EMBOSS bioinformatics suite, it is used for sequence analysis, codon usage studies, and compositional analysis.

# PARAMETERS

**-word** _size_
> Word size to count (e.g., 2 for dinucleotides, 3 for codons)

**-frame** _number_
> Reading frame (1, 2, or 3)

**-nozero**
> Ignore zero counts in output

**-infile** _file_
> Compare to previous compseq output

**-calcfreq**
> Calculate expected frequencies from input

**-help**
> Display help

# CAVEATS

Part of the EMBOSS suite. Input must be valid FASTA format. Large word sizes can produce very large output tables.

# SEE ALSO

[cusp](/man/cusp)(1), [wordcount](/man/wordcount)(1)
