# TLDR

**Manipulate IP aggregate files**

```ipaggmanip [input.agg]```

**Merge multiple aggregate files**

```ipaggmanip --merge [file1.agg] [file2.agg] > [combined.agg]```

**Filter aggregates by count threshold**

```ipaggmanip --min-count=[100] [input.agg]```

**Sort aggregates by count**

```ipaggmanip --sort [input.agg]```

**Convert aggregate format**

```ipaggmanip --output-format=[ascii] [input.agg]```

# SYNOPSIS

**ipaggmanip** [_options_] [_files_]

# PARAMETERS

**--merge**
> Merge multiple aggregate files

**--sort**
> Sort output by count or address

**--min-count** _N_
> Only output aggregates with at least N entries

**--max-count** _N_
> Only output aggregates with at most N entries

**--output-format** _FORMAT_
> Specify output format (ascii, binary)

**--prefix** _LENGTH_
> Re-aggregate with different prefix length

# DESCRIPTION

**ipaggmanip** manipulates IP address aggregate files created by **ipaggcreate**. It can merge multiple aggregate files, filter by thresholds, re-aggregate with different parameters, and convert between formats.

This tool completes the ipsumdump suite's workflow for network traffic analysis: capture with **ipsumdump**, aggregate with **ipaggcreate**, and manipulate/analyze with **ipaggmanip**.

# CAVEATS

Input files must be in the ipagg format produced by ipaggcreate. Merging files with incompatible aggregation parameters may produce unexpected results.

# HISTORY

Part of the **ipsumdump** package developed by Eddie Kohler. Designed for large-scale network measurement research where traffic summarization and analysis across multiple data sources is required.

# SEE ALSO

[ipsumdump](/man/ipsumdump)(1), [ipaggcreate](/man/ipaggcreate)(1), [tcpdump](/man/tcpdump)(1)
