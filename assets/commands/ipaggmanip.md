# TAGLINE

Manipulate IP address aggregate files created by ipaggcreate

# TLDR

**Read aggregate file and output sorted counts**

```ipaggmanip -r [input.agg] --sorted-counts```

**Combine (union) multiple aggregate files**

```ipaggmanip --or [file1.agg] [file2.agg] -o [combined.agg]```

**Re-aggregate to a shorter prefix length (e.g., /16)**

```ipaggmanip --prefix [16] -r [input.agg]```

**Drop labels with fewer than N packets**

```ipaggmanip --cut-smaller [100] -r [input.agg]```

**Output in ASCII with IP addresses**

```ipaggmanip --ip -r [input.agg]```

**Count number of active labels**

```ipaggmanip --num-labels -r [input.agg]```

# SYNOPSIS

**ipaggmanip** [_options_] [_files_]

# PARAMETERS

**-r**, **--read-file** _FILE_
> Read aggregate data from FILE (default: stdin).

**-o**, **--output** _FILE_
> Write results to FILE (default: stdout).

**-b**, **--binary**
> Output in binary format.

**-A**, **--text**
> Output in ASCII text format.

**--ip**
> Output in ASCII with IP addresses instead of raw integer labels.

**-p**, **--prefix** _P_
> Re-aggregate to prefix level P (e.g., 16 for /16).

**-P**, **--posterize**
> Replace every nonzero count with 1.

**--sample** _N_
> Randomly sample packets with probability 1/N.

**--cut-smaller** _N_
> Drop labels with fewer than N packets.

**--cut-larger** _N_
> Drop labels with N or more packets.

**-n**, **--num-labels**
> Print the count of active labels.

**--counts**
> Output counts in label order.

**--sorted-counts**
> Output counts in descending order.

**-e**, **--each**
> Process each input file separately.

**--or**
> Combine input files by adding aggregates (union).

**--and**
> Combine inputs, keeping only labels common to all files.

**--minus**
> Keep FILE1, drop labels present in other files.

**--xor**
> Keep labels present in exactly one file.

# DESCRIPTION

**ipaggmanip** manipulates IP address aggregate files created by **ipaggcreate**. It can merge multiple aggregate files, filter by thresholds, re-aggregate with different parameters, and convert between formats.

This tool completes the ipsumdump suite's workflow for network traffic analysis: capture with **ipsumdump**, aggregate with **ipaggcreate**, and manipulate/analyze with **ipaggmanip**.

# CAVEATS

Input files must be in the ipagg format produced by ipaggcreate. Merging files with incompatible aggregation parameters may produce unexpected results.

# HISTORY

Part of the **ipsumdump** package developed by Eddie Kohler. Designed for large-scale network measurement research where traffic summarization and analysis across multiple data sources is required.

# SEE ALSO

[ipsumdump](/man/ipsumdump)(1), [ipaggcreate](/man/ipaggcreate)(1), [tcpdump](/man/tcpdump)(1)
