# TAGLINE

calculate nucleotide and amino acid composition

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

**compseq** is a bioinformatics tool from the EMBOSS (European Molecular Biology Open Software Suite) package that performs k-mer frequency analysis on DNA, RNA, and protein sequences. It reads sequences in FASTA format and generates compositional statistics showing how often each possible word (k-mer) of a specified length appears in the sequence.

The tool is widely used in molecular biology for multiple applications: analyzing codon usage bias in genes, identifying sequence composition patterns that indicate functional or structural elements, and comparing sequence characteristics across organisms or genomic regions. By specifying different word sizes, researchers can examine dinucleotide frequencies (word size 2), codon frequencies (word size 3), or longer oligonucleotide patterns.

compseq can calculate both observed frequencies and expected frequencies based on the overall base composition, making it useful for identifying statistically significant deviations from random distribution. The reading frame parameter allows analysis of coding sequences in specific frames, critical for studying codon usage patterns in protein-coding genes.

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
