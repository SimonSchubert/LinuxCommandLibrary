# TLDR

**Open a CSV file** in a Python shell

```csvpy [data.csv]```

**Open with tab delimiter**

```csvpy -t [data.tsv]```

**Open with agate** library loaded

```csvpy --agate [data.csv]```

**Open with custom encoding**

```csvpy -e [latin1] [data.csv]```

**Open file without headers**

```csvpy --no-header-row [data.csv]```

# SYNOPSIS

**csvpy** [_options_] _file_

# PARAMETERS

_FILE_
> CSV file to load into the Python environment.

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter (default: comma).

**-t**, **--tabs**
> Use tabs as delimiter.

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

**--no-header-row**
> File has no header row.

**--agate**
> Load file as an agate Table instead of csv reader.

**-H**, **--no-inference**
> Disable type inference.

**--dict**
> Load as DictReader (rows as dictionaries).

# DESCRIPTION

**csvpy** is part of csvkit that loads a CSV file into an interactive Python shell for exploration and analysis. The data is available as a reader object or, with **--agate**, as a full-featured agate Table.

In default mode, the CSV data is loaded into a variable named **reader**, a csv.reader object. With **--dict**, it becomes a DictReader where each row is a dictionary. With **--agate**, it becomes a **table** variable with analysis capabilities.

This tool is useful for quick data exploration, testing data transformations, and prototyping analysis code. The interactive environment allows immediate feedback while working with the data.

# CAVEATS

Large files may use significant memory when loaded entirely. The default reader is consumed after iteration; use **--agate** for reusable data. Requires familiarity with Python for effective use.

# HISTORY

csvpy is part of **csvkit**, created by Christopher Groskopf in **2011**. It provides a quick way to drop into Python for ad-hoc data analysis without writing boilerplate file loading code.

# SEE ALSO

[csvkit](/man/csvkit)(1), [python](/man/python)(1), [ipython](/man/ipython)(1)
