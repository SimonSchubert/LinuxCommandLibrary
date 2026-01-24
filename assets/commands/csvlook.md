# TLDR

**Display CSV as table**

```csvlook [data.csv]```

**Limit rows displayed**

```csvlook --max-rows [10] [data.csv]```

**Limit column width**

```csvlook --max-column-width [20] [data.csv]```

**Hide line numbers**

```csvlook --no-number [data.csv]```

**Use different delimiter**

```csvlook -d ";" [data.csv]```

**Read from stdin**

```cat [data.csv] | csvlook```

# SYNOPSIS

**csvlook** [_options_] _file_

# DESCRIPTION

**csvlook** renders CSV data as a fixed-width table for terminal viewing. It's part of csvkit and provides a quick way to preview CSV files in a readable format.

The tool auto-sizes columns based on content and displays data with ASCII borders, making it easy to inspect data structure and values.

# PARAMETERS

**-H**, **--no-header-row**
> Input has no header row.

**--max-rows** _n_
> Maximum rows to display.

**--max-column-width** _n_
> Truncate columns at width.

**--max-columns** _n_
> Maximum columns to display.

**-y** _n_, **--snifflimit** _n_
> Rows to sniff for delimiter.

**--no-number**
> Don't display row numbers.

**-d** _char_
> Field delimiter.

**-q** _char_
> Quote character.

**-e** _encoding_
> Input encoding.

# CAVEATS

Large files may be slow to render. Wide tables may wrap in terminal. Part of csvkit, requires Python installation.

# HISTORY

**csvlook** is part of **csvkit**, created by **Christopher Groskopf** in **2011**. It provides quick data preview capabilities essential for data analysis workflows, complementing other csvkit tools for CSV manipulation.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvstat](/man/csvstat)(1), [column](/man/column)(1), [less](/man/less)(1)
